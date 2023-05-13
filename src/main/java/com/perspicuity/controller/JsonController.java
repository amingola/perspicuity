package com.perspicuity.controller;

import com.perspicuity.service.MarshallingService;
import com.perspicuity.service.UnmarshallingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.bind.JAXBException;

@Controller
@RequestMapping("/json")
public class JsonController {

    private static final Logger logger = LoggerFactory.getLogger(JsonController.class);

    final MarshallingService marshallingService;

    public JsonController(MarshallingService marshallingService) {
        this.marshallingService = marshallingService;
    }

    @PostMapping("/com.genologics.ri.Address")
    ResponseEntity<Object> getAddress(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.Address");
        com.genologics.ri.Address jsonPayload = (com.genologics.ri.Address) xmlToJson(com.genologics.ri.Address.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.Container")
    ResponseEntity<Object> getContainer(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.Container");
        com.genologics.ri.Container jsonPayload = (com.genologics.ri.Container) xmlToJson(com.genologics.ri.Container.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.Externalid")
    ResponseEntity<Object> getExternalid(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.Externalid");
        com.genologics.ri.Externalid jsonPayload = (com.genologics.ri.Externalid) xmlToJson(com.genologics.ri.Externalid.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.Index")
    ResponseEntity<Object> getIndex(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.Index");
        com.genologics.ri.Index jsonPayload = (com.genologics.ri.Index) xmlToJson(com.genologics.ri.Index.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.Link")
    ResponseEntity<Object> getLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.Link");
        com.genologics.ri.Link jsonPayload = (com.genologics.ri.Link) xmlToJson(com.genologics.ri.Link.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.Links")
    ResponseEntity<Object> getLinks(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.Links");
        com.genologics.ri.Links jsonPayload = (com.genologics.ri.Links) xmlToJson(com.genologics.ri.Links.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.Location")
    ResponseEntity<Object> getLocation(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.Location");
        com.genologics.ri.Location jsonPayload = (com.genologics.ri.Location) xmlToJson(com.genologics.ri.Location.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.Page")
    ResponseEntity<Object> getPage(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.Page");
        com.genologics.ri.Page jsonPayload = (com.genologics.ri.Page) xmlToJson(com.genologics.ri.Page.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.artifact.Artifact")
    ResponseEntity<Object> getArtifactArtifact(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.artifact.Artifact");
        com.genologics.ri.artifact.Artifact jsonPayload = (com.genologics.ri.artifact.Artifact) xmlToJson(com.genologics.ri.artifact.Artifact.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.artifact.Artifact.WorkflowStages")
    ResponseEntity<Object> getArtifactArtifactWorkflowStages(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.artifact.Artifact.WorkflowStages");
        com.genologics.ri.artifact.Artifact.WorkflowStages jsonPayload = (com.genologics.ri.artifact.Artifact.WorkflowStages) xmlToJson(com.genologics.ri.artifact.Artifact.WorkflowStages.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.artifact.ArtifactLink")
    ResponseEntity<Object> getArtifactArtifactLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.artifact.ArtifactLink");
        com.genologics.ri.artifact.ArtifactLink jsonPayload = (com.genologics.ri.artifact.ArtifactLink) xmlToJson(com.genologics.ri.artifact.ArtifactLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.artifact.Artifactgroup")
    ResponseEntity<Object> getArtifactArtifactgroup(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.artifact.Artifactgroup");
        com.genologics.ri.artifact.Artifactgroup jsonPayload = (com.genologics.ri.artifact.Artifactgroup) xmlToJson(com.genologics.ri.artifact.Artifactgroup.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.artifact.Artifacts")
    ResponseEntity<Object> getArtifactArtifacts(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.artifact.Artifacts");
        com.genologics.ri.artifact.Artifacts jsonPayload = (com.genologics.ri.artifact.Artifacts) xmlToJson(com.genologics.ri.artifact.Artifacts.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.artifact.ControlType")
    ResponseEntity<Object> getArtifactControlType(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.artifact.ControlType");
        com.genologics.ri.artifact.ControlType jsonPayload = (com.genologics.ri.artifact.ControlType) xmlToJson(com.genologics.ri.artifact.ControlType.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.artifact.Demux")
    ResponseEntity<Object> getArtifactDemux(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.artifact.Demux");
        com.genologics.ri.artifact.Demux jsonPayload = (com.genologics.ri.artifact.Demux) xmlToJson(com.genologics.ri.artifact.Demux.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.artifact.DemuxArtifact")
    ResponseEntity<Object> getArtifactDemuxArtifact(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.artifact.DemuxArtifact");
        com.genologics.ri.artifact.DemuxArtifact jsonPayload = (com.genologics.ri.artifact.DemuxArtifact) xmlToJson(com.genologics.ri.artifact.DemuxArtifact.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.artifact.DemuxArtifact.ReagentLabels")
    ResponseEntity<Object> getArtifactDemuxArtifactReagentLabels(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.artifact.DemuxArtifact.ReagentLabels");
        com.genologics.ri.artifact.DemuxArtifact.ReagentLabels jsonPayload = (com.genologics.ri.artifact.DemuxArtifact.ReagentLabels) xmlToJson(com.genologics.ri.artifact.DemuxArtifact.ReagentLabels.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.artifact.DemuxArtifact.Samples")
    ResponseEntity<Object> getArtifactDemuxArtifactSamples(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.artifact.DemuxArtifact.Samples");
        com.genologics.ri.artifact.DemuxArtifact.Samples jsonPayload = (com.genologics.ri.artifact.DemuxArtifact.Samples) xmlToJson(com.genologics.ri.artifact.DemuxArtifact.Samples.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.artifact.DemuxArtifactSample")
    ResponseEntity<Object> getArtifactDemuxArtifactSample(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.artifact.DemuxArtifactSample");
        com.genologics.ri.artifact.DemuxArtifactSample jsonPayload = (com.genologics.ri.artifact.DemuxArtifactSample) xmlToJson(com.genologics.ri.artifact.DemuxArtifactSample.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.artifact.DemuxDetails")
    ResponseEntity<Object> getArtifactDemuxDetails(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.artifact.DemuxDetails");
        com.genologics.ri.artifact.DemuxDetails jsonPayload = (com.genologics.ri.artifact.DemuxDetails) xmlToJson(com.genologics.ri.artifact.DemuxDetails.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.artifact.DemuxDetails.Artifacts")
    ResponseEntity<Object> getArtifactDemuxDetailsArtifacts(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.artifact.DemuxDetails.Artifacts");
        com.genologics.ri.artifact.DemuxDetails.Artifacts jsonPayload = (com.genologics.ri.artifact.DemuxDetails.Artifacts) xmlToJson(com.genologics.ri.artifact.DemuxDetails.Artifacts.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.artifact.DemuxLink")
    ResponseEntity<Object> getArtifactDemuxLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.artifact.DemuxLink");
        com.genologics.ri.artifact.DemuxLink jsonPayload = (com.genologics.ri.artifact.DemuxLink) xmlToJson(com.genologics.ri.artifact.DemuxLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.artifact.DemuxSourceArtifact")
    ResponseEntity<Object> getArtifactDemuxSourceArtifact(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.artifact.DemuxSourceArtifact");
        com.genologics.ri.artifact.DemuxSourceArtifact jsonPayload = (com.genologics.ri.artifact.DemuxSourceArtifact) xmlToJson(com.genologics.ri.artifact.DemuxSourceArtifact.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.artifact.Details")
    ResponseEntity<Object> getArtifactDetails(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.artifact.Details");
        com.genologics.ri.artifact.Details jsonPayload = (com.genologics.ri.artifact.Details) xmlToJson(com.genologics.ri.artifact.Details.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.artifact.ParentProcess")
    ResponseEntity<Object> getArtifactParentProcess(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.artifact.ParentProcess");
        com.genologics.ri.artifact.ParentProcess jsonPayload = (com.genologics.ri.artifact.ParentProcess) xmlToJson(com.genologics.ri.artifact.ParentProcess.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.artifact.PoolStep")
    ResponseEntity<Object> getArtifactPoolStep(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.artifact.PoolStep");
        com.genologics.ri.artifact.PoolStep jsonPayload = (com.genologics.ri.artifact.PoolStep) xmlToJson(com.genologics.ri.artifact.PoolStep.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.artifact.ReagentLabel")
    ResponseEntity<Object> getArtifactReagentLabel(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.artifact.ReagentLabel");
        com.genologics.ri.artifact.ReagentLabel jsonPayload = (com.genologics.ri.artifact.ReagentLabel) xmlToJson(com.genologics.ri.artifact.ReagentLabel.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.artifact.Sample")
    ResponseEntity<Object> getArtifactSample(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.artifact.Sample");
        com.genologics.ri.artifact.Sample jsonPayload = (com.genologics.ri.artifact.Sample) xmlToJson(com.genologics.ri.artifact.Sample.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.artifact.WorkflowStage")
    ResponseEntity<Object> getArtifactWorkflowStage(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.artifact.WorkflowStage");
        com.genologics.ri.artifact.WorkflowStage jsonPayload = (com.genologics.ri.artifact.WorkflowStage) xmlToJson(com.genologics.ri.artifact.WorkflowStage.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.artifactgroup.Artifactgroup")
    ResponseEntity<Object> getArtifactgroupArtifactgroup(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.artifactgroup.Artifactgroup");
        com.genologics.ri.artifactgroup.Artifactgroup jsonPayload = (com.genologics.ri.artifactgroup.Artifactgroup) xmlToJson(com.genologics.ri.artifactgroup.Artifactgroup.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.artifactgroup.ArtifactgroupLink")
    ResponseEntity<Object> getArtifactgroupArtifactgroupLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.artifactgroup.ArtifactgroupLink");
        com.genologics.ri.artifactgroup.ArtifactgroupLink jsonPayload = (com.genologics.ri.artifactgroup.ArtifactgroupLink) xmlToJson(com.genologics.ri.artifactgroup.ArtifactgroupLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.artifactgroup.Artifactgroups")
    ResponseEntity<Object> getArtifactgroupArtifactgroups(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.artifactgroup.Artifactgroups");
        com.genologics.ri.artifactgroup.Artifactgroups jsonPayload = (com.genologics.ri.artifactgroup.Artifactgroups) xmlToJson(com.genologics.ri.artifactgroup.Artifactgroups.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.artifactgroup.Artifacts")
    ResponseEntity<Object> getArtifactgroupArtifacts(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.artifactgroup.Artifacts");
        com.genologics.ri.artifactgroup.Artifacts jsonPayload = (com.genologics.ri.artifactgroup.Artifacts) xmlToJson(com.genologics.ri.artifactgroup.Artifacts.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.automation.Automation")
    ResponseEntity<Object> getAutomationAutomation(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.automation.Automation");
        com.genologics.ri.automation.Automation jsonPayload = (com.genologics.ri.automation.Automation) xmlToJson(com.genologics.ri.automation.Automation.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.automation.Automation.ProcessTypes")
    ResponseEntity<Object> getAutomationAutomationProcessTypes(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.automation.Automation.ProcessTypes");
        com.genologics.ri.automation.Automation.ProcessTypes jsonPayload = (com.genologics.ri.automation.Automation.ProcessTypes) xmlToJson(com.genologics.ri.automation.Automation.ProcessTypes.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.automation.AutomationLink")
    ResponseEntity<Object> getAutomationAutomationLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.automation.AutomationLink");
        com.genologics.ri.automation.AutomationLink jsonPayload = (com.genologics.ri.automation.AutomationLink) xmlToJson(com.genologics.ri.automation.AutomationLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.automation.Automations")
    ResponseEntity<Object> getAutomationAutomations(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.automation.Automations");
        com.genologics.ri.automation.Automations jsonPayload = (com.genologics.ri.automation.Automations) xmlToJson(com.genologics.ri.automation.Automations.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.automation.ProcessType")
    ResponseEntity<Object> getAutomationProcessType(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.automation.ProcessType");
        com.genologics.ri.automation.ProcessType jsonPayload = (com.genologics.ri.automation.ProcessType) xmlToJson(com.genologics.ri.automation.ProcessType.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.configuration.Field")
    ResponseEntity<Object> getConfigurationField(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.configuration.Field");
        com.genologics.ri.configuration.Field jsonPayload = (com.genologics.ri.configuration.Field) xmlToJson(com.genologics.ri.configuration.Field.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.configuration.FieldLink")
    ResponseEntity<Object> getConfigurationFieldLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.configuration.FieldLink");
        com.genologics.ri.configuration.FieldLink jsonPayload = (com.genologics.ri.configuration.FieldLink) xmlToJson(com.genologics.ri.configuration.FieldLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.configuration.Type")
    ResponseEntity<Object> getConfigurationType(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.configuration.Type");
        com.genologics.ri.configuration.Type jsonPayload = (com.genologics.ri.configuration.Type) xmlToJson(com.genologics.ri.configuration.Type.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.configuration.TypeDefinition")
    ResponseEntity<Object> getConfigurationTypeDefinition(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.configuration.TypeDefinition");
        com.genologics.ri.configuration.TypeDefinition jsonPayload = (com.genologics.ri.configuration.TypeDefinition) xmlToJson(com.genologics.ri.configuration.TypeDefinition.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.configuration.UdfconfigLink")
    ResponseEntity<Object> getConfigurationUdfconfigLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.configuration.UdfconfigLink");
        com.genologics.ri.configuration.UdfconfigLink jsonPayload = (com.genologics.ri.configuration.UdfconfigLink) xmlToJson(com.genologics.ri.configuration.UdfconfigLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.configuration.Udfs")
    ResponseEntity<Object> getConfigurationUdfs(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.configuration.Udfs");
        com.genologics.ri.configuration.Udfs jsonPayload = (com.genologics.ri.configuration.Udfs) xmlToJson(com.genologics.ri.configuration.Udfs.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.configuration.UdtconfigLink")
    ResponseEntity<Object> getConfigurationUdtconfigLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.configuration.UdtconfigLink");
        com.genologics.ri.configuration.UdtconfigLink jsonPayload = (com.genologics.ri.configuration.UdtconfigLink) xmlToJson(com.genologics.ri.configuration.UdtconfigLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.configuration.Udts")
    ResponseEntity<Object> getConfigurationUdts(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.configuration.Udts");
        com.genologics.ri.configuration.Udts jsonPayload = (com.genologics.ri.configuration.Udts) xmlToJson(com.genologics.ri.configuration.Udts.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.container.Container")
    ResponseEntity<Object> getContainerContainer(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.container.Container");
        com.genologics.ri.container.Container jsonPayload = (com.genologics.ri.container.Container) xmlToJson(com.genologics.ri.container.Container.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.container.ContainerLink")
    ResponseEntity<Object> getContainerContainerLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.container.ContainerLink");
        com.genologics.ri.container.ContainerLink jsonPayload = (com.genologics.ri.container.ContainerLink) xmlToJson(com.genologics.ri.container.ContainerLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.container.ContainerType")
    ResponseEntity<Object> getContainerContainerType(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.container.ContainerType");
        com.genologics.ri.container.ContainerType jsonPayload = (com.genologics.ri.container.ContainerType) xmlToJson(com.genologics.ri.container.ContainerType.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.container.Containers")
    ResponseEntity<Object> getContainerContainers(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.container.Containers");
        com.genologics.ri.container.Containers jsonPayload = (com.genologics.ri.container.Containers) xmlToJson(com.genologics.ri.container.Containers.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.container.Details")
    ResponseEntity<Object> getContainerDetails(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.container.Details");
        com.genologics.ri.container.Details jsonPayload = (com.genologics.ri.container.Details) xmlToJson(com.genologics.ri.container.Details.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.container.Placement")
    ResponseEntity<Object> getContainerPlacement(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.container.Placement");
        com.genologics.ri.container.Placement jsonPayload = (com.genologics.ri.container.Placement) xmlToJson(com.genologics.ri.container.Placement.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.containertype.CalibrantWell")
    ResponseEntity<Object> getContainertypeCalibrantWell(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.containertype.CalibrantWell");
        com.genologics.ri.containertype.CalibrantWell jsonPayload = (com.genologics.ri.containertype.CalibrantWell) xmlToJson(com.genologics.ri.containertype.CalibrantWell.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.containertype.ContainerType")
    ResponseEntity<Object> getContainertypeContainerType(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.containertype.ContainerType");
        com.genologics.ri.containertype.ContainerType jsonPayload = (com.genologics.ri.containertype.ContainerType) xmlToJson(com.genologics.ri.containertype.ContainerType.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.containertype.ContainerTypeLink")
    ResponseEntity<Object> getContainertypeContainerTypeLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.containertype.ContainerTypeLink");
        com.genologics.ri.containertype.ContainerTypeLink jsonPayload = (com.genologics.ri.containertype.ContainerTypeLink) xmlToJson(com.genologics.ri.containertype.ContainerTypeLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.containertype.ContainerTypes")
    ResponseEntity<Object> getContainertypeContainerTypes(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.containertype.ContainerTypes");
        com.genologics.ri.containertype.ContainerTypes jsonPayload = (com.genologics.ri.containertype.ContainerTypes) xmlToJson(com.genologics.ri.containertype.ContainerTypes.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.containertype.Dimension")
    ResponseEntity<Object> getContainertypeDimension(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.containertype.Dimension");
        com.genologics.ri.containertype.Dimension jsonPayload = (com.genologics.ri.containertype.Dimension) xmlToJson(com.genologics.ri.containertype.Dimension.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.controltype.ControlType")
    ResponseEntity<Object> getControltypeControlType(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.controltype.ControlType");
        com.genologics.ri.controltype.ControlType jsonPayload = (com.genologics.ri.controltype.ControlType) xmlToJson(com.genologics.ri.controltype.ControlType.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.controltype.ControlTypeLink")
    ResponseEntity<Object> getControltypeControlTypeLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.controltype.ControlTypeLink");
        com.genologics.ri.controltype.ControlTypeLink jsonPayload = (com.genologics.ri.controltype.ControlTypeLink) xmlToJson(com.genologics.ri.controltype.ControlTypeLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.controltype.ControlTypes")
    ResponseEntity<Object> getControltypeControlTypes(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.controltype.ControlTypes");
        com.genologics.ri.controltype.ControlTypes jsonPayload = (com.genologics.ri.controltype.ControlTypes) xmlToJson(com.genologics.ri.controltype.ControlTypes.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.exception.Exception")
    ResponseEntity<Object> getExceptionException(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.exception.Exception");
        com.genologics.ri.exception.Exception jsonPayload = (com.genologics.ri.exception.Exception) xmlToJson(com.genologics.ri.exception.Exception.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.file.Details")
    ResponseEntity<Object> getFileDetails(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.file.Details");
        com.genologics.ri.file.Details jsonPayload = (com.genologics.ri.file.Details) xmlToJson(com.genologics.ri.file.Details.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.file.File")
    ResponseEntity<Object> getFileFile(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.file.File");
        com.genologics.ri.file.File jsonPayload = (com.genologics.ri.file.File) xmlToJson(com.genologics.ri.file.File.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.file.FileLink")
    ResponseEntity<Object> getFileFileLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.file.FileLink");
        com.genologics.ri.file.FileLink jsonPayload = (com.genologics.ri.file.FileLink) xmlToJson(com.genologics.ri.file.FileLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.file.Files")
    ResponseEntity<Object> getFileFiles(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.file.Files");
        com.genologics.ri.file.Files jsonPayload = (com.genologics.ri.file.Files) xmlToJson(com.genologics.ri.file.Files.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.instrument.Instrument")
    ResponseEntity<Object> getInstrumentInstrument(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.instrument.Instrument");
        com.genologics.ri.instrument.Instrument jsonPayload = (com.genologics.ri.instrument.Instrument) xmlToJson(com.genologics.ri.instrument.Instrument.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.instrument.InstrumentLink")
    ResponseEntity<Object> getInstrumentInstrumentLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.instrument.InstrumentLink");
        com.genologics.ri.instrument.InstrumentLink jsonPayload = (com.genologics.ri.instrument.InstrumentLink) xmlToJson(com.genologics.ri.instrument.InstrumentLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.instrument.Instruments")
    ResponseEntity<Object> getInstrumentInstruments(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.instrument.Instruments");
        com.genologics.ri.instrument.Instruments jsonPayload = (com.genologics.ri.instrument.Instruments) xmlToJson(com.genologics.ri.instrument.Instruments.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.instrumenttype.InstrumentType")
    ResponseEntity<Object> getInstrumenttypeInstrumentType(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.instrumenttype.InstrumentType");
        com.genologics.ri.instrumenttype.InstrumentType jsonPayload = (com.genologics.ri.instrumenttype.InstrumentType) xmlToJson(com.genologics.ri.instrumenttype.InstrumentType.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.instrumenttype.InstrumentType.ProcessTypes")
    ResponseEntity<Object> getInstrumenttypeInstrumentTypeProcessTypes(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.instrumenttype.InstrumentType.ProcessTypes");
        com.genologics.ri.instrumenttype.InstrumentType.ProcessTypes jsonPayload = (com.genologics.ri.instrumenttype.InstrumentType.ProcessTypes) xmlToJson(com.genologics.ri.instrumenttype.InstrumentType.ProcessTypes.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.instrumenttype.InstrumentTypeLink")
    ResponseEntity<Object> getInstrumenttypeInstrumentTypeLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.instrumenttype.InstrumentTypeLink");
        com.genologics.ri.instrumenttype.InstrumentTypeLink jsonPayload = (com.genologics.ri.instrumenttype.InstrumentTypeLink) xmlToJson(com.genologics.ri.instrumenttype.InstrumentTypeLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.instrumenttype.InstrumentTypeProcessType")
    ResponseEntity<Object> getInstrumenttypeInstrumentTypeProcessType(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.instrumenttype.InstrumentTypeProcessType");
        com.genologics.ri.instrumenttype.InstrumentTypeProcessType jsonPayload = (com.genologics.ri.instrumenttype.InstrumentTypeProcessType) xmlToJson(com.genologics.ri.instrumenttype.InstrumentTypeProcessType.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.instrumenttype.InstrumentTypes")
    ResponseEntity<Object> getInstrumenttypeInstrumentTypes(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.instrumenttype.InstrumentTypes");
        com.genologics.ri.instrumenttype.InstrumentTypes jsonPayload = (com.genologics.ri.instrumenttype.InstrumentTypes) xmlToJson(com.genologics.ri.instrumenttype.InstrumentTypes.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.lab.Lab")
    ResponseEntity<Object> getLabLab(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.lab.Lab");
        com.genologics.ri.lab.Lab jsonPayload = (com.genologics.ri.lab.Lab) xmlToJson(com.genologics.ri.lab.Lab.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.lab.LabLink")
    ResponseEntity<Object> getLabLabLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.lab.LabLink");
        com.genologics.ri.lab.LabLink jsonPayload = (com.genologics.ri.lab.LabLink) xmlToJson(com.genologics.ri.lab.LabLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.lab.Labs")
    ResponseEntity<Object> getLabLabs(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.lab.Labs");
        com.genologics.ri.lab.Labs jsonPayload = (com.genologics.ri.lab.Labs) xmlToJson(com.genologics.ri.lab.Labs.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.permission.Permission")
    ResponseEntity<Object> getPermissionPermission(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.permission.Permission");
        com.genologics.ri.permission.Permission jsonPayload = (com.genologics.ri.permission.Permission) xmlToJson(com.genologics.ri.permission.Permission.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.permission.PermissionLink")
    ResponseEntity<Object> getPermissionPermissionLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.permission.PermissionLink");
        com.genologics.ri.permission.PermissionLink jsonPayload = (com.genologics.ri.permission.PermissionLink) xmlToJson(com.genologics.ri.permission.PermissionLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.permission.Permissions")
    ResponseEntity<Object> getPermissionPermissions(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.permission.Permissions");
        com.genologics.ri.permission.Permissions jsonPayload = (com.genologics.ri.permission.Permissions) xmlToJson(com.genologics.ri.permission.Permissions.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.process.Artifact")
    ResponseEntity<Object> getProcessArtifact(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.process.Artifact");
        com.genologics.ri.process.Artifact jsonPayload = (com.genologics.ri.process.Artifact) xmlToJson(com.genologics.ri.process.Artifact.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.process.InputOutputMap")
    ResponseEntity<Object> getProcessInputOutputMap(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.process.InputOutputMap");
        com.genologics.ri.process.InputOutputMap jsonPayload = (com.genologics.ri.process.InputOutputMap) xmlToJson(com.genologics.ri.process.InputOutputMap.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.process.Instrument")
    ResponseEntity<Object> getProcessInstrument(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.process.Instrument");
        com.genologics.ri.process.Instrument jsonPayload = (com.genologics.ri.process.Instrument) xmlToJson(com.genologics.ri.process.Instrument.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.process.Parameter")
    ResponseEntity<Object> getProcessParameter(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.process.Parameter");
        com.genologics.ri.process.Parameter jsonPayload = (com.genologics.ri.process.Parameter) xmlToJson(com.genologics.ri.process.Parameter.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.process.ParentProcess")
    ResponseEntity<Object> getProcessParentProcess(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.process.ParentProcess");
        com.genologics.ri.process.ParentProcess jsonPayload = (com.genologics.ri.process.ParentProcess) xmlToJson(com.genologics.ri.process.ParentProcess.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.process.Process")
    ResponseEntity<Object> getProcessProcess(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.process.Process");
        com.genologics.ri.process.Process jsonPayload = (com.genologics.ri.process.Process) xmlToJson(com.genologics.ri.process.Process.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.process.ProcessLink")
    ResponseEntity<Object> getProcessProcessLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.process.ProcessLink");
        com.genologics.ri.process.ProcessLink jsonPayload = (com.genologics.ri.process.ProcessLink) xmlToJson(com.genologics.ri.process.ProcessLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.process.ProcessType")
    ResponseEntity<Object> getProcessProcessType(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.process.ProcessType");
        com.genologics.ri.process.ProcessType jsonPayload = (com.genologics.ri.process.ProcessType) xmlToJson(com.genologics.ri.process.ProcessType.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.process.Processes")
    ResponseEntity<Object> getProcessProcesses(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.process.Processes");
        com.genologics.ri.process.Processes jsonPayload = (com.genologics.ri.process.Processes) xmlToJson(com.genologics.ri.process.Processes.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.process.Technician")
    ResponseEntity<Object> getProcessTechnician(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.process.Technician");
        com.genologics.ri.process.Technician jsonPayload = (com.genologics.ri.process.Technician) xmlToJson(com.genologics.ri.process.Technician.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processexecution.Input")
    ResponseEntity<Object> getProcessexecutionInput(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processexecution.Input");
        com.genologics.ri.processexecution.Input jsonPayload = (com.genologics.ri.processexecution.Input) xmlToJson(com.genologics.ri.processexecution.Input.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processexecution.InputOutputMap")
    ResponseEntity<Object> getProcessexecutionInputOutputMap(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processexecution.InputOutputMap");
        com.genologics.ri.processexecution.InputOutputMap jsonPayload = (com.genologics.ri.processexecution.InputOutputMap) xmlToJson(com.genologics.ri.processexecution.InputOutputMap.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processexecution.Instrument")
    ResponseEntity<Object> getProcessexecutionInstrument(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processexecution.Instrument");
        com.genologics.ri.processexecution.Instrument jsonPayload = (com.genologics.ri.processexecution.Instrument) xmlToJson(com.genologics.ri.processexecution.Instrument.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processexecution.Output")
    ResponseEntity<Object> getProcessexecutionOutput(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processexecution.Output");
        com.genologics.ri.processexecution.Output jsonPayload = (com.genologics.ri.processexecution.Output) xmlToJson(com.genologics.ri.processexecution.Output.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processexecution.Parameter")
    ResponseEntity<Object> getProcessexecutionParameter(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processexecution.Parameter");
        com.genologics.ri.processexecution.Parameter jsonPayload = (com.genologics.ri.processexecution.Parameter) xmlToJson(com.genologics.ri.processexecution.Parameter.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processexecution.Process")
    ResponseEntity<Object> getProcessexecutionProcess(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processexecution.Process");
        com.genologics.ri.processexecution.Process jsonPayload = (com.genologics.ri.processexecution.Process) xmlToJson(com.genologics.ri.processexecution.Process.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processexecution.Technician")
    ResponseEntity<Object> getProcessexecutionTechnician(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processexecution.Technician");
        com.genologics.ri.processexecution.Technician jsonPayload = (com.genologics.ri.processexecution.Technician) xmlToJson(com.genologics.ri.processexecution.Technician.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processtemplate.Instrument")
    ResponseEntity<Object> getProcesstemplateInstrument(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processtemplate.Instrument");
        com.genologics.ri.processtemplate.Instrument jsonPayload = (com.genologics.ri.processtemplate.Instrument) xmlToJson(com.genologics.ri.processtemplate.Instrument.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processtemplate.Parameter")
    ResponseEntity<Object> getProcesstemplateParameter(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processtemplate.Parameter");
        com.genologics.ri.processtemplate.Parameter jsonPayload = (com.genologics.ri.processtemplate.Parameter) xmlToJson(com.genologics.ri.processtemplate.Parameter.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processtemplate.ProcessTemplate")
    ResponseEntity<Object> getProcesstemplateProcessTemplate(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processtemplate.ProcessTemplate");
        com.genologics.ri.processtemplate.ProcessTemplate jsonPayload = (com.genologics.ri.processtemplate.ProcessTemplate) xmlToJson(com.genologics.ri.processtemplate.ProcessTemplate.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processtemplate.ProcessTemplateLink")
    ResponseEntity<Object> getProcesstemplateProcessTemplateLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processtemplate.ProcessTemplateLink");
        com.genologics.ri.processtemplate.ProcessTemplateLink jsonPayload = (com.genologics.ri.processtemplate.ProcessTemplateLink) xmlToJson(com.genologics.ri.processtemplate.ProcessTemplateLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processtemplate.ProcessTemplates")
    ResponseEntity<Object> getProcesstemplateProcessTemplates(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processtemplate.ProcessTemplates");
        com.genologics.ri.processtemplate.ProcessTemplates jsonPayload = (com.genologics.ri.processtemplate.ProcessTemplates) xmlToJson(com.genologics.ri.processtemplate.ProcessTemplates.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processtemplate.ProcessType")
    ResponseEntity<Object> getProcesstemplateProcessType(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processtemplate.ProcessType");
        com.genologics.ri.processtemplate.ProcessType jsonPayload = (com.genologics.ri.processtemplate.ProcessType) xmlToJson(com.genologics.ri.processtemplate.ProcessType.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processtemplate.Technician")
    ResponseEntity<Object> getProcesstemplateTechnician(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processtemplate.Technician");
        com.genologics.ri.processtemplate.Technician jsonPayload = (com.genologics.ri.processtemplate.Technician) xmlToJson(com.genologics.ri.processtemplate.Technician.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processtype.ContainerTypeLink")
    ResponseEntity<Object> getProcesstypeContainerTypeLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processtype.ContainerTypeLink");
        com.genologics.ri.processtype.ContainerTypeLink jsonPayload = (com.genologics.ri.processtype.ContainerTypeLink) xmlToJson(com.genologics.ri.processtype.ContainerTypeLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processtype.ControlTypeLink")
    ResponseEntity<Object> getProcesstypeControlTypeLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processtype.ControlTypeLink");
        com.genologics.ri.processtype.ControlTypeLink jsonPayload = (com.genologics.ri.processtype.ControlTypeLink) xmlToJson(com.genologics.ri.processtype.ControlTypeLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processtype.EppTrigger")
    ResponseEntity<Object> getProcesstypeEppTrigger(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processtype.EppTrigger");
        com.genologics.ri.processtype.EppTrigger jsonPayload = (com.genologics.ri.processtype.EppTrigger) xmlToJson(com.genologics.ri.processtype.EppTrigger.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processtype.Field")
    ResponseEntity<Object> getProcesstypeField(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processtype.Field");
        com.genologics.ri.processtype.Field jsonPayload = (com.genologics.ri.processtype.Field) xmlToJson(com.genologics.ri.processtype.Field.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processtype.File")
    ResponseEntity<Object> getProcesstypeFile(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processtype.File");
        com.genologics.ri.processtype.File jsonPayload = (com.genologics.ri.processtype.File) xmlToJson(com.genologics.ri.processtype.File.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processtype.Icebucketfield")
    ResponseEntity<Object> getProcesstypeIcebucketfield(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processtype.Icebucketfield");
        com.genologics.ri.processtype.Icebucketfield jsonPayload = (com.genologics.ri.processtype.Icebucketfield) xmlToJson(com.genologics.ri.processtype.Icebucketfield.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processtype.Parameter")
    ResponseEntity<Object> getProcesstypeParameter(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processtype.Parameter");
        com.genologics.ri.processtype.Parameter jsonPayload = (com.genologics.ri.processtype.Parameter) xmlToJson(com.genologics.ri.processtype.Parameter.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processtype.ProcessInput")
    ResponseEntity<Object> getProcesstypeProcessInput(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processtype.ProcessInput");
        com.genologics.ri.processtype.ProcessInput jsonPayload = (com.genologics.ri.processtype.ProcessInput) xmlToJson(com.genologics.ri.processtype.ProcessInput.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processtype.ProcessOutput")
    ResponseEntity<Object> getProcesstypeProcessOutput(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processtype.ProcessOutput");
        com.genologics.ri.processtype.ProcessOutput jsonPayload = (com.genologics.ri.processtype.ProcessOutput) xmlToJson(com.genologics.ri.processtype.ProcessOutput.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processtype.ProcessType")
    ResponseEntity<Object> getProcesstypeProcessType(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processtype.ProcessType");
        com.genologics.ri.processtype.ProcessType jsonPayload = (com.genologics.ri.processtype.ProcessType) xmlToJson(com.genologics.ri.processtype.ProcessType.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processtype.ProcessType.EppTriggers")
    ResponseEntity<Object> getProcesstypeProcessTypeEppTriggers(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processtype.ProcessType.EppTriggers");
        com.genologics.ri.processtype.ProcessType.EppTriggers jsonPayload = (com.genologics.ri.processtype.ProcessType.EppTriggers) xmlToJson(com.genologics.ri.processtype.ProcessType.EppTriggers.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processtype.ProcessType.IceBucketFields")
    ResponseEntity<Object> getProcesstypeProcessTypeIceBucketFields(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processtype.ProcessType.IceBucketFields");
        com.genologics.ri.processtype.ProcessType.IceBucketFields jsonPayload = (com.genologics.ri.processtype.ProcessType.IceBucketFields) xmlToJson(com.genologics.ri.processtype.ProcessType.IceBucketFields.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processtype.ProcessType.PermittedContainers")
    ResponseEntity<Object> getProcesstypeProcessTypePermittedContainers(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processtype.ProcessType.PermittedContainers");
        com.genologics.ri.processtype.ProcessType.PermittedContainers jsonPayload = (com.genologics.ri.processtype.ProcessType.PermittedContainers) xmlToJson(com.genologics.ri.processtype.ProcessType.PermittedContainers.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processtype.ProcessType.PermittedControlTypes")
    ResponseEntity<Object> getProcesstypeProcessTypePermittedControlTypes(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processtype.ProcessType.PermittedControlTypes");
        com.genologics.ri.processtype.ProcessType.PermittedControlTypes jsonPayload = (com.genologics.ri.processtype.ProcessType.PermittedControlTypes) xmlToJson(com.genologics.ri.processtype.ProcessType.PermittedControlTypes.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processtype.ProcessType.PermittedInstrumentTypes")
    ResponseEntity<Object> getProcesstypeProcessTypePermittedInstrumentTypes(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processtype.ProcessType.PermittedInstrumentTypes");
        com.genologics.ri.processtype.ProcessType.PermittedInstrumentTypes jsonPayload = (com.genologics.ri.processtype.ProcessType.PermittedInstrumentTypes) xmlToJson(com.genologics.ri.processtype.ProcessType.PermittedInstrumentTypes.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processtype.ProcessType.PermittedReagentCategories")
    ResponseEntity<Object> getProcesstypeProcessTypePermittedReagentCategories(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processtype.ProcessType.PermittedReagentCategories");
        com.genologics.ri.processtype.ProcessType.PermittedReagentCategories jsonPayload = (com.genologics.ri.processtype.ProcessType.PermittedReagentCategories) xmlToJson(com.genologics.ri.processtype.ProcessType.PermittedReagentCategories.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processtype.ProcessType.QueueFields")
    ResponseEntity<Object> getProcesstypeProcessTypeQueueFields(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processtype.ProcessType.QueueFields");
        com.genologics.ri.processtype.ProcessType.QueueFields jsonPayload = (com.genologics.ri.processtype.ProcessType.QueueFields) xmlToJson(com.genologics.ri.processtype.ProcessType.QueueFields.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processtype.ProcessType.RequiredReagentKits")
    ResponseEntity<Object> getProcesstypeProcessTypeRequiredReagentKits(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processtype.ProcessType.RequiredReagentKits");
        com.genologics.ri.processtype.ProcessType.RequiredReagentKits jsonPayload = (com.genologics.ri.processtype.ProcessType.RequiredReagentKits) xmlToJson(com.genologics.ri.processtype.ProcessType.RequiredReagentKits.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processtype.ProcessType.SampleFields")
    ResponseEntity<Object> getProcesstypeProcessTypeSampleFields(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processtype.ProcessType.SampleFields");
        com.genologics.ri.processtype.ProcessType.SampleFields jsonPayload = (com.genologics.ri.processtype.ProcessType.SampleFields) xmlToJson(com.genologics.ri.processtype.ProcessType.SampleFields.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processtype.ProcessType.StepFields")
    ResponseEntity<Object> getProcesstypeProcessTypeStepFields(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processtype.ProcessType.StepFields");
        com.genologics.ri.processtype.ProcessType.StepFields jsonPayload = (com.genologics.ri.processtype.ProcessType.StepFields) xmlToJson(com.genologics.ri.processtype.ProcessType.StepFields.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processtype.ProcessType.StepProperties")
    ResponseEntity<Object> getProcesstypeProcessTypeStepProperties(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processtype.ProcessType.StepProperties");
        com.genologics.ri.processtype.ProcessType.StepProperties jsonPayload = (com.genologics.ri.processtype.ProcessType.StepProperties) xmlToJson(com.genologics.ri.processtype.ProcessType.StepProperties.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processtype.ProcessTypeAttribute")
    ResponseEntity<Object> getProcesstypeProcessTypeAttribute(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processtype.ProcessTypeAttribute");
        com.genologics.ri.processtype.ProcessTypeAttribute jsonPayload = (com.genologics.ri.processtype.ProcessTypeAttribute) xmlToJson(com.genologics.ri.processtype.ProcessTypeAttribute.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processtype.ProcessTypeLink")
    ResponseEntity<Object> getProcesstypeProcessTypeLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processtype.ProcessTypeLink");
        com.genologics.ri.processtype.ProcessTypeLink jsonPayload = (com.genologics.ri.processtype.ProcessTypeLink) xmlToJson(com.genologics.ri.processtype.ProcessTypeLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processtype.ProcessTypes")
    ResponseEntity<Object> getProcesstypeProcessTypes(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processtype.ProcessTypes");
        com.genologics.ri.processtype.ProcessTypes jsonPayload = (com.genologics.ri.processtype.ProcessTypes) xmlToJson(com.genologics.ri.processtype.ProcessTypes.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processtype.Queuefield")
    ResponseEntity<Object> getProcesstypeQueuefield(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processtype.Queuefield");
        com.genologics.ri.processtype.Queuefield jsonPayload = (com.genologics.ri.processtype.Queuefield) xmlToJson(com.genologics.ri.processtype.Queuefield.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processtype.ReagentKitLink")
    ResponseEntity<Object> getProcesstypeReagentKitLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processtype.ReagentKitLink");
        com.genologics.ri.processtype.ReagentKitLink jsonPayload = (com.genologics.ri.processtype.ReagentKitLink) xmlToJson(com.genologics.ri.processtype.ReagentKitLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processtype.StepProperty")
    ResponseEntity<Object> getProcesstypeStepProperty(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processtype.StepProperty");
        com.genologics.ri.processtype.StepProperty jsonPayload = (com.genologics.ri.processtype.StepProperty) xmlToJson(com.genologics.ri.processtype.StepProperty.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processtype.StepSetup")
    ResponseEntity<Object> getProcesstypeStepSetup(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processtype.StepSetup");
        com.genologics.ri.processtype.StepSetup jsonPayload = (com.genologics.ri.processtype.StepSetup) xmlToJson(com.genologics.ri.processtype.StepSetup.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processtype.StepSetup.Files")
    ResponseEntity<Object> getProcesstypeStepSetupFiles(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processtype.StepSetup.Files");
        com.genologics.ri.processtype.StepSetup.Files jsonPayload = (com.genologics.ri.processtype.StepSetup.Files) xmlToJson(com.genologics.ri.processtype.StepSetup.Files.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.processtype.TypeDefinition")
    ResponseEntity<Object> getProcesstypeTypeDefinition(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.processtype.TypeDefinition");
        com.genologics.ri.processtype.TypeDefinition jsonPayload = (com.genologics.ri.processtype.TypeDefinition) xmlToJson(com.genologics.ri.processtype.TypeDefinition.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.project.Project")
    ResponseEntity<Object> getProjectProject(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.project.Project");
        com.genologics.ri.project.Project jsonPayload = (com.genologics.ri.project.Project) xmlToJson(com.genologics.ri.project.Project.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.project.ProjectLink")
    ResponseEntity<Object> getProjectProjectLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.project.ProjectLink");
        com.genologics.ri.project.ProjectLink jsonPayload = (com.genologics.ri.project.ProjectLink) xmlToJson(com.genologics.ri.project.ProjectLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.project.Projects")
    ResponseEntity<Object> getProjectProjects(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.project.Projects");
        com.genologics.ri.project.Projects jsonPayload = (com.genologics.ri.project.Projects) xmlToJson(com.genologics.ri.project.Projects.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.project.Researcher")
    ResponseEntity<Object> getProjectResearcher(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.project.Researcher");
        com.genologics.ri.project.Researcher jsonPayload = (com.genologics.ri.project.Researcher) xmlToJson(com.genologics.ri.project.Researcher.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.property.Properties")
    ResponseEntity<Object> getPropertyProperties(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.property.Properties");
        com.genologics.ri.property.Properties jsonPayload = (com.genologics.ri.property.Properties) xmlToJson(com.genologics.ri.property.Properties.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.property.PropertyLink")
    ResponseEntity<Object> getPropertyPropertyLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.property.PropertyLink");
        com.genologics.ri.property.PropertyLink jsonPayload = (com.genologics.ri.property.PropertyLink) xmlToJson(com.genologics.ri.property.PropertyLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.protocolconfiguration.Protocol")
    ResponseEntity<Object> getProtocolconfigurationProtocol(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.protocolconfiguration.Protocol");
        com.genologics.ri.protocolconfiguration.Protocol jsonPayload = (com.genologics.ri.protocolconfiguration.Protocol) xmlToJson(com.genologics.ri.protocolconfiguration.Protocol.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.protocolconfiguration.Protocol.ProtocolProperties")
    ResponseEntity<Object> getProtocolconfigurationProtocolProtocolProperties(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.protocolconfiguration.Protocol.ProtocolProperties");
        com.genologics.ri.protocolconfiguration.Protocol.ProtocolProperties jsonPayload = (com.genologics.ri.protocolconfiguration.Protocol.ProtocolProperties) xmlToJson(com.genologics.ri.protocolconfiguration.Protocol.ProtocolProperties.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.protocolconfiguration.Protocol.Steps")
    ResponseEntity<Object> getProtocolconfigurationProtocolSteps(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.protocolconfiguration.Protocol.Steps");
        com.genologics.ri.protocolconfiguration.Protocol.Steps jsonPayload = (com.genologics.ri.protocolconfiguration.Protocol.Steps) xmlToJson(com.genologics.ri.protocolconfiguration.Protocol.Steps.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.protocolconfiguration.ProtocolLink")
    ResponseEntity<Object> getProtocolconfigurationProtocolLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.protocolconfiguration.ProtocolLink");
        com.genologics.ri.protocolconfiguration.ProtocolLink jsonPayload = (com.genologics.ri.protocolconfiguration.ProtocolLink) xmlToJson(com.genologics.ri.protocolconfiguration.ProtocolLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.protocolconfiguration.ProtocolProperty")
    ResponseEntity<Object> getProtocolconfigurationProtocolProperty(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.protocolconfiguration.ProtocolProperty");
        com.genologics.ri.protocolconfiguration.ProtocolProperty jsonPayload = (com.genologics.ri.protocolconfiguration.ProtocolProperty) xmlToJson(com.genologics.ri.protocolconfiguration.ProtocolProperty.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.protocolconfiguration.Protocols")
    ResponseEntity<Object> getProtocolconfigurationProtocols(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.protocolconfiguration.Protocols");
        com.genologics.ri.protocolconfiguration.Protocols jsonPayload = (com.genologics.ri.protocolconfiguration.Protocols) xmlToJson(com.genologics.ri.protocolconfiguration.Protocols.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.queue.ArtifactLink")
    ResponseEntity<Object> getQueueArtifactLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.queue.ArtifactLink");
        com.genologics.ri.queue.ArtifactLink jsonPayload = (com.genologics.ri.queue.ArtifactLink) xmlToJson(com.genologics.ri.queue.ArtifactLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.queue.Queue")
    ResponseEntity<Object> getQueueQueue(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.queue.Queue");
        com.genologics.ri.queue.Queue jsonPayload = (com.genologics.ri.queue.Queue) xmlToJson(com.genologics.ri.queue.Queue.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.queue.Queue.Artifacts")
    ResponseEntity<Object> getQueueQueueArtifacts(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.queue.Queue.Artifacts");
        com.genologics.ri.queue.Queue.Artifacts jsonPayload = (com.genologics.ri.queue.Queue.Artifacts) xmlToJson(com.genologics.ri.queue.Queue.Artifacts.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.reagentkit.ReagentKit")
    ResponseEntity<Object> getReagentkitReagentKit(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.reagentkit.ReagentKit");
        com.genologics.ri.reagentkit.ReagentKit jsonPayload = (com.genologics.ri.reagentkit.ReagentKit) xmlToJson(com.genologics.ri.reagentkit.ReagentKit.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.reagentkit.ReagentKitLink")
    ResponseEntity<Object> getReagentkitReagentKitLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.reagentkit.ReagentKitLink");
        com.genologics.ri.reagentkit.ReagentKitLink jsonPayload = (com.genologics.ri.reagentkit.ReagentKitLink) xmlToJson(com.genologics.ri.reagentkit.ReagentKitLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.reagentkit.ReagentKits")
    ResponseEntity<Object> getReagentkitReagentKits(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.reagentkit.ReagentKits");
        com.genologics.ri.reagentkit.ReagentKits jsonPayload = (com.genologics.ri.reagentkit.ReagentKits) xmlToJson(com.genologics.ri.reagentkit.ReagentKits.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.reagentlot.ReagentKitLink")
    ResponseEntity<Object> getReagentlotReagentKitLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.reagentlot.ReagentKitLink");
        com.genologics.ri.reagentlot.ReagentKitLink jsonPayload = (com.genologics.ri.reagentlot.ReagentKitLink) xmlToJson(com.genologics.ri.reagentlot.ReagentKitLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.reagentlot.ReagentLot")
    ResponseEntity<Object> getReagentlotReagentLot(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.reagentlot.ReagentLot");
        com.genologics.ri.reagentlot.ReagentLot jsonPayload = (com.genologics.ri.reagentlot.ReagentLot) xmlToJson(com.genologics.ri.reagentlot.ReagentLot.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.reagentlot.ReagentLotLink")
    ResponseEntity<Object> getReagentlotReagentLotLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.reagentlot.ReagentLotLink");
        com.genologics.ri.reagentlot.ReagentLotLink jsonPayload = (com.genologics.ri.reagentlot.ReagentLotLink) xmlToJson(com.genologics.ri.reagentlot.ReagentLotLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.reagentlot.ReagentLots")
    ResponseEntity<Object> getReagentlotReagentLots(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.reagentlot.ReagentLots");
        com.genologics.ri.reagentlot.ReagentLots jsonPayload = (com.genologics.ri.reagentlot.ReagentLots) xmlToJson(com.genologics.ri.reagentlot.ReagentLots.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.reagentlot.Researcher")
    ResponseEntity<Object> getReagentlotResearcher(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.reagentlot.Researcher");
        com.genologics.ri.reagentlot.Researcher jsonPayload = (com.genologics.ri.reagentlot.Researcher) xmlToJson(com.genologics.ri.reagentlot.Researcher.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.reagenttype.Attribute")
    ResponseEntity<Object> getReagenttypeAttribute(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.reagenttype.Attribute");
        com.genologics.ri.reagenttype.Attribute jsonPayload = (com.genologics.ri.reagenttype.Attribute) xmlToJson(com.genologics.ri.reagenttype.Attribute.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.reagenttype.ReagentType")
    ResponseEntity<Object> getReagenttypeReagentType(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.reagenttype.ReagentType");
        com.genologics.ri.reagenttype.ReagentType jsonPayload = (com.genologics.ri.reagenttype.ReagentType) xmlToJson(com.genologics.ri.reagenttype.ReagentType.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.reagenttype.ReagentTypeLink")
    ResponseEntity<Object> getReagenttypeReagentTypeLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.reagenttype.ReagentTypeLink");
        com.genologics.ri.reagenttype.ReagentTypeLink jsonPayload = (com.genologics.ri.reagenttype.ReagentTypeLink) xmlToJson(com.genologics.ri.reagenttype.ReagentTypeLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.reagenttype.ReagentTypes")
    ResponseEntity<Object> getReagenttypeReagentTypes(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.reagenttype.ReagentTypes");
        com.genologics.ri.reagenttype.ReagentTypes jsonPayload = (com.genologics.ri.reagenttype.ReagentTypes) xmlToJson(com.genologics.ri.reagenttype.ReagentTypes.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.reagenttype.SpecialType")
    ResponseEntity<Object> getReagenttypeSpecialType(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.reagenttype.SpecialType");
        com.genologics.ri.reagenttype.SpecialType jsonPayload = (com.genologics.ri.reagenttype.SpecialType) xmlToJson(com.genologics.ri.reagenttype.SpecialType.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.researcher.Credentials")
    ResponseEntity<Object> getResearcherCredentials(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.researcher.Credentials");
        com.genologics.ri.researcher.Credentials jsonPayload = (com.genologics.ri.researcher.Credentials) xmlToJson(com.genologics.ri.researcher.Credentials.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.researcher.Lab")
    ResponseEntity<Object> getResearcherLab(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.researcher.Lab");
        com.genologics.ri.researcher.Lab jsonPayload = (com.genologics.ri.researcher.Lab) xmlToJson(com.genologics.ri.researcher.Lab.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.researcher.Researcher")
    ResponseEntity<Object> getResearcherResearcher(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.researcher.Researcher");
        com.genologics.ri.researcher.Researcher jsonPayload = (com.genologics.ri.researcher.Researcher) xmlToJson(com.genologics.ri.researcher.Researcher.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.researcher.ResearcherLink")
    ResponseEntity<Object> getResearcherResearcherLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.researcher.ResearcherLink");
        com.genologics.ri.researcher.ResearcherLink jsonPayload = (com.genologics.ri.researcher.ResearcherLink) xmlToJson(com.genologics.ri.researcher.ResearcherLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.researcher.Researchers")
    ResponseEntity<Object> getResearcherResearchers(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.researcher.Researchers");
        com.genologics.ri.researcher.Researchers jsonPayload = (com.genologics.ri.researcher.Researchers) xmlToJson(com.genologics.ri.researcher.Researchers.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.researcher.Role")
    ResponseEntity<Object> getResearcherRole(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.researcher.Role");
        com.genologics.ri.researcher.Role jsonPayload = (com.genologics.ri.researcher.Role) xmlToJson(com.genologics.ri.researcher.Role.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.role.PermissionLink")
    ResponseEntity<Object> getRolePermissionLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.role.PermissionLink");
        com.genologics.ri.role.PermissionLink jsonPayload = (com.genologics.ri.role.PermissionLink) xmlToJson(com.genologics.ri.role.PermissionLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.role.ResearcherLink")
    ResponseEntity<Object> getRoleResearcherLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.role.ResearcherLink");
        com.genologics.ri.role.ResearcherLink jsonPayload = (com.genologics.ri.role.ResearcherLink) xmlToJson(com.genologics.ri.role.ResearcherLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.role.Role")
    ResponseEntity<Object> getRoleRole(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.role.Role");
        com.genologics.ri.role.Role jsonPayload = (com.genologics.ri.role.Role) xmlToJson(com.genologics.ri.role.Role.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.role.Role.Permissions")
    ResponseEntity<Object> getRoleRolePermissions(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.role.Role.Permissions");
        com.genologics.ri.role.Role.Permissions jsonPayload = (com.genologics.ri.role.Role.Permissions) xmlToJson(com.genologics.ri.role.Role.Permissions.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.role.Role.Researchers")
    ResponseEntity<Object> getRoleRoleResearchers(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.role.Role.Researchers");
        com.genologics.ri.role.Role.Researchers jsonPayload = (com.genologics.ri.role.Role.Researchers) xmlToJson(com.genologics.ri.role.Role.Researchers.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.role.RoleLink")
    ResponseEntity<Object> getRoleRoleLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.role.RoleLink");
        com.genologics.ri.role.RoleLink jsonPayload = (com.genologics.ri.role.RoleLink) xmlToJson(com.genologics.ri.role.RoleLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.role.Roles")
    ResponseEntity<Object> getRoleRoles(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.role.Roles");
        com.genologics.ri.role.Roles jsonPayload = (com.genologics.ri.role.Roles) xmlToJson(com.genologics.ri.role.Roles.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.routing.Artifact")
    ResponseEntity<Object> getRoutingArtifact(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.routing.Artifact");
        com.genologics.ri.routing.Artifact jsonPayload = (com.genologics.ri.routing.Artifact) xmlToJson(com.genologics.ri.routing.Artifact.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.routing.ExtArtifactAssignments")
    ResponseEntity<Object> getRoutingExtArtifactAssignments(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.routing.ExtArtifactAssignments");
        com.genologics.ri.routing.ExtArtifactAssignments jsonPayload = (com.genologics.ri.routing.ExtArtifactAssignments) xmlToJson(com.genologics.ri.routing.ExtArtifactAssignments.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.routing.Routing")
    ResponseEntity<Object> getRoutingRouting(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.routing.Routing");
        com.genologics.ri.routing.Routing jsonPayload = (com.genologics.ri.routing.Routing) xmlToJson(com.genologics.ri.routing.Routing.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.sample.Artifact")
    ResponseEntity<Object> getSampleArtifact(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.sample.Artifact");
        com.genologics.ri.sample.Artifact jsonPayload = (com.genologics.ri.sample.Artifact) xmlToJson(com.genologics.ri.sample.Artifact.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.sample.Biosource")
    ResponseEntity<Object> getSampleBiosource(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.sample.Biosource");
        com.genologics.ri.sample.Biosource jsonPayload = (com.genologics.ri.sample.Biosource) xmlToJson(com.genologics.ri.sample.Biosource.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.sample.ContainerType")
    ResponseEntity<Object> getSampleContainerType(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.sample.ContainerType");
        com.genologics.ri.sample.ContainerType jsonPayload = (com.genologics.ri.sample.ContainerType) xmlToJson(com.genologics.ri.sample.ContainerType.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.sample.ControlType")
    ResponseEntity<Object> getSampleControlType(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.sample.ControlType");
        com.genologics.ri.sample.ControlType jsonPayload = (com.genologics.ri.sample.ControlType) xmlToJson(com.genologics.ri.sample.ControlType.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.sample.Details")
    ResponseEntity<Object> getSampleDetails(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.sample.Details");
        com.genologics.ri.sample.Details jsonPayload = (com.genologics.ri.sample.Details) xmlToJson(com.genologics.ri.sample.Details.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.sample.Project")
    ResponseEntity<Object> getSampleProject(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.sample.Project");
        com.genologics.ri.sample.Project jsonPayload = (com.genologics.ri.sample.Project) xmlToJson(com.genologics.ri.sample.Project.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.sample.Sample")
    ResponseEntity<Object> getSampleSample(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.sample.Sample");
        com.genologics.ri.sample.Sample jsonPayload = (com.genologics.ri.sample.Sample) xmlToJson(com.genologics.ri.sample.Sample.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.sample.SampleLink")
    ResponseEntity<Object> getSampleSampleLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.sample.SampleLink");
        com.genologics.ri.sample.SampleLink jsonPayload = (com.genologics.ri.sample.SampleLink) xmlToJson(com.genologics.ri.sample.SampleLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.sample.Samplebase")
    ResponseEntity<Object> getSampleSamplebase(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.sample.Samplebase");
        com.genologics.ri.sample.Samplebase jsonPayload = (com.genologics.ri.sample.Samplebase) xmlToJson(com.genologics.ri.sample.Samplebase.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.sample.Samplecreation")
    ResponseEntity<Object> getSampleSamplecreation(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.sample.Samplecreation");
        com.genologics.ri.sample.Samplecreation jsonPayload = (com.genologics.ri.sample.Samplecreation) xmlToJson(com.genologics.ri.sample.Samplecreation.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.sample.Samples")
    ResponseEntity<Object> getSampleSamples(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.sample.Samples");
        com.genologics.ri.sample.Samples jsonPayload = (com.genologics.ri.sample.Samples) xmlToJson(com.genologics.ri.sample.Samples.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.sample.Submitter")
    ResponseEntity<Object> getSampleSubmitter(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.sample.Submitter");
        com.genologics.ri.sample.Submitter jsonPayload = (com.genologics.ri.sample.Submitter) xmlToJson(com.genologics.ri.sample.Submitter.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.stage.Protocol")
    ResponseEntity<Object> getStageProtocol(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.stage.Protocol");
        com.genologics.ri.stage.Protocol jsonPayload = (com.genologics.ri.stage.Protocol) xmlToJson(com.genologics.ri.stage.Protocol.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.stage.Stage")
    ResponseEntity<Object> getStageStage(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.stage.Stage");
        com.genologics.ri.stage.Stage jsonPayload = (com.genologics.ri.stage.Stage) xmlToJson(com.genologics.ri.stage.Stage.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.stage.Step")
    ResponseEntity<Object> getStageStep(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.stage.Step");
        com.genologics.ri.stage.Step jsonPayload = (com.genologics.ri.stage.Step) xmlToJson(com.genologics.ri.stage.Step.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.stage.Workflow")
    ResponseEntity<Object> getStageWorkflow(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.stage.Workflow");
        com.genologics.ri.stage.Workflow jsonPayload = (com.genologics.ri.stage.Workflow) xmlToJson(com.genologics.ri.stage.Workflow.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.Actions")
    ResponseEntity<Object> getStepActions(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.Actions");
        com.genologics.ri.step.Actions jsonPayload = (com.genologics.ri.step.Actions) xmlToJson(com.genologics.ri.step.Actions.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.Actions.NextActions")
    ResponseEntity<Object> getStepActionsNextActions(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.Actions.NextActions");
        com.genologics.ri.step.Actions.NextActions jsonPayload = (com.genologics.ri.step.Actions.NextActions) xmlToJson(com.genologics.ri.step.Actions.NextActions.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.ActionsLink")
    ResponseEntity<Object> getStepActionsLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.ActionsLink");
        com.genologics.ri.step.ActionsLink jsonPayload = (com.genologics.ri.step.ActionsLink) xmlToJson(com.genologics.ri.step.ActionsLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.Artifact")
    ResponseEntity<Object> getStepArtifact(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.Artifact");
        com.genologics.ri.step.Artifact jsonPayload = (com.genologics.ri.step.Artifact) xmlToJson(com.genologics.ri.step.Artifact.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.AutomaticNextStepLink")
    ResponseEntity<Object> getStepAutomaticNextStepLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.AutomaticNextStepLink");
        com.genologics.ri.step.AutomaticNextStepLink jsonPayload = (com.genologics.ri.step.AutomaticNextStepLink) xmlToJson(com.genologics.ri.step.AutomaticNextStepLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.AvailableProgram")
    ResponseEntity<Object> getStepAvailableProgram(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.AvailableProgram");
        com.genologics.ri.step.AvailableProgram jsonPayload = (com.genologics.ri.step.AvailableProgram) xmlToJson(com.genologics.ri.step.AvailableProgram.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.Container")
    ResponseEntity<Object> getStepContainer(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.Container");
        com.genologics.ri.step.Container jsonPayload = (com.genologics.ri.step.Container) xmlToJson(com.genologics.ri.step.Container.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.CreationInput")
    ResponseEntity<Object> getStepCreationInput(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.CreationInput");
        com.genologics.ri.step.CreationInput jsonPayload = (com.genologics.ri.step.CreationInput) xmlToJson(com.genologics.ri.step.CreationInput.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.Details")
    ResponseEntity<Object> getStepDetails(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.Details");
        com.genologics.ri.step.Details jsonPayload = (com.genologics.ri.step.Details) xmlToJson(com.genologics.ri.step.Details.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.Details.Fields")
    ResponseEntity<Object> getStepDetailsFields(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.Details.Fields");
        com.genologics.ri.step.Details.Fields jsonPayload = (com.genologics.ri.step.Details.Fields) xmlToJson(com.genologics.ri.step.Details.Fields.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.Details.InputOutputMaps")
    ResponseEntity<Object> getStepDetailsInputOutputMaps(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.Details.InputOutputMaps");
        com.genologics.ri.step.Details.InputOutputMaps jsonPayload = (com.genologics.ri.step.Details.InputOutputMaps) xmlToJson(com.genologics.ri.step.Details.InputOutputMaps.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.DetailsLink")
    ResponseEntity<Object> getStepDetailsLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.DetailsLink");
        com.genologics.ri.step.DetailsLink jsonPayload = (com.genologics.ri.step.DetailsLink) xmlToJson(com.genologics.ri.step.DetailsLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.EscalatedArtifact")
    ResponseEntity<Object> getStepEscalatedArtifact(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.EscalatedArtifact");
        com.genologics.ri.step.EscalatedArtifact jsonPayload = (com.genologics.ri.step.EscalatedArtifact) xmlToJson(com.genologics.ri.step.EscalatedArtifact.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.Escalation")
    ResponseEntity<Object> getStepEscalation(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.Escalation");
        com.genologics.ri.step.Escalation jsonPayload = (com.genologics.ri.step.Escalation) xmlToJson(com.genologics.ri.step.Escalation.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.Escalation.EscalatedArtifacts")
    ResponseEntity<Object> getStepEscalationEscalatedArtifacts(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.Escalation.EscalatedArtifacts");
        com.genologics.ri.step.Escalation.EscalatedArtifacts jsonPayload = (com.genologics.ri.step.Escalation.EscalatedArtifacts) xmlToJson(com.genologics.ri.step.Escalation.EscalatedArtifacts.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.EscalationRequest")
    ResponseEntity<Object> getStepEscalationRequest(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.EscalationRequest");
        com.genologics.ri.step.EscalationRequest jsonPayload = (com.genologics.ri.step.EscalationRequest) xmlToJson(com.genologics.ri.step.EscalationRequest.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.EscalationReview")
    ResponseEntity<Object> getStepEscalationReview(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.EscalationReview");
        com.genologics.ri.step.EscalationReview jsonPayload = (com.genologics.ri.step.EscalationReview) xmlToJson(com.genologics.ri.step.EscalationReview.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.File")
    ResponseEntity<Object> getStepFile(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.File");
        com.genologics.ri.step.File jsonPayload = (com.genologics.ri.step.File) xmlToJson(com.genologics.ri.step.File.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.Input")
    ResponseEntity<Object> getStepInput(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.Input");
        com.genologics.ri.step.Input jsonPayload = (com.genologics.ri.step.Input) xmlToJson(com.genologics.ri.step.Input.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.InputOutputMap")
    ResponseEntity<Object> getStepInputOutputMap(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.InputOutputMap");
        com.genologics.ri.step.InputOutputMap jsonPayload = (com.genologics.ri.step.InputOutputMap) xmlToJson(com.genologics.ri.step.InputOutputMap.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.Instrument")
    ResponseEntity<Object> getStepInstrument(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.Instrument");
        com.genologics.ri.step.Instrument jsonPayload = (com.genologics.ri.step.Instrument) xmlToJson(com.genologics.ri.step.Instrument.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.NextAction")
    ResponseEntity<Object> getStepNextAction(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.NextAction");
        com.genologics.ri.step.NextAction jsonPayload = (com.genologics.ri.step.NextAction) xmlToJson(com.genologics.ri.step.NextAction.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.Output")
    ResponseEntity<Object> getStepOutput(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.Output");
        com.genologics.ri.step.Output jsonPayload = (com.genologics.ri.step.Output) xmlToJson(com.genologics.ri.step.Output.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.OutputPlacement")
    ResponseEntity<Object> getStepOutputPlacement(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.OutputPlacement");
        com.genologics.ri.step.OutputPlacement jsonPayload = (com.genologics.ri.step.OutputPlacement) xmlToJson(com.genologics.ri.step.OutputPlacement.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.Placements")
    ResponseEntity<Object> getStepPlacements(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.Placements");
        com.genologics.ri.step.Placements jsonPayload = (com.genologics.ri.step.Placements) xmlToJson(com.genologics.ri.step.Placements.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.Placements.OutputPlacements")
    ResponseEntity<Object> getStepPlacementsOutputPlacements(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.Placements.OutputPlacements");
        com.genologics.ri.step.Placements.OutputPlacements jsonPayload = (com.genologics.ri.step.Placements.OutputPlacements) xmlToJson(com.genologics.ri.step.Placements.OutputPlacements.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.Placements.SelectedContainers")
    ResponseEntity<Object> getStepPlacementsSelectedContainers(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.Placements.SelectedContainers");
        com.genologics.ri.step.Placements.SelectedContainers jsonPayload = (com.genologics.ri.step.Placements.SelectedContainers) xmlToJson(com.genologics.ri.step.Placements.SelectedContainers.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.PlacementsLink")
    ResponseEntity<Object> getStepPlacementsLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.PlacementsLink");
        com.genologics.ri.step.PlacementsLink jsonPayload = (com.genologics.ri.step.PlacementsLink) xmlToJson(com.genologics.ri.step.PlacementsLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.PooledInputs")
    ResponseEntity<Object> getStepPooledInputs(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.PooledInputs");
        com.genologics.ri.step.PooledInputs jsonPayload = (com.genologics.ri.step.PooledInputs) xmlToJson(com.genologics.ri.step.PooledInputs.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.Pools")
    ResponseEntity<Object> getStepPools(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.Pools");
        com.genologics.ri.step.Pools jsonPayload = (com.genologics.ri.step.Pools) xmlToJson(com.genologics.ri.step.Pools.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.Pools.AvailableInputs")
    ResponseEntity<Object> getStepPoolsAvailableInputs(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.Pools.AvailableInputs");
        com.genologics.ri.step.Pools.AvailableInputs jsonPayload = (com.genologics.ri.step.Pools.AvailableInputs) xmlToJson(com.genologics.ri.step.Pools.AvailableInputs.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.Pools.PooledInputs")
    ResponseEntity<Object> getStepPoolsPooledInputs(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.Pools.PooledInputs");
        com.genologics.ri.step.Pools.PooledInputs jsonPayload = (com.genologics.ri.step.Pools.PooledInputs) xmlToJson(com.genologics.ri.step.Pools.PooledInputs.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.PoolsLink")
    ResponseEntity<Object> getStepPoolsLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.PoolsLink");
        com.genologics.ri.step.PoolsLink jsonPayload = (com.genologics.ri.step.PoolsLink) xmlToJson(com.genologics.ri.step.PoolsLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.ProgramStatus")
    ResponseEntity<Object> getStepProgramStatus(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.ProgramStatus");
        com.genologics.ri.step.ProgramStatus jsonPayload = (com.genologics.ri.step.ProgramStatus) xmlToJson(com.genologics.ri.step.ProgramStatus.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.ProgramStatusLink")
    ResponseEntity<Object> getStepProgramStatusLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.ProgramStatusLink");
        com.genologics.ri.step.ProgramStatusLink jsonPayload = (com.genologics.ri.step.ProgramStatusLink) xmlToJson(com.genologics.ri.step.ProgramStatusLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.ReagentLabel")
    ResponseEntity<Object> getStepReagentLabel(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.ReagentLabel");
        com.genologics.ri.step.ReagentLabel jsonPayload = (com.genologics.ri.step.ReagentLabel) xmlToJson(com.genologics.ri.step.ReagentLabel.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.ReagentLotLink")
    ResponseEntity<Object> getStepReagentLotLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.ReagentLotLink");
        com.genologics.ri.step.ReagentLotLink jsonPayload = (com.genologics.ri.step.ReagentLotLink) xmlToJson(com.genologics.ri.step.ReagentLotLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.ReagentLotsLink")
    ResponseEntity<Object> getStepReagentLotsLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.ReagentLotsLink");
        com.genologics.ri.step.ReagentLotsLink jsonPayload = (com.genologics.ri.step.ReagentLotsLink) xmlToJson(com.genologics.ri.step.ReagentLotsLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.Reagents")
    ResponseEntity<Object> getStepReagents(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.Reagents");
        com.genologics.ri.step.Reagents jsonPayload = (com.genologics.ri.step.Reagents) xmlToJson(com.genologics.ri.step.Reagents.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.Reagents.OutputReagents")
    ResponseEntity<Object> getStepReagentsOutputReagents(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.Reagents.OutputReagents");
        com.genologics.ri.step.Reagents.OutputReagents jsonPayload = (com.genologics.ri.step.Reagents.OutputReagents) xmlToJson(com.genologics.ri.step.Reagents.OutputReagents.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.ReagentsLink")
    ResponseEntity<Object> getStepReagentsLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.ReagentsLink");
        com.genologics.ri.step.ReagentsLink jsonPayload = (com.genologics.ri.step.ReagentsLink) xmlToJson(com.genologics.ri.step.ReagentsLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.ReagentsLots")
    ResponseEntity<Object> getStepReagentsLots(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.ReagentsLots");
        com.genologics.ri.step.ReagentsLots jsonPayload = (com.genologics.ri.step.ReagentsLots) xmlToJson(com.genologics.ri.step.ReagentsLots.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.ReagentsLots.ReagentLots")
    ResponseEntity<Object> getStepReagentsLotsReagentLots(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.ReagentsLots.ReagentLots");
        com.genologics.ri.step.ReagentsLots.ReagentLots jsonPayload = (com.genologics.ri.step.ReagentsLots.ReagentLots) xmlToJson(com.genologics.ri.step.ReagentsLots.ReagentLots.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.Setup")
    ResponseEntity<Object> getStepSetup(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.Setup");
        com.genologics.ri.step.Setup jsonPayload = (com.genologics.ri.step.Setup) xmlToJson(com.genologics.ri.step.Setup.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.Setup.Files")
    ResponseEntity<Object> getStepSetupFiles(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.Setup.Files");
        com.genologics.ri.step.Setup.Files jsonPayload = (com.genologics.ri.step.Setup.Files) xmlToJson(com.genologics.ri.step.Setup.Files.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.SetupLink")
    ResponseEntity<Object> getStepSetupLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.SetupLink");
        com.genologics.ri.step.SetupLink jsonPayload = (com.genologics.ri.step.SetupLink) xmlToJson(com.genologics.ri.step.SetupLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.Step")
    ResponseEntity<Object> getStepStep(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.Step");
        com.genologics.ri.step.Step jsonPayload = (com.genologics.ri.step.Step) xmlToJson(com.genologics.ri.step.Step.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.Step.AvailablePrograms")
    ResponseEntity<Object> getStepStepAvailablePrograms(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.Step.AvailablePrograms");
        com.genologics.ri.step.Step.AvailablePrograms jsonPayload = (com.genologics.ri.step.Step.AvailablePrograms) xmlToJson(com.genologics.ri.step.Step.AvailablePrograms.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.StepConfiguration")
    ResponseEntity<Object> getStepStepConfiguration(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.StepConfiguration");
        com.genologics.ri.step.StepConfiguration jsonPayload = (com.genologics.ri.step.StepConfiguration) xmlToJson(com.genologics.ri.step.StepConfiguration.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.StepCreation")
    ResponseEntity<Object> getStepStepCreation(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.StepCreation");
        com.genologics.ri.step.StepCreation jsonPayload = (com.genologics.ri.step.StepCreation) xmlToJson(com.genologics.ri.step.StepCreation.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.StepCreation.Inputs")
    ResponseEntity<Object> getStepStepCreationInputs(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.StepCreation.Inputs");
        com.genologics.ri.step.StepCreation.Inputs jsonPayload = (com.genologics.ri.step.StepCreation.Inputs) xmlToJson(com.genologics.ri.step.StepCreation.Inputs.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.step.User")
    ResponseEntity<Object> getStepUser(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.step.User");
        com.genologics.ri.step.User jsonPayload = (com.genologics.ri.step.User) xmlToJson(com.genologics.ri.step.User.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.stepconfiguration.ControlTypeLink")
    ResponseEntity<Object> getStepconfigurationControlTypeLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.stepconfiguration.ControlTypeLink");
        com.genologics.ri.stepconfiguration.ControlTypeLink jsonPayload = (com.genologics.ri.stepconfiguration.ControlTypeLink) xmlToJson(com.genologics.ri.stepconfiguration.ControlTypeLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.stepconfiguration.EppTrigger")
    ResponseEntity<Object> getStepconfigurationEppTrigger(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.stepconfiguration.EppTrigger");
        com.genologics.ri.stepconfiguration.EppTrigger jsonPayload = (com.genologics.ri.stepconfiguration.EppTrigger) xmlToJson(com.genologics.ri.stepconfiguration.EppTrigger.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.stepconfiguration.Field")
    ResponseEntity<Object> getStepconfigurationField(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.stepconfiguration.Field");
        com.genologics.ri.stepconfiguration.Field jsonPayload = (com.genologics.ri.stepconfiguration.Field) xmlToJson(com.genologics.ri.stepconfiguration.Field.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.stepconfiguration.File")
    ResponseEntity<Object> getStepconfigurationFile(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.stepconfiguration.File");
        com.genologics.ri.stepconfiguration.File jsonPayload = (com.genologics.ri.stepconfiguration.File) xmlToJson(com.genologics.ri.stepconfiguration.File.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.stepconfiguration.GenericTypeLink")
    ResponseEntity<Object> getStepconfigurationGenericTypeLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.stepconfiguration.GenericTypeLink");
        com.genologics.ri.stepconfiguration.GenericTypeLink jsonPayload = (com.genologics.ri.stepconfiguration.GenericTypeLink) xmlToJson(com.genologics.ri.stepconfiguration.GenericTypeLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.stepconfiguration.Icebucketfield")
    ResponseEntity<Object> getStepconfigurationIcebucketfield(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.stepconfiguration.Icebucketfield");
        com.genologics.ri.stepconfiguration.Icebucketfield jsonPayload = (com.genologics.ri.stepconfiguration.Icebucketfield) xmlToJson(com.genologics.ri.stepconfiguration.Icebucketfield.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.stepconfiguration.LockableSetting")
    ResponseEntity<Object> getStepconfigurationLockableSetting(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.stepconfiguration.LockableSetting");
        com.genologics.ri.stepconfiguration.LockableSetting jsonPayload = (com.genologics.ri.stepconfiguration.LockableSetting) xmlToJson(com.genologics.ri.stepconfiguration.LockableSetting.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.stepconfiguration.NextStep")
    ResponseEntity<Object> getStepconfigurationNextStep(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.stepconfiguration.NextStep");
        com.genologics.ri.stepconfiguration.NextStep jsonPayload = (com.genologics.ri.stepconfiguration.NextStep) xmlToJson(com.genologics.ri.stepconfiguration.NextStep.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.stepconfiguration.ProcessType")
    ResponseEntity<Object> getStepconfigurationProcessType(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.stepconfiguration.ProcessType");
        com.genologics.ri.stepconfiguration.ProcessType jsonPayload = (com.genologics.ri.stepconfiguration.ProcessType) xmlToJson(com.genologics.ri.stepconfiguration.ProcessType.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.stepconfiguration.Queuefield")
    ResponseEntity<Object> getStepconfigurationQueuefield(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.stepconfiguration.Queuefield");
        com.genologics.ri.stepconfiguration.Queuefield jsonPayload = (com.genologics.ri.stepconfiguration.Queuefield) xmlToJson(com.genologics.ri.stepconfiguration.Queuefield.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.stepconfiguration.ReagentKitLink")
    ResponseEntity<Object> getStepconfigurationReagentKitLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.stepconfiguration.ReagentKitLink");
        com.genologics.ri.stepconfiguration.ReagentKitLink jsonPayload = (com.genologics.ri.stepconfiguration.ReagentKitLink) xmlToJson(com.genologics.ri.stepconfiguration.ReagentKitLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.stepconfiguration.Step")
    ResponseEntity<Object> getStepconfigurationStep(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.stepconfiguration.Step");
        com.genologics.ri.stepconfiguration.Step jsonPayload = (com.genologics.ri.stepconfiguration.Step) xmlToJson(com.genologics.ri.stepconfiguration.Step.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.stepconfiguration.Step.EppTriggers")
    ResponseEntity<Object> getStepconfigurationStepEppTriggers(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.stepconfiguration.Step.EppTriggers");
        com.genologics.ri.stepconfiguration.Step.EppTriggers jsonPayload = (com.genologics.ri.stepconfiguration.Step.EppTriggers) xmlToJson(com.genologics.ri.stepconfiguration.Step.EppTriggers.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.stepconfiguration.Step.IceBucketFields")
    ResponseEntity<Object> getStepconfigurationStepIceBucketFields(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.stepconfiguration.Step.IceBucketFields");
        com.genologics.ri.stepconfiguration.Step.IceBucketFields jsonPayload = (com.genologics.ri.stepconfiguration.Step.IceBucketFields) xmlToJson(com.genologics.ri.stepconfiguration.Step.IceBucketFields.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.stepconfiguration.Step.PermittedContainers")
    ResponseEntity<Object> getStepconfigurationStepPermittedContainers(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.stepconfiguration.Step.PermittedContainers");
        com.genologics.ri.stepconfiguration.Step.PermittedContainers jsonPayload = (com.genologics.ri.stepconfiguration.Step.PermittedContainers) xmlToJson(com.genologics.ri.stepconfiguration.Step.PermittedContainers.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.stepconfiguration.Step.PermittedControlTypes")
    ResponseEntity<Object> getStepconfigurationStepPermittedControlTypes(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.stepconfiguration.Step.PermittedControlTypes");
        com.genologics.ri.stepconfiguration.Step.PermittedControlTypes jsonPayload = (com.genologics.ri.stepconfiguration.Step.PermittedControlTypes) xmlToJson(com.genologics.ri.stepconfiguration.Step.PermittedControlTypes.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.stepconfiguration.Step.PermittedInstrumentTypes")
    ResponseEntity<Object> getStepconfigurationStepPermittedInstrumentTypes(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.stepconfiguration.Step.PermittedInstrumentTypes");
        com.genologics.ri.stepconfiguration.Step.PermittedInstrumentTypes jsonPayload = (com.genologics.ri.stepconfiguration.Step.PermittedInstrumentTypes) xmlToJson(com.genologics.ri.stepconfiguration.Step.PermittedInstrumentTypes.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.stepconfiguration.Step.PermittedReagentCategories")
    ResponseEntity<Object> getStepconfigurationStepPermittedReagentCategories(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.stepconfiguration.Step.PermittedReagentCategories");
        com.genologics.ri.stepconfiguration.Step.PermittedReagentCategories jsonPayload = (com.genologics.ri.stepconfiguration.Step.PermittedReagentCategories) xmlToJson(com.genologics.ri.stepconfiguration.Step.PermittedReagentCategories.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.stepconfiguration.Step.QueueFields")
    ResponseEntity<Object> getStepconfigurationStepQueueFields(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.stepconfiguration.Step.QueueFields");
        com.genologics.ri.stepconfiguration.Step.QueueFields jsonPayload = (com.genologics.ri.stepconfiguration.Step.QueueFields) xmlToJson(com.genologics.ri.stepconfiguration.Step.QueueFields.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.stepconfiguration.Step.RequiredReagentKits")
    ResponseEntity<Object> getStepconfigurationStepRequiredReagentKits(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.stepconfiguration.Step.RequiredReagentKits");
        com.genologics.ri.stepconfiguration.Step.RequiredReagentKits jsonPayload = (com.genologics.ri.stepconfiguration.Step.RequiredReagentKits) xmlToJson(com.genologics.ri.stepconfiguration.Step.RequiredReagentKits.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.stepconfiguration.Step.SampleFields")
    ResponseEntity<Object> getStepconfigurationStepSampleFields(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.stepconfiguration.Step.SampleFields");
        com.genologics.ri.stepconfiguration.Step.SampleFields jsonPayload = (com.genologics.ri.stepconfiguration.Step.SampleFields) xmlToJson(com.genologics.ri.stepconfiguration.Step.SampleFields.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.stepconfiguration.Step.StepFields")
    ResponseEntity<Object> getStepconfigurationStepStepFields(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.stepconfiguration.Step.StepFields");
        com.genologics.ri.stepconfiguration.Step.StepFields jsonPayload = (com.genologics.ri.stepconfiguration.Step.StepFields) xmlToJson(com.genologics.ri.stepconfiguration.Step.StepFields.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.stepconfiguration.Step.StepProperties")
    ResponseEntity<Object> getStepconfigurationStepStepProperties(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.stepconfiguration.Step.StepProperties");
        com.genologics.ri.stepconfiguration.Step.StepProperties jsonPayload = (com.genologics.ri.stepconfiguration.Step.StepProperties) xmlToJson(com.genologics.ri.stepconfiguration.Step.StepProperties.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.stepconfiguration.Step.Transitions")
    ResponseEntity<Object> getStepconfigurationStepTransitions(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.stepconfiguration.Step.Transitions");
        com.genologics.ri.stepconfiguration.Step.Transitions jsonPayload = (com.genologics.ri.stepconfiguration.Step.Transitions) xmlToJson(com.genologics.ri.stepconfiguration.Step.Transitions.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.stepconfiguration.StepProperty")
    ResponseEntity<Object> getStepconfigurationStepProperty(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.stepconfiguration.StepProperty");
        com.genologics.ri.stepconfiguration.StepProperty jsonPayload = (com.genologics.ri.stepconfiguration.StepProperty) xmlToJson(com.genologics.ri.stepconfiguration.StepProperty.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.stepconfiguration.StepSetup")
    ResponseEntity<Object> getStepconfigurationStepSetup(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.stepconfiguration.StepSetup");
        com.genologics.ri.stepconfiguration.StepSetup jsonPayload = (com.genologics.ri.stepconfiguration.StepSetup) xmlToJson(com.genologics.ri.stepconfiguration.StepSetup.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.stepconfiguration.StepSetup.Files")
    ResponseEntity<Object> getStepconfigurationStepSetupFiles(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.stepconfiguration.StepSetup.Files");
        com.genologics.ri.stepconfiguration.StepSetup.Files jsonPayload = (com.genologics.ri.stepconfiguration.StepSetup.Files) xmlToJson(com.genologics.ri.stepconfiguration.StepSetup.Files.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.userdefined.Field")
    ResponseEntity<Object> getUserdefinedField(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.userdefined.Field");
        com.genologics.ri.userdefined.Field jsonPayload = (com.genologics.ri.userdefined.Field) xmlToJson(com.genologics.ri.userdefined.Field.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.userdefined.Type")
    ResponseEntity<Object> getUserdefinedType(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.userdefined.Type");
        com.genologics.ri.userdefined.Type jsonPayload = (com.genologics.ri.userdefined.Type) xmlToJson(com.genologics.ri.userdefined.Type.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.version.Version")
    ResponseEntity<Object> getVersionVersion(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.version.Version");
        com.genologics.ri.version.Version jsonPayload = (com.genologics.ri.version.Version) xmlToJson(com.genologics.ri.version.Version.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.version.Versions")
    ResponseEntity<Object> getVersionVersions(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.version.Versions");
        com.genologics.ri.version.Versions jsonPayload = (com.genologics.ri.version.Versions) xmlToJson(com.genologics.ri.version.Versions.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.workflowconfiguration.ProtocolLink")
    ResponseEntity<Object> getWorkflowconfigurationProtocolLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.workflowconfiguration.ProtocolLink");
        com.genologics.ri.workflowconfiguration.ProtocolLink jsonPayload = (com.genologics.ri.workflowconfiguration.ProtocolLink) xmlToJson(com.genologics.ri.workflowconfiguration.ProtocolLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.workflowconfiguration.StageLink")
    ResponseEntity<Object> getWorkflowconfigurationStageLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.workflowconfiguration.StageLink");
        com.genologics.ri.workflowconfiguration.StageLink jsonPayload = (com.genologics.ri.workflowconfiguration.StageLink) xmlToJson(com.genologics.ri.workflowconfiguration.StageLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.workflowconfiguration.Workflow")
    ResponseEntity<Object> getWorkflowconfigurationWorkflow(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.workflowconfiguration.Workflow");
        com.genologics.ri.workflowconfiguration.Workflow jsonPayload = (com.genologics.ri.workflowconfiguration.Workflow) xmlToJson(com.genologics.ri.workflowconfiguration.Workflow.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.workflowconfiguration.Workflow.Protocols")
    ResponseEntity<Object> getWorkflowconfigurationWorkflowProtocols(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.workflowconfiguration.Workflow.Protocols");
        com.genologics.ri.workflowconfiguration.Workflow.Protocols jsonPayload = (com.genologics.ri.workflowconfiguration.Workflow.Protocols) xmlToJson(com.genologics.ri.workflowconfiguration.Workflow.Protocols.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.workflowconfiguration.Workflow.Stages")
    ResponseEntity<Object> getWorkflowconfigurationWorkflowStages(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.workflowconfiguration.Workflow.Stages");
        com.genologics.ri.workflowconfiguration.Workflow.Stages jsonPayload = (com.genologics.ri.workflowconfiguration.Workflow.Stages) xmlToJson(com.genologics.ri.workflowconfiguration.Workflow.Stages.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.workflowconfiguration.WorkflowLink")
    ResponseEntity<Object> getWorkflowconfigurationWorkflowLink(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.workflowconfiguration.WorkflowLink");
        com.genologics.ri.workflowconfiguration.WorkflowLink jsonPayload = (com.genologics.ri.workflowconfiguration.WorkflowLink) xmlToJson(com.genologics.ri.workflowconfiguration.WorkflowLink.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/com.genologics.ri.workflowconfiguration.Workflows")
    ResponseEntity<Object> getWorkflowconfigurationWorkflows(@RequestBody String xmlPayload) {
        logger.info("hit /json/com.genologics.ri.workflowconfiguration.Workflows");
        com.genologics.ri.workflowconfiguration.Workflows jsonPayload = (com.genologics.ri.workflowconfiguration.Workflows) xmlToJson(com.genologics.ri.workflowconfiguration.Workflows.class, xmlPayload);
        return buildResponse(jsonPayload);
    }
    private ResponseEntity<Object> buildResponse(Object jsonPayload) {
        return (jsonPayload != null)
                ? ResponseEntity.ok(jsonPayload)
                : ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    private Object xmlToJson(Class<?> payloadClass, String xmlPayload){

        logger.info("\n" + xmlPayload);

        try {
            return UnmarshallingService.unmarshal(payloadClass, xmlPayload).getValue();
        } catch (JAXBException | ClassNotFoundException e) {
            logger.error("xmlToJson didn't work for payload: " + xmlPayload, e);
        }

        return null;

    }

}
