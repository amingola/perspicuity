import com.perspicuity.NamespaceMapper;
import com.perspicuity.service.MarshallingService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.stream.Stream;

public class JsonEndpointDynamicTests {

    private static MarshallingService marshallingService;
    private static NamespaceMapper namespaceMapper;

    @BeforeAll
    static void init(){
        namespaceMapper = new NamespaceMapper("com.genologics.ri");
        marshallingService = new MarshallingService(namespaceMapper);
    }

    @TestFactory
    Stream<DynamicTest> dynamicTestsFromStreamInJava8() {
        return namespaceMapper.getClarityClasses().values().stream()
                .map(c -> DynamicTest.dynamicTest("Marshalling: " + c, () -> {

                    //Skip ObjectFactory classes
                    if(c.getName().contains("ObjectFactory")) return;

                    Object obj = TestUtils.fillAllFields(c.newInstance());

                    marshallingService.marshal(obj.getClass(), obj);
                    System.out.println("Marshalled object: " + obj);

                }));
    }

}
