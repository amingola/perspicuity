package obsolete;

import com.perspicuity.NamespaceMapper;
import com.perspicuity.service.MarshallingService;
import com.perspicuity.service.UnmarshallingService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.stream.Stream;

public class JsonEndpointDynamicTests {

    private static MarshallingService marshallingService;
    private static UnmarshallingService unmarshallingService;
    private static NamespaceMapper namespaceMapper;

    @BeforeAll
    static void init(){
        String clarityPackage = "com.genologics.ri";
        String clarityPackageRoot = "com.genologics";
        String clarityUri = "http://genologics.com";
        String schemaDirectory = "src/main/xsd";

        NamespaceMapper namespaceMapper = new NamespaceMapper(clarityPackage, clarityPackageRoot, clarityUri, schemaDirectory);
        marshallingService = new MarshallingService(clarityPackage, clarityPackageRoot, clarityUri, namespaceMapper);
        unmarshallingService = new UnmarshallingService(clarityPackage, clarityUri);
    }

    /*@TestFactory
    Stream<DynamicTest> marshalEveryType() {
        return namespaceMapper.getClarityClasses().values().stream()
                .map(c -> DynamicTest.dynamicTest("Marshalling: " + c, () -> {

                    //Skip ObjectFactory classes
                    if(c.getName().contains("ObjectFactory")) return;

                    Object obj = obsolete.TestUtils.fillAllFields(c.newInstance());

                    String xml = marshallingService.marshal(obj.getClass(), obj);
                    System.out.println("Marshalled object: " + xml);

                }));
    }*/

    /*@TestFactory
    Stream<DynamicTest> marshalAndUnmarshalEveryType() {
        return namespaceMapper.getClarityClasses().values().stream()
                .map(c -> DynamicTest.dynamicTest("Marshalling: " + c, () -> {

                    //Skip ObjectFactory classes
                    if(c.getName().contains("ObjectFactory")) return;

                    Object obj = obsolete.TestUtils.fillAllFields(c.newInstance());

                    String xml = marshallingService.marshal(obj.getClass(), obj);
                    System.out.println("Marshalled object: " + xml);

                    Object pojo = UnmarshallingService.unmarshal(c, xml).getDeclaredType().newInstance();
                    System.out.println("Unmarshalled object: " + pojo);

                }));
    }*/

    @TestFactory
    Stream<DynamicTest> marshalAndUnmarshalEndpointTypes() {
        return namespaceMapper.getClarityClasses().values().stream()
                .map(c -> DynamicTest.dynamicTest("Marshalling: " + c, () -> {

                    //Skip ObjectFactory classes
                    if(c.getName().contains("ObjectFactory")) return;

                    Object obj = TestUtils.fillAllFields(c.newInstance());

                    String xml = marshallingService.marshal(obj.getClass(), obj);
                    System.out.println("Marshalled object: " + xml);

                    Object pojo = unmarshallingService.unmarshal(c, xml).getDeclaredType().newInstance();
                    System.out.println("Unmarshalled object: " + pojo);

                }));
    }

}