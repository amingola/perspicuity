import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.genologics.ri.Links;
import com.genologics.ri.container.Container;
import com.genologics.ri.controltype.ControlType;
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
import com.genologics.ri.processtype.ProcessTypes;
import com.genologics.ri.project.Project;
import com.genologics.ri.project.Projects;
import com.genologics.ri.protocolconfiguration.Protocol;
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
import com.genologics.ri.sample.Details;
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

import javax.xml.bind.JAXBException;

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

    @Test
    void test3() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Links links = new Links();
        TestUtils.fillAllFields(links);

        System.out.println(links);
        String sampleXml = marshallingService.marshal(Links.class, links);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(Links.class, sampleXml);
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
//        TestUtils.fillAllFields(artifactGroup);
//
//        System.out.println(artifactGroup);
//        String sampleXml = marshallingService.marshal(Artifactgroup.class, artifactGroup);
//
//        System.out.println("Resulting sample: " + sampleXml);
//
//        Object obj = UnmarshallingService.unmarshal(Artifactgroup.class, sampleXml);
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
//        TestUtils.fillAllFields(artifact);
//
//        System.out.println(artifact);
//        String sampleXml = marshallingService.marshal(Artifact.class, artifact);
//
//        System.out.println("Resulting sample: " + sampleXml);
//
//        Object obj = UnmarshallingService.unmarshal(Artifact.class, sampleXml);
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
//        TestUtils.fillAllFields(artifact);
//
//        System.out.println(artifact);
//        String sampleXml = marshallingService.marshal(Artifact.class, artifact);
//
//        System.out.println("Resulting sample: " + sampleXml);
//
//        Object obj = UnmarshallingService.unmarshal(Artifact.class, sampleXml);
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
//        TestUtils.fillAllFields(artifact);
//
//        System.out.println(artifact);
//        String sampleXml = marshallingService.marshal(Artifact.class, artifact);
//
//        System.out.println("Resulting sample: " + sampleXml);
//
//        Object obj = UnmarshallingService.unmarshal(Artifact.class, sampleXml);
//        ObjectMapper objectMapper = new ObjectMapper();
//        String str = objectMapper.writeValueAsString(obj);
//
//        System.out.println(str);
//
//    }

    @Test
    void _links() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Links links = new Links();
        TestUtils.fillAllFields(links);

        System.out.println(links);
        String sampleXml = marshallingService.marshal(Links.class, links);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(Links.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _details() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Details details = new Details();
        TestUtils.fillAllFields(details);

        System.out.println(details);
        String sampleXml = marshallingService.marshal(Details.class, details);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(Details.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _protocols() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Workflow.Protocols protocols = new Workflow.Protocols();
        TestUtils.fillAllFields(protocols);

        System.out.println(protocols);
        String sampleXml = marshallingService.marshal(Workflow.Protocols.class, protocols);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(Workflow.Protocols.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _protocol() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Protocol protocol = new Protocol();
        TestUtils.fillAllFields(protocol);

        System.out.println(protocol);
        String sampleXml = marshallingService.marshal(Protocol.class, protocol);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(Protocol.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _step() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Step step = new Step();
        TestUtils.fillAllFields(step);

        System.out.println(step);
        String sampleXml = marshallingService.marshal(Step.class, step);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(Step.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _stepcreation() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        StepCreation stepcreation = new StepCreation();
        TestUtils.fillAllFields(stepcreation);

        System.out.println(stepcreation);
        String sampleXml = marshallingService.marshal(StepCreation.class, stepcreation);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(StepCreation.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _workflows() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Workflows workflows = new Workflows();
        TestUtils.fillAllFields(workflows);

        System.out.println(workflows);
        String sampleXml = marshallingService.marshal(Workflows.class, workflows);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(Workflows.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _workflow() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Workflow workflow = new Workflow();
        TestUtils.fillAllFields(workflow);

        System.out.println(workflow);
        String sampleXml = marshallingService.marshal(Workflow.class, workflow);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(Workflow.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _stage() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Stage stage = new Stage();
        TestUtils.fillAllFields(stage);

        System.out.println(stage);
        String sampleXml = marshallingService.marshal(Stage.class, stage);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(Stage.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _container() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Container container = new Container();
        TestUtils.fillAllFields(container);

        System.out.println(container);
        String sampleXml = marshallingService.marshal(Container.class, container);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(Container.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _file() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        File file = new File();
        TestUtils.fillAllFields(file);

        System.out.println(file);
        String sampleXml = marshallingService.marshal(File.class, file);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(File.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _files() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Files files = new Files();
        TestUtils.fillAllFields(files);

        System.out.println(files);
        String sampleXml = marshallingService.marshal(Files.class, files);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(Files.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _instruments() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Instruments instruments = new Instruments();
        TestUtils.fillAllFields(instruments);

        System.out.println(instruments);
        String sampleXml = marshallingService.marshal(Instruments.class, instruments);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(Instruments.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _instrument() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Instrument instrument = new Instrument();
        TestUtils.fillAllFields(instrument);

        System.out.println(instrument);
        String sampleXml = marshallingService.marshal(Instrument.class, instrument);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(Instrument.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _labs() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Labs labs = new Labs();
        TestUtils.fillAllFields(labs);

        System.out.println(labs);
        String sampleXml = marshallingService.marshal(Labs.class, labs);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(Labs.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _lab() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Lab lab = new Lab();
        TestUtils.fillAllFields(lab);

        System.out.println(lab);
        String sampleXml = marshallingService.marshal(Lab.class, lab);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(Lab.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _permissions() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Permissions permissions = new Permissions();
        TestUtils.fillAllFields(permissions);

        System.out.println(permissions);
        String sampleXml = marshallingService.marshal(Permissions.class, permissions);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(Permissions.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _permission() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Permission permission = new Permission();
        TestUtils.fillAllFields(permission);

        System.out.println(permission);
        String sampleXml = marshallingService.marshal(Permission.class, permission);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(Permission.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _processes() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Processes processes = new Processes();
        TestUtils.fillAllFields(processes);

        System.out.println(processes);
        String sampleXml = marshallingService.marshal(Processes.class, processes);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(Processes.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _process() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        com.genologics.ri.process.Process process = new com.genologics.ri.process.Process();
        TestUtils.fillAllFields(process);

        System.out.println(process);
        String sampleXml = marshallingService.marshal(Process.class, process);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(Process.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _processtemplate() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        ProcessTemplate processtemplate = new ProcessTemplate();
        TestUtils.fillAllFields(processtemplate);

        System.out.println(processtemplate);
        String sampleXml = marshallingService.marshal(ProcessTemplate.class, processtemplate);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(ProcessTemplate.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _processtemplates() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        ProcessTemplates processtemplates = new ProcessTemplates();
        TestUtils.fillAllFields(processtemplates);

        System.out.println(processtemplates);
        String sampleXml = marshallingService.marshal(ProcessTemplates.class, processtemplates);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(ProcessTemplates.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _processtypes() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        ProcessTypes processtypes = new ProcessTypes();
        TestUtils.fillAllFields(processtypes);

        System.out.println(processtypes);
        String sampleXml = marshallingService.marshal(ProcessTypes.class, processtypes);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(ProcessTypes.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _processtype() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        com.genologics.ri.process.ProcessType processtype = new com.genologics.ri.process.ProcessType();
        TestUtils.fillAllFields(processtype);

        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(processtype);

        System.out.println(str);
        String sampleXml = marshallingService.marshal(com.genologics.ri.process.ProcessType.class, processtype);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(com.genologics.ri.process.ProcessType.class, sampleXml);
        str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    /*@Test
    void _processtype2() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        com.genologics.ri.processtype.ProcessType processtype = new com.genologics.ri.processtype.ProcessType();
        TestUtils.fillAllFields(processtype);

        System.out.println(processtype);
        String sampleXml = marshallingService.marshal(com.genologics.ri.processtype.ProcessType.class, processtype);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(com.genologics.ri.processtype.ProcessType.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _processtype3() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        com.genologics.ri.processtemplate.ProcessType processtype = new com.genologics.ri.processtemplate.ProcessType();
        TestUtils.fillAllFields(processtype);

        System.out.println(processtype);
        String sampleXml = marshallingService.marshal(com.genologics.ri.processtemplate.ProcessType.class, processtype);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(com.genologics.ri.processtemplate.ProcessType.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _processtype4() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        com.genologics.ri.automation.ProcessType processtype = new com.genologics.ri.automation.ProcessType();
        TestUtils.fillAllFields(processtype);

        System.out.println(processtype);
        String sampleXml = marshallingService.marshal(com.genologics.ri.automation.ProcessType.class, processtype);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(com.genologics.ri.automation.ProcessType.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _processtype5() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        com.genologics.ri.stepconfiguration.ProcessType processtype = new com.genologics.ri.stepconfiguration.ProcessType();
        TestUtils.fillAllFields(processtype);

        System.out.println(processtype);
        String sampleXml = marshallingService.marshal(com.genologics.ri.stepconfiguration.ProcessType.class, processtype);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(com.genologics.ri.stepconfiguration.ProcessType.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }*/

    @Test
    void _project() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Project project = new Project();
        TestUtils.fillAllFields(project);

        System.out.println(project);
        String sampleXml = marshallingService.marshal(Project.class, project);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(Project.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _projects() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Projects projects = new Projects();
        TestUtils.fillAllFields(projects);

        System.out.println(projects);
        String sampleXml = marshallingService.marshal(Projects.class, projects);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(Projects.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _queue() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Queue queue = new Queue();
        TestUtils.fillAllFields(queue);

        System.out.println(queue);
        String sampleXml = marshallingService.marshal(Queue.class, queue);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(Queue.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _reagentkits() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        ReagentKits reagentkits = new ReagentKits();
        TestUtils.fillAllFields(reagentkits);

        System.out.println(reagentkits);
        String sampleXml = marshallingService.marshal(ReagentKits.class, reagentkits);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(ReagentKits.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _reagentkit() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        ReagentKit reagentkit = new ReagentKit();
        TestUtils.fillAllFields(reagentkit);

        System.out.println(reagentkit);
        String sampleXml = marshallingService.marshal(ReagentKit.class, reagentkit);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(ReagentKit.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _reagentlot() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        ReagentLot reagentlot = new ReagentLot();
        TestUtils.fillAllFields(reagentlot);

        System.out.println(reagentlot);
        String sampleXml = marshallingService.marshal(ReagentLot.class, reagentlot);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(ReagentLot.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _reagentlots() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        ReagentLots reagentlots = new ReagentLots();
        TestUtils.fillAllFields(reagentlots);

        System.out.println(reagentlots);
        String sampleXml = marshallingService.marshal(ReagentLots.class, reagentlots);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(ReagentLots.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _reagenttypes() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        ReagentTypes reagenttypes = new ReagentTypes();
        TestUtils.fillAllFields(reagenttypes);

        System.out.println(reagenttypes);
        String sampleXml = marshallingService.marshal(ReagentTypes.class, reagenttypes);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(ReagentTypes.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _reagenttype() throws JAXBException, ClassNotFoundException, JsonProcessingException {
        ReagentType reagenttype = new ReagentType();
        TestUtils.fillAllFields(reagenttype);

        System.out.println(reagenttype);
        String sampleXml = marshallingService.marshal(ReagentType.class, reagenttype);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(ReagentType.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _researcher() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Researcher researcher = new Researcher();
        TestUtils.fillAllFields(researcher);

        System.out.println(researcher);
        String sampleXml = marshallingService.marshal(Researcher.class, researcher);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(Researcher.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _roles() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Roles roles = new Roles();
        TestUtils.fillAllFields(roles);

        System.out.println(roles);
        String sampleXml = marshallingService.marshal(Roles.class, roles);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(Roles.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _role() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Role role = new Role();
        TestUtils.fillAllFields(role);

        System.out.println(role);
        String sampleXml = marshallingService.marshal(Role.class, role);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(Role.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _routing() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Routing routing = new Routing();
        TestUtils.fillAllFields(routing);

        System.out.println(routing);
        String sampleXml = marshallingService.marshal(Routing.class, routing);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(Routing.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _samples() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Samples samples = new Samples();
        TestUtils.fillAllFields(samples);

        System.out.println(samples);
        String sampleXml = marshallingService.marshal(Samples.class, samples);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(Samples.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _sample() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Sample sample = new Sample();
        TestUtils.fillAllFields(sample);

        System.out.println(sample);
        String sampleXml = marshallingService.marshal(Sample.class, sample);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(Sample.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _samplecreation() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Samplecreation samplecreation = new Samplecreation();
        TestUtils.fillAllFields(samplecreation);

        System.out.println(samplecreation);
        String sampleXml = marshallingService.marshal(Samplecreation.class, samplecreation);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(Samplecreation.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _actions() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Actions actions = new Actions();
        TestUtils.fillAllFields(actions);

        System.out.println(actions);
        String sampleXml = marshallingService.marshal(Actions.class, actions);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(Actions.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _placements() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Placements placements = new Placements();
        TestUtils.fillAllFields(placements);

        System.out.println(placements);
        String sampleXml = marshallingService.marshal(Placements.class, placements);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(Placements.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _pools() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Pools pools = new Pools();
        TestUtils.fillAllFields(pools);

        System.out.println(pools);
        String sampleXml = marshallingService.marshal(Pools.class, pools);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(Pools.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _programstatus() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        ProgramStatus programstatus = new ProgramStatus();
        TestUtils.fillAllFields(programstatus);

        System.out.println(programstatus);
        String sampleXml = marshallingService.marshal(ProgramStatus.class, programstatus);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(ProgramStatus.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _lots() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        ReagentLots lots = new ReagentLots();
        TestUtils.fillAllFields(lots);

        System.out.println(lots);
        String sampleXml = marshallingService.marshal(ReagentLots.class, lots);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(ReagentLots.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _reagents() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Reagents reagents = new Reagents();
        TestUtils.fillAllFields(reagents);

        System.out.println(reagents);
        String sampleXml = marshallingService.marshal(Reagents.class, reagents);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(Reagents.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

    }

    @Test
    void _setup() throws JAXBException, ClassNotFoundException, JsonProcessingException {

        Setup setup = new Setup();
        TestUtils.fillAllFields(setup);

        System.out.println(setup);
        String sampleXml = marshallingService.marshal(Setup.class, setup);

        System.out.println("Resulting sample: " + sampleXml);

        Object obj = UnmarshallingService.unmarshal(Setup.class, sampleXml);
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(obj);

        System.out.println(str);

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
