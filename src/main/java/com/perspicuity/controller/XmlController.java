package com.perspicuity.controller;

import com.perspicuity.service.MarshallingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.bind.JAXBException;

@Controller
@RequestMapping("/xml2")
public class XmlController {

    private static final Logger logger = LoggerFactory.getLogger(XmlController.class);

    final MarshallingService marshallingService;

    public XmlController(MarshallingService marshallingService) {
        this.marshallingService = marshallingService;
    }
    @GetMapping("/com.genologics.ri.Address")
    ResponseEntity<String> getAddress() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.Address");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.Address.class, new com.genologics.ri.Address()));
    }

    @GetMapping("/com.genologics.ri.artifact.Artifact")
    ResponseEntity<String> getArtifactArtifact() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.artifact.Artifact");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.artifact.Artifact.class, new com.genologics.ri.artifact.Artifact()));
    }

    @GetMapping("/com.genologics.ri.artifact.Artifact.WorkflowStages")
    ResponseEntity<String> getArtifactArtifactWorkflowStages() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.artifact.Artifact.WorkflowStages");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.artifact.Artifact.WorkflowStages.class, new com.genologics.ri.artifact.Artifact.WorkflowStages()));
    }

    @GetMapping("/com.genologics.ri.artifact.Artifactgroup")
    ResponseEntity<String> getArtifactArtifactgroup() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.artifact.Artifactgroup");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.artifact.Artifactgroup.class, new com.genologics.ri.artifact.Artifactgroup()));
    }

    @GetMapping("/com.genologics.ri.artifact.ArtifactLink")
    ResponseEntity<String> getArtifactArtifactLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.artifact.ArtifactLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.artifact.ArtifactLink.class, new com.genologics.ri.artifact.ArtifactLink()));
    }

    @GetMapping("/com.genologics.ri.artifact.Artifacts")
    ResponseEntity<String> getArtifactArtifacts() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.artifact.Artifacts");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.artifact.Artifacts.class, new com.genologics.ri.artifact.Artifacts()));
    }

    @GetMapping("/com.genologics.ri.artifact.ControlType")
    ResponseEntity<String> getArtifactControlType() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.artifact.ControlType");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.artifact.ControlType.class, new com.genologics.ri.artifact.ControlType()));
    }

    @GetMapping("/com.genologics.ri.artifact.Demux")
    ResponseEntity<String> getArtifactDemux() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.artifact.Demux");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.artifact.Demux.class, new com.genologics.ri.artifact.Demux()));
    }

    @GetMapping("/com.genologics.ri.artifact.DemuxArtifact")
    ResponseEntity<String> getArtifactDemuxArtifact() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.artifact.DemuxArtifact");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.artifact.DemuxArtifact.class, new com.genologics.ri.artifact.DemuxArtifact()));
    }

    @GetMapping("/com.genologics.ri.artifact.DemuxArtifact.ReagentLabels")
    ResponseEntity<String> getArtifactDemuxArtifactReagentLabels() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.artifact.DemuxArtifact.ReagentLabels");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.artifact.DemuxArtifact.ReagentLabels.class, new com.genologics.ri.artifact.DemuxArtifact.ReagentLabels()));
    }

    @GetMapping("/com.genologics.ri.artifact.DemuxArtifact.Samples")
    ResponseEntity<String> getArtifactDemuxArtifactSamples() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.artifact.DemuxArtifact.Samples");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.artifact.DemuxArtifact.Samples.class, new com.genologics.ri.artifact.DemuxArtifact.Samples()));
    }

    @GetMapping("/com.genologics.ri.artifact.DemuxArtifactSample")
    ResponseEntity<String> getArtifactDemuxArtifactSample() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.artifact.DemuxArtifactSample");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.artifact.DemuxArtifactSample.class, new com.genologics.ri.artifact.DemuxArtifactSample()));
    }

    @GetMapping("/com.genologics.ri.artifact.DemuxDetails")
    ResponseEntity<String> getArtifactDemuxDetails() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.artifact.DemuxDetails");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.artifact.DemuxDetails.class, new com.genologics.ri.artifact.DemuxDetails()));
    }

    @GetMapping("/com.genologics.ri.artifact.DemuxDetails.Artifacts")
    ResponseEntity<String> getArtifactDemuxDetailsArtifacts() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.artifact.DemuxDetails.Artifacts");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.artifact.DemuxDetails.Artifacts.class, new com.genologics.ri.artifact.DemuxDetails.Artifacts()));
    }

    @GetMapping("/com.genologics.ri.artifact.DemuxLink")
    ResponseEntity<String> getArtifactDemuxLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.artifact.DemuxLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.artifact.DemuxLink.class, new com.genologics.ri.artifact.DemuxLink()));
    }

    @GetMapping("/com.genologics.ri.artifact.DemuxSourceArtifact")
    ResponseEntity<String> getArtifactDemuxSourceArtifact() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.artifact.DemuxSourceArtifact");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.artifact.DemuxSourceArtifact.class, new com.genologics.ri.artifact.DemuxSourceArtifact()));
    }

    @GetMapping("/com.genologics.ri.artifact.Details")
    ResponseEntity<String> getArtifactDetails() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.artifact.Details");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.artifact.Details.class, new com.genologics.ri.artifact.Details()));
    }

    @GetMapping("/com.genologics.ri.artifact.ParentProcess")
    ResponseEntity<String> getArtifactParentProcess() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.artifact.ParentProcess");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.artifact.ParentProcess.class, new com.genologics.ri.artifact.ParentProcess()));
    }

    @GetMapping("/com.genologics.ri.artifact.PoolStep")
    ResponseEntity<String> getArtifactPoolStep() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.artifact.PoolStep");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.artifact.PoolStep.class, new com.genologics.ri.artifact.PoolStep()));
    }

    @GetMapping("/com.genologics.ri.artifact.ReagentLabel")
    ResponseEntity<String> getArtifactReagentLabel() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.artifact.ReagentLabel");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.artifact.ReagentLabel.class, new com.genologics.ri.artifact.ReagentLabel()));
    }

    @GetMapping("/com.genologics.ri.artifact.Sample")
    ResponseEntity<String> getArtifactSample() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.artifact.Sample");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.artifact.Sample.class, new com.genologics.ri.artifact.Sample()));
    }

    @GetMapping("/com.genologics.ri.artifact.WorkflowStage")
    ResponseEntity<String> getArtifactWorkflowStage() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.artifact.WorkflowStage");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.artifact.WorkflowStage.class, new com.genologics.ri.artifact.WorkflowStage()));
    }

    @GetMapping("/com.genologics.ri.artifactgroup.Artifactgroup")
    ResponseEntity<String> getArtifactgroupArtifactgroup() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.artifactgroup.Artifactgroup");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.artifactgroup.Artifactgroup.class, new com.genologics.ri.artifactgroup.Artifactgroup()));
    }

    @GetMapping("/com.genologics.ri.artifactgroup.ArtifactgroupLink")
    ResponseEntity<String> getArtifactgroupArtifactgroupLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.artifactgroup.ArtifactgroupLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.artifactgroup.ArtifactgroupLink.class, new com.genologics.ri.artifactgroup.ArtifactgroupLink()));
    }

    @GetMapping("/com.genologics.ri.artifactgroup.Artifactgroups")
    ResponseEntity<String> getArtifactgroupArtifactgroups() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.artifactgroup.Artifactgroups");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.artifactgroup.Artifactgroups.class, new com.genologics.ri.artifactgroup.Artifactgroups()));
    }

    @GetMapping("/com.genologics.ri.artifactgroup.Artifacts")
    ResponseEntity<String> getArtifactgroupArtifacts() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.artifactgroup.Artifacts");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.artifactgroup.Artifacts.class, new com.genologics.ri.artifactgroup.Artifacts()));
    }

    @GetMapping("/com.genologics.ri.automation.Automation")
    ResponseEntity<String> getAutomationAutomation() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.automation.Automation");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.automation.Automation.class, new com.genologics.ri.automation.Automation()));
    }

    @GetMapping("/com.genologics.ri.automation.Automation.ProcessTypes")
    ResponseEntity<String> getAutomationAutomationProcessTypes() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.automation.Automation.ProcessTypes");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.automation.Automation.ProcessTypes.class, new com.genologics.ri.automation.Automation.ProcessTypes()));
    }

    @GetMapping("/com.genologics.ri.automation.AutomationLink")
    ResponseEntity<String> getAutomationAutomationLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.automation.AutomationLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.automation.AutomationLink.class, new com.genologics.ri.automation.AutomationLink()));
    }

    @GetMapping("/com.genologics.ri.automation.Automations")
    ResponseEntity<String> getAutomationAutomations() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.automation.Automations");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.automation.Automations.class, new com.genologics.ri.automation.Automations()));
    }

    @GetMapping("/com.genologics.ri.automation.ProcessType")
    ResponseEntity<String> getAutomationProcessType() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.automation.ProcessType");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.automation.ProcessType.class, new com.genologics.ri.automation.ProcessType()));
    }

    @GetMapping("/com.genologics.ri.configuration.Field")
    ResponseEntity<String> getConfigurationField() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.configuration.Field");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.configuration.Field.class, new com.genologics.ri.configuration.Field()));
    }

    @GetMapping("/com.genologics.ri.configuration.FieldLink")
    ResponseEntity<String> getConfigurationFieldLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.configuration.FieldLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.configuration.FieldLink.class, new com.genologics.ri.configuration.FieldLink()));
    }

    @GetMapping("/com.genologics.ri.configuration.Type")
    ResponseEntity<String> getConfigurationType() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.configuration.Type");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.configuration.Type.class, new com.genologics.ri.configuration.Type()));
    }

    @GetMapping("/com.genologics.ri.configuration.TypeDefinition")
    ResponseEntity<String> getConfigurationTypeDefinition() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.configuration.TypeDefinition");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.configuration.TypeDefinition.class, new com.genologics.ri.configuration.TypeDefinition()));
    }

    @GetMapping("/com.genologics.ri.configuration.UdfconfigLink")
    ResponseEntity<String> getConfigurationUdfconfigLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.configuration.UdfconfigLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.configuration.UdfconfigLink.class, new com.genologics.ri.configuration.UdfconfigLink()));
    }

    @GetMapping("/com.genologics.ri.configuration.Udfs")
    ResponseEntity<String> getConfigurationUdfs() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.configuration.Udfs");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.configuration.Udfs.class, new com.genologics.ri.configuration.Udfs()));
    }

    @GetMapping("/com.genologics.ri.configuration.UdtconfigLink")
    ResponseEntity<String> getConfigurationUdtconfigLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.configuration.UdtconfigLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.configuration.UdtconfigLink.class, new com.genologics.ri.configuration.UdtconfigLink()));
    }

    @GetMapping("/com.genologics.ri.configuration.Udts")
    ResponseEntity<String> getConfigurationUdts() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.configuration.Udts");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.configuration.Udts.class, new com.genologics.ri.configuration.Udts()));
    }

    @GetMapping("/com.genologics.ri.container.Container")
    ResponseEntity<String> getContainerContainer() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.container.Container");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.container.Container.class, new com.genologics.ri.container.Container()));
    }

    @GetMapping("/com.genologics.ri.container.ContainerLink")
    ResponseEntity<String> getContainerContainerLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.container.ContainerLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.container.ContainerLink.class, new com.genologics.ri.container.ContainerLink()));
    }

    @GetMapping("/com.genologics.ri.container.Containers")
    ResponseEntity<String> getContainerContainers() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.container.Containers");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.container.Containers.class, new com.genologics.ri.container.Containers()));
    }

    @GetMapping("/com.genologics.ri.container.ContainerType")
    ResponseEntity<String> getContainerContainerType() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.container.ContainerType");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.container.ContainerType.class, new com.genologics.ri.container.ContainerType()));
    }

    @GetMapping("/com.genologics.ri.container.Details")
    ResponseEntity<String> getContainerDetails() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.container.Details");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.container.Details.class, new com.genologics.ri.container.Details()));
    }

    @GetMapping("/com.genologics.ri.container.Placement")
    ResponseEntity<String> getContainerPlacement() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.container.Placement");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.container.Placement.class, new com.genologics.ri.container.Placement()));
    }

    @GetMapping("/com.genologics.ri.Container")
    ResponseEntity<String> getContainer() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.Container");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.Container.class, new com.genologics.ri.Container()));
    }

    @GetMapping("/com.genologics.ri.containertype.CalibrantWell")
    ResponseEntity<String> getContainertypeCalibrantWell() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.containertype.CalibrantWell");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.containertype.CalibrantWell.class, new com.genologics.ri.containertype.CalibrantWell()));
    }

    @GetMapping("/com.genologics.ri.containertype.ContainerType")
    ResponseEntity<String> getContainertypeContainerType() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.containertype.ContainerType");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.containertype.ContainerType.class, new com.genologics.ri.containertype.ContainerType()));
    }

    @GetMapping("/com.genologics.ri.containertype.ContainerTypeLink")
    ResponseEntity<String> getContainertypeContainerTypeLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.containertype.ContainerTypeLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.containertype.ContainerTypeLink.class, new com.genologics.ri.containertype.ContainerTypeLink()));
    }

    @GetMapping("/com.genologics.ri.containertype.ContainerTypes")
    ResponseEntity<String> getContainertypeContainerTypes() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.containertype.ContainerTypes");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.containertype.ContainerTypes.class, new com.genologics.ri.containertype.ContainerTypes()));
    }

    @GetMapping("/com.genologics.ri.containertype.Dimension")
    ResponseEntity<String> getContainertypeDimension() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.containertype.Dimension");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.containertype.Dimension.class, new com.genologics.ri.containertype.Dimension()));
    }

    @GetMapping("/com.genologics.ri.controltype.ControlType")
    ResponseEntity<String> getControltypeControlType() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.controltype.ControlType");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.controltype.ControlType.class, new com.genologics.ri.controltype.ControlType()));
    }

    @GetMapping("/com.genologics.ri.controltype.ControlTypeLink")
    ResponseEntity<String> getControltypeControlTypeLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.controltype.ControlTypeLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.controltype.ControlTypeLink.class, new com.genologics.ri.controltype.ControlTypeLink()));
    }

    @GetMapping("/com.genologics.ri.controltype.ControlTypes")
    ResponseEntity<String> getControltypeControlTypes() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.controltype.ControlTypes");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.controltype.ControlTypes.class, new com.genologics.ri.controltype.ControlTypes()));
    }

    @GetMapping("/com.genologics.ri.exception.Exception")
    ResponseEntity<String> getExceptionException() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.exception.Exception");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.exception.Exception.class, new com.genologics.ri.exception.Exception()));
    }

    @GetMapping("/com.genologics.ri.Externalid")
    ResponseEntity<String> getExternalid() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.Externalid");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.Externalid.class, new com.genologics.ri.Externalid()));
    }

    @GetMapping("/com.genologics.ri.file.Details")
    ResponseEntity<String> getFileDetails() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.file.Details");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.file.Details.class, new com.genologics.ri.file.Details()));
    }

    @GetMapping("/com.genologics.ri.file.File")
    ResponseEntity<String> getFileFile() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.file.File");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.file.File.class, new com.genologics.ri.file.File()));
    }

    @GetMapping("/com.genologics.ri.file.FileLink")
    ResponseEntity<String> getFileFileLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.file.FileLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.file.FileLink.class, new com.genologics.ri.file.FileLink()));
    }

    @GetMapping("/com.genologics.ri.file.Files")
    ResponseEntity<String> getFileFiles() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.file.Files");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.file.Files.class, new com.genologics.ri.file.Files()));
    }

    @GetMapping("/com.genologics.ri.Index")
    ResponseEntity<String> getIndex() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.Index");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.Index.class, new com.genologics.ri.Index()));
    }

    @GetMapping("/com.genologics.ri.instrument.Instrument")
    ResponseEntity<String> getInstrumentInstrument() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.instrument.Instrument");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.instrument.Instrument.class, new com.genologics.ri.instrument.Instrument()));
    }

    @GetMapping("/com.genologics.ri.instrument.InstrumentLink")
    ResponseEntity<String> getInstrumentInstrumentLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.instrument.InstrumentLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.instrument.InstrumentLink.class, new com.genologics.ri.instrument.InstrumentLink()));
    }

    @GetMapping("/com.genologics.ri.instrument.Instruments")
    ResponseEntity<String> getInstrumentInstruments() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.instrument.Instruments");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.instrument.Instruments.class, new com.genologics.ri.instrument.Instruments()));
    }

    @GetMapping("/com.genologics.ri.instrumenttype.InstrumentType")
    ResponseEntity<String> getInstrumenttypeInstrumentType() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.instrumenttype.InstrumentType");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.instrumenttype.InstrumentType.class, new com.genologics.ri.instrumenttype.InstrumentType()));
    }

    @GetMapping("/com.genologics.ri.instrumenttype.InstrumentType.ProcessTypes")
    ResponseEntity<String> getInstrumenttypeInstrumentTypeProcessTypes() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.instrumenttype.InstrumentType.ProcessTypes");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.instrumenttype.InstrumentType.ProcessTypes.class, new com.genologics.ri.instrumenttype.InstrumentType.ProcessTypes()));
    }

    @GetMapping("/com.genologics.ri.instrumenttype.InstrumentTypeLink")
    ResponseEntity<String> getInstrumenttypeInstrumentTypeLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.instrumenttype.InstrumentTypeLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.instrumenttype.InstrumentTypeLink.class, new com.genologics.ri.instrumenttype.InstrumentTypeLink()));
    }

    @GetMapping("/com.genologics.ri.instrumenttype.InstrumentTypeProcessType")
    ResponseEntity<String> getInstrumenttypeInstrumentTypeProcessType() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.instrumenttype.InstrumentTypeProcessType");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.instrumenttype.InstrumentTypeProcessType.class, new com.genologics.ri.instrumenttype.InstrumentTypeProcessType()));
    }

    @GetMapping("/com.genologics.ri.instrumenttype.InstrumentTypes")
    ResponseEntity<String> getInstrumenttypeInstrumentTypes() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.instrumenttype.InstrumentTypes");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.instrumenttype.InstrumentTypes.class, new com.genologics.ri.instrumenttype.InstrumentTypes()));
    }

    @GetMapping("/com.genologics.ri.lab.Lab")
    ResponseEntity<String> getLabLab() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.lab.Lab");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.lab.Lab.class, new com.genologics.ri.lab.Lab()));
    }

    @GetMapping("/com.genologics.ri.lab.LabLink")
    ResponseEntity<String> getLabLabLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.lab.LabLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.lab.LabLink.class, new com.genologics.ri.lab.LabLink()));
    }

    @GetMapping("/com.genologics.ri.lab.Labs")
    ResponseEntity<String> getLabLabs() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.lab.Labs");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.lab.Labs.class, new com.genologics.ri.lab.Labs()));
    }

    @GetMapping("/com.genologics.ri.Link")
    ResponseEntity<String> getLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.Link");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.Link.class, new com.genologics.ri.Link()));
    }

    @GetMapping("/com.genologics.ri.Links")
    ResponseEntity<String> getLinks() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.Links");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.Links.class, new com.genologics.ri.Links()));
    }

    @GetMapping("/com.genologics.ri.Location")
    ResponseEntity<String> getLocation() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.Location");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.Location.class, new com.genologics.ri.Location()));
    }

    @GetMapping("/com.genologics.ri.Page")
    ResponseEntity<String> getPage() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.Page");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.Page.class, new com.genologics.ri.Page()));
    }

    @GetMapping("/com.genologics.ri.permission.Permission")
    ResponseEntity<String> getPermissionPermission() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.permission.Permission");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.permission.Permission.class, new com.genologics.ri.permission.Permission()));
    }

    @GetMapping("/com.genologics.ri.permission.PermissionLink")
    ResponseEntity<String> getPermissionPermissionLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.permission.PermissionLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.permission.PermissionLink.class, new com.genologics.ri.permission.PermissionLink()));
    }

    @GetMapping("/com.genologics.ri.permission.Permissions")
    ResponseEntity<String> getPermissionPermissions() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.permission.Permissions");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.permission.Permissions.class, new com.genologics.ri.permission.Permissions()));
    }

    @GetMapping("/com.genologics.ri.process.Artifact")
    ResponseEntity<String> getProcessArtifact() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.process.Artifact");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.process.Artifact.class, new com.genologics.ri.process.Artifact()));
    }

    @GetMapping("/com.genologics.ri.process.InputOutputMap")
    ResponseEntity<String> getProcessInputOutputMap() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.process.InputOutputMap");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.process.InputOutputMap.class, new com.genologics.ri.process.InputOutputMap()));
    }

    @GetMapping("/com.genologics.ri.process.Instrument")
    ResponseEntity<String> getProcessInstrument() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.process.Instrument");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.process.Instrument.class, new com.genologics.ri.process.Instrument()));
    }

    @GetMapping("/com.genologics.ri.process.Parameter")
    ResponseEntity<String> getProcessParameter() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.process.Parameter");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.process.Parameter.class, new com.genologics.ri.process.Parameter()));
    }

    @GetMapping("/com.genologics.ri.process.ParentProcess")
    ResponseEntity<String> getProcessParentProcess() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.process.ParentProcess");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.process.ParentProcess.class, new com.genologics.ri.process.ParentProcess()));
    }

    @GetMapping("/com.genologics.ri.process.Process")
    ResponseEntity<String> getProcessProcess() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.process.Process");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.process.Process.class, new com.genologics.ri.process.Process()));
    }

    @GetMapping("/com.genologics.ri.process.Processes")
    ResponseEntity<String> getProcessProcesses() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.process.Processes");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.process.Processes.class, new com.genologics.ri.process.Processes()));
    }

    @GetMapping("/com.genologics.ri.process.ProcessLink")
    ResponseEntity<String> getProcessProcessLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.process.ProcessLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.process.ProcessLink.class, new com.genologics.ri.process.ProcessLink()));
    }

    @GetMapping("/com.genologics.ri.process.ProcessType")
    ResponseEntity<String> getProcessProcessType() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.process.ProcessType");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.process.ProcessType.class, new com.genologics.ri.process.ProcessType()));
    }

    @GetMapping("/com.genologics.ri.process.Technician")
    ResponseEntity<String> getProcessTechnician() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.process.Technician");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.process.Technician.class, new com.genologics.ri.process.Technician()));
    }

    @GetMapping("/com.genologics.ri.processexecution.Input")
    ResponseEntity<String> getProcessexecutionInput() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processexecution.Input");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processexecution.Input.class, new com.genologics.ri.processexecution.Input()));
    }

    @GetMapping("/com.genologics.ri.processexecution.InputOutputMap")
    ResponseEntity<String> getProcessexecutionInputOutputMap() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processexecution.InputOutputMap");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processexecution.InputOutputMap.class, new com.genologics.ri.processexecution.InputOutputMap()));
    }

    @GetMapping("/com.genologics.ri.processexecution.Instrument")
    ResponseEntity<String> getProcessexecutionInstrument() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processexecution.Instrument");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processexecution.Instrument.class, new com.genologics.ri.processexecution.Instrument()));
    }

    @GetMapping("/com.genologics.ri.processexecution.Output")
    ResponseEntity<String> getProcessexecutionOutput() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processexecution.Output");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processexecution.Output.class, new com.genologics.ri.processexecution.Output()));
    }

    @GetMapping("/com.genologics.ri.processexecution.Parameter")
    ResponseEntity<String> getProcessexecutionParameter() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processexecution.Parameter");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processexecution.Parameter.class, new com.genologics.ri.processexecution.Parameter()));
    }

    @GetMapping("/com.genologics.ri.processexecution.Process")
    ResponseEntity<String> getProcessexecutionProcess() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processexecution.Process");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processexecution.Process.class, new com.genologics.ri.processexecution.Process()));
    }

    @GetMapping("/com.genologics.ri.processexecution.Technician")
    ResponseEntity<String> getProcessexecutionTechnician() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processexecution.Technician");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processexecution.Technician.class, new com.genologics.ri.processexecution.Technician()));
    }

    @GetMapping("/com.genologics.ri.processtemplate.Instrument")
    ResponseEntity<String> getProcesstemplateInstrument() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processtemplate.Instrument");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processtemplate.Instrument.class, new com.genologics.ri.processtemplate.Instrument()));
    }

    @GetMapping("/com.genologics.ri.processtemplate.Parameter")
    ResponseEntity<String> getProcesstemplateParameter() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processtemplate.Parameter");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processtemplate.Parameter.class, new com.genologics.ri.processtemplate.Parameter()));
    }

    @GetMapping("/com.genologics.ri.processtemplate.ProcessTemplate")
    ResponseEntity<String> getProcesstemplateProcessTemplate() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processtemplate.ProcessTemplate");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processtemplate.ProcessTemplate.class, new com.genologics.ri.processtemplate.ProcessTemplate()));
    }

    @GetMapping("/com.genologics.ri.processtemplate.ProcessTemplateLink")
    ResponseEntity<String> getProcesstemplateProcessTemplateLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processtemplate.ProcessTemplateLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processtemplate.ProcessTemplateLink.class, new com.genologics.ri.processtemplate.ProcessTemplateLink()));
    }

    @GetMapping("/com.genologics.ri.processtemplate.ProcessTemplates")
    ResponseEntity<String> getProcesstemplateProcessTemplates() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processtemplate.ProcessTemplates");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processtemplate.ProcessTemplates.class, new com.genologics.ri.processtemplate.ProcessTemplates()));
    }

    @GetMapping("/com.genologics.ri.processtemplate.ProcessType")
    ResponseEntity<String> getProcesstemplateProcessType() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processtemplate.ProcessType");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processtemplate.ProcessType.class, new com.genologics.ri.processtemplate.ProcessType()));
    }

    @GetMapping("/com.genologics.ri.processtemplate.Technician")
    ResponseEntity<String> getProcesstemplateTechnician() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processtemplate.Technician");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processtemplate.Technician.class, new com.genologics.ri.processtemplate.Technician()));
    }

    @GetMapping("/com.genologics.ri.processtype.ContainerTypeLink")
    ResponseEntity<String> getProcesstypeContainerTypeLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processtype.ContainerTypeLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processtype.ContainerTypeLink.class, new com.genologics.ri.processtype.ContainerTypeLink()));
    }

    @GetMapping("/com.genologics.ri.processtype.ControlTypeLink")
    ResponseEntity<String> getProcesstypeControlTypeLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processtype.ControlTypeLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processtype.ControlTypeLink.class, new com.genologics.ri.processtype.ControlTypeLink()));
    }

    @GetMapping("/com.genologics.ri.processtype.EppTrigger")
    ResponseEntity<String> getProcesstypeEppTrigger() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processtype.EppTrigger");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processtype.EppTrigger.class, new com.genologics.ri.processtype.EppTrigger()));
    }

    @GetMapping("/com.genologics.ri.processtype.Field")
    ResponseEntity<String> getProcesstypeField() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processtype.Field");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processtype.Field.class, new com.genologics.ri.processtype.Field()));
    }

    @GetMapping("/com.genologics.ri.processtype.File")
    ResponseEntity<String> getProcesstypeFile() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processtype.File");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processtype.File.class, new com.genologics.ri.processtype.File()));
    }

    @GetMapping("/com.genologics.ri.processtype.Icebucketfield")
    ResponseEntity<String> getProcesstypeIcebucketfield() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processtype.Icebucketfield");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processtype.Icebucketfield.class, new com.genologics.ri.processtype.Icebucketfield()));
    }

    @GetMapping("/com.genologics.ri.processtype.Parameter")
    ResponseEntity<String> getProcesstypeParameter() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processtype.Parameter");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processtype.Parameter.class, new com.genologics.ri.processtype.Parameter()));
    }

    @GetMapping("/com.genologics.ri.processtype.ProcessInput")
    ResponseEntity<String> getProcesstypeProcessInput() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processtype.ProcessInput");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processtype.ProcessInput.class, new com.genologics.ri.processtype.ProcessInput()));
    }

    @GetMapping("/com.genologics.ri.processtype.ProcessOutput")
    ResponseEntity<String> getProcesstypeProcessOutput() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processtype.ProcessOutput");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processtype.ProcessOutput.class, new com.genologics.ri.processtype.ProcessOutput()));
    }

    @GetMapping("/com.genologics.ri.processtype.ProcessType")
    ResponseEntity<String> getProcesstypeProcessType() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processtype.ProcessType");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processtype.ProcessType.class, new com.genologics.ri.processtype.ProcessType()));
    }

    @GetMapping("/com.genologics.ri.processtype.ProcessType.EppTriggers")
    ResponseEntity<String> getProcesstypeProcessTypeEppTriggers() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processtype.ProcessType.EppTriggers");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processtype.ProcessType.EppTriggers.class, new com.genologics.ri.processtype.ProcessType.EppTriggers()));
    }

    @GetMapping("/com.genologics.ri.processtype.ProcessType.IceBucketFields")
    ResponseEntity<String> getProcesstypeProcessTypeIceBucketFields() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processtype.ProcessType.IceBucketFields");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processtype.ProcessType.IceBucketFields.class, new com.genologics.ri.processtype.ProcessType.IceBucketFields()));
    }

    @GetMapping("/com.genologics.ri.processtype.ProcessType.PermittedContainers")
    ResponseEntity<String> getProcesstypeProcessTypePermittedContainers() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processtype.ProcessType.PermittedContainers");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processtype.ProcessType.PermittedContainers.class, new com.genologics.ri.processtype.ProcessType.PermittedContainers()));
    }

    @GetMapping("/com.genologics.ri.processtype.ProcessType.PermittedControlTypes")
    ResponseEntity<String> getProcesstypeProcessTypePermittedControlTypes() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processtype.ProcessType.PermittedControlTypes");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processtype.ProcessType.PermittedControlTypes.class, new com.genologics.ri.processtype.ProcessType.PermittedControlTypes()));
    }

    @GetMapping("/com.genologics.ri.processtype.ProcessType.PermittedInstrumentTypes")
    ResponseEntity<String> getProcesstypeProcessTypePermittedInstrumentTypes() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processtype.ProcessType.PermittedInstrumentTypes");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processtype.ProcessType.PermittedInstrumentTypes.class, new com.genologics.ri.processtype.ProcessType.PermittedInstrumentTypes()));
    }

    @GetMapping("/com.genologics.ri.processtype.ProcessType.PermittedReagentCategories")
    ResponseEntity<String> getProcesstypeProcessTypePermittedReagentCategories() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processtype.ProcessType.PermittedReagentCategories");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processtype.ProcessType.PermittedReagentCategories.class, new com.genologics.ri.processtype.ProcessType.PermittedReagentCategories()));
    }

    @GetMapping("/com.genologics.ri.processtype.ProcessType.QueueFields")
    ResponseEntity<String> getProcesstypeProcessTypeQueueFields() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processtype.ProcessType.QueueFields");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processtype.ProcessType.QueueFields.class, new com.genologics.ri.processtype.ProcessType.QueueFields()));
    }

    @GetMapping("/com.genologics.ri.processtype.ProcessType.RequiredReagentKits")
    ResponseEntity<String> getProcesstypeProcessTypeRequiredReagentKits() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processtype.ProcessType.RequiredReagentKits");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processtype.ProcessType.RequiredReagentKits.class, new com.genologics.ri.processtype.ProcessType.RequiredReagentKits()));
    }

    @GetMapping("/com.genologics.ri.processtype.ProcessType.SampleFields")
    ResponseEntity<String> getProcesstypeProcessTypeSampleFields() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processtype.ProcessType.SampleFields");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processtype.ProcessType.SampleFields.class, new com.genologics.ri.processtype.ProcessType.SampleFields()));
    }

    @GetMapping("/com.genologics.ri.processtype.ProcessType.StepFields")
    ResponseEntity<String> getProcesstypeProcessTypeStepFields() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processtype.ProcessType.StepFields");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processtype.ProcessType.StepFields.class, new com.genologics.ri.processtype.ProcessType.StepFields()));
    }

    @GetMapping("/com.genologics.ri.processtype.ProcessType.StepProperties")
    ResponseEntity<String> getProcesstypeProcessTypeStepProperties() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processtype.ProcessType.StepProperties");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processtype.ProcessType.StepProperties.class, new com.genologics.ri.processtype.ProcessType.StepProperties()));
    }

    @GetMapping("/com.genologics.ri.processtype.ProcessTypeAttribute")
    ResponseEntity<String> getProcesstypeProcessTypeAttribute() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processtype.ProcessTypeAttribute");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processtype.ProcessTypeAttribute.class, new com.genologics.ri.processtype.ProcessTypeAttribute()));
    }

    @GetMapping("/com.genologics.ri.processtype.ProcessTypeLink")
    ResponseEntity<String> getProcesstypeProcessTypeLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processtype.ProcessTypeLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processtype.ProcessTypeLink.class, new com.genologics.ri.processtype.ProcessTypeLink()));
    }

    @GetMapping("/com.genologics.ri.processtype.ProcessTypes")
    ResponseEntity<String> getProcesstypeProcessTypes() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processtype.ProcessTypes");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processtype.ProcessTypes.class, new com.genologics.ri.processtype.ProcessTypes()));
    }

    @GetMapping("/com.genologics.ri.processtype.Queuefield")
    ResponseEntity<String> getProcesstypeQueuefield() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processtype.Queuefield");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processtype.Queuefield.class, new com.genologics.ri.processtype.Queuefield()));
    }

    @GetMapping("/com.genologics.ri.processtype.ReagentKitLink")
    ResponseEntity<String> getProcesstypeReagentKitLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processtype.ReagentKitLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processtype.ReagentKitLink.class, new com.genologics.ri.processtype.ReagentKitLink()));
    }

    @GetMapping("/com.genologics.ri.processtype.StepProperty")
    ResponseEntity<String> getProcesstypeStepProperty() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processtype.StepProperty");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processtype.StepProperty.class, new com.genologics.ri.processtype.StepProperty()));
    }

    @GetMapping("/com.genologics.ri.processtype.StepSetup")
    ResponseEntity<String> getProcesstypeStepSetup() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processtype.StepSetup");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processtype.StepSetup.class, new com.genologics.ri.processtype.StepSetup()));
    }

    @GetMapping("/com.genologics.ri.processtype.StepSetup.Files")
    ResponseEntity<String> getProcesstypeStepSetupFiles() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processtype.StepSetup.Files");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processtype.StepSetup.Files.class, new com.genologics.ri.processtype.StepSetup.Files()));
    }

    @GetMapping("/com.genologics.ri.processtype.TypeDefinition")
    ResponseEntity<String> getProcesstypeTypeDefinition() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.processtype.TypeDefinition");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.processtype.TypeDefinition.class, new com.genologics.ri.processtype.TypeDefinition()));
    }

    @GetMapping("/com.genologics.ri.project.Project")
    ResponseEntity<String> getProjectProject() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.project.Project");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.project.Project.class, new com.genologics.ri.project.Project()));
    }

    @GetMapping("/com.genologics.ri.project.ProjectLink")
    ResponseEntity<String> getProjectProjectLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.project.ProjectLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.project.ProjectLink.class, new com.genologics.ri.project.ProjectLink()));
    }

    @GetMapping("/com.genologics.ri.project.Projects")
    ResponseEntity<String> getProjectProjects() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.project.Projects");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.project.Projects.class, new com.genologics.ri.project.Projects()));
    }

    @GetMapping("/com.genologics.ri.project.Researcher")
    ResponseEntity<String> getProjectResearcher() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.project.Researcher");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.project.Researcher.class, new com.genologics.ri.project.Researcher()));
    }

    @GetMapping("/com.genologics.ri.property.Properties")
    ResponseEntity<String> getPropertyProperties() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.property.Properties");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.property.Properties.class, new com.genologics.ri.property.Properties()));
    }

    @GetMapping("/com.genologics.ri.property.PropertyLink")
    ResponseEntity<String> getPropertyPropertyLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.property.PropertyLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.property.PropertyLink.class, new com.genologics.ri.property.PropertyLink()));
    }

    @GetMapping("/com.genologics.ri.protocolconfiguration.Protocol")
    ResponseEntity<String> getProtocolconfigurationProtocol() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.protocolconfiguration.Protocol");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.protocolconfiguration.Protocol.class, new com.genologics.ri.protocolconfiguration.Protocol()));
    }

    @GetMapping("/com.genologics.ri.protocolconfiguration.Protocol.ProtocolProperties")
    ResponseEntity<String> getProtocolconfigurationProtocolProtocolProperties() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.protocolconfiguration.Protocol.ProtocolProperties");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.protocolconfiguration.Protocol.ProtocolProperties.class, new com.genologics.ri.protocolconfiguration.Protocol.ProtocolProperties()));
    }

    @GetMapping("/com.genologics.ri.protocolconfiguration.Protocol.Steps")
    ResponseEntity<String> getProtocolconfigurationProtocolSteps() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.protocolconfiguration.Protocol.Steps");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.protocolconfiguration.Protocol.Steps.class, new com.genologics.ri.protocolconfiguration.Protocol.Steps()));
    }

    @GetMapping("/com.genologics.ri.protocolconfiguration.ProtocolLink")
    ResponseEntity<String> getProtocolconfigurationProtocolLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.protocolconfiguration.ProtocolLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.protocolconfiguration.ProtocolLink.class, new com.genologics.ri.protocolconfiguration.ProtocolLink()));
    }

    @GetMapping("/com.genologics.ri.protocolconfiguration.ProtocolProperty")
    ResponseEntity<String> getProtocolconfigurationProtocolProperty() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.protocolconfiguration.ProtocolProperty");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.protocolconfiguration.ProtocolProperty.class, new com.genologics.ri.protocolconfiguration.ProtocolProperty()));
    }

    @GetMapping("/com.genologics.ri.protocolconfiguration.Protocols")
    ResponseEntity<String> getProtocolconfigurationProtocols() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.protocolconfiguration.Protocols");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.protocolconfiguration.Protocols.class, new com.genologics.ri.protocolconfiguration.Protocols()));
    }

    @GetMapping("/com.genologics.ri.queue.ArtifactLink")
    ResponseEntity<String> getQueueArtifactLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.queue.ArtifactLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.queue.ArtifactLink.class, new com.genologics.ri.queue.ArtifactLink()));
    }

    @GetMapping("/com.genologics.ri.queue.Queue")
    ResponseEntity<String> getQueueQueue() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.queue.Queue");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.queue.Queue.class, new com.genologics.ri.queue.Queue()));
    }

    @GetMapping("/com.genologics.ri.queue.Queue.Artifacts")
    ResponseEntity<String> getQueueQueueArtifacts() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.queue.Queue.Artifacts");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.queue.Queue.Artifacts.class, new com.genologics.ri.queue.Queue.Artifacts()));
    }

    @GetMapping("/com.genologics.ri.reagentkit.ReagentKit")
    ResponseEntity<String> getReagentkitReagentKit() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.reagentkit.ReagentKit");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.reagentkit.ReagentKit.class, new com.genologics.ri.reagentkit.ReagentKit()));
    }

    @GetMapping("/com.genologics.ri.reagentkit.ReagentKitLink")
    ResponseEntity<String> getReagentkitReagentKitLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.reagentkit.ReagentKitLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.reagentkit.ReagentKitLink.class, new com.genologics.ri.reagentkit.ReagentKitLink()));
    }

    @GetMapping("/com.genologics.ri.reagentkit.ReagentKits")
    ResponseEntity<String> getReagentkitReagentKits() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.reagentkit.ReagentKits");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.reagentkit.ReagentKits.class, new com.genologics.ri.reagentkit.ReagentKits()));
    }

    @GetMapping("/com.genologics.ri.reagentlot.ReagentKitLink")
    ResponseEntity<String> getReagentlotReagentKitLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.reagentlot.ReagentKitLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.reagentlot.ReagentKitLink.class, new com.genologics.ri.reagentlot.ReagentKitLink()));
    }

    @GetMapping("/com.genologics.ri.reagentlot.ReagentLot")
    ResponseEntity<String> getReagentlotReagentLot() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.reagentlot.ReagentLot");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.reagentlot.ReagentLot.class, new com.genologics.ri.reagentlot.ReagentLot()));
    }

    @GetMapping("/com.genologics.ri.reagentlot.ReagentLotLink")
    ResponseEntity<String> getReagentlotReagentLotLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.reagentlot.ReagentLotLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.reagentlot.ReagentLotLink.class, new com.genologics.ri.reagentlot.ReagentLotLink()));
    }

    @GetMapping("/com.genologics.ri.reagentlot.ReagentLots")
    ResponseEntity<String> getReagentlotReagentLots() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.reagentlot.ReagentLots");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.reagentlot.ReagentLots.class, new com.genologics.ri.reagentlot.ReagentLots()));
    }

    @GetMapping("/com.genologics.ri.reagentlot.Researcher")
    ResponseEntity<String> getReagentlotResearcher() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.reagentlot.Researcher");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.reagentlot.Researcher.class, new com.genologics.ri.reagentlot.Researcher()));
    }

    @GetMapping("/com.genologics.ri.reagenttype.Attribute")
    ResponseEntity<String> getReagenttypeAttribute() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.reagenttype.Attribute");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.reagenttype.Attribute.class, new com.genologics.ri.reagenttype.Attribute()));
    }

    @GetMapping("/com.genologics.ri.reagenttype.ReagentType")
    ResponseEntity<String> getReagenttypeReagentType() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.reagenttype.ReagentType");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.reagenttype.ReagentType.class, new com.genologics.ri.reagenttype.ReagentType()));
    }

    @GetMapping("/com.genologics.ri.reagenttype.ReagentTypeLink")
    ResponseEntity<String> getReagenttypeReagentTypeLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.reagenttype.ReagentTypeLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.reagenttype.ReagentTypeLink.class, new com.genologics.ri.reagenttype.ReagentTypeLink()));
    }

    @GetMapping("/com.genologics.ri.reagenttype.ReagentTypes")
    ResponseEntity<String> getReagenttypeReagentTypes() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.reagenttype.ReagentTypes");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.reagenttype.ReagentTypes.class, new com.genologics.ri.reagenttype.ReagentTypes()));
    }

    @GetMapping("/com.genologics.ri.reagenttype.SpecialType")
    ResponseEntity<String> getReagenttypeSpecialType() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.reagenttype.SpecialType");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.reagenttype.SpecialType.class, new com.genologics.ri.reagenttype.SpecialType()));
    }

    @GetMapping("/com.genologics.ri.researcher.Credentials")
    ResponseEntity<String> getResearcherCredentials() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.researcher.Credentials");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.researcher.Credentials.class, new com.genologics.ri.researcher.Credentials()));
    }

    @GetMapping("/com.genologics.ri.researcher.Lab")
    ResponseEntity<String> getResearcherLab() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.researcher.Lab");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.researcher.Lab.class, new com.genologics.ri.researcher.Lab()));
    }

    @GetMapping("/com.genologics.ri.researcher.Researcher")
    ResponseEntity<String> getResearcherResearcher() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.researcher.Researcher");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.researcher.Researcher.class, new com.genologics.ri.researcher.Researcher()));
    }

    @GetMapping("/com.genologics.ri.researcher.ResearcherLink")
    ResponseEntity<String> getResearcherResearcherLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.researcher.ResearcherLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.researcher.ResearcherLink.class, new com.genologics.ri.researcher.ResearcherLink()));
    }

    @GetMapping("/com.genologics.ri.researcher.Researchers")
    ResponseEntity<String> getResearcherResearchers() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.researcher.Researchers");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.researcher.Researchers.class, new com.genologics.ri.researcher.Researchers()));
    }

    @GetMapping("/com.genologics.ri.researcher.Role")
    ResponseEntity<String> getResearcherRole() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.researcher.Role");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.researcher.Role.class, new com.genologics.ri.researcher.Role()));
    }

    @GetMapping("/com.genologics.ri.role.PermissionLink")
    ResponseEntity<String> getRolePermissionLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.role.PermissionLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.role.PermissionLink.class, new com.genologics.ri.role.PermissionLink()));
    }

    @GetMapping("/com.genologics.ri.role.ResearcherLink")
    ResponseEntity<String> getRoleResearcherLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.role.ResearcherLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.role.ResearcherLink.class, new com.genologics.ri.role.ResearcherLink()));
    }

    @GetMapping("/com.genologics.ri.role.Role")
    ResponseEntity<String> getRoleRole() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.role.Role");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.role.Role.class, new com.genologics.ri.role.Role()));
    }

    @GetMapping("/com.genologics.ri.role.Role.Permissions")
    ResponseEntity<String> getRoleRolePermissions() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.role.Role.Permissions");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.role.Role.Permissions.class, new com.genologics.ri.role.Role.Permissions()));
    }

    @GetMapping("/com.genologics.ri.role.Role.Researchers")
    ResponseEntity<String> getRoleRoleResearchers() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.role.Role.Researchers");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.role.Role.Researchers.class, new com.genologics.ri.role.Role.Researchers()));
    }

    @GetMapping("/com.genologics.ri.role.RoleLink")
    ResponseEntity<String> getRoleRoleLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.role.RoleLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.role.RoleLink.class, new com.genologics.ri.role.RoleLink()));
    }

    @GetMapping("/com.genologics.ri.role.Roles")
    ResponseEntity<String> getRoleRoles() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.role.Roles");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.role.Roles.class, new com.genologics.ri.role.Roles()));
    }

    @GetMapping("/com.genologics.ri.routing.Artifact")
    ResponseEntity<String> getRoutingArtifact() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.routing.Artifact");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.routing.Artifact.class, new com.genologics.ri.routing.Artifact()));
    }

    @GetMapping("/com.genologics.ri.routing.ExtArtifactAssignments")
    ResponseEntity<String> getRoutingExtArtifactAssignments() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.routing.ExtArtifactAssignments");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.routing.ExtArtifactAssignments.class, new com.genologics.ri.routing.ExtArtifactAssignments()));
    }

    @GetMapping("/com.genologics.ri.routing.Routing")
    ResponseEntity<String> getRoutingRouting() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.routing.Routing");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.routing.Routing.class, new com.genologics.ri.routing.Routing()));
    }

    @GetMapping("/com.genologics.ri.sample.Artifact")
    ResponseEntity<String> getSampleArtifact() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.sample.Artifact");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.sample.Artifact.class, new com.genologics.ri.sample.Artifact()));
    }

    @GetMapping("/com.genologics.ri.sample.Biosource")
    ResponseEntity<String> getSampleBiosource() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.sample.Biosource");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.sample.Biosource.class, new com.genologics.ri.sample.Biosource()));
    }

    @GetMapping("/com.genologics.ri.sample.ContainerType")
    ResponseEntity<String> getSampleContainerType() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.sample.ContainerType");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.sample.ContainerType.class, new com.genologics.ri.sample.ContainerType()));
    }

    @GetMapping("/com.genologics.ri.sample.ControlType")
    ResponseEntity<String> getSampleControlType() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.sample.ControlType");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.sample.ControlType.class, new com.genologics.ri.sample.ControlType()));
    }

    @GetMapping("/com.genologics.ri.sample.Details")
    ResponseEntity<String> getSampleDetails() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.sample.Details");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.sample.Details.class, new com.genologics.ri.sample.Details()));
    }

    @GetMapping("/com.genologics.ri.sample.Project")
    ResponseEntity<String> getSampleProject() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.sample.Project");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.sample.Project.class, new com.genologics.ri.sample.Project()));
    }

    @GetMapping("/com.genologics.ri.sample.Sample")
    ResponseEntity<String> getSampleSample() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.sample.Sample");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.sample.Sample.class, new com.genologics.ri.sample.Sample()));
    }

    @GetMapping("/com.genologics.ri.sample.Samplebase")
    ResponseEntity<String> getSampleSamplebase() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.sample.Samplebase");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.sample.Samplebase.class, new com.genologics.ri.sample.Samplebase()));
    }

    @GetMapping("/com.genologics.ri.sample.Samplecreation")
    ResponseEntity<String> getSampleSamplecreation() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.sample.Samplecreation");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.sample.Samplecreation.class, new com.genologics.ri.sample.Samplecreation()));
    }

    @GetMapping("/com.genologics.ri.sample.SampleLink")
    ResponseEntity<String> getSampleSampleLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.sample.SampleLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.sample.SampleLink.class, new com.genologics.ri.sample.SampleLink()));
    }

    @GetMapping("/com.genologics.ri.sample.Samples")
    ResponseEntity<String> getSampleSamples() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.sample.Samples");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.sample.Samples.class, new com.genologics.ri.sample.Samples()));
    }

    @GetMapping("/com.genologics.ri.sample.Submitter")
    ResponseEntity<String> getSampleSubmitter() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.sample.Submitter");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.sample.Submitter.class, new com.genologics.ri.sample.Submitter()));
    }

    @GetMapping("/com.genologics.ri.stage.Protocol")
    ResponseEntity<String> getStageProtocol() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.stage.Protocol");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.stage.Protocol.class, new com.genologics.ri.stage.Protocol()));
    }

    @GetMapping("/com.genologics.ri.stage.Stage")
    ResponseEntity<String> getStageStage() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.stage.Stage");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.stage.Stage.class, new com.genologics.ri.stage.Stage()));
    }

    @GetMapping("/com.genologics.ri.stage.Step")
    ResponseEntity<String> getStageStep() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.stage.Step");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.stage.Step.class, new com.genologics.ri.stage.Step()));
    }

    @GetMapping("/com.genologics.ri.stage.Workflow")
    ResponseEntity<String> getStageWorkflow() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.stage.Workflow");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.stage.Workflow.class, new com.genologics.ri.stage.Workflow()));
    }

    @GetMapping("/com.genologics.ri.step.Actions")
    ResponseEntity<String> getStepActions() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.Actions");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.Actions.class, new com.genologics.ri.step.Actions()));
    }

    @GetMapping("/com.genologics.ri.step.Actions.NextActions")
    ResponseEntity<String> getStepActionsNextActions() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.Actions.NextActions");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.Actions.NextActions.class, new com.genologics.ri.step.Actions.NextActions()));
    }

    @GetMapping("/com.genologics.ri.step.ActionsLink")
    ResponseEntity<String> getStepActionsLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.ActionsLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.ActionsLink.class, new com.genologics.ri.step.ActionsLink()));
    }

    @GetMapping("/com.genologics.ri.step.Artifact")
    ResponseEntity<String> getStepArtifact() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.Artifact");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.Artifact.class, new com.genologics.ri.step.Artifact()));
    }

    @GetMapping("/com.genologics.ri.step.AutomaticNextStepLink")
    ResponseEntity<String> getStepAutomaticNextStepLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.AutomaticNextStepLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.AutomaticNextStepLink.class, new com.genologics.ri.step.AutomaticNextStepLink()));
    }

    @GetMapping("/com.genologics.ri.step.AvailableProgram")
    ResponseEntity<String> getStepAvailableProgram() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.AvailableProgram");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.AvailableProgram.class, new com.genologics.ri.step.AvailableProgram()));
    }

    @GetMapping("/com.genologics.ri.step.Container")
    ResponseEntity<String> getStepContainer() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.Container");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.Container.class, new com.genologics.ri.step.Container()));
    }

    @GetMapping("/com.genologics.ri.step.CreationInput")
    ResponseEntity<String> getStepCreationInput() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.CreationInput");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.CreationInput.class, new com.genologics.ri.step.CreationInput()));
    }

    @GetMapping("/com.genologics.ri.step.Details")
    ResponseEntity<String> getStepDetails() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.Details");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.Details.class, new com.genologics.ri.step.Details()));
    }

    @GetMapping("/com.genologics.ri.step.Details.Fields")
    ResponseEntity<String> getStepDetailsFields() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.Details.Fields");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.Details.Fields.class, new com.genologics.ri.step.Details.Fields()));
    }

    @GetMapping("/com.genologics.ri.step.Details.InputOutputMaps")
    ResponseEntity<String> getStepDetailsInputOutputMaps() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.Details.InputOutputMaps");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.Details.InputOutputMaps.class, new com.genologics.ri.step.Details.InputOutputMaps()));
    }

    @GetMapping("/com.genologics.ri.step.DetailsLink")
    ResponseEntity<String> getStepDetailsLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.DetailsLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.DetailsLink.class, new com.genologics.ri.step.DetailsLink()));
    }

    @GetMapping("/com.genologics.ri.step.EscalatedArtifact")
    ResponseEntity<String> getStepEscalatedArtifact() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.EscalatedArtifact");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.EscalatedArtifact.class, new com.genologics.ri.step.EscalatedArtifact()));
    }

    @GetMapping("/com.genologics.ri.step.Escalation")
    ResponseEntity<String> getStepEscalation() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.Escalation");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.Escalation.class, new com.genologics.ri.step.Escalation()));
    }

    @GetMapping("/com.genologics.ri.step.Escalation.EscalatedArtifacts")
    ResponseEntity<String> getStepEscalationEscalatedArtifacts() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.Escalation.EscalatedArtifacts");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.Escalation.EscalatedArtifacts.class, new com.genologics.ri.step.Escalation.EscalatedArtifacts()));
    }

    @GetMapping("/com.genologics.ri.step.EscalationRequest")
    ResponseEntity<String> getStepEscalationRequest() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.EscalationRequest");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.EscalationRequest.class, new com.genologics.ri.step.EscalationRequest()));
    }

    @GetMapping("/com.genologics.ri.step.EscalationReview")
    ResponseEntity<String> getStepEscalationReview() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.EscalationReview");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.EscalationReview.class, new com.genologics.ri.step.EscalationReview()));
    }

    @GetMapping("/com.genologics.ri.step.File")
    ResponseEntity<String> getStepFile() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.File");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.File.class, new com.genologics.ri.step.File()));
    }

    @GetMapping("/com.genologics.ri.step.Input")
    ResponseEntity<String> getStepInput() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.Input");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.Input.class, new com.genologics.ri.step.Input()));
    }

    @GetMapping("/com.genologics.ri.step.InputOutputMap")
    ResponseEntity<String> getStepInputOutputMap() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.InputOutputMap");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.InputOutputMap.class, new com.genologics.ri.step.InputOutputMap()));
    }

    @GetMapping("/com.genologics.ri.step.Instrument")
    ResponseEntity<String> getStepInstrument() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.Instrument");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.Instrument.class, new com.genologics.ri.step.Instrument()));
    }

    @GetMapping("/com.genologics.ri.step.NextAction")
    ResponseEntity<String> getStepNextAction() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.NextAction");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.NextAction.class, new com.genologics.ri.step.NextAction()));
    }

    @GetMapping("/com.genologics.ri.step.Output")
    ResponseEntity<String> getStepOutput() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.Output");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.Output.class, new com.genologics.ri.step.Output()));
    }

    @GetMapping("/com.genologics.ri.step.OutputPlacement")
    ResponseEntity<String> getStepOutputPlacement() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.OutputPlacement");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.OutputPlacement.class, new com.genologics.ri.step.OutputPlacement()));
    }

    @GetMapping("/com.genologics.ri.step.Placements")
    ResponseEntity<String> getStepPlacements() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.Placements");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.Placements.class, new com.genologics.ri.step.Placements()));
    }

    @GetMapping("/com.genologics.ri.step.Placements.OutputPlacements")
    ResponseEntity<String> getStepPlacementsOutputPlacements() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.Placements.OutputPlacements");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.Placements.OutputPlacements.class, new com.genologics.ri.step.Placements.OutputPlacements()));
    }

    @GetMapping("/com.genologics.ri.step.Placements.SelectedContainers")
    ResponseEntity<String> getStepPlacementsSelectedContainers() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.Placements.SelectedContainers");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.Placements.SelectedContainers.class, new com.genologics.ri.step.Placements.SelectedContainers()));
    }

    @GetMapping("/com.genologics.ri.step.PlacementsLink")
    ResponseEntity<String> getStepPlacementsLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.PlacementsLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.PlacementsLink.class, new com.genologics.ri.step.PlacementsLink()));
    }

    @GetMapping("/com.genologics.ri.step.PooledInputs")
    ResponseEntity<String> getStepPooledInputs() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.PooledInputs");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.PooledInputs.class, new com.genologics.ri.step.PooledInputs()));
    }

    @GetMapping("/com.genologics.ri.step.Pools")
    ResponseEntity<String> getStepPools() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.Pools");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.Pools.class, new com.genologics.ri.step.Pools()));
    }

    @GetMapping("/com.genologics.ri.step.Pools.AvailableInputs")
    ResponseEntity<String> getStepPoolsAvailableInputs() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.Pools.AvailableInputs");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.Pools.AvailableInputs.class, new com.genologics.ri.step.Pools.AvailableInputs()));
    }

    @GetMapping("/com.genologics.ri.step.Pools.PooledInputs")
    ResponseEntity<String> getStepPoolsPooledInputs() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.Pools.PooledInputs");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.Pools.PooledInputs.class, new com.genologics.ri.step.Pools.PooledInputs()));
    }

    @GetMapping("/com.genologics.ri.step.PoolsLink")
    ResponseEntity<String> getStepPoolsLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.PoolsLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.PoolsLink.class, new com.genologics.ri.step.PoolsLink()));
    }

    @GetMapping("/com.genologics.ri.step.ProgramStatus")
    ResponseEntity<String> getStepProgramStatus() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.ProgramStatus");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.ProgramStatus.class, new com.genologics.ri.step.ProgramStatus()));
    }

    @GetMapping("/com.genologics.ri.step.ProgramStatusLink")
    ResponseEntity<String> getStepProgramStatusLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.ProgramStatusLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.ProgramStatusLink.class, new com.genologics.ri.step.ProgramStatusLink()));
    }

    @GetMapping("/com.genologics.ri.step.ReagentLabel")
    ResponseEntity<String> getStepReagentLabel() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.ReagentLabel");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.ReagentLabel.class, new com.genologics.ri.step.ReagentLabel()));
    }

    @GetMapping("/com.genologics.ri.step.ReagentLotLink")
    ResponseEntity<String> getStepReagentLotLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.ReagentLotLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.ReagentLotLink.class, new com.genologics.ri.step.ReagentLotLink()));
    }

    @GetMapping("/com.genologics.ri.step.ReagentLotsLink")
    ResponseEntity<String> getStepReagentLotsLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.ReagentLotsLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.ReagentLotsLink.class, new com.genologics.ri.step.ReagentLotsLink()));
    }

    @GetMapping("/com.genologics.ri.step.Reagents")
    ResponseEntity<String> getStepReagents() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.Reagents");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.Reagents.class, new com.genologics.ri.step.Reagents()));
    }

    @GetMapping("/com.genologics.ri.step.Reagents.OutputReagents")
    ResponseEntity<String> getStepReagentsOutputReagents() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.Reagents.OutputReagents");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.Reagents.OutputReagents.class, new com.genologics.ri.step.Reagents.OutputReagents()));
    }

    @GetMapping("/com.genologics.ri.step.ReagentsLink")
    ResponseEntity<String> getStepReagentsLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.ReagentsLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.ReagentsLink.class, new com.genologics.ri.step.ReagentsLink()));
    }

    @GetMapping("/com.genologics.ri.step.ReagentsLots")
    ResponseEntity<String> getStepReagentsLots() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.ReagentsLots");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.ReagentsLots.class, new com.genologics.ri.step.ReagentsLots()));
    }

    @GetMapping("/com.genologics.ri.step.ReagentsLots.ReagentLots")
    ResponseEntity<String> getStepReagentsLotsReagentLots() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.ReagentsLots.ReagentLots");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.ReagentsLots.ReagentLots.class, new com.genologics.ri.step.ReagentsLots.ReagentLots()));
    }

    @GetMapping("/com.genologics.ri.step.Setup")
    ResponseEntity<String> getStepSetup() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.Setup");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.Setup.class, new com.genologics.ri.step.Setup()));
    }

    @GetMapping("/com.genologics.ri.step.Setup.Files")
    ResponseEntity<String> getStepSetupFiles() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.Setup.Files");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.Setup.Files.class, new com.genologics.ri.step.Setup.Files()));
    }

    @GetMapping("/com.genologics.ri.step.SetupLink")
    ResponseEntity<String> getStepSetupLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.SetupLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.SetupLink.class, new com.genologics.ri.step.SetupLink()));
    }

    @GetMapping("/com.genologics.ri.step.Step")
    ResponseEntity<String> getStepStep() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.Step");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.Step.class, new com.genologics.ri.step.Step()));
    }

    @GetMapping("/com.genologics.ri.step.Step.AvailablePrograms")
    ResponseEntity<String> getStepStepAvailablePrograms() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.Step.AvailablePrograms");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.Step.AvailablePrograms.class, new com.genologics.ri.step.Step.AvailablePrograms()));
    }

    @GetMapping("/com.genologics.ri.step.StepConfiguration")
    ResponseEntity<String> getStepStepConfiguration() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.StepConfiguration");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.StepConfiguration.class, new com.genologics.ri.step.StepConfiguration()));
    }

    @GetMapping("/com.genologics.ri.step.StepCreation")
    ResponseEntity<String> getStepStepCreation() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.StepCreation");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.StepCreation.class, new com.genologics.ri.step.StepCreation()));
    }

    @GetMapping("/com.genologics.ri.step.StepCreation.Inputs")
    ResponseEntity<String> getStepStepCreationInputs() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.StepCreation.Inputs");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.StepCreation.Inputs.class, new com.genologics.ri.step.StepCreation.Inputs()));
    }

    @GetMapping("/com.genologics.ri.step.User")
    ResponseEntity<String> getStepUser() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.step.User");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.step.User.class, new com.genologics.ri.step.User()));
    }

    @GetMapping("/com.genologics.ri.stepconfiguration.ControlTypeLink")
    ResponseEntity<String> getStepconfigurationControlTypeLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.stepconfiguration.ControlTypeLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.stepconfiguration.ControlTypeLink.class, new com.genologics.ri.stepconfiguration.ControlTypeLink()));
    }

    @GetMapping("/com.genologics.ri.stepconfiguration.EppTrigger")
    ResponseEntity<String> getStepconfigurationEppTrigger() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.stepconfiguration.EppTrigger");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.stepconfiguration.EppTrigger.class, new com.genologics.ri.stepconfiguration.EppTrigger()));
    }

    @GetMapping("/com.genologics.ri.stepconfiguration.Field")
    ResponseEntity<String> getStepconfigurationField() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.stepconfiguration.Field");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.stepconfiguration.Field.class, new com.genologics.ri.stepconfiguration.Field()));
    }

    @GetMapping("/com.genologics.ri.stepconfiguration.File")
    ResponseEntity<String> getStepconfigurationFile() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.stepconfiguration.File");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.stepconfiguration.File.class, new com.genologics.ri.stepconfiguration.File()));
    }

    @GetMapping("/com.genologics.ri.stepconfiguration.GenericTypeLink")
    ResponseEntity<String> getStepconfigurationGenericTypeLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.stepconfiguration.GenericTypeLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.stepconfiguration.GenericTypeLink.class, new com.genologics.ri.stepconfiguration.GenericTypeLink()));
    }

    @GetMapping("/com.genologics.ri.stepconfiguration.Icebucketfield")
    ResponseEntity<String> getStepconfigurationIcebucketfield() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.stepconfiguration.Icebucketfield");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.stepconfiguration.Icebucketfield.class, new com.genologics.ri.stepconfiguration.Icebucketfield()));
    }

    @GetMapping("/com.genologics.ri.stepconfiguration.LockableSetting")
    ResponseEntity<String> getStepconfigurationLockableSetting() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.stepconfiguration.LockableSetting");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.stepconfiguration.LockableSetting.class, new com.genologics.ri.stepconfiguration.LockableSetting()));
    }

    @GetMapping("/com.genologics.ri.stepconfiguration.NextStep")
    ResponseEntity<String> getStepconfigurationNextStep() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.stepconfiguration.NextStep");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.stepconfiguration.NextStep.class, new com.genologics.ri.stepconfiguration.NextStep()));
    }

    @GetMapping("/com.genologics.ri.stepconfiguration.ProcessType")
    ResponseEntity<String> getStepconfigurationProcessType() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.stepconfiguration.ProcessType");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.stepconfiguration.ProcessType.class, new com.genologics.ri.stepconfiguration.ProcessType()));
    }

    @GetMapping("/com.genologics.ri.stepconfiguration.Queuefield")
    ResponseEntity<String> getStepconfigurationQueuefield() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.stepconfiguration.Queuefield");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.stepconfiguration.Queuefield.class, new com.genologics.ri.stepconfiguration.Queuefield()));
    }

    @GetMapping("/com.genologics.ri.stepconfiguration.ReagentKitLink")
    ResponseEntity<String> getStepconfigurationReagentKitLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.stepconfiguration.ReagentKitLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.stepconfiguration.ReagentKitLink.class, new com.genologics.ri.stepconfiguration.ReagentKitLink()));
    }

    @GetMapping("/com.genologics.ri.stepconfiguration.Step")
    ResponseEntity<String> getStepconfigurationStep() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.stepconfiguration.Step");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.stepconfiguration.Step.class, new com.genologics.ri.stepconfiguration.Step()));
    }

    @GetMapping("/com.genologics.ri.stepconfiguration.Step.EppTriggers")
    ResponseEntity<String> getStepconfigurationStepEppTriggers() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.stepconfiguration.Step.EppTriggers");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.stepconfiguration.Step.EppTriggers.class, new com.genologics.ri.stepconfiguration.Step.EppTriggers()));
    }

    @GetMapping("/com.genologics.ri.stepconfiguration.Step.IceBucketFields")
    ResponseEntity<String> getStepconfigurationStepIceBucketFields() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.stepconfiguration.Step.IceBucketFields");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.stepconfiguration.Step.IceBucketFields.class, new com.genologics.ri.stepconfiguration.Step.IceBucketFields()));
    }

    @GetMapping("/com.genologics.ri.stepconfiguration.Step.PermittedContainers")
    ResponseEntity<String> getStepconfigurationStepPermittedContainers() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.stepconfiguration.Step.PermittedContainers");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.stepconfiguration.Step.PermittedContainers.class, new com.genologics.ri.stepconfiguration.Step.PermittedContainers()));
    }

    @GetMapping("/com.genologics.ri.stepconfiguration.Step.PermittedControlTypes")
    ResponseEntity<String> getStepconfigurationStepPermittedControlTypes() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.stepconfiguration.Step.PermittedControlTypes");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.stepconfiguration.Step.PermittedControlTypes.class, new com.genologics.ri.stepconfiguration.Step.PermittedControlTypes()));
    }

    @GetMapping("/com.genologics.ri.stepconfiguration.Step.PermittedInstrumentTypes")
    ResponseEntity<String> getStepconfigurationStepPermittedInstrumentTypes() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.stepconfiguration.Step.PermittedInstrumentTypes");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.stepconfiguration.Step.PermittedInstrumentTypes.class, new com.genologics.ri.stepconfiguration.Step.PermittedInstrumentTypes()));
    }

    @GetMapping("/com.genologics.ri.stepconfiguration.Step.PermittedReagentCategories")
    ResponseEntity<String> getStepconfigurationStepPermittedReagentCategories() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.stepconfiguration.Step.PermittedReagentCategories");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.stepconfiguration.Step.PermittedReagentCategories.class, new com.genologics.ri.stepconfiguration.Step.PermittedReagentCategories()));
    }

    @GetMapping("/com.genologics.ri.stepconfiguration.Step.QueueFields")
    ResponseEntity<String> getStepconfigurationStepQueueFields() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.stepconfiguration.Step.QueueFields");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.stepconfiguration.Step.QueueFields.class, new com.genologics.ri.stepconfiguration.Step.QueueFields()));
    }

    @GetMapping("/com.genologics.ri.stepconfiguration.Step.RequiredReagentKits")
    ResponseEntity<String> getStepconfigurationStepRequiredReagentKits() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.stepconfiguration.Step.RequiredReagentKits");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.stepconfiguration.Step.RequiredReagentKits.class, new com.genologics.ri.stepconfiguration.Step.RequiredReagentKits()));
    }

    @GetMapping("/com.genologics.ri.stepconfiguration.Step.SampleFields")
    ResponseEntity<String> getStepconfigurationStepSampleFields() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.stepconfiguration.Step.SampleFields");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.stepconfiguration.Step.SampleFields.class, new com.genologics.ri.stepconfiguration.Step.SampleFields()));
    }

    @GetMapping("/com.genologics.ri.stepconfiguration.Step.StepFields")
    ResponseEntity<String> getStepconfigurationStepStepFields() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.stepconfiguration.Step.StepFields");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.stepconfiguration.Step.StepFields.class, new com.genologics.ri.stepconfiguration.Step.StepFields()));
    }

    @GetMapping("/com.genologics.ri.stepconfiguration.Step.StepProperties")
    ResponseEntity<String> getStepconfigurationStepStepProperties() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.stepconfiguration.Step.StepProperties");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.stepconfiguration.Step.StepProperties.class, new com.genologics.ri.stepconfiguration.Step.StepProperties()));
    }

    @GetMapping("/com.genologics.ri.stepconfiguration.Step.Transitions")
    ResponseEntity<String> getStepconfigurationStepTransitions() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.stepconfiguration.Step.Transitions");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.stepconfiguration.Step.Transitions.class, new com.genologics.ri.stepconfiguration.Step.Transitions()));
    }

    @GetMapping("/com.genologics.ri.stepconfiguration.StepProperty")
    ResponseEntity<String> getStepconfigurationStepProperty() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.stepconfiguration.StepProperty");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.stepconfiguration.StepProperty.class, new com.genologics.ri.stepconfiguration.StepProperty()));
    }

    @GetMapping("/com.genologics.ri.stepconfiguration.StepSetup")
    ResponseEntity<String> getStepconfigurationStepSetup() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.stepconfiguration.StepSetup");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.stepconfiguration.StepSetup.class, new com.genologics.ri.stepconfiguration.StepSetup()));
    }

    @GetMapping("/com.genologics.ri.stepconfiguration.StepSetup.Files")
    ResponseEntity<String> getStepconfigurationStepSetupFiles() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.stepconfiguration.StepSetup.Files");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.stepconfiguration.StepSetup.Files.class, new com.genologics.ri.stepconfiguration.StepSetup.Files()));
    }

    @GetMapping("/com.genologics.ri.userdefined.Field")
    ResponseEntity<String> getUserdefinedField() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.userdefined.Field");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.userdefined.Field.class, new com.genologics.ri.userdefined.Field()));
    }

    @GetMapping("/com.genologics.ri.userdefined.Type")
    ResponseEntity<String> getUserdefinedType() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.userdefined.Type");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.userdefined.Type.class, new com.genologics.ri.userdefined.Type()));
    }

    @GetMapping("/com.genologics.ri.version.Version")
    ResponseEntity<String> getVersionVersion() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.version.Version");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.version.Version.class, new com.genologics.ri.version.Version()));
    }

    @GetMapping("/com.genologics.ri.version.Versions")
    ResponseEntity<String> getVersionVersions() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.version.Versions");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.version.Versions.class, new com.genologics.ri.version.Versions()));
    }

    @GetMapping("/com.genologics.ri.workflowconfiguration.ProtocolLink")
    ResponseEntity<String> getWorkflowconfigurationProtocolLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.workflowconfiguration.ProtocolLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.workflowconfiguration.ProtocolLink.class, new com.genologics.ri.workflowconfiguration.ProtocolLink()));
    }

    @GetMapping("/com.genologics.ri.workflowconfiguration.StageLink")
    ResponseEntity<String> getWorkflowconfigurationStageLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.workflowconfiguration.StageLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.workflowconfiguration.StageLink.class, new com.genologics.ri.workflowconfiguration.StageLink()));
    }

    @GetMapping("/com.genologics.ri.workflowconfiguration.Workflow")
    ResponseEntity<String> getWorkflowconfigurationWorkflow() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.workflowconfiguration.Workflow");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.workflowconfiguration.Workflow.class, new com.genologics.ri.workflowconfiguration.Workflow()));
    }

    @GetMapping("/com.genologics.ri.workflowconfiguration.Workflow.Protocols")
    ResponseEntity<String> getWorkflowconfigurationWorkflowProtocols() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.workflowconfiguration.Workflow.Protocols");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.workflowconfiguration.Workflow.Protocols.class, new com.genologics.ri.workflowconfiguration.Workflow.Protocols()));
    }

    @GetMapping("/com.genologics.ri.workflowconfiguration.Workflow.Stages")
    ResponseEntity<String> getWorkflowconfigurationWorkflowStages() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.workflowconfiguration.Workflow.Stages");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.workflowconfiguration.Workflow.Stages.class, new com.genologics.ri.workflowconfiguration.Workflow.Stages()));
    }

    @GetMapping("/com.genologics.ri.workflowconfiguration.WorkflowLink")
    ResponseEntity<String> getWorkflowconfigurationWorkflowLink() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.workflowconfiguration.WorkflowLink");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.workflowconfiguration.WorkflowLink.class, new com.genologics.ri.workflowconfiguration.WorkflowLink()));
    }

    @GetMapping("/com.genologics.ri.workflowconfiguration.Workflows")
    ResponseEntity<String> getWorkflowconfigurationWorkflows() throws JAXBException, ClassNotFoundException {
        logger.info("commence /xml/com.genologics.ri.workflowconfiguration.Workflows");
        return ResponseEntity.ok(marshallingService.marshal(com.genologics.ri.workflowconfiguration.Workflows.class, new com.genologics.ri.workflowconfiguration.Workflows()));
    }

}