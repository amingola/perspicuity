import com.genologics.ri.sample.*;
import com.genologics.ri.userdefined.Type;
import com.perspicuity.NamespaceMapper;
import com.perspicuity.service.MarshallingService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import javax.xml.bind.JAXBException;
import java.util.Arrays;
import java.util.stream.Stream;

public class JsonEndpointSimpleTests {

    private static MarshallingService marshallingService;
    private static NamespaceMapper namespaceMapper;

    /*public JsonEndpointTests(MarshallingService marshallingService){
        this.marshallingService = marshallingService;
    }*/

    @BeforeAll
    static void init(){
        namespaceMapper = new NamespaceMapper("com.genologics.ri");
        marshallingService = new MarshallingService(namespaceMapper);
    }

    @Test
    void test1() throws JAXBException, ClassNotFoundException {

        Sample sample = new Sample();
        sample.setName("Sample Name123");
        sample.setDateReceived("5/13/2023");
        sample.setLimsid("Limsid123");
        sample.setUri("uri123");
        sample.setDateCompleted("5/13/2023");

        sample.setType(getFullType());
        sample.setControlType(getFullControlType());

        Project project = new Project();
        project.setUri("Project URI123");
        project.setLimsid("Project Limsid123");
        sample.setProject(project);

        Submitter submitter = new Submitter();
        submitter.setFirstName("submitter FirstName123");
        submitter.setLastName("submitter LastName123");
        submitter.setUri("submitter URI123");
        sample.setSubmitter(submitter);

        Artifact artifact = new Artifact();
        artifact.setUri("artifact URI123");
        artifact.setLimsid("artifact Limsid123");
        sample.setArtifact(artifact);

        Biosource biosource = new Biosource();
        biosource.setDescription("biosource Description123");
        biosource.setName("biosource Name123");
        sample.setBiosource(biosource);

        String sampleXml = marshallingService.marshal(Sample.class, sample);

        System.out.println("Resulting sample: " + sampleXml);

    }

    @Test
    void test2() throws JAXBException, ClassNotFoundException {

        Sample sample = new Sample();
        TestUtils.fillAllFields(sample);

        System.out.println(sample);
        String sampleXml = marshallingService.marshal(Sample.class, sample);

        System.out.println("Resulting sample: " + sampleXml);

    }

    private static ControlType getFullControlType() {
        ControlType controlType = new ControlType();
        controlType.setUri("ControlType URI123");
        controlType.setName("ControlType Name123");
        return controlType;
    }

    private static Type getFullType() {
        Type type = new Type();
        type.setName("Type Name123");
        return type;
    }

}
