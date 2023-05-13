import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestUtils {

    static Object fillAllFields(Object obj){

        Class<?> currentClass = obj.getClass();

        while(currentClass != Object.class){

            Arrays.stream(currentClass.getDeclaredFields()).forEach(field -> {

                switch(field.getType().getName().toLowerCase()){
                    case "java.lang.string":
                        try {
                            field.setAccessible(true);
                            field.set(obj, getStringValue(field));
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "java.lang.integer":
                        try {
                            field.setAccessible(true);
                            field.set(obj, 1234657890);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "java.lang.short":
                        try {
                            field.setAccessible(true);
                            field.set(obj, 123);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "java.lang.byte":
                        try {
                            field.setAccessible(true);
                            field.set(obj, 1);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "java.lang.long":
                        try {
                            field.setAccessible(true);
                            field.set(obj, 1234567890123456789L);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "java.lang.double":
                        try {
                            field.setAccessible(true);
                            field.set(obj, 12345.06789);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "java.lang.float":
                        try {
                            field.setAccessible(true);
                            field.set(obj, 1234567890.0987654321f);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "java.lang.char":

                        try {
                            field.setAccessible(true);
                            field.set(obj, 'Q');
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "java.lang.boolean":

                        try {
                            field.setAccessible(true);
                            field.set(obj, Boolean.TRUE);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "java.util.list":
                        try {
                            field.setAccessible(true);

                            List list = new ArrayList();
                            Class<?> fieldClass =
                                    (Class<?>) ((ParameterizedType) field.getGenericType()).getActualTypeArguments()[0];

                            Object listObj = fillAllFields(fieldClass.newInstance());
                            Object listObj2 = fillAllFields(fieldClass.newInstance());
                            Object listObj3 = fillAllFields(fieldClass.newInstance());

                            list.add(listObj);
                            list.add(listObj2);
                            list.add(listObj3);

                            field.set(obj, list);
                        } catch (IllegalAccessException | InstantiationException e) {
                            e.printStackTrace();
                        }
                        break;
                    default:
//                        System.out.println("Field is " + field.getType().getName() + ", do something about that");
                        try {
                            field.setAccessible(true);

                            if(field.getType().isEnum()){
                                field.set(obj, field.getType().getEnumConstants()[0]);
                            }else{
                                field.set(obj, fillAllFields(field.getType().newInstance()));
                            }

                        } catch (IllegalAccessException | InstantiationException e) {
                            e.printStackTrace();
                        }
                        break;
                }

            });

            currentClass = currentClass.getSuperclass();

        }

        return obj;

    }

    private static String getStringValue(Field field) {
        return field.getDeclaringClass().getSimpleName() + "." + field.getName() + " sample value";
    }

}
