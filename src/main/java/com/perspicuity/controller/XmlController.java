package com.perspicuity.controller;

import com.perspicuity.service.MarshallingService;
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
@RequestMapping("/xml")
public class XmlController {

    private static final Logger logger = LoggerFactory.getLogger(XmlController.class);

    final MarshallingService marshallingService;

    public XmlController(MarshallingService marshallingService) {
        this.marshallingService = marshallingService;
    }

    @PostMapping("/xml/address")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.Address address){
        logger.info("hit /marshal/com.genologics.ri.Address");
        return marshal(address.getClass(), address);
    }

    @PostMapping("/xml/container")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.Container container){
        logger.info("hit /marshal/com.genologics.ri.Container");
        return marshal(container.getClass(), container);
    }

    @PostMapping("/xml/externalid")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.Externalid externalid){
        logger.info("hit /marshal/com.genologics.ri.Externalid");
        return marshal(externalid.getClass(), externalid);
    }

    @PostMapping("/xml/index")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.Index index){
        logger.info("hit /marshal/com.genologics.ri.Index");
        return marshal(index.getClass(), index);
    }

    @PostMapping("/xml/link")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.Link link){
        logger.info("hit /marshal/com.genologics.ri.Link");
        return marshal(link.getClass(), link);
    }

    @PostMapping("/xml/links")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.Links links){
        logger.info("hit /marshal/com.genologics.ri.Links");
        return marshal(links.getClass(), links);
    }

    @PostMapping("/xml/location")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.Location location){
        logger.info("hit /marshal/com.genologics.ri.Location");
        return marshal(location.getClass(), location);
    }

    @PostMapping("/xml/page")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.Page page){
        logger.info("hit /marshal/com.genologics.ri.Page");
        return marshal(page.getClass(), page);
    }

    @PostMapping("/xml/artifactartifact")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.Artifact artifactartifact){
        logger.info("hit /marshal/com.genologics.ri.artifact.Artifact");
        return marshal(artifactartifact.getClass(), artifactartifact);
    }

    @PostMapping("/xml/artifactartifactworkflowstages")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.Artifact.WorkflowStages artifactartifactworkflowstages){
        logger.info("hit /marshal/com.genologics.ri.artifact.Artifact.WorkflowStages");
        return marshal(artifactartifactworkflowstages.getClass(), artifactartifactworkflowstages);
    }

    @PostMapping("/xml/artifactartifactlink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.ArtifactLink artifactartifactlink){
        logger.info("hit /marshal/com.genologics.ri.artifact.ArtifactLink");
        return marshal(artifactartifactlink.getClass(), artifactartifactlink);
    }

    @PostMapping("/xml/artifactartifactgroup")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.Artifactgroup artifactartifactgroup){
        logger.info("hit /marshal/com.genologics.ri.artifact.Artifactgroup");
        return marshal(artifactartifactgroup.getClass(), artifactartifactgroup);
    }

    @PostMapping("/xml/artifactartifacts")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.Artifacts artifactartifacts){
        logger.info("hit /marshal/com.genologics.ri.artifact.Artifacts");
        return marshal(artifactartifacts.getClass(), artifactartifacts);
    }

    @PostMapping("/xml/artifactcontroltype")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.ControlType artifactcontroltype){
        logger.info("hit /marshal/com.genologics.ri.artifact.ControlType");
        return marshal(artifactcontroltype.getClass(), artifactcontroltype);
    }

    @PostMapping("/xml/artifactdemux")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.Demux artifactdemux){
        logger.info("hit /marshal/com.genologics.ri.artifact.Demux");
        return marshal(artifactdemux.getClass(), artifactdemux);
    }

    @PostMapping("/xml/artifactdemuxartifact")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.DemuxArtifact artifactdemuxartifact){
        logger.info("hit /marshal/com.genologics.ri.artifact.DemuxArtifact");
        return marshal(artifactdemuxartifact.getClass(), artifactdemuxartifact);
    }

    @PostMapping("/xml/artifactdemuxartifactreagentlabels")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.DemuxArtifact.ReagentLabels artifactdemuxartifactreagentlabels){
        logger.info("hit /marshal/com.genologics.ri.artifact.DemuxArtifact.ReagentLabels");
        return marshal(artifactdemuxartifactreagentlabels.getClass(), artifactdemuxartifactreagentlabels);
    }

    @PostMapping("/xml/artifactdemuxartifactsamples")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.DemuxArtifact.Samples artifactdemuxartifactsamples){
        logger.info("hit /marshal/com.genologics.ri.artifact.DemuxArtifact.Samples");
        return marshal(artifactdemuxartifactsamples.getClass(), artifactdemuxartifactsamples);
    }

    @PostMapping("/xml/artifactdemuxartifactsample")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.DemuxArtifactSample artifactdemuxartifactsample){
        logger.info("hit /marshal/com.genologics.ri.artifact.DemuxArtifactSample");
        return marshal(artifactdemuxartifactsample.getClass(), artifactdemuxartifactsample);
    }

    @PostMapping("/xml/artifactdemuxdetails")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.DemuxDetails artifactdemuxdetails){
        logger.info("hit /marshal/com.genologics.ri.artifact.DemuxDetails");
        return marshal(artifactdemuxdetails.getClass(), artifactdemuxdetails);
    }

    @PostMapping("/xml/artifactdemuxdetailsartifacts")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.DemuxDetails.Artifacts artifactdemuxdetailsartifacts){
        logger.info("hit /marshal/com.genologics.ri.artifact.DemuxDetails.Artifacts");
        return marshal(artifactdemuxdetailsartifacts.getClass(), artifactdemuxdetailsartifacts);
    }

    @PostMapping("/xml/artifactdemuxlink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.DemuxLink artifactdemuxlink){
        logger.info("hit /marshal/com.genologics.ri.artifact.DemuxLink");
        return marshal(artifactdemuxlink.getClass(), artifactdemuxlink);
    }

    @PostMapping("/xml/artifactdemuxsourceartifact")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.DemuxSourceArtifact artifactdemuxsourceartifact){
        logger.info("hit /marshal/com.genologics.ri.artifact.DemuxSourceArtifact");
        return marshal(artifactdemuxsourceartifact.getClass(), artifactdemuxsourceartifact);
    }

    @PostMapping("/xml/artifactdetails")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.Details artifactdetails){
        logger.info("hit /marshal/com.genologics.ri.artifact.Details");
        return marshal(artifactdetails.getClass(), artifactdetails);
    }

    @PostMapping("/xml/artifactparentprocess")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.ParentProcess artifactparentprocess){
        logger.info("hit /marshal/com.genologics.ri.artifact.ParentProcess");
        return marshal(artifactparentprocess.getClass(), artifactparentprocess);
    }

    @PostMapping("/xml/artifactpoolstep")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.PoolStep artifactpoolstep){
        logger.info("hit /marshal/com.genologics.ri.artifact.PoolStep");
        return marshal(artifactpoolstep.getClass(), artifactpoolstep);
    }

    @PostMapping("/xml/artifactreagentlabel")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.ReagentLabel artifactreagentlabel){
        logger.info("hit /marshal/com.genologics.ri.artifact.ReagentLabel");
        return marshal(artifactreagentlabel.getClass(), artifactreagentlabel);
    }

    @PostMapping("/xml/artifactsample")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.Sample artifactsample){
        logger.info("hit /marshal/com.genologics.ri.artifact.Sample");
        return marshal(artifactsample.getClass(), artifactsample);
    }

    @PostMapping("/xml/artifactworkflowstage")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.WorkflowStage artifactworkflowstage){
        logger.info("hit /marshal/com.genologics.ri.artifact.WorkflowStage");
        return marshal(artifactworkflowstage.getClass(), artifactworkflowstage);
    }

    @PostMapping("/xml/artifactgroupartifactgroup")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifactgroup.Artifactgroup artifactgroupartifactgroup){
        logger.info("hit /marshal/com.genologics.ri.artifactgroup.Artifactgroup");
        return marshal(artifactgroupartifactgroup.getClass(), artifactgroupartifactgroup);
    }

    @PostMapping("/xml/artifactgroupartifactgrouplink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifactgroup.ArtifactgroupLink artifactgroupartifactgrouplink){
        logger.info("hit /marshal/com.genologics.ri.artifactgroup.ArtifactgroupLink");
        return marshal(artifactgroupartifactgrouplink.getClass(), artifactgroupartifactgrouplink);
    }

    @PostMapping("/xml/artifactgroupartifactgroups")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifactgroup.Artifactgroups artifactgroupartifactgroups){
        logger.info("hit /marshal/com.genologics.ri.artifactgroup.Artifactgroups");
        return marshal(artifactgroupartifactgroups.getClass(), artifactgroupartifactgroups);
    }

    @PostMapping("/xml/artifactgroupartifacts")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifactgroup.Artifacts artifactgroupartifacts){
        logger.info("hit /marshal/com.genologics.ri.artifactgroup.Artifacts");
        return marshal(artifactgroupartifacts.getClass(), artifactgroupartifacts);
    }

    @PostMapping("/xml/automationautomation")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.automation.Automation automationautomation){
        logger.info("hit /marshal/com.genologics.ri.automation.Automation");
        return marshal(automationautomation.getClass(), automationautomation);
    }

    @PostMapping("/xml/automationautomationprocesstypes")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.automation.Automation.ProcessTypes automationautomationprocesstypes){
        logger.info("hit /marshal/com.genologics.ri.automation.Automation.ProcessTypes");
        return marshal(automationautomationprocesstypes.getClass(), automationautomationprocesstypes);
    }

    @PostMapping("/xml/automationautomationlink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.automation.AutomationLink automationautomationlink){
        logger.info("hit /marshal/com.genologics.ri.automation.AutomationLink");
        return marshal(automationautomationlink.getClass(), automationautomationlink);
    }

    @PostMapping("/xml/automationautomations")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.automation.Automations automationautomations){
        logger.info("hit /marshal/com.genologics.ri.automation.Automations");
        return marshal(automationautomations.getClass(), automationautomations);
    }

    @PostMapping("/xml/automationprocesstype")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.automation.ProcessType automationprocesstype){
        logger.info("hit /marshal/com.genologics.ri.automation.ProcessType");
        return marshal(automationprocesstype.getClass(), automationprocesstype);
    }

    @PostMapping("/xml/configurationfield")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.configuration.Field configurationfield){
        logger.info("hit /marshal/com.genologics.ri.configuration.Field");
        return marshal(configurationfield.getClass(), configurationfield);
    }

    @PostMapping("/xml/configurationfieldlink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.configuration.FieldLink configurationfieldlink){
        logger.info("hit /marshal/com.genologics.ri.configuration.FieldLink");
        return marshal(configurationfieldlink.getClass(), configurationfieldlink);
    }

    @PostMapping("/xml/configurationtype")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.configuration.Type configurationtype){
        logger.info("hit /marshal/com.genologics.ri.configuration.Type");
        return marshal(configurationtype.getClass(), configurationtype);
    }

    @PostMapping("/xml/configurationtypedefinition")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.configuration.TypeDefinition configurationtypedefinition){
        logger.info("hit /marshal/com.genologics.ri.configuration.TypeDefinition");
        return marshal(configurationtypedefinition.getClass(), configurationtypedefinition);
    }

    @PostMapping("/xml/configurationudfconfiglink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.configuration.UdfconfigLink configurationudfconfiglink){
        logger.info("hit /marshal/com.genologics.ri.configuration.UdfconfigLink");
        return marshal(configurationudfconfiglink.getClass(), configurationudfconfiglink);
    }

    @PostMapping("/xml/configurationudfs")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.configuration.Udfs configurationudfs){
        logger.info("hit /marshal/com.genologics.ri.configuration.Udfs");
        return marshal(configurationudfs.getClass(), configurationudfs);
    }

    @PostMapping("/xml/configurationudtconfiglink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.configuration.UdtconfigLink configurationudtconfiglink){
        logger.info("hit /marshal/com.genologics.ri.configuration.UdtconfigLink");
        return marshal(configurationudtconfiglink.getClass(), configurationudtconfiglink);
    }

    @PostMapping("/xml/configurationudts")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.configuration.Udts configurationudts){
        logger.info("hit /marshal/com.genologics.ri.configuration.Udts");
        return marshal(configurationudts.getClass(), configurationudts);
    }

    @PostMapping("/xml/containercontainer")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.container.Container containercontainer){
        logger.info("hit /marshal/com.genologics.ri.container.Container");
        return marshal(containercontainer.getClass(), containercontainer);
    }

    @PostMapping("/xml/containercontainerlink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.container.ContainerLink containercontainerlink){
        logger.info("hit /marshal/com.genologics.ri.container.ContainerLink");
        return marshal(containercontainerlink.getClass(), containercontainerlink);
    }

    @PostMapping("/xml/containercontainertype")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.container.ContainerType containercontainertype){
        logger.info("hit /marshal/com.genologics.ri.container.ContainerType");
        return marshal(containercontainertype.getClass(), containercontainertype);
    }

    @PostMapping("/xml/containercontainers")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.container.Containers containercontainers){
        logger.info("hit /marshal/com.genologics.ri.container.Containers");
        return marshal(containercontainers.getClass(), containercontainers);
    }

    @PostMapping("/xml/containerdetails")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.container.Details containerdetails){
        logger.info("hit /marshal/com.genologics.ri.container.Details");
        return marshal(containerdetails.getClass(), containerdetails);
    }

    @PostMapping("/xml/containerplacement")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.container.Placement containerplacement){
        logger.info("hit /marshal/com.genologics.ri.container.Placement");
        return marshal(containerplacement.getClass(), containerplacement);
    }

    @PostMapping("/xml/containertypecalibrantwell")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.containertype.CalibrantWell containertypecalibrantwell){
        logger.info("hit /marshal/com.genologics.ri.containertype.CalibrantWell");
        return marshal(containertypecalibrantwell.getClass(), containertypecalibrantwell);
    }

    @PostMapping("/xml/containertypecontainertype")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.containertype.ContainerType containertypecontainertype){
        logger.info("hit /marshal/com.genologics.ri.containertype.ContainerType");
        return marshal(containertypecontainertype.getClass(), containertypecontainertype);
    }

    @PostMapping("/xml/containertypecontainertypelink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.containertype.ContainerTypeLink containertypecontainertypelink){
        logger.info("hit /marshal/com.genologics.ri.containertype.ContainerTypeLink");
        return marshal(containertypecontainertypelink.getClass(), containertypecontainertypelink);
    }

    @PostMapping("/xml/containertypecontainertypes")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.containertype.ContainerTypes containertypecontainertypes){
        logger.info("hit /marshal/com.genologics.ri.containertype.ContainerTypes");
        return marshal(containertypecontainertypes.getClass(), containertypecontainertypes);
    }

    @PostMapping("/xml/containertypedimension")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.containertype.Dimension containertypedimension){
        logger.info("hit /marshal/com.genologics.ri.containertype.Dimension");
        return marshal(containertypedimension.getClass(), containertypedimension);
    }

    @PostMapping("/xml/controltypecontroltype")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.controltype.ControlType controltypecontroltype){
        logger.info("hit /marshal/com.genologics.ri.controltype.ControlType");
        return marshal(controltypecontroltype.getClass(), controltypecontroltype);
    }

    @PostMapping("/xml/controltypecontroltypelink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.controltype.ControlTypeLink controltypecontroltypelink){
        logger.info("hit /marshal/com.genologics.ri.controltype.ControlTypeLink");
        return marshal(controltypecontroltypelink.getClass(), controltypecontroltypelink);
    }

    @PostMapping("/xml/controltypecontroltypes")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.controltype.ControlTypes controltypecontroltypes){
        logger.info("hit /marshal/com.genologics.ri.controltype.ControlTypes");
        return marshal(controltypecontroltypes.getClass(), controltypecontroltypes);
    }

    @PostMapping("/xml/exceptionexception")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.exception.Exception exceptionexception){
        logger.info("hit /marshal/com.genologics.ri.exception.Exception");
        return marshal(exceptionexception.getClass(), exceptionexception);
    }

    @PostMapping("/xml/filedetails")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.file.Details filedetails){
        logger.info("hit /marshal/com.genologics.ri.file.Details");
        return marshal(filedetails.getClass(), filedetails);
    }

    @PostMapping("/xml/filefile")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.file.File filefile){
        logger.info("hit /marshal/com.genologics.ri.file.File");
        return marshal(filefile.getClass(), filefile);
    }

    @PostMapping("/xml/filefilelink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.file.FileLink filefilelink){
        logger.info("hit /marshal/com.genologics.ri.file.FileLink");
        return marshal(filefilelink.getClass(), filefilelink);
    }

    @PostMapping("/xml/filefiles")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.file.Files filefiles){
        logger.info("hit /marshal/com.genologics.ri.file.Files");
        return marshal(filefiles.getClass(), filefiles);
    }

    @PostMapping("/xml/instrumentinstrument")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.instrument.Instrument instrumentinstrument){
        logger.info("hit /marshal/com.genologics.ri.instrument.Instrument");
        return marshal(instrumentinstrument.getClass(), instrumentinstrument);
    }

    @PostMapping("/xml/instrumentinstrumentlink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.instrument.InstrumentLink instrumentinstrumentlink){
        logger.info("hit /marshal/com.genologics.ri.instrument.InstrumentLink");
        return marshal(instrumentinstrumentlink.getClass(), instrumentinstrumentlink);
    }

    @PostMapping("/xml/instrumentinstruments")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.instrument.Instruments instrumentinstruments){
        logger.info("hit /marshal/com.genologics.ri.instrument.Instruments");
        return marshal(instrumentinstruments.getClass(), instrumentinstruments);
    }

    @PostMapping("/xml/instrumenttypeinstrumenttype")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.instrumenttype.InstrumentType instrumenttypeinstrumenttype){
        logger.info("hit /marshal/com.genologics.ri.instrumenttype.InstrumentType");
        return marshal(instrumenttypeinstrumenttype.getClass(), instrumenttypeinstrumenttype);
    }

    @PostMapping("/xml/instrumenttypeinstrumenttypeprocesstypes")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.instrumenttype.InstrumentType.ProcessTypes instrumenttypeinstrumenttypeprocesstypes){
        logger.info("hit /marshal/com.genologics.ri.instrumenttype.InstrumentType.ProcessTypes");
        return marshal(instrumenttypeinstrumenttypeprocesstypes.getClass(), instrumenttypeinstrumenttypeprocesstypes);
    }

    @PostMapping("/xml/instrumenttypeinstrumenttypelink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.instrumenttype.InstrumentTypeLink instrumenttypeinstrumenttypelink){
        logger.info("hit /marshal/com.genologics.ri.instrumenttype.InstrumentTypeLink");
        return marshal(instrumenttypeinstrumenttypelink.getClass(), instrumenttypeinstrumenttypelink);
    }

    @PostMapping("/xml/instrumenttypeinstrumenttypeprocesstype")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.instrumenttype.InstrumentTypeProcessType instrumenttypeinstrumenttypeprocesstype){
        logger.info("hit /marshal/com.genologics.ri.instrumenttype.InstrumentTypeProcessType");
        return marshal(instrumenttypeinstrumenttypeprocesstype.getClass(), instrumenttypeinstrumenttypeprocesstype);
    }

    @PostMapping("/xml/instrumenttypeinstrumenttypes")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.instrumenttype.InstrumentTypes instrumenttypeinstrumenttypes){
        logger.info("hit /marshal/com.genologics.ri.instrumenttype.InstrumentTypes");
        return marshal(instrumenttypeinstrumenttypes.getClass(), instrumenttypeinstrumenttypes);
    }

    @PostMapping("/xml/lablab")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.lab.Lab lablab){
        logger.info("hit /marshal/com.genologics.ri.lab.Lab");
        return marshal(lablab.getClass(), lablab);
    }

    @PostMapping("/xml/lablablink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.lab.LabLink lablablink){
        logger.info("hit /marshal/com.genologics.ri.lab.LabLink");
        return marshal(lablablink.getClass(), lablablink);
    }

    @PostMapping("/xml/lablabs")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.lab.Labs lablabs){
        logger.info("hit /marshal/com.genologics.ri.lab.Labs");
        return marshal(lablabs.getClass(), lablabs);
    }

    @PostMapping("/xml/permissionpermission")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.permission.Permission permissionpermission){
        logger.info("hit /marshal/com.genologics.ri.permission.Permission");
        return marshal(permissionpermission.getClass(), permissionpermission);
    }

    @PostMapping("/xml/permissionpermissionlink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.permission.PermissionLink permissionpermissionlink){
        logger.info("hit /marshal/com.genologics.ri.permission.PermissionLink");
        return marshal(permissionpermissionlink.getClass(), permissionpermissionlink);
    }

    @PostMapping("/xml/permissionpermissions")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.permission.Permissions permissionpermissions){
        logger.info("hit /marshal/com.genologics.ri.permission.Permissions");
        return marshal(permissionpermissions.getClass(), permissionpermissions);
    }

    @PostMapping("/xml/processartifact")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.process.Artifact processartifact){
        logger.info("hit /marshal/com.genologics.ri.process.Artifact");
        return marshal(processartifact.getClass(), processartifact);
    }

    @PostMapping("/xml/processinputoutputmap")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.process.InputOutputMap processinputoutputmap){
        logger.info("hit /marshal/com.genologics.ri.process.InputOutputMap");
        return marshal(processinputoutputmap.getClass(), processinputoutputmap);
    }

    @PostMapping("/xml/processinstrument")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.process.Instrument processinstrument){
        logger.info("hit /marshal/com.genologics.ri.process.Instrument");
        return marshal(processinstrument.getClass(), processinstrument);
    }

    @PostMapping("/xml/processparameter")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.process.Parameter processparameter){
        logger.info("hit /marshal/com.genologics.ri.process.Parameter");
        return marshal(processparameter.getClass(), processparameter);
    }

    @PostMapping("/xml/processparentprocess")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.process.ParentProcess processparentprocess){
        logger.info("hit /marshal/com.genologics.ri.process.ParentProcess");
        return marshal(processparentprocess.getClass(), processparentprocess);
    }

    @PostMapping("/xml/processprocess")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.process.Process processprocess){
        logger.info("hit /marshal/com.genologics.ri.process.Process");
        return marshal(processprocess.getClass(), processprocess);
    }

    @PostMapping("/xml/processprocesslink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.process.ProcessLink processprocesslink){
        logger.info("hit /marshal/com.genologics.ri.process.ProcessLink");
        return marshal(processprocesslink.getClass(), processprocesslink);
    }

    @PostMapping("/xml/processprocesstype")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.process.ProcessType processprocesstype){
        logger.info("hit /marshal/com.genologics.ri.process.ProcessType");
        return marshal(processprocesstype.getClass(), processprocesstype);
    }

    @PostMapping("/xml/processprocesses")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.process.Processes processprocesses){
        logger.info("hit /marshal/com.genologics.ri.process.Processes");
        return marshal(processprocesses.getClass(), processprocesses);
    }

    @PostMapping("/xml/processtechnician")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.process.Technician processtechnician){
        logger.info("hit /marshal/com.genologics.ri.process.Technician");
        return marshal(processtechnician.getClass(), processtechnician);
    }

    @PostMapping("/xml/processexecutioninput")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processexecution.Input processexecutioninput){
        logger.info("hit /marshal/com.genologics.ri.processexecution.Input");
        return marshal(processexecutioninput.getClass(), processexecutioninput);
    }

    @PostMapping("/xml/processexecutioninputoutputmap")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processexecution.InputOutputMap processexecutioninputoutputmap){
        logger.info("hit /marshal/com.genologics.ri.processexecution.InputOutputMap");
        return marshal(processexecutioninputoutputmap.getClass(), processexecutioninputoutputmap);
    }

    @PostMapping("/xml/processexecutioninstrument")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processexecution.Instrument processexecutioninstrument){
        logger.info("hit /marshal/com.genologics.ri.processexecution.Instrument");
        return marshal(processexecutioninstrument.getClass(), processexecutioninstrument);
    }

    @PostMapping("/xml/processexecutionoutput")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processexecution.Output processexecutionoutput){
        logger.info("hit /marshal/com.genologics.ri.processexecution.Output");
        return marshal(processexecutionoutput.getClass(), processexecutionoutput);
    }

    @PostMapping("/xml/processexecutionparameter")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processexecution.Parameter processexecutionparameter){
        logger.info("hit /marshal/com.genologics.ri.processexecution.Parameter");
        return marshal(processexecutionparameter.getClass(), processexecutionparameter);
    }

    @PostMapping("/xml/processexecutionprocess")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processexecution.Process processexecutionprocess){
        logger.info("hit /marshal/com.genologics.ri.processexecution.Process");
        return marshal(processexecutionprocess.getClass(), processexecutionprocess);
    }

    @PostMapping("/xml/processexecutiontechnician")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processexecution.Technician processexecutiontechnician){
        logger.info("hit /marshal/com.genologics.ri.processexecution.Technician");
        return marshal(processexecutiontechnician.getClass(), processexecutiontechnician);
    }

    @PostMapping("/xml/processtemplateinstrument")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtemplate.Instrument processtemplateinstrument){
        logger.info("hit /marshal/com.genologics.ri.processtemplate.Instrument");
        return marshal(processtemplateinstrument.getClass(), processtemplateinstrument);
    }

    @PostMapping("/xml/processtemplateparameter")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtemplate.Parameter processtemplateparameter){
        logger.info("hit /marshal/com.genologics.ri.processtemplate.Parameter");
        return marshal(processtemplateparameter.getClass(), processtemplateparameter);
    }

    @PostMapping("/xml/processtemplateprocesstemplate")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtemplate.ProcessTemplate processtemplateprocesstemplate){
        logger.info("hit /marshal/com.genologics.ri.processtemplate.ProcessTemplate");
        return marshal(processtemplateprocesstemplate.getClass(), processtemplateprocesstemplate);
    }

    @PostMapping("/xml/processtemplateprocesstemplatelink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtemplate.ProcessTemplateLink processtemplateprocesstemplatelink){
        logger.info("hit /marshal/com.genologics.ri.processtemplate.ProcessTemplateLink");
        return marshal(processtemplateprocesstemplatelink.getClass(), processtemplateprocesstemplatelink);
    }

    @PostMapping("/xml/processtemplateprocesstemplates")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtemplate.ProcessTemplates processtemplateprocesstemplates){
        logger.info("hit /marshal/com.genologics.ri.processtemplate.ProcessTemplates");
        return marshal(processtemplateprocesstemplates.getClass(), processtemplateprocesstemplates);
    }

    @PostMapping("/xml/processtemplateprocesstype")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtemplate.ProcessType processtemplateprocesstype){
        logger.info("hit /marshal/com.genologics.ri.processtemplate.ProcessType");
        return marshal(processtemplateprocesstype.getClass(), processtemplateprocesstype);
    }

    @PostMapping("/xml/processtemplatetechnician")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtemplate.Technician processtemplatetechnician){
        logger.info("hit /marshal/com.genologics.ri.processtemplate.Technician");
        return marshal(processtemplatetechnician.getClass(), processtemplatetechnician);
    }

    @PostMapping("/xml/processtypecontainertypelink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.ContainerTypeLink processtypecontainertypelink){
        logger.info("hit /marshal/com.genologics.ri.processtype.ContainerTypeLink");
        return marshal(processtypecontainertypelink.getClass(), processtypecontainertypelink);
    }

    @PostMapping("/xml/processtypecontroltypelink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.ControlTypeLink processtypecontroltypelink){
        logger.info("hit /marshal/com.genologics.ri.processtype.ControlTypeLink");
        return marshal(processtypecontroltypelink.getClass(), processtypecontroltypelink);
    }

    @PostMapping("/xml/processtypeepptrigger")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.EppTrigger processtypeepptrigger){
        logger.info("hit /marshal/com.genologics.ri.processtype.EppTrigger");
        return marshal(processtypeepptrigger.getClass(), processtypeepptrigger);
    }

    @PostMapping("/xml/processtypefield")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.Field processtypefield){
        logger.info("hit /marshal/com.genologics.ri.processtype.Field");
        return marshal(processtypefield.getClass(), processtypefield);
    }

    @PostMapping("/xml/processtypefile")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.File processtypefile){
        logger.info("hit /marshal/com.genologics.ri.processtype.File");
        return marshal(processtypefile.getClass(), processtypefile);
    }

    @PostMapping("/xml/processtypeicebucketfield")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.Icebucketfield processtypeicebucketfield){
        logger.info("hit /marshal/com.genologics.ri.processtype.Icebucketfield");
        return marshal(processtypeicebucketfield.getClass(), processtypeicebucketfield);
    }

    @PostMapping("/xml/processtypeparameter")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.Parameter processtypeparameter){
        logger.info("hit /marshal/com.genologics.ri.processtype.Parameter");
        return marshal(processtypeparameter.getClass(), processtypeparameter);
    }

    @PostMapping("/xml/processtypeprocessinput")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.ProcessInput processtypeprocessinput){
        logger.info("hit /marshal/com.genologics.ri.processtype.ProcessInput");
        return marshal(processtypeprocessinput.getClass(), processtypeprocessinput);
    }

    @PostMapping("/xml/processtypeprocessoutput")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.ProcessOutput processtypeprocessoutput){
        logger.info("hit /marshal/com.genologics.ri.processtype.ProcessOutput");
        return marshal(processtypeprocessoutput.getClass(), processtypeprocessoutput);
    }

    @PostMapping("/xml/processtypeprocesstype")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.ProcessType processtypeprocesstype){
        logger.info("hit /marshal/com.genologics.ri.processtype.ProcessType");
        return marshal(processtypeprocesstype.getClass(), processtypeprocesstype);
    }

    @PostMapping("/xml/processtypeprocesstypeepptriggers")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.ProcessType.EppTriggers processtypeprocesstypeepptriggers){
        logger.info("hit /marshal/com.genologics.ri.processtype.ProcessType.EppTriggers");
        return marshal(processtypeprocesstypeepptriggers.getClass(), processtypeprocesstypeepptriggers);
    }

    @PostMapping("/xml/processtypeprocesstypeicebucketfields")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.ProcessType.IceBucketFields processtypeprocesstypeicebucketfields){
        logger.info("hit /marshal/com.genologics.ri.processtype.ProcessType.IceBucketFields");
        return marshal(processtypeprocesstypeicebucketfields.getClass(), processtypeprocesstypeicebucketfields);
    }

    @PostMapping("/xml/processtypeprocesstypepermittedcontainers")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.ProcessType.PermittedContainers processtypeprocesstypepermittedcontainers){
        logger.info("hit /marshal/com.genologics.ri.processtype.ProcessType.PermittedContainers");
        return marshal(processtypeprocesstypepermittedcontainers.getClass(), processtypeprocesstypepermittedcontainers);
    }

    @PostMapping("/xml/processtypeprocesstypepermittedcontroltypes")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.ProcessType.PermittedControlTypes processtypeprocesstypepermittedcontroltypes){
        logger.info("hit /marshal/com.genologics.ri.processtype.ProcessType.PermittedControlTypes");
        return marshal(processtypeprocesstypepermittedcontroltypes.getClass(), processtypeprocesstypepermittedcontroltypes);
    }

    @PostMapping("/xml/processtypeprocesstypepermittedinstrumenttypes")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.ProcessType.PermittedInstrumentTypes processtypeprocesstypepermittedinstrumenttypes){
        logger.info("hit /marshal/com.genologics.ri.processtype.ProcessType.PermittedInstrumentTypes");
        return marshal(processtypeprocesstypepermittedinstrumenttypes.getClass(), processtypeprocesstypepermittedinstrumenttypes);
    }

    @PostMapping("/xml/processtypeprocesstypepermittedreagentcategories")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.ProcessType.PermittedReagentCategories processtypeprocesstypepermittedreagentcategories){
        logger.info("hit /marshal/com.genologics.ri.processtype.ProcessType.PermittedReagentCategories");
        return marshal(processtypeprocesstypepermittedreagentcategories.getClass(), processtypeprocesstypepermittedreagentcategories);
    }

    @PostMapping("/xml/processtypeprocesstypequeuefields")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.ProcessType.QueueFields processtypeprocesstypequeuefields){
        logger.info("hit /marshal/com.genologics.ri.processtype.ProcessType.QueueFields");
        return marshal(processtypeprocesstypequeuefields.getClass(), processtypeprocesstypequeuefields);
    }

    @PostMapping("/xml/processtypeprocesstyperequiredreagentkits")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.ProcessType.RequiredReagentKits processtypeprocesstyperequiredreagentkits){
        logger.info("hit /marshal/com.genologics.ri.processtype.ProcessType.RequiredReagentKits");
        return marshal(processtypeprocesstyperequiredreagentkits.getClass(), processtypeprocesstyperequiredreagentkits);
    }

    @PostMapping("/xml/processtypeprocesstypesamplefields")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.ProcessType.SampleFields processtypeprocesstypesamplefields){
        logger.info("hit /marshal/com.genologics.ri.processtype.ProcessType.SampleFields");
        return marshal(processtypeprocesstypesamplefields.getClass(), processtypeprocesstypesamplefields);
    }

    @PostMapping("/xml/processtypeprocesstypestepfields")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.ProcessType.StepFields processtypeprocesstypestepfields){
        logger.info("hit /marshal/com.genologics.ri.processtype.ProcessType.StepFields");
        return marshal(processtypeprocesstypestepfields.getClass(), processtypeprocesstypestepfields);
    }

    @PostMapping("/xml/processtypeprocesstypestepproperties")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.ProcessType.StepProperties processtypeprocesstypestepproperties){
        logger.info("hit /marshal/com.genologics.ri.processtype.ProcessType.StepProperties");
        return marshal(processtypeprocesstypestepproperties.getClass(), processtypeprocesstypestepproperties);
    }

    @PostMapping("/xml/processtypeprocesstypeattribute")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.ProcessTypeAttribute processtypeprocesstypeattribute){
        logger.info("hit /marshal/com.genologics.ri.processtype.ProcessTypeAttribute");
        return marshal(processtypeprocesstypeattribute.getClass(), processtypeprocesstypeattribute);
    }

    @PostMapping("/xml/processtypeprocesstypelink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.ProcessTypeLink processtypeprocesstypelink){
        logger.info("hit /marshal/com.genologics.ri.processtype.ProcessTypeLink");
        return marshal(processtypeprocesstypelink.getClass(), processtypeprocesstypelink);
    }

    @PostMapping("/xml/processtypeprocesstypes")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.ProcessTypes processtypeprocesstypes){
        logger.info("hit /marshal/com.genologics.ri.processtype.ProcessTypes");
        return marshal(processtypeprocesstypes.getClass(), processtypeprocesstypes);
    }

    @PostMapping("/xml/processtypequeuefield")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.Queuefield processtypequeuefield){
        logger.info("hit /marshal/com.genologics.ri.processtype.Queuefield");
        return marshal(processtypequeuefield.getClass(), processtypequeuefield);
    }

    @PostMapping("/xml/processtypereagentkitlink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.ReagentKitLink processtypereagentkitlink){
        logger.info("hit /marshal/com.genologics.ri.processtype.ReagentKitLink");
        return marshal(processtypereagentkitlink.getClass(), processtypereagentkitlink);
    }

    @PostMapping("/xml/processtypestepproperty")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.StepProperty processtypestepproperty){
        logger.info("hit /marshal/com.genologics.ri.processtype.StepProperty");
        return marshal(processtypestepproperty.getClass(), processtypestepproperty);
    }

    @PostMapping("/xml/processtypestepsetup")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.StepSetup processtypestepsetup){
        logger.info("hit /marshal/com.genologics.ri.processtype.StepSetup");
        return marshal(processtypestepsetup.getClass(), processtypestepsetup);
    }

    @PostMapping("/xml/processtypestepsetupfiles")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.StepSetup.Files processtypestepsetupfiles){
        logger.info("hit /marshal/com.genologics.ri.processtype.StepSetup.Files");
        return marshal(processtypestepsetupfiles.getClass(), processtypestepsetupfiles);
    }

    @PostMapping("/xml/processtypetypedefinition")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.TypeDefinition processtypetypedefinition){
        logger.info("hit /marshal/com.genologics.ri.processtype.TypeDefinition");
        return marshal(processtypetypedefinition.getClass(), processtypetypedefinition);
    }

    @PostMapping("/xml/projectproject")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.project.Project projectproject){
        logger.info("hit /marshal/com.genologics.ri.project.Project");
        return marshal(projectproject.getClass(), projectproject);
    }

    @PostMapping("/xml/projectprojectlink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.project.ProjectLink projectprojectlink){
        logger.info("hit /marshal/com.genologics.ri.project.ProjectLink");
        return marshal(projectprojectlink.getClass(), projectprojectlink);
    }

    @PostMapping("/xml/projectprojects")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.project.Projects projectprojects){
        logger.info("hit /marshal/com.genologics.ri.project.Projects");
        return marshal(projectprojects.getClass(), projectprojects);
    }

    @PostMapping("/xml/projectresearcher")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.project.Researcher projectresearcher){
        logger.info("hit /marshal/com.genologics.ri.project.Researcher");
        return marshal(projectresearcher.getClass(), projectresearcher);
    }

    @PostMapping("/xml/propertyproperties")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.property.Properties propertyproperties){
        logger.info("hit /marshal/com.genologics.ri.property.Properties");
        return marshal(propertyproperties.getClass(), propertyproperties);
    }

    @PostMapping("/xml/propertypropertylink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.property.PropertyLink propertypropertylink){
        logger.info("hit /marshal/com.genologics.ri.property.PropertyLink");
        return marshal(propertypropertylink.getClass(), propertypropertylink);
    }

    @PostMapping("/xml/protocolconfigurationprotocol")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.protocolconfiguration.Protocol protocolconfigurationprotocol){
        logger.info("hit /marshal/com.genologics.ri.protocolconfiguration.Protocol");
        return marshal(protocolconfigurationprotocol.getClass(), protocolconfigurationprotocol);
    }

    @PostMapping("/xml/protocolconfigurationprotocolprotocolproperties")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.protocolconfiguration.Protocol.ProtocolProperties protocolconfigurationprotocolprotocolproperties){
        logger.info("hit /marshal/com.genologics.ri.protocolconfiguration.Protocol.ProtocolProperties");
        return marshal(protocolconfigurationprotocolprotocolproperties.getClass(), protocolconfigurationprotocolprotocolproperties);
    }

    @PostMapping("/xml/protocolconfigurationprotocolsteps")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.protocolconfiguration.Protocol.Steps protocolconfigurationprotocolsteps){
        logger.info("hit /marshal/com.genologics.ri.protocolconfiguration.Protocol.Steps");
        return marshal(protocolconfigurationprotocolsteps.getClass(), protocolconfigurationprotocolsteps);
    }

    @PostMapping("/xml/protocolconfigurationprotocollink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.protocolconfiguration.ProtocolLink protocolconfigurationprotocollink){
        logger.info("hit /marshal/com.genologics.ri.protocolconfiguration.ProtocolLink");
        return marshal(protocolconfigurationprotocollink.getClass(), protocolconfigurationprotocollink);
    }

    @PostMapping("/xml/protocolconfigurationprotocolproperty")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.protocolconfiguration.ProtocolProperty protocolconfigurationprotocolproperty){
        logger.info("hit /marshal/com.genologics.ri.protocolconfiguration.ProtocolProperty");
        return marshal(protocolconfigurationprotocolproperty.getClass(), protocolconfigurationprotocolproperty);
    }

    @PostMapping("/xml/protocolconfigurationprotocols")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.protocolconfiguration.Protocols protocolconfigurationprotocols){
        logger.info("hit /marshal/com.genologics.ri.protocolconfiguration.Protocols");
        return marshal(protocolconfigurationprotocols.getClass(), protocolconfigurationprotocols);
    }

    @PostMapping("/xml/queueartifactlink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.queue.ArtifactLink queueartifactlink){
        logger.info("hit /marshal/com.genologics.ri.queue.ArtifactLink");
        return marshal(queueartifactlink.getClass(), queueartifactlink);
    }

    @PostMapping("/xml/queuequeue")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.queue.Queue queuequeue){
        logger.info("hit /marshal/com.genologics.ri.queue.Queue");
        return marshal(queuequeue.getClass(), queuequeue);
    }

    @PostMapping("/xml/queuequeueartifacts")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.queue.Queue.Artifacts queuequeueartifacts){
        logger.info("hit /marshal/com.genologics.ri.queue.Queue.Artifacts");
        return marshal(queuequeueartifacts.getClass(), queuequeueartifacts);
    }

    @PostMapping("/xml/reagentkitreagentkit")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.reagentkit.ReagentKit reagentkitreagentkit){
        logger.info("hit /marshal/com.genologics.ri.reagentkit.ReagentKit");
        return marshal(reagentkitreagentkit.getClass(), reagentkitreagentkit);
    }

    @PostMapping("/xml/reagentkitreagentkitlink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.reagentkit.ReagentKitLink reagentkitreagentkitlink){
        logger.info("hit /marshal/com.genologics.ri.reagentkit.ReagentKitLink");
        return marshal(reagentkitreagentkitlink.getClass(), reagentkitreagentkitlink);
    }

    @PostMapping("/xml/reagentkitreagentkits")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.reagentkit.ReagentKits reagentkitreagentkits){
        logger.info("hit /marshal/com.genologics.ri.reagentkit.ReagentKits");
        return marshal(reagentkitreagentkits.getClass(), reagentkitreagentkits);
    }

    @PostMapping("/xml/reagentlotreagentkitlink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.reagentlot.ReagentKitLink reagentlotreagentkitlink){
        logger.info("hit /marshal/com.genologics.ri.reagentlot.ReagentKitLink");
        return marshal(reagentlotreagentkitlink.getClass(), reagentlotreagentkitlink);
    }

    @PostMapping("/xml/reagentlotreagentlot")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.reagentlot.ReagentLot reagentlotreagentlot){
        logger.info("hit /marshal/com.genologics.ri.reagentlot.ReagentLot");
        return marshal(reagentlotreagentlot.getClass(), reagentlotreagentlot);
    }

    @PostMapping("/xml/reagentlotreagentlotlink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.reagentlot.ReagentLotLink reagentlotreagentlotlink){
        logger.info("hit /marshal/com.genologics.ri.reagentlot.ReagentLotLink");
        return marshal(reagentlotreagentlotlink.getClass(), reagentlotreagentlotlink);
    }

    @PostMapping("/xml/reagentlotreagentlots")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.reagentlot.ReagentLots reagentlotreagentlots){
        logger.info("hit /marshal/com.genologics.ri.reagentlot.ReagentLots");
        return marshal(reagentlotreagentlots.getClass(), reagentlotreagentlots);
    }

    @PostMapping("/xml/reagentlotresearcher")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.reagentlot.Researcher reagentlotresearcher){
        logger.info("hit /marshal/com.genologics.ri.reagentlot.Researcher");
        return marshal(reagentlotresearcher.getClass(), reagentlotresearcher);
    }

    @PostMapping("/xml/reagenttypeattribute")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.reagenttype.Attribute reagenttypeattribute){
        logger.info("hit /marshal/com.genologics.ri.reagenttype.Attribute");
        return marshal(reagenttypeattribute.getClass(), reagenttypeattribute);
    }

    @PostMapping("/xml/reagenttypereagenttype")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.reagenttype.ReagentType reagenttypereagenttype){
        logger.info("hit /marshal/com.genologics.ri.reagenttype.ReagentType");
        return marshal(reagenttypereagenttype.getClass(), reagenttypereagenttype);
    }

    @PostMapping("/xml/reagenttypereagenttypelink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.reagenttype.ReagentTypeLink reagenttypereagenttypelink){
        logger.info("hit /marshal/com.genologics.ri.reagenttype.ReagentTypeLink");
        return marshal(reagenttypereagenttypelink.getClass(), reagenttypereagenttypelink);
    }

    @PostMapping("/xml/reagenttypereagenttypes")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.reagenttype.ReagentTypes reagenttypereagenttypes){
        logger.info("hit /marshal/com.genologics.ri.reagenttype.ReagentTypes");
        return marshal(reagenttypereagenttypes.getClass(), reagenttypereagenttypes);
    }

    @PostMapping("/xml/reagenttypespecialtype")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.reagenttype.SpecialType reagenttypespecialtype){
        logger.info("hit /marshal/com.genologics.ri.reagenttype.SpecialType");
        return marshal(reagenttypespecialtype.getClass(), reagenttypespecialtype);
    }

    @PostMapping("/xml/researchercredentials")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.researcher.Credentials researchercredentials){
        logger.info("hit /marshal/com.genologics.ri.researcher.Credentials");
        return marshal(researchercredentials.getClass(), researchercredentials);
    }

    @PostMapping("/xml/researcherlab")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.researcher.Lab researcherlab){
        logger.info("hit /marshal/com.genologics.ri.researcher.Lab");
        return marshal(researcherlab.getClass(), researcherlab);
    }

    @PostMapping("/xml/researcherresearcher")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.researcher.Researcher researcherresearcher){
        logger.info("hit /marshal/com.genologics.ri.researcher.Researcher");
        return marshal(researcherresearcher.getClass(), researcherresearcher);
    }

    @PostMapping("/xml/researcherresearcherlink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.researcher.ResearcherLink researcherresearcherlink){
        logger.info("hit /marshal/com.genologics.ri.researcher.ResearcherLink");
        return marshal(researcherresearcherlink.getClass(), researcherresearcherlink);
    }

    @PostMapping("/xml/researcherresearchers")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.researcher.Researchers researcherresearchers){
        logger.info("hit /marshal/com.genologics.ri.researcher.Researchers");
        return marshal(researcherresearchers.getClass(), researcherresearchers);
    }

    @PostMapping("/xml/researcherrole")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.researcher.Role researcherrole){
        logger.info("hit /marshal/com.genologics.ri.researcher.Role");
        return marshal(researcherrole.getClass(), researcherrole);
    }

    @PostMapping("/xml/rolepermissionlink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.role.PermissionLink rolepermissionlink){
        logger.info("hit /marshal/com.genologics.ri.role.PermissionLink");
        return marshal(rolepermissionlink.getClass(), rolepermissionlink);
    }

    @PostMapping("/xml/roleresearcherlink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.role.ResearcherLink roleresearcherlink){
        logger.info("hit /marshal/com.genologics.ri.role.ResearcherLink");
        return marshal(roleresearcherlink.getClass(), roleresearcherlink);
    }

    @PostMapping("/xml/rolerole")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.role.Role rolerole){
        logger.info("hit /marshal/com.genologics.ri.role.Role");
        return marshal(rolerole.getClass(), rolerole);
    }

    @PostMapping("/xml/rolerolepermissions")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.role.Role.Permissions rolerolepermissions){
        logger.info("hit /marshal/com.genologics.ri.role.Role.Permissions");
        return marshal(rolerolepermissions.getClass(), rolerolepermissions);
    }

    @PostMapping("/xml/roleroleresearchers")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.role.Role.Researchers roleroleresearchers){
        logger.info("hit /marshal/com.genologics.ri.role.Role.Researchers");
        return marshal(roleroleresearchers.getClass(), roleroleresearchers);
    }

    @PostMapping("/xml/rolerolelink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.role.RoleLink rolerolelink){
        logger.info("hit /marshal/com.genologics.ri.role.RoleLink");
        return marshal(rolerolelink.getClass(), rolerolelink);
    }

    @PostMapping("/xml/roleroles")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.role.Roles roleroles){
        logger.info("hit /marshal/com.genologics.ri.role.Roles");
        return marshal(roleroles.getClass(), roleroles);
    }

    @PostMapping("/xml/routingartifact")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.routing.Artifact routingartifact){
        logger.info("hit /marshal/com.genologics.ri.routing.Artifact");
        return marshal(routingartifact.getClass(), routingartifact);
    }

    @PostMapping("/xml/routingextartifactassignments")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.routing.ExtArtifactAssignments routingextartifactassignments){
        logger.info("hit /marshal/com.genologics.ri.routing.ExtArtifactAssignments");
        return marshal(routingextartifactassignments.getClass(), routingextartifactassignments);
    }

    @PostMapping("/xml/routingrouting")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.routing.Routing routingrouting){
        logger.info("hit /marshal/com.genologics.ri.routing.Routing");
        return marshal(routingrouting.getClass(), routingrouting);
    }

    @PostMapping("/xml/sampleartifact")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.sample.Artifact sampleartifact){
        logger.info("hit /marshal/com.genologics.ri.sample.Artifact");
        return marshal(sampleartifact.getClass(), sampleartifact);
    }

    @PostMapping("/xml/samplebiosource")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.sample.Biosource samplebiosource){
        logger.info("hit /marshal/com.genologics.ri.sample.Biosource");
        return marshal(samplebiosource.getClass(), samplebiosource);
    }

    @PostMapping("/xml/samplecontainertype")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.sample.ContainerType samplecontainertype){
        logger.info("hit /marshal/com.genologics.ri.sample.ContainerType");
        return marshal(samplecontainertype.getClass(), samplecontainertype);
    }

    @PostMapping("/xml/samplecontroltype")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.sample.ControlType samplecontroltype){
        logger.info("hit /marshal/com.genologics.ri.sample.ControlType");
        return marshal(samplecontroltype.getClass(), samplecontroltype);
    }

    @PostMapping("/xml/sampledetails")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.sample.Details sampledetails){
        logger.info("hit /marshal/com.genologics.ri.sample.Details");
        return marshal(sampledetails.getClass(), sampledetails);
    }

    @PostMapping("/xml/sampleproject")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.sample.Project sampleproject){
        logger.info("hit /marshal/com.genologics.ri.sample.Project");
        return marshal(sampleproject.getClass(), sampleproject);
    }

    @PostMapping("/xml/samplesample")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.sample.Sample samplesample){
        logger.info("hit /marshal/com.genologics.ri.sample.Sample");
        return marshal(samplesample.getClass(), samplesample);
    }

    @PostMapping("/xml/samplesamplelink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.sample.SampleLink samplesamplelink){
        logger.info("hit /marshal/com.genologics.ri.sample.SampleLink");
        return marshal(samplesamplelink.getClass(), samplesamplelink);
    }

    @PostMapping("/xml/samplesamplebase")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.sample.Samplebase samplesamplebase){
        logger.info("hit /marshal/com.genologics.ri.sample.Samplebase");
        return marshal(samplesamplebase.getClass(), samplesamplebase);
    }

    @PostMapping("/xml/samplesamplecreation")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.sample.Samplecreation samplesamplecreation){
        logger.info("hit /marshal/com.genologics.ri.sample.Samplecreation");
        return marshal(samplesamplecreation.getClass(), samplesamplecreation);
    }

    @PostMapping("/xml/samplesamples")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.sample.Samples samplesamples){
        logger.info("hit /marshal/com.genologics.ri.sample.Samples");
        return marshal(samplesamples.getClass(), samplesamples);
    }

    @PostMapping("/xml/samplesubmitter")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.sample.Submitter samplesubmitter){
        logger.info("hit /marshal/com.genologics.ri.sample.Submitter");
        return marshal(samplesubmitter.getClass(), samplesubmitter);
    }

    @PostMapping("/xml/stageprotocol")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stage.Protocol stageprotocol){
        logger.info("hit /marshal/com.genologics.ri.stage.Protocol");
        return marshal(stageprotocol.getClass(), stageprotocol);
    }

    @PostMapping("/xml/stagestage")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stage.Stage stagestage){
        logger.info("hit /marshal/com.genologics.ri.stage.Stage");
        return marshal(stagestage.getClass(), stagestage);
    }

    @PostMapping("/xml/stagestep")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stage.Step stagestep){
        logger.info("hit /marshal/com.genologics.ri.stage.Step");
        return marshal(stagestep.getClass(), stagestep);
    }

    @PostMapping("/xml/stageworkflow")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stage.Workflow stageworkflow){
        logger.info("hit /marshal/com.genologics.ri.stage.Workflow");
        return marshal(stageworkflow.getClass(), stageworkflow);
    }

    @PostMapping("/xml/stepactions")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Actions stepactions){
        logger.info("hit /marshal/com.genologics.ri.step.Actions");
        return marshal(stepactions.getClass(), stepactions);
    }

    @PostMapping("/xml/stepactionsnextactions")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Actions.NextActions stepactionsnextactions){
        logger.info("hit /marshal/com.genologics.ri.step.Actions.NextActions");
        return marshal(stepactionsnextactions.getClass(), stepactionsnextactions);
    }

    @PostMapping("/xml/stepactionslink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.ActionsLink stepactionslink){
        logger.info("hit /marshal/com.genologics.ri.step.ActionsLink");
        return marshal(stepactionslink.getClass(), stepactionslink);
    }

    @PostMapping("/xml/stepartifact")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Artifact stepartifact){
        logger.info("hit /marshal/com.genologics.ri.step.Artifact");
        return marshal(stepartifact.getClass(), stepartifact);
    }

    @PostMapping("/xml/stepautomaticnextsteplink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.AutomaticNextStepLink stepautomaticnextsteplink){
        logger.info("hit /marshal/com.genologics.ri.step.AutomaticNextStepLink");
        return marshal(stepautomaticnextsteplink.getClass(), stepautomaticnextsteplink);
    }

    @PostMapping("/xml/stepavailableprogram")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.AvailableProgram stepavailableprogram){
        logger.info("hit /marshal/com.genologics.ri.step.AvailableProgram");
        return marshal(stepavailableprogram.getClass(), stepavailableprogram);
    }

    @PostMapping("/xml/stepcontainer")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Container stepcontainer){
        logger.info("hit /marshal/com.genologics.ri.step.Container");
        return marshal(stepcontainer.getClass(), stepcontainer);
    }

    @PostMapping("/xml/stepcreationinput")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.CreationInput stepcreationinput){
        logger.info("hit /marshal/com.genologics.ri.step.CreationInput");
        return marshal(stepcreationinput.getClass(), stepcreationinput);
    }

    @PostMapping("/xml/stepdetails")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Details stepdetails){
        logger.info("hit /marshal/com.genologics.ri.step.Details");
        return marshal(stepdetails.getClass(), stepdetails);
    }

    @PostMapping("/xml/stepdetailsfields")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Details.Fields stepdetailsfields){
        logger.info("hit /marshal/com.genologics.ri.step.Details.Fields");
        return marshal(stepdetailsfields.getClass(), stepdetailsfields);
    }

    @PostMapping("/xml/stepdetailsinputoutputmaps")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Details.InputOutputMaps stepdetailsinputoutputmaps){
        logger.info("hit /marshal/com.genologics.ri.step.Details.InputOutputMaps");
        return marshal(stepdetailsinputoutputmaps.getClass(), stepdetailsinputoutputmaps);
    }

    @PostMapping("/xml/stepdetailslink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.DetailsLink stepdetailslink){
        logger.info("hit /marshal/com.genologics.ri.step.DetailsLink");
        return marshal(stepdetailslink.getClass(), stepdetailslink);
    }

    @PostMapping("/xml/stepescalatedartifact")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.EscalatedArtifact stepescalatedartifact){
        logger.info("hit /marshal/com.genologics.ri.step.EscalatedArtifact");
        return marshal(stepescalatedartifact.getClass(), stepescalatedartifact);
    }

    @PostMapping("/xml/stepescalation")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Escalation stepescalation){
        logger.info("hit /marshal/com.genologics.ri.step.Escalation");
        return marshal(stepescalation.getClass(), stepescalation);
    }

    @PostMapping("/xml/stepescalationescalatedartifacts")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Escalation.EscalatedArtifacts stepescalationescalatedartifacts){
        logger.info("hit /marshal/com.genologics.ri.step.Escalation.EscalatedArtifacts");
        return marshal(stepescalationescalatedartifacts.getClass(), stepescalationescalatedartifacts);
    }

    @PostMapping("/xml/stepescalationrequest")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.EscalationRequest stepescalationrequest){
        logger.info("hit /marshal/com.genologics.ri.step.EscalationRequest");
        return marshal(stepescalationrequest.getClass(), stepescalationrequest);
    }

    @PostMapping("/xml/stepescalationreview")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.EscalationReview stepescalationreview){
        logger.info("hit /marshal/com.genologics.ri.step.EscalationReview");
        return marshal(stepescalationreview.getClass(), stepescalationreview);
    }

    @PostMapping("/xml/stepfile")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.File stepfile){
        logger.info("hit /marshal/com.genologics.ri.step.File");
        return marshal(stepfile.getClass(), stepfile);
    }

    @PostMapping("/xml/stepinput")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Input stepinput){
        logger.info("hit /marshal/com.genologics.ri.step.Input");
        return marshal(stepinput.getClass(), stepinput);
    }

    @PostMapping("/xml/stepinputoutputmap")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.InputOutputMap stepinputoutputmap){
        logger.info("hit /marshal/com.genologics.ri.step.InputOutputMap");
        return marshal(stepinputoutputmap.getClass(), stepinputoutputmap);
    }

    @PostMapping("/xml/stepinstrument")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Instrument stepinstrument){
        logger.info("hit /marshal/com.genologics.ri.step.Instrument");
        return marshal(stepinstrument.getClass(), stepinstrument);
    }

    @PostMapping("/xml/steplots")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Lots steplots){
        logger.info("hit /marshal/com.genologics.ri.step.Lots");
        return marshal(steplots.getClass(), steplots);
    }

    @PostMapping("/xml/steplotsreagentlots")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Lots.ReagentLots steplotsreagentlots){
        logger.info("hit /marshal/com.genologics.ri.step.Lots.ReagentLots");
        return marshal(steplotsreagentlots.getClass(), steplotsreagentlots);
    }

    @PostMapping("/xml/stepnextaction")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.NextAction stepnextaction){
        logger.info("hit /marshal/com.genologics.ri.step.NextAction");
        return marshal(stepnextaction.getClass(), stepnextaction);
    }

    @PostMapping("/xml/stepoutput")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Output stepoutput){
        logger.info("hit /marshal/com.genologics.ri.step.Output");
        return marshal(stepoutput.getClass(), stepoutput);
    }

    @PostMapping("/xml/stepoutputplacement")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.OutputPlacement stepoutputplacement){
        logger.info("hit /marshal/com.genologics.ri.step.OutputPlacement");
        return marshal(stepoutputplacement.getClass(), stepoutputplacement);
    }

    @PostMapping("/xml/stepplacements")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Placements stepplacements){
        logger.info("hit /marshal/com.genologics.ri.step.Placements");
        return marshal(stepplacements.getClass(), stepplacements);
    }

    @PostMapping("/xml/stepplacementsoutputplacements")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Placements.OutputPlacements stepplacementsoutputplacements){
        logger.info("hit /marshal/com.genologics.ri.step.Placements.OutputPlacements");
        return marshal(stepplacementsoutputplacements.getClass(), stepplacementsoutputplacements);
    }

    @PostMapping("/xml/stepplacementsselectedcontainers")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Placements.SelectedContainers stepplacementsselectedcontainers){
        logger.info("hit /marshal/com.genologics.ri.step.Placements.SelectedContainers");
        return marshal(stepplacementsselectedcontainers.getClass(), stepplacementsselectedcontainers);
    }

    @PostMapping("/xml/stepplacementslink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.PlacementsLink stepplacementslink){
        logger.info("hit /marshal/com.genologics.ri.step.PlacementsLink");
        return marshal(stepplacementslink.getClass(), stepplacementslink);
    }

    @PostMapping("/xml/steppooledinputs")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.PooledInputs steppooledinputs){
        logger.info("hit /marshal/com.genologics.ri.step.PooledInputs");
        return marshal(steppooledinputs.getClass(), steppooledinputs);
    }

    @PostMapping("/xml/steppools")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Pools steppools){
        logger.info("hit /marshal/com.genologics.ri.step.Pools");
        return marshal(steppools.getClass(), steppools);
    }

    @PostMapping("/xml/steppoolsavailableinputs")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Pools.AvailableInputs steppoolsavailableinputs){
        logger.info("hit /marshal/com.genologics.ri.step.Pools.AvailableInputs");
        return marshal(steppoolsavailableinputs.getClass(), steppoolsavailableinputs);
    }

    @PostMapping("/xml/steppoolspooledinputs")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Pools.PooledInputs steppoolspooledinputs){
        logger.info("hit /marshal/com.genologics.ri.step.Pools.PooledInputs");
        return marshal(steppoolspooledinputs.getClass(), steppoolspooledinputs);
    }

    @PostMapping("/xml/steppoolslink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.PoolsLink steppoolslink){
        logger.info("hit /marshal/com.genologics.ri.step.PoolsLink");
        return marshal(steppoolslink.getClass(), steppoolslink);
    }

    @PostMapping("/xml/stepprogramstatus")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.ProgramStatus stepprogramstatus){
        logger.info("hit /marshal/com.genologics.ri.step.ProgramStatus");
        return marshal(stepprogramstatus.getClass(), stepprogramstatus);
    }

    @PostMapping("/xml/stepprogramstatuslink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.ProgramStatusLink stepprogramstatuslink){
        logger.info("hit /marshal/com.genologics.ri.step.ProgramStatusLink");
        return marshal(stepprogramstatuslink.getClass(), stepprogramstatuslink);
    }

    @PostMapping("/xml/stepreagentlabel")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.ReagentLabel stepreagentlabel){
        logger.info("hit /marshal/com.genologics.ri.step.ReagentLabel");
        return marshal(stepreagentlabel.getClass(), stepreagentlabel);
    }

    @PostMapping("/xml/stepreagentlotlink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.ReagentLotLink stepreagentlotlink){
        logger.info("hit /marshal/com.genologics.ri.step.ReagentLotLink");
        return marshal(stepreagentlotlink.getClass(), stepreagentlotlink);
    }

    @PostMapping("/xml/stepreagentlotslink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.ReagentLotsLink stepreagentlotslink){
        logger.info("hit /marshal/com.genologics.ri.step.ReagentLotsLink");
        return marshal(stepreagentlotslink.getClass(), stepreagentlotslink);
    }

    @PostMapping("/xml/stepreagents")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Reagents stepreagents){
        logger.info("hit /marshal/com.genologics.ri.step.Reagents");
        return marshal(stepreagents.getClass(), stepreagents);
    }

    @PostMapping("/xml/stepreagentsoutputreagents")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Reagents.OutputReagents stepreagentsoutputreagents){
        logger.info("hit /marshal/com.genologics.ri.step.Reagents.OutputReagents");
        return marshal(stepreagentsoutputreagents.getClass(), stepreagentsoutputreagents);
    }

    @PostMapping("/xml/stepreagentslink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.ReagentsLink stepreagentslink){
        logger.info("hit /marshal/com.genologics.ri.step.ReagentsLink");
        return marshal(stepreagentslink.getClass(), stepreagentslink);
    }

    @PostMapping("/xml/stepsetup")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Setup stepsetup){
        logger.info("hit /marshal/com.genologics.ri.step.Setup");
        return marshal(stepsetup.getClass(), stepsetup);
    }

    @PostMapping("/xml/stepsetupfiles")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Setup.Files stepsetupfiles){
        logger.info("hit /marshal/com.genologics.ri.step.Setup.Files");
        return marshal(stepsetupfiles.getClass(), stepsetupfiles);
    }

    @PostMapping("/xml/stepsetuplink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.SetupLink stepsetuplink){
        logger.info("hit /marshal/com.genologics.ri.step.SetupLink");
        return marshal(stepsetuplink.getClass(), stepsetuplink);
    }

    @PostMapping("/xml/stepstep")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Step stepstep){
        logger.info("hit /marshal/com.genologics.ri.step.Step");
        return marshal(stepstep.getClass(), stepstep);
    }

    @PostMapping("/xml/stepstepavailableprograms")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Step.AvailablePrograms stepstepavailableprograms){
        logger.info("hit /marshal/com.genologics.ri.step.Step.AvailablePrograms");
        return marshal(stepstepavailableprograms.getClass(), stepstepavailableprograms);
    }

    @PostMapping("/xml/stepstepconfiguration")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.StepConfiguration stepstepconfiguration){
        logger.info("hit /marshal/com.genologics.ri.step.StepConfiguration");
        return marshal(stepstepconfiguration.getClass(), stepstepconfiguration);
    }

    @PostMapping("/xml/stepstepcreation")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.StepCreation stepstepcreation){
        logger.info("hit /marshal/com.genologics.ri.step.StepCreation");
        return marshal(stepstepcreation.getClass(), stepstepcreation);
    }

    @PostMapping("/xml/stepstepcreationinputs")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.StepCreation.Inputs stepstepcreationinputs){
        logger.info("hit /marshal/com.genologics.ri.step.StepCreation.Inputs");
        return marshal(stepstepcreationinputs.getClass(), stepstepcreationinputs);
    }

    @PostMapping("/xml/stepuser")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.User stepuser){
        logger.info("hit /marshal/com.genologics.ri.step.User");
        return marshal(stepuser.getClass(), stepuser);
    }

    @PostMapping("/xml/stepconfigurationcontroltypelink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.ControlTypeLink stepconfigurationcontroltypelink){
        logger.info("hit /marshal/com.genologics.ri.stepconfiguration.ControlTypeLink");
        return marshal(stepconfigurationcontroltypelink.getClass(), stepconfigurationcontroltypelink);
    }

    @PostMapping("/xml/stepconfigurationepptrigger")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.EppTrigger stepconfigurationepptrigger){
        logger.info("hit /marshal/com.genologics.ri.stepconfiguration.EppTrigger");
        return marshal(stepconfigurationepptrigger.getClass(), stepconfigurationepptrigger);
    }

    @PostMapping("/xml/stepconfigurationfield")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.Field stepconfigurationfield){
        logger.info("hit /marshal/com.genologics.ri.stepconfiguration.Field");
        return marshal(stepconfigurationfield.getClass(), stepconfigurationfield);
    }

    @PostMapping("/xml/stepconfigurationfile")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.File stepconfigurationfile){
        logger.info("hit /marshal/com.genologics.ri.stepconfiguration.File");
        return marshal(stepconfigurationfile.getClass(), stepconfigurationfile);
    }

    @PostMapping("/xml/stepconfigurationgenerictypelink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.GenericTypeLink stepconfigurationgenerictypelink){
        logger.info("hit /marshal/com.genologics.ri.stepconfiguration.GenericTypeLink");
        return marshal(stepconfigurationgenerictypelink.getClass(), stepconfigurationgenerictypelink);
    }

    @PostMapping("/xml/stepconfigurationicebucketfield")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.Icebucketfield stepconfigurationicebucketfield){
        logger.info("hit /marshal/com.genologics.ri.stepconfiguration.Icebucketfield");
        return marshal(stepconfigurationicebucketfield.getClass(), stepconfigurationicebucketfield);
    }

    @PostMapping("/xml/stepconfigurationlockablesetting")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.LockableSetting stepconfigurationlockablesetting){
        logger.info("hit /marshal/com.genologics.ri.stepconfiguration.LockableSetting");
        return marshal(stepconfigurationlockablesetting.getClass(), stepconfigurationlockablesetting);
    }

    @PostMapping("/xml/stepconfigurationnextstep")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.NextStep stepconfigurationnextstep){
        logger.info("hit /marshal/com.genologics.ri.stepconfiguration.NextStep");
        return marshal(stepconfigurationnextstep.getClass(), stepconfigurationnextstep);
    }

    @PostMapping("/xml/stepconfigurationprocesstype")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.ProcessType stepconfigurationprocesstype){
        logger.info("hit /marshal/com.genologics.ri.stepconfiguration.ProcessType");
        return marshal(stepconfigurationprocesstype.getClass(), stepconfigurationprocesstype);
    }

    @PostMapping("/xml/stepconfigurationqueuefield")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.Queuefield stepconfigurationqueuefield){
        logger.info("hit /marshal/com.genologics.ri.stepconfiguration.Queuefield");
        return marshal(stepconfigurationqueuefield.getClass(), stepconfigurationqueuefield);
    }

    @PostMapping("/xml/stepconfigurationreagentkitlink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.ReagentKitLink stepconfigurationreagentkitlink){
        logger.info("hit /marshal/com.genologics.ri.stepconfiguration.ReagentKitLink");
        return marshal(stepconfigurationreagentkitlink.getClass(), stepconfigurationreagentkitlink);
    }

    @PostMapping("/xml/stepconfigurationstep")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.Step stepconfigurationstep){
        logger.info("hit /marshal/com.genologics.ri.stepconfiguration.Step");
        return marshal(stepconfigurationstep.getClass(), stepconfigurationstep);
    }

    @PostMapping("/xml/stepconfigurationstepepptriggers")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.Step.EppTriggers stepconfigurationstepepptriggers){
        logger.info("hit /marshal/com.genologics.ri.stepconfiguration.Step.EppTriggers");
        return marshal(stepconfigurationstepepptriggers.getClass(), stepconfigurationstepepptriggers);
    }

    @PostMapping("/xml/stepconfigurationstepicebucketfields")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.Step.IceBucketFields stepconfigurationstepicebucketfields){
        logger.info("hit /marshal/com.genologics.ri.stepconfiguration.Step.IceBucketFields");
        return marshal(stepconfigurationstepicebucketfields.getClass(), stepconfigurationstepicebucketfields);
    }

    @PostMapping("/xml/stepconfigurationsteppermittedcontainers")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.Step.PermittedContainers stepconfigurationsteppermittedcontainers){
        logger.info("hit /marshal/com.genologics.ri.stepconfiguration.Step.PermittedContainers");
        return marshal(stepconfigurationsteppermittedcontainers.getClass(), stepconfigurationsteppermittedcontainers);
    }

    @PostMapping("/xml/stepconfigurationsteppermittedcontroltypes")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.Step.PermittedControlTypes stepconfigurationsteppermittedcontroltypes){
        logger.info("hit /marshal/com.genologics.ri.stepconfiguration.Step.PermittedControlTypes");
        return marshal(stepconfigurationsteppermittedcontroltypes.getClass(), stepconfigurationsteppermittedcontroltypes);
    }

    @PostMapping("/xml/stepconfigurationsteppermittedinstrumenttypes")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.Step.PermittedInstrumentTypes stepconfigurationsteppermittedinstrumenttypes){
        logger.info("hit /marshal/com.genologics.ri.stepconfiguration.Step.PermittedInstrumentTypes");
        return marshal(stepconfigurationsteppermittedinstrumenttypes.getClass(), stepconfigurationsteppermittedinstrumenttypes);
    }

    @PostMapping("/xml/stepconfigurationsteppermittedreagentcategories")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.Step.PermittedReagentCategories stepconfigurationsteppermittedreagentcategories){
        logger.info("hit /marshal/com.genologics.ri.stepconfiguration.Step.PermittedReagentCategories");
        return marshal(stepconfigurationsteppermittedreagentcategories.getClass(), stepconfigurationsteppermittedreagentcategories);
    }

    @PostMapping("/xml/stepconfigurationstepqueuefields")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.Step.QueueFields stepconfigurationstepqueuefields){
        logger.info("hit /marshal/com.genologics.ri.stepconfiguration.Step.QueueFields");
        return marshal(stepconfigurationstepqueuefields.getClass(), stepconfigurationstepqueuefields);
    }

    @PostMapping("/xml/stepconfigurationsteprequiredreagentkits")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.Step.RequiredReagentKits stepconfigurationsteprequiredreagentkits){
        logger.info("hit /marshal/com.genologics.ri.stepconfiguration.Step.RequiredReagentKits");
        return marshal(stepconfigurationsteprequiredreagentkits.getClass(), stepconfigurationsteprequiredreagentkits);
    }

    @PostMapping("/xml/stepconfigurationstepsamplefields")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.Step.SampleFields stepconfigurationstepsamplefields){
        logger.info("hit /marshal/com.genologics.ri.stepconfiguration.Step.SampleFields");
        return marshal(stepconfigurationstepsamplefields.getClass(), stepconfigurationstepsamplefields);
    }

    @PostMapping("/xml/stepconfigurationstepstepfields")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.Step.StepFields stepconfigurationstepstepfields){
        logger.info("hit /marshal/com.genologics.ri.stepconfiguration.Step.StepFields");
        return marshal(stepconfigurationstepstepfields.getClass(), stepconfigurationstepstepfields);
    }

    @PostMapping("/xml/stepconfigurationstepstepproperties")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.Step.StepProperties stepconfigurationstepstepproperties){
        logger.info("hit /marshal/com.genologics.ri.stepconfiguration.Step.StepProperties");
        return marshal(stepconfigurationstepstepproperties.getClass(), stepconfigurationstepstepproperties);
    }

    @PostMapping("/xml/stepconfigurationsteptransitions")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.Step.Transitions stepconfigurationsteptransitions){
        logger.info("hit /marshal/com.genologics.ri.stepconfiguration.Step.Transitions");
        return marshal(stepconfigurationsteptransitions.getClass(), stepconfigurationsteptransitions);
    }

    @PostMapping("/xml/stepconfigurationstepproperty")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.StepProperty stepconfigurationstepproperty){
        logger.info("hit /marshal/com.genologics.ri.stepconfiguration.StepProperty");
        return marshal(stepconfigurationstepproperty.getClass(), stepconfigurationstepproperty);
    }

    @PostMapping("/xml/stepconfigurationstepsetup")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.StepSetup stepconfigurationstepsetup){
        logger.info("hit /marshal/com.genologics.ri.stepconfiguration.StepSetup");
        return marshal(stepconfigurationstepsetup.getClass(), stepconfigurationstepsetup);
    }

    @PostMapping("/xml/stepconfigurationstepsetupfiles")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.StepSetup.Files stepconfigurationstepsetupfiles){
        logger.info("hit /marshal/com.genologics.ri.stepconfiguration.StepSetup.Files");
        return marshal(stepconfigurationstepsetupfiles.getClass(), stepconfigurationstepsetupfiles);
    }

    @PostMapping("/xml/userdefinedfield")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.userdefined.Field userdefinedfield){
        logger.info("hit /marshal/com.genologics.ri.userdefined.Field");
        return marshal(userdefinedfield.getClass(), userdefinedfield);
    }

    @PostMapping("/xml/userdefinedtype")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.userdefined.Type userdefinedtype){
        logger.info("hit /marshal/com.genologics.ri.userdefined.Type");
        return marshal(userdefinedtype.getClass(), userdefinedtype);
    }

    @PostMapping("/xml/versionversion")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.version.Version versionversion){
        logger.info("hit /marshal/com.genologics.ri.version.Version");
        return marshal(versionversion.getClass(), versionversion);
    }

    @PostMapping("/xml/versionversions")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.version.Versions versionversions){
        logger.info("hit /marshal/com.genologics.ri.version.Versions");
        return marshal(versionversions.getClass(), versionversions);
    }

    @PostMapping("/xml/workflowconfigurationprotocollink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.workflowconfiguration.ProtocolLink workflowconfigurationprotocollink){
        logger.info("hit /marshal/com.genologics.ri.workflowconfiguration.ProtocolLink");
        return marshal(workflowconfigurationprotocollink.getClass(), workflowconfigurationprotocollink);
    }

    @PostMapping("/xml/workflowconfigurationstagelink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.workflowconfiguration.StageLink workflowconfigurationstagelink){
        logger.info("hit /marshal/com.genologics.ri.workflowconfiguration.StageLink");
        return marshal(workflowconfigurationstagelink.getClass(), workflowconfigurationstagelink);
    }

    @PostMapping("/xml/workflowconfigurationworkflow")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.workflowconfiguration.Workflow workflowconfigurationworkflow){
        logger.info("hit /marshal/com.genologics.ri.workflowconfiguration.Workflow");
        return marshal(workflowconfigurationworkflow.getClass(), workflowconfigurationworkflow);
    }

    @PostMapping("/xml/workflowconfigurationworkflowprotocols")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.workflowconfiguration.Workflow.Protocols workflowconfigurationworkflowprotocols){
        logger.info("hit /marshal/com.genologics.ri.workflowconfiguration.Workflow.Protocols");
        return marshal(workflowconfigurationworkflowprotocols.getClass(), workflowconfigurationworkflowprotocols);
    }

    @PostMapping("/xml/workflowconfigurationworkflowstages")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.workflowconfiguration.Workflow.Stages workflowconfigurationworkflowstages){
        logger.info("hit /marshal/com.genologics.ri.workflowconfiguration.Workflow.Stages");
        return marshal(workflowconfigurationworkflowstages.getClass(), workflowconfigurationworkflowstages);
    }

    @PostMapping("/xml/workflowconfigurationworkflowlink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.workflowconfiguration.WorkflowLink workflowconfigurationworkflowlink){
        logger.info("hit /marshal/com.genologics.ri.workflowconfiguration.WorkflowLink");
        return marshal(workflowconfigurationworkflowlink.getClass(), workflowconfigurationworkflowlink);
    }

    @PostMapping("/xml/workflowconfigurationworkflows")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.workflowconfiguration.Workflows workflowconfigurationworkflows){
        logger.info("hit /marshal/com.genologics.ri.workflowconfiguration.Workflows");
        return marshal(workflowconfigurationworkflows.getClass(), workflowconfigurationworkflows);
    }

    private ResponseEntity<String> marshal(Class<?> payloadClass, Object payload){

        try {

            String response = marshallingService.marshal(payloadClass, payload);
            return ResponseEntity.ok().body(response);

        } catch (JAXBException e) {

            logger.error("Something broke real bad...", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.toString());

        } catch (ClassNotFoundException e) {

            String msg = "ClassNotFoundException...was this a Clarity datatype?: " + payloadClass;

            logger.error(msg, e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(msg);

        }

    }
}