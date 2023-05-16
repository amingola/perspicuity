import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.genologics.ri.Links;
import com.genologics.ri.artifact.Artifacts;
import com.genologics.ri.artifactgroup.Artifactgroup;
import com.genologics.ri.configuration.Field;
import com.genologics.ri.configuration.Udfs;
import com.genologics.ri.configuration.Udts;
import com.genologics.ri.container.Container;
import com.genologics.ri.container.Containers;
import com.genologics.ri.containertype.ContainerType;
import com.genologics.ri.containertype.ContainerTypes;
import com.genologics.ri.controltype.ControlType;
import com.genologics.ri.controltype.ControlTypes;
import com.genologics.ri.instrument.Instrument;
import com.genologics.ri.instrument.Instruments;
import com.genologics.ri.lab.Lab;
import com.genologics.ri.lab.Labs;
import com.genologics.ri.permission.Permission;
import com.genologics.ri.permission.Permissions;
import com.genologics.ri.process.Processes;
import com.genologics.ri.processtemplate.ProcessTemplate;
import com.genologics.ri.processtemplate.ProcessTemplates;
import com.genologics.ri.processtype.ObjectFactory;
import com.genologics.ri.processtype.ProcessType;
import com.genologics.ri.processtype.ProcessTypes;
import com.genologics.ri.project.Project;
import com.genologics.ri.project.Projects;
import com.genologics.ri.protocolconfiguration.Protocol;
import com.genologics.ri.protocolconfiguration.Protocols;
import com.genologics.ri.queue.Queue;
import com.genologics.ri.reagentkit.ReagentKit;
import com.genologics.ri.reagentkit.ReagentKits;
import com.genologics.ri.reagentlot.ReagentLot;
import com.genologics.ri.reagentlot.ReagentLots;
import com.genologics.ri.reagenttype.ReagentType;
import com.genologics.ri.reagenttype.ReagentTypes;
import com.genologics.ri.researcher.Researcher;
import com.genologics.ri.role.Role;
import com.genologics.ri.role.Roles;
import com.genologics.ri.routing.Routing;
import com.genologics.ri.sample.Sample;
import com.genologics.ri.sample.Samples;
import com.genologics.ri.stage.Stage;
import com.genologics.ri.step.*;
import com.genologics.ri.stepconfiguration.Step;
import com.genologics.ri.workflowconfiguration.Workflow;
import com.genologics.ri.workflowconfiguration.Workflows;
import com.perspicuity.NamespaceMapper;
import com.perspicuity.service.MarshallingService;
import com.perspicuity.service.UnmarshallingService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;

import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoundTripTestsFromSampleXml {

    private static final String examplePayloadsDir = "src/main/resources/example_payloads/";
    private static MarshallingService marshallingService;

    @BeforeAll
    static void init(){
        marshallingService = new MarshallingService(new NamespaceMapper("com.genologics.ri"));
    }

    @Test
    public void roundTripWithStepStep() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.step.Step.class;

        String xml = getExampleXmlFromFile("stp_step.xml");
        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        JAXBElement<?> unmarshalledPojo2 = UnmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        //System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithProcessTypes() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.processtype.ProcessTypes.class;

        String xml = getExampleXmlFromFile("ptp_process-types.xml");
        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = UnmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        //System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    private static String getExampleXmlFromFile(String filename) throws IOException {
        File file = new File(examplePayloadsDir + filename);
        String xml = new String(Files.readAllBytes(file.toPath()), StandardCharsets.UTF_8);

        //remove comments
        return xml.replaceAll("<!--[\\s\\S]*?-->", "");
    }

}
