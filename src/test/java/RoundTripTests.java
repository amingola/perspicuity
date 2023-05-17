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
import com.genologics.ri.file.File;
import com.genologics.ri.instrument.Instrument;
import com.genologics.ri.instrument.Instruments;
import com.genologics.ri.lab.Lab;
import com.genologics.ri.lab.Labs;
import com.genologics.ri.permission.Permission;
import com.genologics.ri.permission.Permissions;
import com.genologics.ri.process.Processes;
import com.genologics.ri.processtemplate.ProcessTemplate;
import com.genologics.ri.processtemplate.ProcessTemplates;
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

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoundTripTests {

    private static MarshallingService marshallingService;

    @BeforeAll
    static void init(){
        NamespaceMapper namespaceMapper = new NamespaceMapper("com.genologics");
        marshallingService =
                new MarshallingService("com.genologics", "http://genologics.com", namespaceMapper);

    }

    @Test
    public void roundTripWithArtifactgroup() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = Artifactgroup.class;
        Artifactgroup artifactgroup = new Artifactgroup();
        TestUtils.fillAllFields(artifactgroup);

        System.out.println(artifactgroup);
        String sampleXml = marshallingService.marshal(clazz, artifactgroup);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithArtifacts() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = Artifacts.class;
        Artifacts artifacts = new Artifacts();
        TestUtils.fillAllFields(artifacts);

        System.out.println(artifacts);
        String sampleXml = marshallingService.marshal(clazz, artifacts);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithArtifact() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = Artifact.class;
        Artifact artifact = new Artifact();
        TestUtils.fillAllFields(artifact);

        System.out.println(artifact);
        String sampleXml = marshallingService.marshal(clazz, artifact);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithArtifactDetails() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = com.genologics.ri.artifact.Details.class;
        com.genologics.ri.artifact.Details details = new com.genologics.ri.artifact.Details();
        TestUtils.fillAllFields(details);

        System.out.println(details);
        String sampleXml = marshallingService.marshal(clazz, details);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithProtocols() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = Protocols.class;
        Protocols protocols = new Protocols();
        TestUtils.fillAllFields(protocols);

        System.out.println(protocols);
        String sampleXml = marshallingService.marshal(clazz, protocols);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithProtocol() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = Protocol.class;
        Protocol protocol = new Protocol();
        TestUtils.fillAllFields(protocol);

        System.out.println(protocol);
        String sampleXml = marshallingService.marshal(clazz, protocol);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithUdfs() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = Udfs.class;
        Udfs udfs = new Udfs();
        TestUtils.fillAllFields(udfs);

        System.out.println(udfs);
        String sampleXml = marshallingService.marshal(clazz, udfs);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithField() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = Field.class;
        Field field = new Field();
        TestUtils.fillAllFields(field);

        System.out.println(field);
        String sampleXml = marshallingService.marshal(clazz, field);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithUdts() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = Udts.class;
        Udts udts = new Udts();
        TestUtils.fillAllFields(udts);

        System.out.println(udts);
        String sampleXml = marshallingService.marshal(clazz, udts);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithType() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = com.genologics.ri.configuration.Type.class;
        com.genologics.ri.configuration.Type type = new com.genologics.ri.configuration.Type();
        TestUtils.fillAllFields(type);

        System.out.println(type);
        String sampleXml = marshallingService.marshal(clazz, type);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithWorkflows() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = Workflows.class;
        Workflows workflows = new Workflows();
        TestUtils.fillAllFields(workflows);

        System.out.println(workflows);
        String sampleXml = marshallingService.marshal(clazz, workflows);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithWorkflow() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = Workflow.class;
        Workflow workflow = new Workflow();
        TestUtils.fillAllFields(workflow);

        System.out.println(workflow);
        String sampleXml = marshallingService.marshal(clazz, workflow);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithStage() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = Stage.class;
        Stage stage = new Stage();
        TestUtils.fillAllFields(stage);

        System.out.println(stage);
        String sampleXml = marshallingService.marshal(clazz, stage);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithContainers() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = Containers.class;
        Containers containers = new Containers();
        TestUtils.fillAllFields(containers);

        System.out.println(containers);
        String sampleXml = marshallingService.marshal(clazz, containers);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithContainer() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = Container.class;
        Container container = new Container();
        TestUtils.fillAllFields(container);

        System.out.println(container);
        String sampleXml = marshallingService.marshal(clazz, container);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithLinks() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = Links.class;
        Links links = new Links();
        TestUtils.fillAllFields(links);

        System.out.println(links);
        String sampleXml = marshallingService.marshal(clazz, links);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithDetails() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = Details.class;
        Details details = new Details();
        TestUtils.fillAllFields(details);

        System.out.println(details);
        String sampleXml = marshallingService.marshal(clazz, details);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithSampleDetails() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = com.genologics.ri.sample.Details.class;
        com.genologics.ri.sample.Details details = new com.genologics.ri.sample.Details();
        TestUtils.fillAllFields(details);

        System.out.println(details);
        String sampleXml = marshallingService.marshal(clazz, details);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithStepDetails() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = Details.class;
        Details details = new Details();
        TestUtils.fillAllFields(details);

        System.out.println(details);
        String sampleXml = marshallingService.marshal(clazz, details);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithFileDetails() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = com.genologics.ri.file.Details.class;
        com.genologics.ri.file.Details details = new com.genologics.ri.file.Details();
        TestUtils.fillAllFields(details);

        System.out.println(details);
        String sampleXml = marshallingService.marshal(clazz, details);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithContainerTypes() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = ContainerTypes.class;
        ContainerTypes containerTypes = new ContainerTypes();
        TestUtils.fillAllFields(containerTypes);

        System.out.println(containerTypes);
        String sampleXml = marshallingService.marshal(clazz, containerTypes);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithContainerType() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = ContainerType.class;
        ContainerType containerType = new ContainerType();
        TestUtils.fillAllFields(containerType);

        System.out.println(containerType);
        String sampleXml = marshallingService.marshal(clazz, containerType);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithControlTypes() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = ControlTypes.class;
        ControlTypes controlTypes = new ControlTypes();
        TestUtils.fillAllFields(controlTypes);

        System.out.println(controlTypes);
        String sampleXml = marshallingService.marshal(clazz, controlTypes);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithControlType() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = ControlType.class;
        ControlType controlType = new ControlType();
        TestUtils.fillAllFields(controlType);

        System.out.println(controlType);
        String sampleXml = marshallingService.marshal(clazz, controlType);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithFile() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = File.class;
        File file = new File();
        TestUtils.fillAllFields(file);

        System.out.println(file);
        String sampleXml = marshallingService.marshal(clazz, file);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithInstruments() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = Instruments.class;
        Instruments instruments = new Instruments();
        TestUtils.fillAllFields(instruments);

        System.out.println(instruments);
        String sampleXml = marshallingService.marshal(clazz, instruments);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithInstrument() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = Instrument.class;
        Instrument instrument = new Instrument();
        TestUtils.fillAllFields(instrument);

        System.out.println(instrument);
        String sampleXml = marshallingService.marshal(clazz, instrument);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithLabs() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = Labs.class;
        Labs labs = new Labs();
        TestUtils.fillAllFields(labs);

        System.out.println(labs);
        String sampleXml = marshallingService.marshal(clazz, labs);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithLab() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = Lab.class;
        Lab lab = new Lab();
        TestUtils.fillAllFields(lab);

        System.out.println(lab);
        String sampleXml = marshallingService.marshal(clazz, lab);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithPermissions() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = Permissions.class;
        Permissions permissions = new Permissions();
        TestUtils.fillAllFields(permissions);

        System.out.println(permissions);
        String sampleXml = marshallingService.marshal(clazz, permissions);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithPermission() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = Permission.class;
        Permission permission = new Permission();
        TestUtils.fillAllFields(permission);

        System.out.println(permission);
        String sampleXml = marshallingService.marshal(clazz, permission);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithProcesses() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = Processes.class;
        Processes processes = new Processes();
        TestUtils.fillAllFields(processes);

        System.out.println(processes);
        String sampleXml = marshallingService.marshal(clazz, processes);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithProcess() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = com.genologics.ri.process.Process.class;
        com.genologics.ri.process.Process process = new com.genologics.ri.process.Process();
        TestUtils.fillAllFields(process);

        System.out.println(process);
        String sampleXml = marshallingService.marshal(clazz, process);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithProcessTemplates() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = ProcessTemplates.class;
        ProcessTemplates processTemplates = new ProcessTemplates();
        TestUtils.fillAllFields(processTemplates);

        System.out.println(processTemplates);
        String sampleXml = marshallingService.marshal(clazz, processTemplates);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithProcessTemplate() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = ProcessTemplate.class;
        ProcessTemplate processTemplate = new ProcessTemplate();
        TestUtils.fillAllFields(processTemplate);

        System.out.println(processTemplate);
        String sampleXml = marshallingService.marshal(clazz, processTemplate);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithProcessTypes() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = ProcessTypes.class;
        ProcessTypes processTypes = new ProcessTypes();
        TestUtils.fillAllFields(processTypes);

        System.out.println(processTypes);
        String sampleXml = marshallingService.marshal(clazz, processTypes);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithProcessType() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = ProcessType.class;
        ProcessType processType = new ProcessType();
        TestUtils.fillAllFields(processType);

        System.out.println(processType);
        String sampleXml = marshallingService.marshal(clazz, processType);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithProjects() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = Projects.class;
        Projects projects = new Projects();
        TestUtils.fillAllFields(projects);

        System.out.println(projects);
        String sampleXml = marshallingService.marshal(clazz, projects);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithProject() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = Project.class;
        Project project = new Project();
        TestUtils.fillAllFields(project);

        System.out.println(project);
        String sampleXml = marshallingService.marshal(clazz, project);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithQueue() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = Queue.class;
        Queue queue = new Queue();
        TestUtils.fillAllFields(queue);

        System.out.println(queue);
        String sampleXml = marshallingService.marshal(clazz, queue);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithReagentKits() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = ReagentKits.class;
        ReagentKits reagentKits = new ReagentKits();
        TestUtils.fillAllFields(reagentKits);

        System.out.println(reagentKits);
        String sampleXml = marshallingService.marshal(clazz, reagentKits);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithReagentKit() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = ReagentKit.class;
        ReagentKit reagentKit = new ReagentKit();
        TestUtils.fillAllFields(reagentKit);

        System.out.println(reagentKit);
        String sampleXml = marshallingService.marshal(clazz, reagentKit);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithReagentLots() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = ReagentLots.class;
        ReagentLots reagentLots = new ReagentLots();
        TestUtils.fillAllFields(reagentLots);

        System.out.println(reagentLots);
        String sampleXml = marshallingService.marshal(clazz, reagentLots);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithReagentLot() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = ReagentLots.class;
        ReagentLot reagentLot = new ReagentLot();
        TestUtils.fillAllFields(reagentLot);

        System.out.println(reagentLot);
        String sampleXml = marshallingService.marshal(clazz, reagentLot);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithReagentTypes() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = ReagentTypes.class;
        ReagentTypes reagentTypes = new ReagentTypes();
        TestUtils.fillAllFields(reagentTypes);

        System.out.println(reagentTypes);
        String sampleXml = marshallingService.marshal(clazz, reagentTypes);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithReagentType() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = ReagentType.class;
        ReagentType reagentType = new ReagentType();
        TestUtils.fillAllFields(reagentType);

        System.out.println(reagentType);
        String sampleXml = marshallingService.marshal(clazz, reagentType);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithResearcher() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = Researcher.class;
        Researcher researcher = new Researcher();
        TestUtils.fillAllFields(researcher);

        System.out.println(researcher);
        String sampleXml = marshallingService.marshal(clazz, researcher);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithRoles() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = Roles.class;
        Roles roles = new Roles();
        TestUtils.fillAllFields(roles);

        System.out.println(roles);
        String sampleXml = marshallingService.marshal(clazz, roles);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithRole() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = Role.class;
        Role role = new Role();
        TestUtils.fillAllFields(role);

        System.out.println(role);
        String sampleXml = marshallingService.marshal(clazz, role);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithRouting() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = Routing.class;
        Routing routing = new Routing();
        TestUtils.fillAllFields(routing);

        System.out.println(routing);
        String sampleXml = marshallingService.marshal(clazz, routing);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithSamples() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = Samples.class;
        Samples samples = new Samples();
        TestUtils.fillAllFields(samples);

        System.out.println(samples);
        String sampleXml = marshallingService.marshal(clazz, samples);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithSample() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = Sample.class;
        Sample sample = new Sample();
        TestUtils.fillAllFields(sample);

        System.out.println(sample);
        String sampleXml = marshallingService.marshal(clazz, sample);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithStepcreation() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = StepCreation.class;
        StepCreation stepCreation = new StepCreation();
        TestUtils.fillAllFields(stepCreation);

        System.out.println(stepCreation);
        String sampleXml = marshallingService.marshal(clazz, stepCreation);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithStepconfigurationStep() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = Step.class;
        Step step = new Step();
        TestUtils.fillAllFields(step);

        System.out.println(step);
        String sampleXml = marshallingService.marshal(clazz, step);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithActions() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = Actions.class;
        Actions actions = new Actions();
        TestUtils.fillAllFields(actions);

        System.out.println(actions);
        String sampleXml = marshallingService.marshal(clazz, actions);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithStepStep() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = com.genologics.ri.step.Step.class;
        com.genologics.ri.step.Step step = new com.genologics.ri.step.Step();
        TestUtils.fillAllFields(step);

        System.out.println(step);
        String sampleXml = marshallingService.marshal(clazz, step);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithPlacements() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = Placements.class;
        Placements placements = new Placements();
        TestUtils.fillAllFields(placements);

        System.out.println(placements);
        String sampleXml = marshallingService.marshal(clazz, placements);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithPools() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = Pools.class;
        Pools pools = new Pools();
        TestUtils.fillAllFields(pools);

        System.out.println(pools);
        String sampleXml = marshallingService.marshal(clazz, pools);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithProgramstatus() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = ProgramStatus.class;
        ProgramStatus programStatus = new ProgramStatus();
        TestUtils.fillAllFields(programStatus);

        System.out.println(programStatus);
        String sampleXml = marshallingService.marshal(clazz, programStatus);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithReagentsLots() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = Lots.class;
        Lots lots = new Lots();
        TestUtils.fillAllFields(lots);

        System.out.println(lots);
        String sampleXml = marshallingService.marshal(clazz, lots);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithReagents() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = Reagents.class;
        Reagents reagents = new Reagents();
        TestUtils.fillAllFields(reagents);

        System.out.println(reagents);
        String sampleXml = marshallingService.marshal(clazz, reagents);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    @Test
    public void roundTripWithSetup() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Class<?> clazz = Setup.class;
        Setup setup = new Setup();
        TestUtils.fillAllFields(setup);

        System.out.println(setup);
        String sampleXml = marshallingService.marshal(clazz, setup);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledPojo = UnmarshallingService.unmarshal(clazz, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

}
