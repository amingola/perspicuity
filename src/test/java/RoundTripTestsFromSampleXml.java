import com.fasterxml.jackson.databind.ObjectMapper;
import com.perspicuity.NamespaceMapper;
import com.perspicuity.service.MarshallingService;
import com.perspicuity.service.UnmarshallingService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoundTripTestsFromSampleXml {

    private static final String examplePayloadsDir = "src/main/resources/example_payloads/";
    private static MarshallingService marshallingService;
    private static UnmarshallingService unmarshallingService;

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

    @Test
    public void roundTripWithArtifactArtifact() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.artifact.Artifact.class;

        String xml = getExampleXmlFromFile("art_artifact.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithArtifactArtifacts() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.artifact.Artifacts.class;

        String xml = getExampleXmlFromFile("art_artifacts.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithArtifactDetails() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.artifact.Details.class;

        String xml = getExampleXmlFromFile("art_details.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithArtifactgroupArtifactgroup() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.artifactgroup.Artifactgroup.class;

        String xml = getExampleXmlFromFile("artgr_artifactgroup.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithArtifactgroupArtifactgroups() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.artifactgroup.Artifactgroups.class;

        String xml = getExampleXmlFromFile("artgr_artifactgroups.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithConfigurationField() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.configuration.Field.class;

        String xml = getExampleXmlFromFile("cnf_field.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithConfigurationType() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.configuration.Type.class;

        String xml = getExampleXmlFromFile("cnf_type.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithConfigurationUdfconfigLink() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.configuration.UdfconfigLink.class;

        String xml = getExampleXmlFromFile("cnf_udfconfig-link.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithConfigurationUdfs() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.configuration.Udfs.class;

        String xml = getExampleXmlFromFile("cnf_udfs.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithConfigurationUdtconfigLink() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.configuration.UdtconfigLink.class;

        String xml = getExampleXmlFromFile("cnf_udtconfig-link.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithConfigurationUdts() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.configuration.Udts.class;

        String xml = getExampleXmlFromFile("cnf_udts.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithContainerContainer() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.container.Container.class;

        String xml = getExampleXmlFromFile("con_container.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithContainerContainers() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.container.Containers.class;

        String xml = getExampleXmlFromFile("con_containers.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithContainerDetails() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.container.Details.class;

        String xml = getExampleXmlFromFile("con_details.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithContainerTypeContainerType() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.containertype.ContainerType.class;

        String xml = getExampleXmlFromFile("ctp_container-type.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithContainerTypeContainerTypes() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.containertype.ContainerTypes.class;

        String xml = getExampleXmlFromFile("ctp_container-types.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithControlTypeControlType() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.controltype.ControlType.class;

        String xml = getExampleXmlFromFile("ctrltp_control-type.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithControlTypeControlTypes() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.controltype.ControlTypes.class;

        String xml = getExampleXmlFromFile("ctrltp_control-types.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithExceptionException() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.exception.Exception.class;

        String xml = getExampleXmlFromFile("exc_exception.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithFileDetails() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.file.Details.class;

        String xml = getExampleXmlFromFile("file_details.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithFileFile() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.file.File.class;

        String xml = getExampleXmlFromFile("file_file.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithFileFiles() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.file.Files.class;

        String xml = getExampleXmlFromFile("file_files.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithInstrumentInstrument() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.instrument.Instrument.class;

        String xml = getExampleXmlFromFile("inst_instrument.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithInstrumentInstruments() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.instrument.Instruments.class;

        String xml = getExampleXmlFromFile("inst_instruments.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithInstrumentTypeInstrumentType() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.instrumenttype.InstrumentType.class;

        String xml = getExampleXmlFromFile("itp_instrument-type.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithInstrumentTypeInstrumentTypes() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.instrumenttype.InstrumentTypes.class;

        String xml = getExampleXmlFromFile("itp_instrument-types.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithReagentKitReagentKit() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.reagentkit.ReagentKit.class;

        String xml = getExampleXmlFromFile("kit_reagent-kit.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithReagentKitReagentKits() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.reagentkit.ReagentKits.class;

        String xml = getExampleXmlFromFile("kit_reagent-kits.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithLabLab() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.lab.Lab.class;

        String xml = getExampleXmlFromFile("lab_lab.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithLabLabs() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.lab.Labs.class;

        String xml = getExampleXmlFromFile("lab_labs.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithReagentLotReagentLot() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.reagentlot.ReagentLot.class;

        String xml = getExampleXmlFromFile("lot_reagent-lot.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithReagentLotReagentLots() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.reagentlot.ReagentLots.class;

        String xml = getExampleXmlFromFile("lot_reagent-lots.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithPermissionPermission() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.permission.Permission.class;

        String xml = getExampleXmlFromFile("perm_permission.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithPermissionPermissions() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.permission.Permissions.class;

        String xml = getExampleXmlFromFile("perm_permissions.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithProcessProcess() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.process.Process.class;

        String xml = getExampleXmlFromFile("prc_process.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithProcessProcesses() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.process.Processes.class;

        String xml = getExampleXmlFromFile("prc_processes.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithProjectProject() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.project.Project.class;

        String xml = getExampleXmlFromFile("prj_project.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithProjectProjects() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.project.Projects.class;

        String xml = getExampleXmlFromFile("prj_projects.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithProtocolconfigurationProtocol() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.protocolconfiguration.Protocol.class;

        String xml = getExampleXmlFromFile("protcnf_protocol.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithProtocolconfigurationProtocols() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.protocolconfiguration.Protocols.class;

        String xml = getExampleXmlFromFile("protcnf_protocols.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithStepconfigurationStep() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.stepconfiguration.Step.class;

        String xml = getExampleXmlFromFile("protstepcnf_step.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithProcessexecutionProcess() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.processexecution.Process.class;

        String xml = getExampleXmlFromFile("prx_process.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithProcesstemplateProcessTemplate() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.processtemplate.ProcessTemplate.class;

        String xml = getExampleXmlFromFile("ptm_process-template.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithProcesstemplateProcessTemplates() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.processtemplate.ProcessTemplates.class;

        String xml = getExampleXmlFromFile("ptm_process-templates.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithProcesstypeProcessType() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.processtype.ProcessType.class;

        String xml = getExampleXmlFromFile("ptp_process-type.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithProcesstypeProcessTypes() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.processtype.ProcessTypes.class;

        String xml = getExampleXmlFromFile("ptp_process-types.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithQueueQueue() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.queue.Queue.class;

        String xml = getExampleXmlFromFile("que_queue.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithResearcherResearcher() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.researcher.Researcher.class;

        String xml = getExampleXmlFromFile("res_researcher.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithResearcherResearchers() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.researcher.Researchers.class;

        String xml = getExampleXmlFromFile("res_researchers.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithIndex() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.Index.class;

        String xml = getExampleXmlFromFile("ri_index.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithLinks() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.Links.class;

        String xml = getExampleXmlFromFile("ri_links.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithRoleRole() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.role.Role.class;

        String xml = getExampleXmlFromFile("role_role.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithRoleRoles() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.role.Roles.class;

        String xml = getExampleXmlFromFile("role_roles.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithRoutingRouting() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.routing.Routing.class;

        String xml = getExampleXmlFromFile("rt_routing.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithReagentTypeReagentType() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.reagenttype.ReagentType.class;

        String xml = getExampleXmlFromFile("rtp_reagent-type.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithReagentTypeReagentTypes() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.reagenttype.ReagentTypes.class;

        String xml = getExampleXmlFromFile("rtp_reagent-types.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithSampleDetails() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.sample.Details.class;

        String xml = getExampleXmlFromFile("smp_details.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithSampleSample() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.sample.Sample.class;

        String xml = getExampleXmlFromFile("smp_sample.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithSampleSamples() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.sample.Samples.class;

        String xml = getExampleXmlFromFile("smp_samples.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithSampleSamplecreation() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.sample.Samplecreation.class;

        String xml = getExampleXmlFromFile("smp_samplecreation.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithStageStage() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.stage.Stage.class;

        String xml = getExampleXmlFromFile("stg_stage.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithStepAction() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.step.Actions.class;

        String xml = getExampleXmlFromFile("stp_actions.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithStepDetails() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.step.Details.class;

        String xml = getExampleXmlFromFile("stp_details.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithStepPlacements() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.step.Placements.class;

        String xml = getExampleXmlFromFile("stp_placements.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithStepPools() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.step.Pools.class;

        String xml = getExampleXmlFromFile("stp_pools.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithStepProgramStatus() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.step.ProgramStatus.class;

        String xml = getExampleXmlFromFile("stp_program-status.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithStepReagents() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.step.Reagents.class;

        String xml = getExampleXmlFromFile("stp_reagents.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        //System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithStepReagentLots() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.step.Lots.class;

        String xml = getExampleXmlFromFile("stp_reagents-lots.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithStepSetup() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.step.Setup.class;

        String xml = getExampleXmlFromFile("stp_setup.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        //System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithStepStep() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.step.Step.class;

        String xml = getExampleXmlFromFile("stp_step.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        //System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithStepStepCreation() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.step.StepCreation.class;

        String xml = getExampleXmlFromFile("stp_step-creation.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        //System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithVersionVersion() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.version.Version.class;

        String xml = getExampleXmlFromFile("ver_version.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        //System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithVersionVersions() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.version.Versions.class;

        String xml = getExampleXmlFromFile("ver_versions.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        //System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithWorkflowWorkflow() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.workflowconfiguration.Workflow.class;

        String xml = getExampleXmlFromFile("wkfcnf_workflow.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        //System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void roundTripWithWorkflowWorkflows() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.workflowconfiguration.Workflows.class;

        String xml = getExampleXmlFromFile("wkfcnf_workflows.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

        //Compare json strings, as the generated POJOs lack a proper equals()
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = objectMapper.writeValueAsString(unmarshalledPojo);
        String jsonStr2 = objectMapper.writeValueAsString(unmarshalledPojo2);
        //System.out.println(jsonStr + "\n\n" + jsonStr2);
        assertEquals(jsonStr, jsonStr2);

    }

    @Test
    public void old_roundTripWithProcessTypes() throws JAXBException, ClassNotFoundException, IOException {

        Class<?> clazz = com.genologics.ri.processtype.ProcessTypes.class;

        String xml = getExampleXmlFromFile("ptp_process-types.xml");
        JAXBElement<?> unmarshalledPojo = unmarshallingService.unmarshal(clazz, xml);

        String xml2 = marshallingService.marshal(clazz, unmarshalledPojo.getValue());
        System.out.println(xml + "\n\n" + xml2);
        JAXBElement<?> unmarshalledPojo2 = unmarshallingService.unmarshal(clazz, xml2);

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
