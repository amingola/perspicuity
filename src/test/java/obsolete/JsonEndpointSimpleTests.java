package obsolete;

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
import com.genologics.ri.file.Files;
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
import com.genologics.ri.sample.Samplecreation;
import com.genologics.ri.sample.Samples;
import com.genologics.ri.stage.Stage;
import com.genologics.ri.step.*;
import com.genologics.ri.stepconfiguration.Step;
import com.genologics.ri.userdefined.Type;
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

public class JsonEndpointSimpleTests {

    private static MarshallingService marshallingService;
    private static UnmarshallingService unmarshallingService;
    private static NamespaceMapper namespaceMapper;

    /*public JsonEndpointTests(MarshallingService marshallingService){
        this.marshallingService = marshallingService;
    }*/

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

    /*@Test
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

        System.out.println("Resulting XML:\n" + sampleXml);

    }

    @Test
    void test2() throws JAXBException, ClassNotFoundException {

        Sample sample = new Sample();
        obsolete.TestUtils.fillAllFields(sample);

        System.out.println(sample);
        String sampleXml = marshallingService.marshal(Sample.class, sample);

        System.out.println("Resulting XML:\n" + sampleXml);

    }

    @Test
    void test3() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Links links = new Links();
        obsolete.TestUtils.fillAllFields(links);

        System.out.println(links);
        String sampleXml = marshallingService.marshal(Links.class, links);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(Links.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }*/

//    /*
//    Covers
//    GET /artifactgroups
//    GET /artifactgroups/{experimentid}
//    */
//    @Test
//    void _artifactgroups() throws JAXBException, ClassNotFoundException, JsonProcessingException {
//
//        Artifactgroup artifactGroup = new Artifactgroup();
//        obsolete.TestUtils.fillAllFields(artifactGroup);
//
//        System.out.println(artifactGroup);
//        String sampleXml = marshallingService.marshal(Artifactgroup.class, artifactGroup);
//
//        System.out.println("Resulting XML:\n" + sampleXml);
//
//        Object obj = unmarshallingService.unmarshal(Artifactgroup.class, sampleXml);
//        ObjectMapper objectMapper = new ObjectMapper();
//        String str = objectMapper.writeValueAsString(obj);
//
//        System.out.println(str);
//
//    }
//
//    /*
//    Covers
//    GET /artifacts
//    GET /artifacts/{limsid}
//    */
//    @Test
//    void _artifacts() throws JAXBException, ClassNotFoundException, JsonProcessingException {
//
//        Artifact artifact = new Artifact();
//        obsolete.TestUtils.fillAllFields(artifact);
//
//        System.out.println(artifact);
//        String sampleXml = marshallingService.marshal(Artifact.class, artifact);
//
//        System.out.println("Resulting XML:\n" + sampleXml);
//
//        Object obj = unmarshallingService.unmarshal(Artifact.class, sampleXml);
//        ObjectMapper objectMapper = new ObjectMapper();
//        String str = objectMapper.writeValueAsString(obj);
//
//        System.out.println(str);
//
//    }
//
//    @Test
//    void _links() throws JAXBException, ClassNotFoundException, JsonProcessingException {
//
//        Artifact artifact = new Artifact();
//        obsolete.TestUtils.fillAllFields(artifact);
//
//        System.out.println(artifact);
//        String sampleXml = marshallingService.marshal(Artifact.class, artifact);
//
//        System.out.println("Resulting XML:\n" + sampleXml);
//
//        Object obj = unmarshallingService.unmarshal(Artifact.class, sampleXml);
//        ObjectMapper objectMapper = new ObjectMapper();
//        String str = objectMapper.writeValueAsString(obj);
//
//        System.out.println(str);
//
//    }
//
//    @Test
//    void _details() throws JAXBException, ClassNotFoundException, JsonProcessingException {
//
//        Artifact artifact = new Artifact();
//        obsolete.TestUtils.fillAllFields(artifact);
//
//        System.out.println(artifact);
//        String sampleXml = marshallingService.marshal(Artifact.class, artifact);
//
//        System.out.println("Resulting XML:\n" + sampleXml);
//
//        Object obj = unmarshallingService.unmarshal(Artifact.class, sampleXml);
//        ObjectMapper objectMapper = new ObjectMapper();
//        String str = objectMapper.writeValueAsString(obj);
//
//        System.out.println(str);
//
//    }

    //Endpoint /{version}/artifactgroups | GET artifactgroup
    //Endpoint /{version}/artifactgroups/{experimentid} | GET artifactgroup
    @Test
    void _artifactgroups() throws JAXBException, ClassNotFoundException, JsonProcessingException {
        //roundTripWithArtifactgroup();
    }

    //Endpoint /{version}/artifacts | GET artifacts
    @Test
    void _artifacts() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Artifacts artifacts = new Artifacts();
        TestUtils.fillAllFields(artifacts);

        System.out.println(artifacts);
        String sampleXml = marshallingService.marshal(Artifacts.class, artifacts);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledArtifacts = unmarshallingService.unmarshal(Artifacts.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledArtifacts);
        System.out.println(jsonStr);

        String sampleXml2 = marshallingService.marshal(artifacts.getClass(), unmarshalledArtifacts.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);

    }

    //Endpoint /{version}/artifacts/{limsid} | GET artifact | PUT artifact returns artifact
    @Test
    void _artifacts_limsid() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        com.genologics.ri.artifact.Artifact artifact = new com.genologics.ri.artifact.Artifact();
        TestUtils.fillAllFields(artifact);

        System.out.println(artifact);
        String sampleXml = marshallingService.marshal(artifact.getClass(), artifact);

        System.out.println("Resulting XML:\n" + sampleXml);

        JAXBElement<?> unmarshalledArtifact = unmarshallingService.unmarshal(artifact.getClass(), sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledArtifact);
        System.out.println(jsonStr);

        //Complete the "round-trip" and assert equality
        String sampleXml2 = marshallingService.marshal(artifact.getClass(), unmarshalledArtifact.getValue());
        System.out.println("Resulting XML:\n" + sampleXml2);

        assertEquals(sampleXml, sampleXml2);


    }

    //Endpoint /{version}/artifacts/batch/retrieve | POST links returns details
    //Endpoint /{version}/artifacts/batch/update | POST details returns links
    //(there's a typo that says it returns details:
    //https://d10e8rzir0haj8.cloudfront.net/4.2/rest.version.artifacts.batch.update.html)
    @Test
    void _artifact_batch_retrieve_artifact_batch_update() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        /*Create and verify payload for "POST" with a "round-trip"*/

        //Create a mock POJO
        com.genologics.ri.Links links = new com.genologics.ri.Links();
        TestUtils.fillAllFields(links);
        System.out.println("com.genologics.ri.Links json object: " + links);

        //Create the XML payload for the "POST"
        String sampleXml = marshallingService.marshal(links.getClass(), links);
        System.out.println("Resulting com.genologics.ri.Links XML:\n" + sampleXml);

        //Verify the XML payload was valid by unmarshalling it
        JAXBElement<?> unmarshalledLinks = unmarshallingService.unmarshal(links.getClass(), sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println(objectMapper.writeValueAsString(unmarshalledLinks));

        //Complete the "round-trip" and assert equality
        String sampleXml2 = marshallingService.marshal(links.getClass(), unmarshalledLinks.getValue());
        assertEquals(sampleXml, sampleXml2);

        /*Create and verify response from "POST" with a "round-trip"*/

        //Create a mock POJO
        com.genologics.ri.artifact.Details details = new com.genologics.ri.artifact.Details();
        TestUtils.fillAllFields(details);
        System.out.println("com.genologics.ri.artifact.Details json object: " + details);

        //Create the XML payload for the "POST"
        String sampleXml3 = marshallingService.marshal(details.getClass(), details);
        System.out.println("Resulting com.genologics.ri.artifact.Details XML:\n" + sampleXml3);

        //Verify the XML payload was valid by unmarshalling it
        JAXBElement<?> unmarshalledDetails = unmarshallingService.unmarshal(details.getClass(), sampleXml3);
        System.out.println(objectMapper.writeValueAsString(unmarshalledDetails));

        //Complete the "round-trip" and assert equality
        String sampleXml4 = marshallingService.marshal(details.getClass(), unmarshalledDetails.getValue());
        assertEquals(sampleXml3, sampleXml4);

    }

    //This test is covered by the test above
    /*@Test
    void _artifact_batch_update() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Create and verify response from "POST" with a "round-trip"

        //Create a mock POJO
        com.genologics.ri.artifact.Details details = new com.genologics.ri.artifact.Details();
        obsolete.TestUtils.fillAllFields(details);
        System.out.println("com.genologics.ri.artifact.Details json object: " + details);

        //Create the XML payload for the "POST"
        String sampleXml = marshallingService.marshal(details.getClass(), details);
        System.out.println("Resulting com.genologics.ri.artifact.Details XML:\n" + sampleXml);

        //Verify the XML payload was valid by unmarshalling it
        ObjectMapper objectMapper = new ObjectMapper();
        Object obj = unmarshallingService.unmarshal(details.getClass(), sampleXml);
        System.out.println(objectMapper.writeValueAsString(obj));

        //Complete the "round-trip" and assert equality
        String sampleXml2 = marshallingService.marshal(details.getClass(), details);
        assertEquals(sampleXml, sampleXml2);

    }*/

    //Endpoint /{version}/configuration/protocols | GET protocols
    @Test
    void _configuration_protocols() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        //Create a mock POJO
        Class<?> clazz = com.genologics.ri.protocolconfiguration.Protocols.class;
        com.genologics.ri.protocolconfiguration.Protocols protocols = new com.genologics.ri.protocolconfiguration.Protocols();
        TestUtils.fillAllFields(protocols);
        System.out.println("com.genologics.ri.protocolconfiguration.Protocols json object: " + protocols);

        //Create the XML payload for the "POST"
        String sampleXml = marshallingService.marshal(clazz, protocols);
        System.out.println("Resulting com.genologics.ri.protocolconfiguration.Protocols XML:\n" + sampleXml);

        //Verify the XML payload was valid by unmarshalling it
        ObjectMapper objectMapper = new ObjectMapper();
        JAXBElement<?> unmarshalledProtocols = unmarshallingService.unmarshal(clazz, sampleXml);
        System.out.println(objectMapper.writeValueAsString(unmarshalledProtocols));

        //Complete the "round-trip" and assert equality
        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledProtocols.getValue());
        assertEquals(sampleXml, sampleXml2);

    }

    //Endpoint /{version}/configuration/protocols/{protocolid} | GET protocol
    @Test
    void _configuration_protocols_protocolid() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        //Create a mock POJO
        Class<?> clazz = com.genologics.ri.protocolconfiguration.Protocol.class;
        com.genologics.ri.protocolconfiguration.Protocol protocol = new com.genologics.ri.protocolconfiguration.Protocol();
        TestUtils.fillAllFields(protocol);
        System.out.println("com.genologics.ri.protocolconfiguration.Protocol json object: " + protocol);

        //Create the XML payload for the "POST"
        String sampleXml = marshallingService.marshal(clazz, protocol);
        System.out.println("Resulting com.genologics.ri.protocolconfiguration.Protocol XML:\n" + sampleXml);

        //Verify the XML payload was valid by unmarshalling it
        ObjectMapper objectMapper = new ObjectMapper();
        JAXBElement<?> unmarshalledProtocol = unmarshallingService.unmarshal(clazz, sampleXml);
        System.out.println(objectMapper.writeValueAsString(unmarshalledProtocol));

        //Complete the "round-trip" and assert equality
        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledProtocol.getValue());
        assertEquals(sampleXml, sampleXml2);

    }

    //Endpoint /{version}/configuration/protocols/{protocolid}/steps/{stepId} | GET step
    @Test
    void _configuration_protocols_protocolid_steps_stepId()
            throws JAXBException, ClassNotFoundException, JsonProcessingException {

        //Create a mock POJO
        Class<?> clazz = com.genologics.ri.stepconfiguration.Step.class;
        com.genologics.ri.stepconfiguration.Step step = new com.genologics.ri.stepconfiguration.Step();
        TestUtils.fillAllFields(step);
        System.out.println("com.genologics.ri.stepconfiguration.Step json object: " + step);

        //Create the XML payload for the "POST"
        String sampleXml = marshallingService.marshal(clazz, step);
        System.out.println("Resulting com.genologics.ri.stepconfiguration.Step XML:\n" + sampleXml);

        //Verify the XML payload was valid by unmarshalling it
        ObjectMapper objectMapper = new ObjectMapper();
        JAXBElement<?> unmarshalledStep = unmarshallingService.unmarshal(clazz, sampleXml);
        System.out.println(objectMapper.writeValueAsString(unmarshalledStep));

        //Complete the "round-trip" and assert equality
        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledStep.getValue());
        assertEquals(sampleXml, sampleXml2);

    }

    //Endpoint /{version}/configuration/udfs | GET udfs
    @Test
    void _configuration_udfs()
            throws JAXBException, ClassNotFoundException, JsonProcessingException {

        //Create a mock POJO
        Class<?> clazz = com.genologics.ri.configuration.Udfs.class;
        com.genologics.ri.configuration.Udfs udfs = new com.genologics.ri.configuration.Udfs();
        TestUtils.fillAllFields(udfs);
        System.out.println("com.genologics.ri.configuration.Udfs json object: " + udfs);

        //Create the XML payload for the "POST"
        String sampleXml = marshallingService.marshal(clazz, udfs);
        System.out.println("Resulting com.genologics.ri.configuration.Udfs XML:\n" + sampleXml);

        //Verify the XML payload was valid by unmarshalling it
        ObjectMapper objectMapper = new ObjectMapper();
        JAXBElement<?> unmarshalledUdfs = unmarshallingService.unmarshal(clazz, sampleXml);
        System.out.println(objectMapper.writeValueAsString(unmarshalledUdfs));

        //Complete the "round-trip" and assert equality
        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledUdfs.getValue());
        assertEquals(sampleXml, sampleXml2);

    }

    //Endpoint /{version}/configuration/udfs/{udfid} | GET field | PUT field returns field
    @Test
    void _configuration_udfs_udfid()
            throws JAXBException, ClassNotFoundException, JsonProcessingException {

        //Create a mock POJO
        Class<?> clazz = com.genologics.ri.configuration.Field.class;
        com.genologics.ri.configuration.Field field = new com.genologics.ri.configuration.Field();
        TestUtils.fillAllFields(field);
        System.out.println("com.genologics.ri.configuration.Field json object: " + field);

        //Create the XML payload for the "POST"
        String sampleXml = marshallingService.marshal(clazz, field);
        System.out.println("Resulting com.genologics.ri.configuration.Field XML:\n" + sampleXml);

        //Verify the XML payload was valid by unmarshalling it
        ObjectMapper objectMapper = new ObjectMapper();
        JAXBElement<?> unmarshalledStep = unmarshallingService.unmarshal(clazz, sampleXml);
        System.out.println(objectMapper.writeValueAsString(unmarshalledStep));

        //Complete the "round-trip" and assert equality
        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledStep.getValue());
        assertEquals(sampleXml, sampleXml2);

    }

    //Endpoint /{version}/configuration/udts GET udts
    @Test
    void _configuration_udts()
            throws JAXBException, ClassNotFoundException, JsonProcessingException {

        //Create a mock POJO
        Class<?> clazz = com.genologics.ri.configuration.Udts.class;
        com.genologics.ri.configuration.Udts udts = new com.genologics.ri.configuration.Udts();
        TestUtils.fillAllFields(udts);
        System.out.println("com.genologics.ri.configuration.Udts json object: " + udts);

        //Create the XML payload for the "POST"
        String sampleXml = marshallingService.marshal(clazz, udts);
        System.out.println("Resulting com.genologics.ri.configuration.Udts XML:\n" + sampleXml);

        //Verify the XML payload was valid by unmarshalling it
        ObjectMapper objectMapper = new ObjectMapper();
        JAXBElement<?> unmarshalledUdts = unmarshallingService.unmarshal(clazz, sampleXml);
        System.out.println(objectMapper.writeValueAsString(unmarshalledUdts));

        //Complete the "round-trip" and assert equality
        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledUdts.getValue());
        assertEquals(sampleXml, sampleXml2);

    }

    //Endpoint /{version}/configuration/udts/{udtid} | GET type
    @Test
    void _configuration_udts_udtid()
            throws JAXBException, ClassNotFoundException, JsonProcessingException {

        //Create a mock POJO
        Class<?> clazz = com.genologics.ri.configuration.Type.class;
        com.genologics.ri.configuration.Type type = new com.genologics.ri.configuration.Type();
        TestUtils.fillAllFields(type);
        System.out.println("com.genologics.ri.configuration.Type json object: " + type);

        //Create the XML payload for the "POST"
        String sampleXml = marshallingService.marshal(clazz, type);
        System.out.println("Resulting com.genologics.ri.configuration.Type XML:\n" + sampleXml);

        //Verify the XML payload was valid by unmarshalling it
        ObjectMapper objectMapper = new ObjectMapper();
        JAXBElement<?> unmarshalledType = unmarshallingService.unmarshal(clazz, sampleXml);
        System.out.println(objectMapper.writeValueAsString(unmarshalledType));

        //Complete the "round-trip" and assert equality
        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledType.getValue());
        assertEquals(sampleXml, sampleXml2);

    }

    //Endpoint /{version}/configuration/workflows | GET workflows
    @Test
    void _configuration_workflows()
            throws JAXBException, ClassNotFoundException, JsonProcessingException {

        //Create a mock POJO
        Class<?> clazz = com.genologics.ri.workflowconfiguration.Workflows.class;
        com.genologics.ri.workflowconfiguration.Workflows workflows = new com.genologics.ri.workflowconfiguration.Workflows();
        TestUtils.fillAllFields(workflows);
        System.out.println("com.genologics.ri.workflowconfiguration.Workflows json object: " + workflows);

        //Create the XML payload for the "POST"
        String sampleXml = marshallingService.marshal(clazz, workflows);
        System.out.println("Resulting com.genologics.ri.workflowconfiguration.Workflows XML:\n" + sampleXml);

        //Verify the XML payload was valid by unmarshalling it
        ObjectMapper objectMapper = new ObjectMapper();
        JAXBElement<?> unmarshalledWorkflows = unmarshallingService.unmarshal(clazz, sampleXml);
        System.out.println(objectMapper.writeValueAsString(unmarshalledWorkflows));

        //Complete the "round-trip" and assert equality
        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledWorkflows.getValue());
        assertEquals(sampleXml, sampleXml2);

    }

    //Endpoint /{version}/configuration/workflows/{workflowid} | GET workflow
    @Test
    void _configuration_workflows_workflowid()
            throws JAXBException, ClassNotFoundException, JsonProcessingException {

        //Create a mock POJO
        Class<?> clazz = com.genologics.ri.workflowconfiguration.Workflow.class;
        com.genologics.ri.workflowconfiguration.Workflow workflow = new com.genologics.ri.workflowconfiguration.Workflow();
        TestUtils.fillAllFields(workflow);
        System.out.println("com.genologics.ri.workflowconfiguration.Workflow json object: " + workflow);

        //Create the XML payload for the "POST"
        String sampleXml = marshallingService.marshal(clazz, workflow);
        System.out.println("Resulting com.genologics.ri.workflowconfiguration.Workflow XML:\n" + sampleXml);

        //Verify the XML payload was valid by unmarshalling it
        ObjectMapper objectMapper = new ObjectMapper();
        JAXBElement<?> unmarshalledWorkflow = unmarshallingService.unmarshal(clazz, sampleXml);
        System.out.println(objectMapper.writeValueAsString(unmarshalledWorkflow));

        //Complete the "round-trip" and assert equality
        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledWorkflow.getValue());
        assertEquals(sampleXml, sampleXml2);

    }

    //Endpoint /{version}/configuration/workflows/{workflowid}/stages/{stageid} | GET stage
    @Test
    void _configuration_workflows_workflowid_stages_stageid()
            throws JAXBException, ClassNotFoundException, JsonProcessingException {

        //Create a mock POJO
        Class<?> clazz = com.genologics.ri.stage.Stage.class;
        com.genologics.ri.stage.Stage stage = new com.genologics.ri.stage.Stage();
        TestUtils.fillAllFields(stage);
        System.out.println("com.genologics.ri.stage.Stage json object: " + stage);

        //Create the XML payload for the "POST"
        String sampleXml = marshallingService.marshal(clazz, stage);
        System.out.println("Resulting com.genologics.ri.stage.Stage XML:\n" + sampleXml);

        //Verify the XML payload was valid by unmarshalling it
        ObjectMapper objectMapper = new ObjectMapper();
        JAXBElement<?> unmarshalledStage = unmarshallingService.unmarshal(clazz, sampleXml);
        System.out.println(objectMapper.writeValueAsString(unmarshalledStage));

        //Complete the "round-trip" and assert equality
        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledStage.getValue());
        assertEquals(sampleXml, sampleXml2);

    }

    //Endpoint /{version}/containers | GET containers | POST container returns container
    //Endpoint /{version}/containers/{limsid} | GET container | PUT container returns container | DELETE container
    @Test
    void _containers()
            throws JAXBException, ClassNotFoundException, JsonProcessingException {

        //Create a mock POJO
        Class<?> clazz = com.genologics.ri.container.Containers.class;
        com.genologics.ri.container.Containers containers = new com.genologics.ri.container.Containers();
        TestUtils.fillAllFields(containers);
        System.out.println("com.genologics.ri.container.Containers json object: " + containers);

        //Create the XML payload for the "POST"
        String sampleXml = marshallingService.marshal(clazz, containers);
        System.out.println("Resulting com.genologics.ri.container.Containers XML:\n" + sampleXml);

        //Verify the XML payload was valid by unmarshalling it
        ObjectMapper objectMapper = new ObjectMapper();
        JAXBElement<?> unmarshalledContainers = unmarshallingService.unmarshal(clazz, sampleXml);
        System.out.println(objectMapper.writeValueAsString(unmarshalledContainers));

        //Complete the "round-trip" and assert equality
        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledContainers.getValue());
        assertEquals(sampleXml, sampleXml2);

        //Create a mock POJO
        clazz = com.genologics.ri.container.Container.class;
        com.genologics.ri.container.Container container = new com.genologics.ri.container.Container();
        TestUtils.fillAllFields(container);
        System.out.println("com.genologics.ri.container.Container json object: " + container);

        //Create the XML payload for the "POST"
        String sampleXml3 = marshallingService.marshal(clazz, container);
        System.out.println("Resulting com.genologics.ri.container.Container XML:\n" + sampleXml3);

        //Verify the XML payload was valid by unmarshalling it
        objectMapper = new ObjectMapper();
        JAXBElement<?> unmarshalledContainer = unmarshallingService.unmarshal(clazz, sampleXml3);
        System.out.println(objectMapper.writeValueAsString(unmarshalledContainer));

        //Complete the "round-trip" and assert equality
        String sampleXml4 = marshallingService.marshal(clazz, unmarshalledContainer.getValue());
        assertEquals(sampleXml3, sampleXml4);

    }


    //Endpoint /{version}/containers/batch/create | POST details | GET links
    //Endpoint /{version}/containers/batch/retrieve | POST links | GET details
    //Endpoint /{version}/containers/batch/update | POST details | GET links
    @Test
    void _containers_batch_create()
            throws JAXBException, ClassNotFoundException, JsonProcessingException {

        //Create a mock POJO
        Class<?> clazz = com.genologics.ri.container.Details.class;
        com.genologics.ri.container.Details details = new com.genologics.ri.container.Details();
        TestUtils.fillAllFields(details);
        System.out.println("com.genologics.ri.container.Details json object: " + details);

        //Create the XML payload for the "POST"
        String sampleXml = marshallingService.marshal(clazz, details);
        System.out.println("Resulting com.genologics.ri.container.Details XML:\n" + sampleXml);

        //Verify the XML payload was valid by unmarshalling it
        ObjectMapper objectMapper = new ObjectMapper();
        JAXBElement<?> unmarshalledDetails = unmarshallingService.unmarshal(clazz, sampleXml);
        System.out.println(objectMapper.writeValueAsString(unmarshalledDetails));

        //Complete the "round-trip" and assert equality
        String sampleXml2 = marshallingService.marshal(clazz, unmarshalledDetails.getValue());
        assertEquals(sampleXml, sampleXml2);

        //Create a mock POJO
        clazz = com.genologics.ri.Links.class;
        com.genologics.ri.Links links = new com.genologics.ri.Links();
        TestUtils.fillAllFields(links);
        System.out.println("com.genologics.ri.Links json object: " + links);

        //Create the XML payload for the "POST"
        String sampleXml3 = marshallingService.marshal(clazz, links);
        System.out.println("Resulting com.genologics.ri.Links XML:\n" + sampleXml);

        //Verify the XML payload was valid by unmarshalling it
        objectMapper = new ObjectMapper();
        JAXBElement<?> unmarshalledLinks = unmarshallingService.unmarshal(clazz, sampleXml3);
        System.out.println(objectMapper.writeValueAsString(unmarshalledLinks));

        //Complete the "round-trip" and assert equality
        String sampleXml4 = marshallingService.marshal(clazz, unmarshalledLinks.getValue());
        assertEquals(sampleXml3, sampleXml4);

    }






    //////////////////////////////////////////////////////////////////////////////////////////////
    /*@Test
    void _details() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Details details = new Details();
        obsolete.TestUtils.fillAllFields(details);

        System.out.println(details);
        String sampleXml = marshallingService.marshal(Details.class, details);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(Details.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _protocols() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Workflow.Protocols protocols = new Workflow.Protocols();
        obsolete.TestUtils.fillAllFields(protocols);

        System.out.println(protocols);
        String sampleXml = marshallingService.marshal(Workflow.Protocols.class, protocols);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(Workflow.Protocols.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _protocol() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Protocol protocol = new Protocol();
        obsolete.TestUtils.fillAllFields(protocol);

        System.out.println(protocol);
        String sampleXml = marshallingService.marshal(Protocol.class, protocol);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(Protocol.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _step() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Step step = new Step();
        obsolete.TestUtils.fillAllFields(step);

        System.out.println(step);
        String sampleXml = marshallingService.marshal(Step.class, step);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(Step.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _stepcreation() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        StepCreation stepcreation = new StepCreation();
        obsolete.TestUtils.fillAllFields(stepcreation);

        System.out.println(stepcreation);
        String sampleXml = marshallingService.marshal(StepCreation.class, stepcreation);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(StepCreation.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _workflows() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Workflows workflows = new Workflows();
        obsolete.TestUtils.fillAllFields(workflows);

        System.out.println(workflows);
        String sampleXml = marshallingService.marshal(Workflows.class, workflows);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(Workflows.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _workflow() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Workflow workflow = new Workflow();
        obsolete.TestUtils.fillAllFields(workflow);

        System.out.println(workflow);
        String sampleXml = marshallingService.marshal(Workflow.class, workflow);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(Workflow.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _stage() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Stage stage = new Stage();
        obsolete.TestUtils.fillAllFields(stage);

        System.out.println(stage);
        String sampleXml = marshallingService.marshal(Stage.class, stage);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(Stage.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _container() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Container container = new Container();
        obsolete.TestUtils.fillAllFields(container);

        System.out.println(container);
        String sampleXml = marshallingService.marshal(Container.class, container);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(Container.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _file() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        File file = new File();
        obsolete.TestUtils.fillAllFields(file);

        System.out.println(file);
        String sampleXml = marshallingService.marshal(File.class, file);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(File.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _files() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Files files = new Files();
        obsolete.TestUtils.fillAllFields(files);

        System.out.println(files);
        String sampleXml = marshallingService.marshal(Files.class, files);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(Files.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _instruments() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Instruments instruments = new Instruments();
        obsolete.TestUtils.fillAllFields(instruments);

        System.out.println(instruments);
        String sampleXml = marshallingService.marshal(Instruments.class, instruments);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(Instruments.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _instrument() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Instrument instrument = new Instrument();
        obsolete.TestUtils.fillAllFields(instrument);

        System.out.println(instrument);
        String sampleXml = marshallingService.marshal(Instrument.class, instrument);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(Instrument.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _labs() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Labs labs = new Labs();
        obsolete.TestUtils.fillAllFields(labs);

        System.out.println(labs);
        String sampleXml = marshallingService.marshal(Labs.class, labs);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(Labs.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _lab() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Lab lab = new Lab();
        obsolete.TestUtils.fillAllFields(lab);

        System.out.println(lab);
        String sampleXml = marshallingService.marshal(Lab.class, lab);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(Lab.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _permissions() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Permissions permissions = new Permissions();
        obsolete.TestUtils.fillAllFields(permissions);

        System.out.println(permissions);
        String sampleXml = marshallingService.marshal(Permissions.class, permissions);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(Permissions.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _permission() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Permission permission = new Permission();
        obsolete.TestUtils.fillAllFields(permission);

        System.out.println(permission);
        String sampleXml = marshallingService.marshal(Permission.class, permission);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(Permission.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _processes() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Processes processes = new Processes();
        obsolete.TestUtils.fillAllFields(processes);

        System.out.println(processes);
        String sampleXml = marshallingService.marshal(Processes.class, processes);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(Processes.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _process() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        com.genologics.ri.process.Process process = new com.genologics.ri.process.Process();
        obsolete.TestUtils.fillAllFields(process);

        System.out.println(process);
        String sampleXml = marshallingService.marshal(Process.class, process);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(Process.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _processtemplate() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        ProcessTemplate processtemplate = new ProcessTemplate();
        obsolete.TestUtils.fillAllFields(processtemplate);

        System.out.println(processtemplate);
        String sampleXml = marshallingService.marshal(ProcessTemplate.class, processtemplate);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(ProcessTemplate.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _processtemplates() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        ProcessTemplates processtemplates = new ProcessTemplates();
        obsolete.TestUtils.fillAllFields(processtemplates);

        System.out.println(processtemplates);
        String sampleXml = marshallingService.marshal(ProcessTemplates.class, processtemplates);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(ProcessTemplates.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _processtypes() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        ProcessTypes processtypes = new ProcessTypes();
        obsolete.TestUtils.fillAllFields(processtypes);

        System.out.println(processtypes);
        String sampleXml = marshallingService.marshal(ProcessTypes.class, processtypes);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(ProcessTypes.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _processtype() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        com.genologics.ri.process.ProcessType processtype = new com.genologics.ri.process.ProcessType();
        obsolete.TestUtils.fillAllFields(processtype);

        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(processtype);

        System.out.println(str);
        String sampleXml = marshallingService.marshal(com.genologics.ri.process.ProcessType.class, processtype);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(com.genologics.ri.process.ProcessType.class, sampleXml);
        str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _processtype2() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        com.genologics.ri.processtype.ProcessType processtype = new com.genologics.ri.processtype.ProcessType();
        obsolete.TestUtils.fillAllFields(processtype);

        System.out.println(processtype);
        String sampleXml = marshallingService.marshal(com.genologics.ri.processtype.ProcessType.class, processtype);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(com.genologics.ri.processtype.ProcessType.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _processtype3() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        com.genologics.ri.processtemplate.ProcessType processtype = new com.genologics.ri.processtemplate.ProcessType();
        obsolete.TestUtils.fillAllFields(processtype);

        System.out.println(processtype);
        String sampleXml = marshallingService.marshal(com.genologics.ri.processtemplate.ProcessType.class, processtype);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(com.genologics.ri.processtemplate.ProcessType.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _processtype4() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        com.genologics.ri.automation.ProcessType processtype = new com.genologics.ri.automation.ProcessType();
        obsolete.TestUtils.fillAllFields(processtype);

        System.out.println(processtype);
        String sampleXml = marshallingService.marshal(com.genologics.ri.automation.ProcessType.class, processtype);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(com.genologics.ri.automation.ProcessType.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _processtype5() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        com.genologics.ri.stepconfiguration.ProcessType processtype = new com.genologics.ri.stepconfiguration.ProcessType();
        obsolete.TestUtils.fillAllFields(processtype);

        System.out.println(processtype);
        String sampleXml = marshallingService.marshal(com.genologics.ri.stepconfiguration.ProcessType.class, processtype);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(com.genologics.ri.stepconfiguration.ProcessType.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _project() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Project project = new Project();
        obsolete.TestUtils.fillAllFields(project);

        System.out.println(project);
        String sampleXml = marshallingService.marshal(Project.class, project);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(Project.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _projects() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Projects projects = new Projects();
        obsolete.TestUtils.fillAllFields(projects);

        System.out.println(projects);
        String sampleXml = marshallingService.marshal(Projects.class, projects);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(Projects.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _queue() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Queue queue = new Queue();
        obsolete.TestUtils.fillAllFields(queue);

        System.out.println(queue);
        String sampleXml = marshallingService.marshal(Queue.class, queue);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(Queue.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _reagentkits() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        ReagentKits reagentkits = new ReagentKits();
        obsolete.TestUtils.fillAllFields(reagentkits);

        System.out.println(reagentkits);
        String sampleXml = marshallingService.marshal(ReagentKits.class, reagentkits);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(ReagentKits.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _reagentkit() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        ReagentKit reagentkit = new ReagentKit();
        obsolete.TestUtils.fillAllFields(reagentkit);

        System.out.println(reagentkit);
        String sampleXml = marshallingService.marshal(ReagentKit.class, reagentkit);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(ReagentKit.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _reagentlot() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        ReagentLot reagentlot = new ReagentLot();
        obsolete.TestUtils.fillAllFields(reagentlot);

        System.out.println(reagentlot);
        String sampleXml = marshallingService.marshal(ReagentLot.class, reagentlot);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(ReagentLot.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _reagentlots() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        ReagentLots reagentlots = new ReagentLots();
        obsolete.TestUtils.fillAllFields(reagentlots);

        System.out.println(reagentlots);
        String sampleXml = marshallingService.marshal(ReagentLots.class, reagentlots);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(ReagentLots.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _reagenttypes() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        ReagentTypes reagenttypes = new ReagentTypes();
        obsolete.TestUtils.fillAllFields(reagenttypes);

        System.out.println(reagenttypes);
        String sampleXml = marshallingService.marshal(ReagentTypes.class, reagenttypes);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(ReagentTypes.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _reagenttype() throws JAXBException, ClassNotFoundException, JsonProcessingException {
        ReagentType reagenttype = new ReagentType();
        obsolete.TestUtils.fillAllFields(reagenttype);

        System.out.println(reagenttype);
        String sampleXml = marshallingService.marshal(ReagentType.class, reagenttype);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(ReagentType.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _researcher() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Researcher researcher = new Researcher();
        obsolete.TestUtils.fillAllFields(researcher);

        System.out.println(researcher);
        String sampleXml = marshallingService.marshal(Researcher.class, researcher);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(Researcher.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _roles() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Roles roles = new Roles();
        obsolete.TestUtils.fillAllFields(roles);

        System.out.println(roles);
        String sampleXml = marshallingService.marshal(Roles.class, roles);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(Roles.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _role() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Role role = new Role();
        obsolete.TestUtils.fillAllFields(role);

        System.out.println(role);
        String sampleXml = marshallingService.marshal(Role.class, role);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(Role.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _routing() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Routing routing = new Routing();
        obsolete.TestUtils.fillAllFields(routing);

        System.out.println(routing);
        String sampleXml = marshallingService.marshal(Routing.class, routing);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(Routing.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _samples() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Samples samples = new Samples();
        obsolete.TestUtils.fillAllFields(samples);

        System.out.println(samples);
        String sampleXml = marshallingService.marshal(Samples.class, samples);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(Samples.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _sample() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Sample sample = new Sample();
        obsolete.TestUtils.fillAllFields(sample);

        System.out.println(sample);
        String sampleXml = marshallingService.marshal(Sample.class, sample);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(Sample.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _samplecreation() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Samplecreation samplecreation = new Samplecreation();
        obsolete.TestUtils.fillAllFields(samplecreation);

        System.out.println(samplecreation);
        String sampleXml = marshallingService.marshal(Samplecreation.class, samplecreation);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(Samplecreation.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _actions() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Actions actions = new Actions();
        obsolete.TestUtils.fillAllFields(actions);

        System.out.println(actions);
        String sampleXml = marshallingService.marshal(Actions.class, actions);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(Actions.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _placements() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Placements placements = new Placements();
        obsolete.TestUtils.fillAllFields(placements);

        System.out.println(placements);
        String sampleXml = marshallingService.marshal(Placements.class, placements);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(Placements.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _pools() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Pools pools = new Pools();
        obsolete.TestUtils.fillAllFields(pools);

        System.out.println(pools);
        String sampleXml = marshallingService.marshal(Pools.class, pools);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(Pools.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _programstatus() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        ProgramStatus programstatus = new ProgramStatus();
        obsolete.TestUtils.fillAllFields(programstatus);

        System.out.println(programstatus);
        String sampleXml = marshallingService.marshal(ProgramStatus.class, programstatus);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(ProgramStatus.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _lots() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        ReagentLots lots = new ReagentLots();
        obsolete.TestUtils.fillAllFields(lots);

        System.out.println(lots);
        String sampleXml = marshallingService.marshal(ReagentLots.class, lots);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(ReagentLots.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _reagents() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Reagents reagents = new Reagents();
        obsolete.TestUtils.fillAllFields(reagents);

        System.out.println(reagents);
        String sampleXml = marshallingService.marshal(Reagents.class, reagents);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(Reagents.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _setup() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Setup setup = new Setup();
        obsolete.TestUtils.fillAllFields(setup);

        System.out.println(setup);
        String sampleXml = marshallingService.marshal(Setup.class, setup);

        System.out.println("Resulting XML:\n" + sampleXml);

        Object obj = unmarshallingService.unmarshal(Setup.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }*/

    //////////////////////////////////////////////////////////////////////////////////////////////
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
