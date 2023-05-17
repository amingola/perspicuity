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

/**
 * @author Andrew Mingola
 */
@Controller
@RequestMapping("/xml")
public class XmlController {

    private static final Logger logger = LoggerFactory.getLogger(XmlController.class);

    final MarshallingService marshallingService;

    public XmlController(MarshallingService marshallingService) {
        this.marshallingService = marshallingService;
    }

    @PostMapping("/xml/com.genologics.ri.Address")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.Address address){
        logger.info("hit /xml/com.genologics.ri.Address");
        return marshal(address.getClass(), address);
    }

    @PostMapping("/xml/com.genologics.ri.Container")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.Container container){
        logger.info("hit /xml/com.genologics.ri.Container");
        return marshal(container.getClass(), container);
    }

    @PostMapping("/xml/com.genologics.ri.Externalid")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.Externalid externalid){
        logger.info("hit /xml/com.genologics.ri.Externalid");
        return marshal(externalid.getClass(), externalid);
    }

    @PostMapping("/xml/com.genologics.ri.Index")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.Index index){
        logger.info("hit /xml/com.genologics.ri.Index");
        return marshal(index.getClass(), index);
    }

    @PostMapping("/xml/com.genologics.ri.Link")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.Link link){
        logger.info("hit /xml/com.genologics.ri.Link");
        return marshal(link.getClass(), link);
    }

    @PostMapping("/xml/com.genologics.ri.Links")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.Links links){
        logger.info("hit /xml/com.genologics.ri.Links");
        return marshal(links.getClass(), links);
    }

    @PostMapping("/xml/com.genologics.ri.Location")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.Location location){
        logger.info("hit /xml/com.genologics.ri.Location");
        return marshal(location.getClass(), location);
    }

    @PostMapping("/xml/com.genologics.ri.Page")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.Page page){
        logger.info("hit /xml/com.genologics.ri.Page");
        return marshal(page.getClass(), page);
    }

    @PostMapping("/xml/com.genologics.ri.artifact.Artifact")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.Artifact artifactartifact){
        logger.info("hit /xml/com.genologics.ri.artifact.Artifact");
        return marshal(artifactartifact.getClass(), artifactartifact);
    }

    @PostMapping("/xml/com.genologics.ri.artifact.Artifact.WorkflowStages")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.Artifact.WorkflowStages artifactartifactworkflowstages){
        logger.info("hit /xml/com.genologics.ri.artifact.Artifact.WorkflowStages");
        return marshal(artifactartifactworkflowstages.getClass(), artifactartifactworkflowstages);
    }

    @PostMapping("/xml/com.genologics.ri.artifact.ArtifactLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.ArtifactLink artifactartifactlink){
        logger.info("hit /xml/com.genologics.ri.artifact.ArtifactLink");
        return marshal(artifactartifactlink.getClass(), artifactartifactlink);
    }

    @PostMapping("/xml/com.genologics.ri.artifact.Artifactgroup")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.Artifactgroup artifactartifactgroup){
        logger.info("hit /xml/com.genologics.ri.artifact.Artifactgroup");
        return marshal(artifactartifactgroup.getClass(), artifactartifactgroup);
    }

    @PostMapping("/xml/com.genologics.ri.artifact.Artifacts")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.Artifacts artifactartifacts){
        logger.info("hit /xml/com.genologics.ri.artifact.Artifacts");
        return marshal(artifactartifacts.getClass(), artifactartifacts);
    }

    @PostMapping("/xml/com.genologics.ri.artifact.ControlType")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.ControlType artifactcontroltype){
        logger.info("hit /xml/com.genologics.ri.artifact.ControlType");
        return marshal(artifactcontroltype.getClass(), artifactcontroltype);
    }

    @PostMapping("/xml/com.genologics.ri.artifact.Demux")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.Demux artifactdemux){
        logger.info("hit /xml/com.genologics.ri.artifact.Demux");
        return marshal(artifactdemux.getClass(), artifactdemux);
    }

    @PostMapping("/xml/com.genologics.ri.artifact.DemuxArtifact")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.DemuxArtifact artifactdemuxartifact){
        logger.info("hit /xml/com.genologics.ri.artifact.DemuxArtifact");
        return marshal(artifactdemuxartifact.getClass(), artifactdemuxartifact);
    }

    @PostMapping("/xml/com.genologics.ri.artifact.DemuxArtifact.ReagentLabels")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.DemuxArtifact.ReagentLabels artifactdemuxartifactreagentlabels){
        logger.info("hit /xml/com.genologics.ri.artifact.DemuxArtifact.ReagentLabels");
        return marshal(artifactdemuxartifactreagentlabels.getClass(), artifactdemuxartifactreagentlabels);
    }

    @PostMapping("/xml/com.genologics.ri.artifact.DemuxArtifact.Samples")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.DemuxArtifact.Samples artifactdemuxartifactsamples){
        logger.info("hit /xml/com.genologics.ri.artifact.DemuxArtifact.Samples");
        return marshal(artifactdemuxartifactsamples.getClass(), artifactdemuxartifactsamples);
    }

    @PostMapping("/xml/com.genologics.ri.artifact.DemuxArtifactSample")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.DemuxArtifactSample artifactdemuxartifactsample){
        logger.info("hit /xml/com.genologics.ri.artifact.DemuxArtifactSample");
        return marshal(artifactdemuxartifactsample.getClass(), artifactdemuxartifactsample);
    }

    @PostMapping("/xml/com.genologics.ri.artifact.DemuxDetails")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.DemuxDetails artifactdemuxdetails){
        logger.info("hit /xml/com.genologics.ri.artifact.DemuxDetails");
        return marshal(artifactdemuxdetails.getClass(), artifactdemuxdetails);
    }

    @PostMapping("/xml/com.genologics.ri.artifact.DemuxDetails.Artifacts")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.DemuxDetails.Artifacts artifactdemuxdetailsartifacts){
        logger.info("hit /xml/com.genologics.ri.artifact.DemuxDetails.Artifacts");
        return marshal(artifactdemuxdetailsartifacts.getClass(), artifactdemuxdetailsartifacts);
    }

    @PostMapping("/xml/com.genologics.ri.artifact.DemuxLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.DemuxLink artifactdemuxlink){
        logger.info("hit /xml/com.genologics.ri.artifact.DemuxLink");
        return marshal(artifactdemuxlink.getClass(), artifactdemuxlink);
    }

    @PostMapping("/xml/com.genologics.ri.artifact.DemuxSourceArtifact")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.DemuxSourceArtifact artifactdemuxsourceartifact){
        logger.info("hit /xml/com.genologics.ri.artifact.DemuxSourceArtifact");
        return marshal(artifactdemuxsourceartifact.getClass(), artifactdemuxsourceartifact);
    }

    @PostMapping("/xml/com.genologics.ri.artifact.Details")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.Details artifactdetails){
        logger.info("hit /xml/com.genologics.ri.artifact.Details");
        return marshal(artifactdetails.getClass(), artifactdetails);
    }

    @PostMapping("/xml/com.genologics.ri.artifact.ParentProcess")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.ParentProcess artifactparentprocess){
        logger.info("hit /xml/com.genologics.ri.artifact.ParentProcess");
        return marshal(artifactparentprocess.getClass(), artifactparentprocess);
    }

    @PostMapping("/xml/com.genologics.ri.artifact.PoolStep")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.PoolStep artifactpoolstep){
        logger.info("hit /xml/com.genologics.ri.artifact.PoolStep");
        return marshal(artifactpoolstep.getClass(), artifactpoolstep);
    }

    @PostMapping("/xml/com.genologics.ri.artifact.ReagentLabel")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.ReagentLabel artifactreagentlabel){
        logger.info("hit /xml/com.genologics.ri.artifact.ReagentLabel");
        return marshal(artifactreagentlabel.getClass(), artifactreagentlabel);
    }

    @PostMapping("/xml/com.genologics.ri.artifact.Sample")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.Sample artifactsample){
        logger.info("hit /xml/com.genologics.ri.artifact.Sample");
        return marshal(artifactsample.getClass(), artifactsample);
    }

    @PostMapping("/xml/com.genologics.ri.artifact.WorkflowStage")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifact.WorkflowStage artifactworkflowstage){
        logger.info("hit /xml/com.genologics.ri.artifact.WorkflowStage");
        return marshal(artifactworkflowstage.getClass(), artifactworkflowstage);
    }

    @PostMapping("/xml/com.genologics.ri.artifactgroup.Artifactgroup")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifactgroup.Artifactgroup artifactgroupartifactgroup){
        logger.info("hit /xml/com.genologics.ri.artifactgroup.Artifactgroup");
        return marshal(artifactgroupartifactgroup.getClass(), artifactgroupartifactgroup);
    }

    @PostMapping("/xml/com.genologics.ri.artifactgroup.ArtifactgroupLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifactgroup.ArtifactgroupLink artifactgroupartifactgrouplink){
        logger.info("hit /xml/com.genologics.ri.artifactgroup.ArtifactgroupLink");
        return marshal(artifactgroupartifactgrouplink.getClass(), artifactgroupartifactgrouplink);
    }

    @PostMapping("/xml/com.genologics.ri.artifactgroup.Artifactgroups")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifactgroup.Artifactgroups artifactgroupartifactgroups){
        logger.info("hit /xml/com.genologics.ri.artifactgroup.Artifactgroups");
        return marshal(artifactgroupartifactgroups.getClass(), artifactgroupartifactgroups);
    }

    @PostMapping("/xml/com.genologics.ri.artifactgroup.Artifacts")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.artifactgroup.Artifacts artifactgroupartifacts){
        logger.info("hit /xml/com.genologics.ri.artifactgroup.Artifacts");
        return marshal(artifactgroupartifacts.getClass(), artifactgroupartifacts);
    }

    @PostMapping("/xml/com.genologics.ri.automation.Automation")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.automation.Automation automationautomation){
        logger.info("hit /xml/com.genologics.ri.automation.Automation");
        return marshal(automationautomation.getClass(), automationautomation);
    }

    @PostMapping("/xml/com.genologics.ri.automation.Automation.ProcessTypes")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.automation.Automation.ProcessTypes automationautomationprocesstypes){
        logger.info("hit /xml/com.genologics.ri.automation.Automation.ProcessTypes");
        return marshal(automationautomationprocesstypes.getClass(), automationautomationprocesstypes);
    }

    @PostMapping("/xml/com.genologics.ri.automation.AutomationLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.automation.AutomationLink automationautomationlink){
        logger.info("hit /xml/com.genologics.ri.automation.AutomationLink");
        return marshal(automationautomationlink.getClass(), automationautomationlink);
    }

    @PostMapping("/xml/com.genologics.ri.automation.Automations")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.automation.Automations automationautomations){
        logger.info("hit /xml/com.genologics.ri.automation.Automations");
        return marshal(automationautomations.getClass(), automationautomations);
    }

    @PostMapping("/xml/com.genologics.ri.automation.ProcessType")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.automation.ProcessType automationprocesstype){
        logger.info("hit /xml/com.genologics.ri.automation.ProcessType");
        return marshal(automationprocesstype.getClass(), automationprocesstype);
    }

    @PostMapping("/xml/com.genologics.ri.configuration.Field")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.configuration.Field configurationfield){
        logger.info("hit /xml/com.genologics.ri.configuration.Field");
        return marshal(configurationfield.getClass(), configurationfield);
    }

    @PostMapping("/xml/com.genologics.ri.configuration.FieldLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.configuration.FieldLink configurationfieldlink){
        logger.info("hit /xml/com.genologics.ri.configuration.FieldLink");
        return marshal(configurationfieldlink.getClass(), configurationfieldlink);
    }

    @PostMapping("/xml/com.genologics.ri.configuration.Type")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.configuration.Type configurationtype){
        logger.info("hit /xml/com.genologics.ri.configuration.Type");
        return marshal(configurationtype.getClass(), configurationtype);
    }

    @PostMapping("/xml/com.genologics.ri.configuration.TypeDefinition")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.configuration.TypeDefinition configurationtypedefinition){
        logger.info("hit /xml/com.genologics.ri.configuration.TypeDefinition");
        return marshal(configurationtypedefinition.getClass(), configurationtypedefinition);
    }

    @PostMapping("/xml/com.genologics.ri.configuration.UdfconfigLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.configuration.UdfconfigLink configurationudfconfiglink){
        logger.info("hit /xml/com.genologics.ri.configuration.UdfconfigLink");
        return marshal(configurationudfconfiglink.getClass(), configurationudfconfiglink);
    }

    @PostMapping("/xml/com.genologics.ri.configuration.Udfs")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.configuration.Udfs configurationudfs){
        logger.info("hit /xml/com.genologics.ri.configuration.Udfs");
        return marshal(configurationudfs.getClass(), configurationudfs);
    }

    @PostMapping("/xml/com.genologics.ri.configuration.UdtconfigLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.configuration.UdtconfigLink configurationudtconfiglink){
        logger.info("hit /xml/com.genologics.ri.configuration.UdtconfigLink");
        return marshal(configurationudtconfiglink.getClass(), configurationudtconfiglink);
    }

    @PostMapping("/xml/com.genologics.ri.configuration.Udts")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.configuration.Udts configurationudts){
        logger.info("hit /xml/com.genologics.ri.configuration.Udts");
        return marshal(configurationudts.getClass(), configurationudts);
    }

    @PostMapping("/xml/com.genologics.ri.container.Container")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.container.Container containercontainer){
        logger.info("hit /xml/com.genologics.ri.container.Container");
        return marshal(containercontainer.getClass(), containercontainer);
    }

    @PostMapping("/xml/com.genologics.ri.container.ContainerLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.container.ContainerLink containercontainerlink){
        logger.info("hit /xml/com.genologics.ri.container.ContainerLink");
        return marshal(containercontainerlink.getClass(), containercontainerlink);
    }

    @PostMapping("/xml/com.genologics.ri.container.ContainerType")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.container.ContainerType containercontainertype){
        logger.info("hit /xml/com.genologics.ri.container.ContainerType");
        return marshal(containercontainertype.getClass(), containercontainertype);
    }

    @PostMapping("/xml/com.genologics.ri.container.Containers")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.container.Containers containercontainers){
        logger.info("hit /xml/com.genologics.ri.container.Containers");
        return marshal(containercontainers.getClass(), containercontainers);
    }

    @PostMapping("/xml/com.genologics.ri.container.Details")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.container.Details containerdetails){
        logger.info("hit /xml/com.genologics.ri.container.Details");
        return marshal(containerdetails.getClass(), containerdetails);
    }

    @PostMapping("/xml/com.genologics.ri.container.Placement")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.container.Placement containerplacement){
        logger.info("hit /xml/com.genologics.ri.container.Placement");
        return marshal(containerplacement.getClass(), containerplacement);
    }

    @PostMapping("/xml/com.genologics.ri.containertype.CalibrantWell")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.containertype.CalibrantWell containertypecalibrantwell){
        logger.info("hit /xml/com.genologics.ri.containertype.CalibrantWell");
        return marshal(containertypecalibrantwell.getClass(), containertypecalibrantwell);
    }

    @PostMapping("/xml/com.genologics.ri.containertype.ContainerType")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.containertype.ContainerType containertypecontainertype){
        logger.info("hit /xml/com.genologics.ri.containertype.ContainerType");
        return marshal(containertypecontainertype.getClass(), containertypecontainertype);
    }

    @PostMapping("/xml/com.genologics.ri.containertype.ContainerTypeLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.containertype.ContainerTypeLink containertypecontainertypelink){
        logger.info("hit /xml/com.genologics.ri.containertype.ContainerTypeLink");
        return marshal(containertypecontainertypelink.getClass(), containertypecontainertypelink);
    }

    @PostMapping("/xml/com.genologics.ri.containertype.ContainerTypes")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.containertype.ContainerTypes containertypecontainertypes){
        logger.info("hit /xml/com.genologics.ri.containertype.ContainerTypes");
        return marshal(containertypecontainertypes.getClass(), containertypecontainertypes);
    }

    @PostMapping("/xml/com.genologics.ri.containertype.Dimension")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.containertype.Dimension containertypedimension){
        logger.info("hit /xml/com.genologics.ri.containertype.Dimension");
        return marshal(containertypedimension.getClass(), containertypedimension);
    }

    @PostMapping("/xml/com.genologics.ri.controltype.ControlType")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.controltype.ControlType controltypecontroltype){
        logger.info("hit /xml/com.genologics.ri.controltype.ControlType");
        return marshal(controltypecontroltype.getClass(), controltypecontroltype);
    }

    @PostMapping("/xml/com.genologics.ri.controltype.ControlTypeLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.controltype.ControlTypeLink controltypecontroltypelink){
        logger.info("hit /xml/com.genologics.ri.controltype.ControlTypeLink");
        return marshal(controltypecontroltypelink.getClass(), controltypecontroltypelink);
    }

    @PostMapping("/xml/com.genologics.ri.controltype.ControlTypes")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.controltype.ControlTypes controltypecontroltypes){
        logger.info("hit /xml/com.genologics.ri.controltype.ControlTypes");
        return marshal(controltypecontroltypes.getClass(), controltypecontroltypes);
    }

    @PostMapping("/xml/com.genologics.ri.exception.Exception")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.exception.Exception exceptionexception){
        logger.info("hit /xml/com.genologics.ri.exception.Exception");
        return marshal(exceptionexception.getClass(), exceptionexception);
    }

    @PostMapping("/xml/com.genologics.ri.file.Details")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.file.Details filedetails){
        logger.info("hit /xml/com.genologics.ri.file.Details");
        return marshal(filedetails.getClass(), filedetails);
    }

    @PostMapping("/xml/com.genologics.ri.file.File")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.file.File filefile){
        logger.info("hit /xml/com.genologics.ri.file.File");
        return marshal(filefile.getClass(), filefile);
    }

    @PostMapping("/xml/com.genologics.ri.file.FileLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.file.FileLink filefilelink){
        logger.info("hit /xml/com.genologics.ri.file.FileLink");
        return marshal(filefilelink.getClass(), filefilelink);
    }

    @PostMapping("/xml/com.genologics.ri.file.Files")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.file.Files filefiles){
        logger.info("hit /xml/com.genologics.ri.file.Files");
        return marshal(filefiles.getClass(), filefiles);
    }

    @PostMapping("/xml/com.genologics.ri.instrument.Instrument")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.instrument.Instrument instrumentinstrument){
        logger.info("hit /xml/com.genologics.ri.instrument.Instrument");
        return marshal(instrumentinstrument.getClass(), instrumentinstrument);
    }

    @PostMapping("/xml/com.genologics.ri.instrument.InstrumentLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.instrument.InstrumentLink instrumentinstrumentlink){
        logger.info("hit /xml/com.genologics.ri.instrument.InstrumentLink");
        return marshal(instrumentinstrumentlink.getClass(), instrumentinstrumentlink);
    }

    @PostMapping("/xml/com.genologics.ri.instrument.Instruments")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.instrument.Instruments instrumentinstruments){
        logger.info("hit /xml/com.genologics.ri.instrument.Instruments");
        return marshal(instrumentinstruments.getClass(), instrumentinstruments);
    }

    @PostMapping("/xml/com.genologics.ri.instrumenttype.InstrumentType")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.instrumenttype.InstrumentType instrumenttypeinstrumenttype){
        logger.info("hit /xml/com.genologics.ri.instrumenttype.InstrumentType");
        return marshal(instrumenttypeinstrumenttype.getClass(), instrumenttypeinstrumenttype);
    }

    @PostMapping("/xml/com.genologics.ri.instrumenttype.InstrumentType.ProcessTypes")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.instrumenttype.InstrumentType.ProcessTypes instrumenttypeinstrumenttypeprocesstypes){
        logger.info("hit /xml/com.genologics.ri.instrumenttype.InstrumentType.ProcessTypes");
        return marshal(instrumenttypeinstrumenttypeprocesstypes.getClass(), instrumenttypeinstrumenttypeprocesstypes);
    }

    @PostMapping("/xml/com.genologics.ri.instrumenttype.InstrumentTypeLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.instrumenttype.InstrumentTypeLink instrumenttypeinstrumenttypelink){
        logger.info("hit /xml/com.genologics.ri.instrumenttype.InstrumentTypeLink");
        return marshal(instrumenttypeinstrumenttypelink.getClass(), instrumenttypeinstrumenttypelink);
    }

    @PostMapping("/xml/com.genologics.ri.instrumenttype.InstrumentTypeProcessType")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.instrumenttype.InstrumentTypeProcessType instrumenttypeinstrumenttypeprocesstype){
        logger.info("hit /xml/com.genologics.ri.instrumenttype.InstrumentTypeProcessType");
        return marshal(instrumenttypeinstrumenttypeprocesstype.getClass(), instrumenttypeinstrumenttypeprocesstype);
    }

    @PostMapping("/xml/com.genologics.ri.instrumenttype.InstrumentTypes")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.instrumenttype.InstrumentTypes instrumenttypeinstrumenttypes){
        logger.info("hit /xml/com.genologics.ri.instrumenttype.InstrumentTypes");
        return marshal(instrumenttypeinstrumenttypes.getClass(), instrumenttypeinstrumenttypes);
    }

    @PostMapping("/xml/com.genologics.ri.lab.Lab")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.lab.Lab lablab){
        logger.info("hit /xml/com.genologics.ri.lab.Lab");
        return marshal(lablab.getClass(), lablab);
    }

    @PostMapping("/xml/com.genologics.ri.lab.LabLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.lab.LabLink lablablink){
        logger.info("hit /xml/com.genologics.ri.lab.LabLink");
        return marshal(lablablink.getClass(), lablablink);
    }

    @PostMapping("/xml/com.genologics.ri.lab.Labs")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.lab.Labs lablabs){
        logger.info("hit /xml/com.genologics.ri.lab.Labs");
        return marshal(lablabs.getClass(), lablabs);
    }

    @PostMapping("/xml/com.genologics.ri.permission.Permission")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.permission.Permission permissionpermission){
        logger.info("hit /xml/com.genologics.ri.permission.Permission");
        return marshal(permissionpermission.getClass(), permissionpermission);
    }

    @PostMapping("/xml/com.genologics.ri.permission.PermissionLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.permission.PermissionLink permissionpermissionlink){
        logger.info("hit /xml/com.genologics.ri.permission.PermissionLink");
        return marshal(permissionpermissionlink.getClass(), permissionpermissionlink);
    }

    @PostMapping("/xml/com.genologics.ri.permission.Permissions")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.permission.Permissions permissionpermissions){
        logger.info("hit /xml/com.genologics.ri.permission.Permissions");
        return marshal(permissionpermissions.getClass(), permissionpermissions);
    }

    @PostMapping("/xml/com.genologics.ri.process.Artifact")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.process.Artifact processartifact){
        logger.info("hit /xml/com.genologics.ri.process.Artifact");
        return marshal(processartifact.getClass(), processartifact);
    }

    @PostMapping("/xml/com.genologics.ri.process.InputOutputMap")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.process.InputOutputMap processinputoutputmap){
        logger.info("hit /xml/com.genologics.ri.process.InputOutputMap");
        return marshal(processinputoutputmap.getClass(), processinputoutputmap);
    }

    @PostMapping("/xml/com.genologics.ri.process.Instrument")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.process.Instrument processinstrument){
        logger.info("hit /xml/com.genologics.ri.process.Instrument");
        return marshal(processinstrument.getClass(), processinstrument);
    }

    @PostMapping("/xml/com.genologics.ri.process.Parameter")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.process.Parameter processparameter){
        logger.info("hit /xml/com.genologics.ri.process.Parameter");
        return marshal(processparameter.getClass(), processparameter);
    }

    @PostMapping("/xml/com.genologics.ri.process.ParentProcess")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.process.ParentProcess processparentprocess){
        logger.info("hit /xml/com.genologics.ri.process.ParentProcess");
        return marshal(processparentprocess.getClass(), processparentprocess);
    }

    @PostMapping("/xml/com.genologics.ri.process.Process")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.process.Process processprocess){
        logger.info("hit /xml/com.genologics.ri.process.Process");
        return marshal(processprocess.getClass(), processprocess);
    }

    @PostMapping("/xml/com.genologics.ri.process.ProcessLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.process.ProcessLink processprocesslink){
        logger.info("hit /xml/com.genologics.ri.process.ProcessLink");
        return marshal(processprocesslink.getClass(), processprocesslink);
    }

    @PostMapping("/xml/com.genologics.ri.process.ProcessType")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.process.ProcessType processprocesstype){
        logger.info("hit /xml/com.genologics.ri.process.ProcessType");
        return marshal(processprocesstype.getClass(), processprocesstype);
    }

    @PostMapping("/xml/com.genologics.ri.process.Processes")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.process.Processes processprocesses){
        logger.info("hit /xml/com.genologics.ri.process.Processes");
        return marshal(processprocesses.getClass(), processprocesses);
    }

    @PostMapping("/xml/com.genologics.ri.process.Technician")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.process.Technician processtechnician){
        logger.info("hit /xml/com.genologics.ri.process.Technician");
        return marshal(processtechnician.getClass(), processtechnician);
    }

    @PostMapping("/xml/com.genologics.ri.processexecution.Input")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processexecution.Input processexecutioninput){
        logger.info("hit /xml/com.genologics.ri.processexecution.Input");
        return marshal(processexecutioninput.getClass(), processexecutioninput);
    }

    @PostMapping("/xml/com.genologics.ri.processexecution.InputOutputMap")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processexecution.InputOutputMap processexecutioninputoutputmap){
        logger.info("hit /xml/com.genologics.ri.processexecution.InputOutputMap");
        return marshal(processexecutioninputoutputmap.getClass(), processexecutioninputoutputmap);
    }

    @PostMapping("/xml/com.genologics.ri.processexecution.Instrument")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processexecution.Instrument processexecutioninstrument){
        logger.info("hit /xml/com.genologics.ri.processexecution.Instrument");
        return marshal(processexecutioninstrument.getClass(), processexecutioninstrument);
    }

    @PostMapping("/xml/com.genologics.ri.processexecution.Output")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processexecution.Output processexecutionoutput){
        logger.info("hit /xml/com.genologics.ri.processexecution.Output");
        return marshal(processexecutionoutput.getClass(), processexecutionoutput);
    }

    @PostMapping("/xml/com.genologics.ri.processexecution.Parameter")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processexecution.Parameter processexecutionparameter){
        logger.info("hit /xml/com.genologics.ri.processexecution.Parameter");
        return marshal(processexecutionparameter.getClass(), processexecutionparameter);
    }

    @PostMapping("/xml/com.genologics.ri.processexecution.Process")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processexecution.Process processexecutionprocess){
        logger.info("hit /xml/com.genologics.ri.processexecution.Process");
        return marshal(processexecutionprocess.getClass(), processexecutionprocess);
    }

    @PostMapping("/xml/com.genologics.ri.processexecution.Technician")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processexecution.Technician processexecutiontechnician){
        logger.info("hit /xml/com.genologics.ri.processexecution.Technician");
        return marshal(processexecutiontechnician.getClass(), processexecutiontechnician);
    }

    @PostMapping("/xml/com.genologics.ri.processtemplate.Instrument")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtemplate.Instrument processtemplateinstrument){
        logger.info("hit /xml/com.genologics.ri.processtemplate.Instrument");
        return marshal(processtemplateinstrument.getClass(), processtemplateinstrument);
    }

    @PostMapping("/xml/com.genologics.ri.processtemplate.Parameter")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtemplate.Parameter processtemplateparameter){
        logger.info("hit /xml/com.genologics.ri.processtemplate.Parameter");
        return marshal(processtemplateparameter.getClass(), processtemplateparameter);
    }

    @PostMapping("/xml/com.genologics.ri.processtemplate.ProcessTemplate")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtemplate.ProcessTemplate processtemplateprocesstemplate){
        logger.info("hit /xml/com.genologics.ri.processtemplate.ProcessTemplate");
        return marshal(processtemplateprocesstemplate.getClass(), processtemplateprocesstemplate);
    }

    @PostMapping("/xml/com.genologics.ri.processtemplate.ProcessTemplateLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtemplate.ProcessTemplateLink processtemplateprocesstemplatelink){
        logger.info("hit /xml/com.genologics.ri.processtemplate.ProcessTemplateLink");
        return marshal(processtemplateprocesstemplatelink.getClass(), processtemplateprocesstemplatelink);
    }

    @PostMapping("/xml/com.genologics.ri.processtemplate.ProcessTemplates")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtemplate.ProcessTemplates processtemplateprocesstemplates){
        logger.info("hit /xml/com.genologics.ri.processtemplate.ProcessTemplates");
        return marshal(processtemplateprocesstemplates.getClass(), processtemplateprocesstemplates);
    }

    @PostMapping("/xml/com.genologics.ri.processtemplate.ProcessType")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtemplate.ProcessType processtemplateprocesstype){
        logger.info("hit /xml/com.genologics.ri.processtemplate.ProcessType");
        return marshal(processtemplateprocesstype.getClass(), processtemplateprocesstype);
    }

    @PostMapping("/xml/com.genologics.ri.processtemplate.Technician")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtemplate.Technician processtemplatetechnician){
        logger.info("hit /xml/com.genologics.ri.processtemplate.Technician");
        return marshal(processtemplatetechnician.getClass(), processtemplatetechnician);
    }

    @PostMapping("/xml/com.genologics.ri.processtype.ContainerTypeLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.ContainerTypeLink processtypecontainertypelink){
        logger.info("hit /xml/com.genologics.ri.processtype.ContainerTypeLink");
        return marshal(processtypecontainertypelink.getClass(), processtypecontainertypelink);
    }

    @PostMapping("/xml/com.genologics.ri.processtype.ControlTypeLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.ControlTypeLink processtypecontroltypelink){
        logger.info("hit /xml/com.genologics.ri.processtype.ControlTypeLink");
        return marshal(processtypecontroltypelink.getClass(), processtypecontroltypelink);
    }

    @PostMapping("/xml/com.genologics.ri.processtype.EppTrigger")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.EppTrigger processtypeepptrigger){
        logger.info("hit /xml/com.genologics.ri.processtype.EppTrigger");
        return marshal(processtypeepptrigger.getClass(), processtypeepptrigger);
    }

    @PostMapping("/xml/com.genologics.ri.processtype.Field")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.Field processtypefield){
        logger.info("hit /xml/com.genologics.ri.processtype.Field");
        return marshal(processtypefield.getClass(), processtypefield);
    }

    @PostMapping("/xml/com.genologics.ri.processtype.File")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.File processtypefile){
        logger.info("hit /xml/com.genologics.ri.processtype.File");
        return marshal(processtypefile.getClass(), processtypefile);
    }

    @PostMapping("/xml/com.genologics.ri.processtype.Icebucketfield")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.Icebucketfield processtypeicebucketfield){
        logger.info("hit /xml/com.genologics.ri.processtype.Icebucketfield");
        return marshal(processtypeicebucketfield.getClass(), processtypeicebucketfield);
    }

    @PostMapping("/xml/com.genologics.ri.processtype.Parameter")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.Parameter processtypeparameter){
        logger.info("hit /xml/com.genologics.ri.processtype.Parameter");
        return marshal(processtypeparameter.getClass(), processtypeparameter);
    }

    @PostMapping("/xml/com.genologics.ri.processtype.ProcessInput")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.ProcessInput processtypeprocessinput){
        logger.info("hit /xml/com.genologics.ri.processtype.ProcessInput");
        return marshal(processtypeprocessinput.getClass(), processtypeprocessinput);
    }

    @PostMapping("/xml/com.genologics.ri.processtype.ProcessOutput")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.ProcessOutput processtypeprocessoutput){
        logger.info("hit /xml/com.genologics.ri.processtype.ProcessOutput");
        return marshal(processtypeprocessoutput.getClass(), processtypeprocessoutput);
    }

    @PostMapping("/xml/com.genologics.ri.processtype.ProcessType")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.ProcessType processtypeprocesstype){
        logger.info("hit /xml/com.genologics.ri.processtype.ProcessType");
        return marshal(processtypeprocesstype.getClass(), processtypeprocesstype);
    }

    @PostMapping("/xml/com.genologics.ri.processtype.ProcessType.EppTriggers")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.ProcessType.EppTriggers processtypeprocesstypeepptriggers){
        logger.info("hit /xml/com.genologics.ri.processtype.ProcessType.EppTriggers");
        return marshal(processtypeprocesstypeepptriggers.getClass(), processtypeprocesstypeepptriggers);
    }

    @PostMapping("/xml/com.genologics.ri.processtype.ProcessType.IceBucketFields")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.ProcessType.IceBucketFields processtypeprocesstypeicebucketfields){
        logger.info("hit /xml/com.genologics.ri.processtype.ProcessType.IceBucketFields");
        return marshal(processtypeprocesstypeicebucketfields.getClass(), processtypeprocesstypeicebucketfields);
    }

    @PostMapping("/xml/com.genologics.ri.processtype.ProcessType.PermittedContainers")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.ProcessType.PermittedContainers processtypeprocesstypepermittedcontainers){
        logger.info("hit /xml/com.genologics.ri.processtype.ProcessType.PermittedContainers");
        return marshal(processtypeprocesstypepermittedcontainers.getClass(), processtypeprocesstypepermittedcontainers);
    }

    @PostMapping("/xml/com.genologics.ri.processtype.ProcessType.PermittedControlTypes")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.ProcessType.PermittedControlTypes processtypeprocesstypepermittedcontroltypes){
        logger.info("hit /xml/com.genologics.ri.processtype.ProcessType.PermittedControlTypes");
        return marshal(processtypeprocesstypepermittedcontroltypes.getClass(), processtypeprocesstypepermittedcontroltypes);
    }

    @PostMapping("/xml/com.genologics.ri.processtype.ProcessType.PermittedInstrumentTypes")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.ProcessType.PermittedInstrumentTypes processtypeprocesstypepermittedinstrumenttypes){
        logger.info("hit /xml/com.genologics.ri.processtype.ProcessType.PermittedInstrumentTypes");
        return marshal(processtypeprocesstypepermittedinstrumenttypes.getClass(), processtypeprocesstypepermittedinstrumenttypes);
    }

    @PostMapping("/xml/com.genologics.ri.processtype.ProcessType.PermittedReagentCategories")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.ProcessType.PermittedReagentCategories processtypeprocesstypepermittedreagentcategories){
        logger.info("hit /xml/com.genologics.ri.processtype.ProcessType.PermittedReagentCategories");
        return marshal(processtypeprocesstypepermittedreagentcategories.getClass(), processtypeprocesstypepermittedreagentcategories);
    }

    @PostMapping("/xml/com.genologics.ri.processtype.ProcessType.QueueFields")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.ProcessType.QueueFields processtypeprocesstypequeuefields){
        logger.info("hit /xml/com.genologics.ri.processtype.ProcessType.QueueFields");
        return marshal(processtypeprocesstypequeuefields.getClass(), processtypeprocesstypequeuefields);
    }

    @PostMapping("/xml/com.genologics.ri.processtype.ProcessType.RequiredReagentKits")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.ProcessType.RequiredReagentKits processtypeprocesstyperequiredreagentkits){
        logger.info("hit /xml/com.genologics.ri.processtype.ProcessType.RequiredReagentKits");
        return marshal(processtypeprocesstyperequiredreagentkits.getClass(), processtypeprocesstyperequiredreagentkits);
    }

    @PostMapping("/xml/com.genologics.ri.processtype.ProcessType.SampleFields")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.ProcessType.SampleFields processtypeprocesstypesamplefields){
        logger.info("hit /xml/com.genologics.ri.processtype.ProcessType.SampleFields");
        return marshal(processtypeprocesstypesamplefields.getClass(), processtypeprocesstypesamplefields);
    }

    @PostMapping("/xml/com.genologics.ri.processtype.ProcessType.StepFields")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.ProcessType.StepFields processtypeprocesstypestepfields){
        logger.info("hit /xml/com.genologics.ri.processtype.ProcessType.StepFields");
        return marshal(processtypeprocesstypestepfields.getClass(), processtypeprocesstypestepfields);
    }

    @PostMapping("/xml/com.genologics.ri.processtype.ProcessType.StepProperties")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.ProcessType.StepProperties processtypeprocesstypestepproperties){
        logger.info("hit /xml/com.genologics.ri.processtype.ProcessType.StepProperties");
        return marshal(processtypeprocesstypestepproperties.getClass(), processtypeprocesstypestepproperties);
    }

    @PostMapping("/xml/com.genologics.ri.processtype.ProcessTypeAttribute")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.ProcessTypeAttribute processtypeprocesstypeattribute){
        logger.info("hit /xml/com.genologics.ri.processtype.ProcessTypeAttribute");
        return marshal(processtypeprocesstypeattribute.getClass(), processtypeprocesstypeattribute);
    }

    @PostMapping("/xml/com.genologics.ri.processtype.ProcessTypeLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.ProcessTypeLink processtypeprocesstypelink){
        logger.info("hit /xml/com.genologics.ri.processtype.ProcessTypeLink");
        return marshal(processtypeprocesstypelink.getClass(), processtypeprocesstypelink);
    }

    @PostMapping("/xml/com.genologics.ri.processtype.ProcessTypes")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.ProcessTypes processtypeprocesstypes){
        logger.info("hit /xml/com.genologics.ri.processtype.ProcessTypes");
        return marshal(processtypeprocesstypes.getClass(), processtypeprocesstypes);
    }

    @PostMapping("/xml/com.genologics.ri.processtype.Queuefield")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.Queuefield processtypequeuefield){
        logger.info("hit /xml/com.genologics.ri.processtype.Queuefield");
        return marshal(processtypequeuefield.getClass(), processtypequeuefield);
    }

    @PostMapping("/xml/com.genologics.ri.processtype.ReagentKitLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.ReagentKitLink processtypereagentkitlink){
        logger.info("hit /xml/com.genologics.ri.processtype.ReagentKitLink");
        return marshal(processtypereagentkitlink.getClass(), processtypereagentkitlink);
    }

    @PostMapping("/xml/com.genologics.ri.processtype.StepProperty")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.StepProperty processtypestepproperty){
        logger.info("hit /xml/com.genologics.ri.processtype.StepProperty");
        return marshal(processtypestepproperty.getClass(), processtypestepproperty);
    }

    @PostMapping("/xml/com.genologics.ri.processtype.StepSetup")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.StepSetup processtypestepsetup){
        logger.info("hit /xml/com.genologics.ri.processtype.StepSetup");
        return marshal(processtypestepsetup.getClass(), processtypestepsetup);
    }

    @PostMapping("/xml/com.genologics.ri.processtype.StepSetup.Files")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.StepSetup.Files processtypestepsetupfiles){
        logger.info("hit /xml/com.genologics.ri.processtype.StepSetup.Files");
        return marshal(processtypestepsetupfiles.getClass(), processtypestepsetupfiles);
    }

    @PostMapping("/xml/com.genologics.ri.processtype.TypeDefinition")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.processtype.TypeDefinition processtypetypedefinition){
        logger.info("hit /xml/com.genologics.ri.processtype.TypeDefinition");
        return marshal(processtypetypedefinition.getClass(), processtypetypedefinition);
    }

    @PostMapping("/xml/com.genologics.ri.project.Project")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.project.Project projectproject){
        logger.info("hit /xml/com.genologics.ri.project.Project");
        return marshal(projectproject.getClass(), projectproject);
    }

    @PostMapping("/xml/com.genologics.ri.project.ProjectLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.project.ProjectLink projectprojectlink){
        logger.info("hit /xml/com.genologics.ri.project.ProjectLink");
        return marshal(projectprojectlink.getClass(), projectprojectlink);
    }

    @PostMapping("/xml/com.genologics.ri.project.Projects")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.project.Projects projectprojects){
        logger.info("hit /xml/com.genologics.ri.project.Projects");
        return marshal(projectprojects.getClass(), projectprojects);
    }

    @PostMapping("/xml/com.genologics.ri.project.Researcher")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.project.Researcher projectresearcher){
        logger.info("hit /xml/com.genologics.ri.project.Researcher");
        return marshal(projectresearcher.getClass(), projectresearcher);
    }

    @PostMapping("/xml/com.genologics.ri.property.Properties")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.property.Properties propertyproperties){
        logger.info("hit /xml/com.genologics.ri.property.Properties");
        return marshal(propertyproperties.getClass(), propertyproperties);
    }

    @PostMapping("/xml/com.genologics.ri.property.PropertyLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.property.PropertyLink propertypropertylink){
        logger.info("hit /xml/com.genologics.ri.property.PropertyLink");
        return marshal(propertypropertylink.getClass(), propertypropertylink);
    }

    @PostMapping("/xml/com.genologics.ri.protocolconfiguration.Protocol")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.protocolconfiguration.Protocol protocolconfigurationprotocol){
        logger.info("hit /xml/com.genologics.ri.protocolconfiguration.Protocol");
        return marshal(protocolconfigurationprotocol.getClass(), protocolconfigurationprotocol);
    }

    @PostMapping("/xml/com.genologics.ri.protocolconfiguration.Protocol.ProtocolProperties")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.protocolconfiguration.Protocol.ProtocolProperties protocolconfigurationprotocolprotocolproperties){
        logger.info("hit /xml/com.genologics.ri.protocolconfiguration.Protocol.ProtocolProperties");
        return marshal(protocolconfigurationprotocolprotocolproperties.getClass(), protocolconfigurationprotocolprotocolproperties);
    }

    @PostMapping("/xml/com.genologics.ri.protocolconfiguration.Protocol.Steps")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.protocolconfiguration.Protocol.Steps protocolconfigurationprotocolsteps){
        logger.info("hit /xml/com.genologics.ri.protocolconfiguration.Protocol.Steps");
        return marshal(protocolconfigurationprotocolsteps.getClass(), protocolconfigurationprotocolsteps);
    }

    @PostMapping("/xml/com.genologics.ri.protocolconfiguration.ProtocolLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.protocolconfiguration.ProtocolLink protocolconfigurationprotocollink){
        logger.info("hit /xml/com.genologics.ri.protocolconfiguration.ProtocolLink");
        return marshal(protocolconfigurationprotocollink.getClass(), protocolconfigurationprotocollink);
    }

    @PostMapping("/xml/com.genologics.ri.protocolconfiguration.ProtocolProperty")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.protocolconfiguration.ProtocolProperty protocolconfigurationprotocolproperty){
        logger.info("hit /xml/com.genologics.ri.protocolconfiguration.ProtocolProperty");
        return marshal(protocolconfigurationprotocolproperty.getClass(), protocolconfigurationprotocolproperty);
    }

    @PostMapping("/xml/com.genologics.ri.protocolconfiguration.Protocols")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.protocolconfiguration.Protocols protocolconfigurationprotocols){
        logger.info("hit /xml/com.genologics.ri.protocolconfiguration.Protocols");
        return marshal(protocolconfigurationprotocols.getClass(), protocolconfigurationprotocols);
    }

    @PostMapping("/xml/com.genologics.ri.queue.ArtifactLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.queue.ArtifactLink queueartifactlink){
        logger.info("hit /xml/com.genologics.ri.queue.ArtifactLink");
        return marshal(queueartifactlink.getClass(), queueartifactlink);
    }

    @PostMapping("/xml/com.genologics.ri.queue.Queue")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.queue.Queue queuequeue){
        logger.info("hit /xml/com.genologics.ri.queue.Queue");
        return marshal(queuequeue.getClass(), queuequeue);
    }

    @PostMapping("/xml/com.genologics.ri.queue.Queue.Artifacts")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.queue.Queue.Artifacts queuequeueartifacts){
        logger.info("hit /xml/com.genologics.ri.queue.Queue.Artifacts");
        return marshal(queuequeueartifacts.getClass(), queuequeueartifacts);
    }

    @PostMapping("/xml/com.genologics.ri.reagentkit.ReagentKit")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.reagentkit.ReagentKit reagentkitreagentkit){
        logger.info("hit /xml/com.genologics.ri.reagentkit.ReagentKit");
        return marshal(reagentkitreagentkit.getClass(), reagentkitreagentkit);
    }

    @PostMapping("/xml/com.genologics.ri.reagentkit.ReagentKitLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.reagentkit.ReagentKitLink reagentkitreagentkitlink){
        logger.info("hit /xml/com.genologics.ri.reagentkit.ReagentKitLink");
        return marshal(reagentkitreagentkitlink.getClass(), reagentkitreagentkitlink);
    }

    @PostMapping("/xml/com.genologics.ri.reagentkit.ReagentKits")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.reagentkit.ReagentKits reagentkitreagentkits){
        logger.info("hit /xml/com.genologics.ri.reagentkit.ReagentKits");
        return marshal(reagentkitreagentkits.getClass(), reagentkitreagentkits);
    }

    @PostMapping("/xml/com.genologics.ri.reagentlot.ReagentKitLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.reagentlot.ReagentKitLink reagentlotreagentkitlink){
        logger.info("hit /xml/com.genologics.ri.reagentlot.ReagentKitLink");
        return marshal(reagentlotreagentkitlink.getClass(), reagentlotreagentkitlink);
    }

    @PostMapping("/xml/com.genologics.ri.reagentlot.ReagentLot")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.reagentlot.ReagentLot reagentlotreagentlot){
        logger.info("hit /xml/com.genologics.ri.reagentlot.ReagentLot");
        return marshal(reagentlotreagentlot.getClass(), reagentlotreagentlot);
    }

    @PostMapping("/xml/com.genologics.ri.reagentlot.ReagentLotLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.reagentlot.ReagentLotLink reagentlotreagentlotlink){
        logger.info("hit /xml/com.genologics.ri.reagentlot.ReagentLotLink");
        return marshal(reagentlotreagentlotlink.getClass(), reagentlotreagentlotlink);
    }

    @PostMapping("/xml/com.genologics.ri.reagentlot.ReagentLots")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.reagentlot.ReagentLots reagentlotreagentlots){
        logger.info("hit /xml/com.genologics.ri.reagentlot.ReagentLots");
        return marshal(reagentlotreagentlots.getClass(), reagentlotreagentlots);
    }

    @PostMapping("/xml/com.genologics.ri.reagentlot.Researcher")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.reagentlot.Researcher reagentlotresearcher){
        logger.info("hit /xml/com.genologics.ri.reagentlot.Researcher");
        return marshal(reagentlotresearcher.getClass(), reagentlotresearcher);
    }

    @PostMapping("/xml/com.genologics.ri.reagenttype.Attribute")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.reagenttype.Attribute reagenttypeattribute){
        logger.info("hit /xml/com.genologics.ri.reagenttype.Attribute");
        return marshal(reagenttypeattribute.getClass(), reagenttypeattribute);
    }

    @PostMapping("/xml/com.genologics.ri.reagenttype.ReagentType")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.reagenttype.ReagentType reagenttypereagenttype){
        logger.info("hit /xml/com.genologics.ri.reagenttype.ReagentType");
        return marshal(reagenttypereagenttype.getClass(), reagenttypereagenttype);
    }

    @PostMapping("/xml/com.genologics.ri.reagenttype.ReagentTypeLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.reagenttype.ReagentTypeLink reagenttypereagenttypelink){
        logger.info("hit /xml/com.genologics.ri.reagenttype.ReagentTypeLink");
        return marshal(reagenttypereagenttypelink.getClass(), reagenttypereagenttypelink);
    }

    @PostMapping("/xml/com.genologics.ri.reagenttype.ReagentTypes")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.reagenttype.ReagentTypes reagenttypereagenttypes){
        logger.info("hit /xml/com.genologics.ri.reagenttype.ReagentTypes");
        return marshal(reagenttypereagenttypes.getClass(), reagenttypereagenttypes);
    }

    @PostMapping("/xml/com.genologics.ri.reagenttype.SpecialType")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.reagenttype.SpecialType reagenttypespecialtype){
        logger.info("hit /xml/com.genologics.ri.reagenttype.SpecialType");
        return marshal(reagenttypespecialtype.getClass(), reagenttypespecialtype);
    }

    @PostMapping("/xml/com.genologics.ri.researcher.Credentials")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.researcher.Credentials researchercredentials){
        logger.info("hit /xml/com.genologics.ri.researcher.Credentials");
        return marshal(researchercredentials.getClass(), researchercredentials);
    }

    @PostMapping("/xml/com.genologics.ri.researcher.Lab")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.researcher.Lab researcherlab){
        logger.info("hit /xml/com.genologics.ri.researcher.Lab");
        return marshal(researcherlab.getClass(), researcherlab);
    }

    @PostMapping("/xml/com.genologics.ri.researcher.Researcher")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.researcher.Researcher researcherresearcher){
        logger.info("hit /xml/com.genologics.ri.researcher.Researcher");
        return marshal(researcherresearcher.getClass(), researcherresearcher);
    }

    @PostMapping("/xml/com.genologics.ri.researcher.ResearcherLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.researcher.ResearcherLink researcherresearcherlink){
        logger.info("hit /xml/com.genologics.ri.researcher.ResearcherLink");
        return marshal(researcherresearcherlink.getClass(), researcherresearcherlink);
    }

    @PostMapping("/xml/com.genologics.ri.researcher.Researchers")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.researcher.Researchers researcherresearchers){
        logger.info("hit /xml/com.genologics.ri.researcher.Researchers");
        return marshal(researcherresearchers.getClass(), researcherresearchers);
    }

    @PostMapping("/xml/com.genologics.ri.researcher.Role")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.researcher.Role researcherrole){
        logger.info("hit /xml/com.genologics.ri.researcher.Role");
        return marshal(researcherrole.getClass(), researcherrole);
    }

    @PostMapping("/xml/com.genologics.ri.role.PermissionLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.role.PermissionLink rolepermissionlink){
        logger.info("hit /xml/com.genologics.ri.role.PermissionLink");
        return marshal(rolepermissionlink.getClass(), rolepermissionlink);
    }

    @PostMapping("/xml/com.genologics.ri.role.ResearcherLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.role.ResearcherLink roleresearcherlink){
        logger.info("hit /xml/com.genologics.ri.role.ResearcherLink");
        return marshal(roleresearcherlink.getClass(), roleresearcherlink);
    }

    @PostMapping("/xml/com.genologics.ri.role.Role")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.role.Role rolerole){
        logger.info("hit /xml/com.genologics.ri.role.Role");
        return marshal(rolerole.getClass(), rolerole);
    }

    @PostMapping("/xml/com.genologics.ri.role.Role.Permissions")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.role.Role.Permissions rolerolepermissions){
        logger.info("hit /xml/com.genologics.ri.role.Role.Permissions");
        return marshal(rolerolepermissions.getClass(), rolerolepermissions);
    }

    @PostMapping("/xml/com.genologics.ri.role.Role.Researchers")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.role.Role.Researchers roleroleresearchers){
        logger.info("hit /xml/com.genologics.ri.role.Role.Researchers");
        return marshal(roleroleresearchers.getClass(), roleroleresearchers);
    }

    @PostMapping("/xml/com.genologics.ri.role.RoleLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.role.RoleLink rolerolelink){
        logger.info("hit /xml/com.genologics.ri.role.RoleLink");
        return marshal(rolerolelink.getClass(), rolerolelink);
    }

    @PostMapping("/xml/com.genologics.ri.role.Roles")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.role.Roles roleroles){
        logger.info("hit /xml/com.genologics.ri.role.Roles");
        return marshal(roleroles.getClass(), roleroles);
    }

    @PostMapping("/xml/com.genologics.ri.routing.Artifact")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.routing.Artifact routingartifact){
        logger.info("hit /xml/com.genologics.ri.routing.Artifact");
        return marshal(routingartifact.getClass(), routingartifact);
    }

    @PostMapping("/xml/com.genologics.ri.routing.ExtArtifactAssignments")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.routing.ExtArtifactAssignments routingextartifactassignments){
        logger.info("hit /xml/com.genologics.ri.routing.ExtArtifactAssignments");
        return marshal(routingextartifactassignments.getClass(), routingextartifactassignments);
    }

    @PostMapping("/xml/com.genologics.ri.routing.Routing")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.routing.Routing routingrouting){
        logger.info("hit /xml/com.genologics.ri.routing.Routing");
        return marshal(routingrouting.getClass(), routingrouting);
    }

    @PostMapping("/xml/com.genologics.ri.sample.Artifact")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.sample.Artifact sampleartifact){
        logger.info("hit /xml/com.genologics.ri.sample.Artifact");
        return marshal(sampleartifact.getClass(), sampleartifact);
    }

    @PostMapping("/xml/com.genologics.ri.sample.Biosource")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.sample.Biosource samplebiosource){
        logger.info("hit /xml/com.genologics.ri.sample.Biosource");
        return marshal(samplebiosource.getClass(), samplebiosource);
    }

    @PostMapping("/xml/com.genologics.ri.sample.ContainerType")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.sample.ContainerType samplecontainertype){
        logger.info("hit /xml/com.genologics.ri.sample.ContainerType");
        return marshal(samplecontainertype.getClass(), samplecontainertype);
    }

    @PostMapping("/xml/com.genologics.ri.sample.ControlType")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.sample.ControlType samplecontroltype){
        logger.info("hit /xml/com.genologics.ri.sample.ControlType");
        return marshal(samplecontroltype.getClass(), samplecontroltype);
    }

    @PostMapping("/xml/com.genologics.ri.sample.Details")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.sample.Details sampledetails){
        logger.info("hit /xml/com.genologics.ri.sample.Details");
        return marshal(sampledetails.getClass(), sampledetails);
    }

    @PostMapping("/xml/com.genologics.ri.sample.Project")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.sample.Project sampleproject){
        logger.info("hit /xml/com.genologics.ri.sample.Project");
        return marshal(sampleproject.getClass(), sampleproject);
    }

    @PostMapping("/xml/com.genologics.ri.sample.Sample")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.sample.Sample samplesample){
        logger.info("hit /xml/com.genologics.ri.sample.Sample");
        return marshal(samplesample.getClass(), samplesample);
    }

    @PostMapping("/xml/com.genologics.ri.sample.SampleLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.sample.SampleLink samplesamplelink){
        logger.info("hit /xml/com.genologics.ri.sample.SampleLink");
        return marshal(samplesamplelink.getClass(), samplesamplelink);
    }

    @PostMapping("/xml/com.genologics.ri.sample.Samplebase")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.sample.Samplebase samplesamplebase){
        logger.info("hit /xml/com.genologics.ri.sample.Samplebase");
        return marshal(samplesamplebase.getClass(), samplesamplebase);
    }

    @PostMapping("/xml/com.genologics.ri.sample.Samplecreation")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.sample.Samplecreation samplesamplecreation){
        logger.info("hit /xml/com.genologics.ri.sample.Samplecreation");
        return marshal(samplesamplecreation.getClass(), samplesamplecreation);
    }

    @PostMapping("/xml/com.genologics.ri.sample.Samples")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.sample.Samples samplesamples){
        logger.info("hit /xml/com.genologics.ri.sample.Samples");
        return marshal(samplesamples.getClass(), samplesamples);
    }

    @PostMapping("/xml/com.genologics.ri.sample.Submitter")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.sample.Submitter samplesubmitter){
        logger.info("hit /xml/com.genologics.ri.sample.Submitter");
        return marshal(samplesubmitter.getClass(), samplesubmitter);
    }

    @PostMapping("/xml/com.genologics.ri.stage.Protocol")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stage.Protocol stageprotocol){
        logger.info("hit /xml/com.genologics.ri.stage.Protocol");
        return marshal(stageprotocol.getClass(), stageprotocol);
    }

    @PostMapping("/xml/com.genologics.ri.stage.Stage")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stage.Stage stagestage){
        logger.info("hit /xml/com.genologics.ri.stage.Stage");
        return marshal(stagestage.getClass(), stagestage);
    }

    @PostMapping("/xml/com.genologics.ri.stage.Step")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stage.Step stagestep){
        logger.info("hit /xml/com.genologics.ri.stage.Step");
        return marshal(stagestep.getClass(), stagestep);
    }

    @PostMapping("/xml/com.genologics.ri.stage.Workflow")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stage.Workflow stageworkflow){
        logger.info("hit /xml/com.genologics.ri.stage.Workflow");
        return marshal(stageworkflow.getClass(), stageworkflow);
    }

    @PostMapping("/xml/com.genologics.ri.step.Actions")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Actions stepactions){
        logger.info("hit /xml/com.genologics.ri.step.Actions");
        return marshal(stepactions.getClass(), stepactions);
    }

    @PostMapping("/xml/com.genologics.ri.step.Actions.NextActions")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Actions.NextActions stepactionsnextactions){
        logger.info("hit /xml/com.genologics.ri.step.Actions.NextActions");
        return marshal(stepactionsnextactions.getClass(), stepactionsnextactions);
    }

    @PostMapping("/xml/com.genologics.ri.step.ActionsLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.ActionsLink stepactionslink){
        logger.info("hit /xml/com.genologics.ri.step.ActionsLink");
        return marshal(stepactionslink.getClass(), stepactionslink);
    }

    @PostMapping("/xml/com.genologics.ri.step.Artifact")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Artifact stepartifact){
        logger.info("hit /xml/com.genologics.ri.step.Artifact");
        return marshal(stepartifact.getClass(), stepartifact);
    }

    @PostMapping("/xml/com.genologics.ri.step.AutomaticNextStepLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.AutomaticNextStepLink stepautomaticnextsteplink){
        logger.info("hit /xml/com.genologics.ri.step.AutomaticNextStepLink");
        return marshal(stepautomaticnextsteplink.getClass(), stepautomaticnextsteplink);
    }

    @PostMapping("/xml/com.genologics.ri.step.AvailableProgram")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.AvailableProgram stepavailableprogram){
        logger.info("hit /xml/com.genologics.ri.step.AvailableProgram");
        return marshal(stepavailableprogram.getClass(), stepavailableprogram);
    }

    @PostMapping("/xml/com.genologics.ri.step.Container")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Container stepcontainer){
        logger.info("hit /xml/com.genologics.ri.step.Container");
        return marshal(stepcontainer.getClass(), stepcontainer);
    }

    @PostMapping("/xml/com.genologics.ri.step.CreationInput")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.CreationInput stepcreationinput){
        logger.info("hit /xml/com.genologics.ri.step.CreationInput");
        return marshal(stepcreationinput.getClass(), stepcreationinput);
    }

    @PostMapping("/xml/com.genologics.ri.step.Details")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Details stepdetails){
        logger.info("hit /xml/com.genologics.ri.step.Details");
        return marshal(stepdetails.getClass(), stepdetails);
    }

    @PostMapping("/xml/com.genologics.ri.step.Details.Fields")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Details.Fields stepdetailsfields){
        logger.info("hit /xml/com.genologics.ri.step.Details.Fields");
        return marshal(stepdetailsfields.getClass(), stepdetailsfields);
    }

    @PostMapping("/xml/com.genologics.ri.step.Details.InputOutputMaps")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Details.InputOutputMaps stepdetailsinputoutputmaps){
        logger.info("hit /xml/com.genologics.ri.step.Details.InputOutputMaps");
        return marshal(stepdetailsinputoutputmaps.getClass(), stepdetailsinputoutputmaps);
    }

    @PostMapping("/xml/com.genologics.ri.step.DetailsLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.DetailsLink stepdetailslink){
        logger.info("hit /xml/com.genologics.ri.step.DetailsLink");
        return marshal(stepdetailslink.getClass(), stepdetailslink);
    }

    @PostMapping("/xml/com.genologics.ri.step.EscalatedArtifact")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.EscalatedArtifact stepescalatedartifact){
        logger.info("hit /xml/com.genologics.ri.step.EscalatedArtifact");
        return marshal(stepescalatedartifact.getClass(), stepescalatedartifact);
    }

    @PostMapping("/xml/com.genologics.ri.step.Escalation")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Escalation stepescalation){
        logger.info("hit /xml/com.genologics.ri.step.Escalation");
        return marshal(stepescalation.getClass(), stepescalation);
    }

    @PostMapping("/xml/com.genologics.ri.step.Escalation.EscalatedArtifacts")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Escalation.EscalatedArtifacts stepescalationescalatedartifacts){
        logger.info("hit /xml/com.genologics.ri.step.Escalation.EscalatedArtifacts");
        return marshal(stepescalationescalatedartifacts.getClass(), stepescalationescalatedartifacts);
    }

    @PostMapping("/xml/com.genologics.ri.step.EscalationRequest")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.EscalationRequest stepescalationrequest){
        logger.info("hit /xml/com.genologics.ri.step.EscalationRequest");
        return marshal(stepescalationrequest.getClass(), stepescalationrequest);
    }

    @PostMapping("/xml/com.genologics.ri.step.EscalationReview")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.EscalationReview stepescalationreview){
        logger.info("hit /xml/com.genologics.ri.step.EscalationReview");
        return marshal(stepescalationreview.getClass(), stepescalationreview);
    }

    @PostMapping("/xml/com.genologics.ri.step.File")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.File stepfile){
        logger.info("hit /xml/com.genologics.ri.step.File");
        return marshal(stepfile.getClass(), stepfile);
    }

    @PostMapping("/xml/com.genologics.ri.step.Input")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Input stepinput){
        logger.info("hit /xml/com.genologics.ri.step.Input");
        return marshal(stepinput.getClass(), stepinput);
    }

    @PostMapping("/xml/com.genologics.ri.step.InputOutputMap")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.InputOutputMap stepinputoutputmap){
        logger.info("hit /xml/com.genologics.ri.step.InputOutputMap");
        return marshal(stepinputoutputmap.getClass(), stepinputoutputmap);
    }

    @PostMapping("/xml/com.genologics.ri.step.Instrument")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Instrument stepinstrument){
        logger.info("hit /xml/com.genologics.ri.step.Instrument");
        return marshal(stepinstrument.getClass(), stepinstrument);
    }

    @PostMapping("/xml/com.genologics.ri.step.Lots")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Lots steplots){
        logger.info("hit /xml/com.genologics.ri.step.Lots");
        return marshal(steplots.getClass(), steplots);
    }

    @PostMapping("/xml/com.genologics.ri.step.Lots.ReagentLots")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Lots.ReagentLots steplotsreagentlots){
        logger.info("hit /xml/com.genologics.ri.step.Lots.ReagentLots");
        return marshal(steplotsreagentlots.getClass(), steplotsreagentlots);
    }

    @PostMapping("/xml/com.genologics.ri.step.NextAction")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.NextAction stepnextaction){
        logger.info("hit /xml/com.genologics.ri.step.NextAction");
        return marshal(stepnextaction.getClass(), stepnextaction);
    }

    @PostMapping("/xml/com.genologics.ri.step.Output")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Output stepoutput){
        logger.info("hit /xml/com.genologics.ri.step.Output");
        return marshal(stepoutput.getClass(), stepoutput);
    }

    @PostMapping("/xml/com.genologics.ri.step.OutputPlacement")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.OutputPlacement stepoutputplacement){
        logger.info("hit /xml/com.genologics.ri.step.OutputPlacement");
        return marshal(stepoutputplacement.getClass(), stepoutputplacement);
    }

    @PostMapping("/xml/com.genologics.ri.step.Placements")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Placements stepplacements){
        logger.info("hit /xml/com.genologics.ri.step.Placements");
        return marshal(stepplacements.getClass(), stepplacements);
    }

    @PostMapping("/xml/com.genologics.ri.step.Placements.OutputPlacements")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Placements.OutputPlacements stepplacementsoutputplacements){
        logger.info("hit /xml/com.genologics.ri.step.Placements.OutputPlacements");
        return marshal(stepplacementsoutputplacements.getClass(), stepplacementsoutputplacements);
    }

    @PostMapping("/xml/com.genologics.ri.step.Placements.SelectedContainers")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Placements.SelectedContainers stepplacementsselectedcontainers){
        logger.info("hit /xml/com.genologics.ri.step.Placements.SelectedContainers");
        return marshal(stepplacementsselectedcontainers.getClass(), stepplacementsselectedcontainers);
    }

    @PostMapping("/xml/com.genologics.ri.step.PlacementsLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.PlacementsLink stepplacementslink){
        logger.info("hit /xml/com.genologics.ri.step.PlacementsLink");
        return marshal(stepplacementslink.getClass(), stepplacementslink);
    }

    @PostMapping("/xml/com.genologics.ri.step.PooledInputs")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.PooledInputs steppooledinputs){
        logger.info("hit /xml/com.genologics.ri.step.PooledInputs");
        return marshal(steppooledinputs.getClass(), steppooledinputs);
    }

    @PostMapping("/xml/com.genologics.ri.step.Pools")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Pools steppools){
        logger.info("hit /xml/com.genologics.ri.step.Pools");
        return marshal(steppools.getClass(), steppools);
    }

    @PostMapping("/xml/com.genologics.ri.step.Pools.AvailableInputs")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Pools.AvailableInputs steppoolsavailableinputs){
        logger.info("hit /xml/com.genologics.ri.step.Pools.AvailableInputs");
        return marshal(steppoolsavailableinputs.getClass(), steppoolsavailableinputs);
    }

    @PostMapping("/xml/com.genologics.ri.step.Pools.PooledInputs")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Pools.PooledInputs steppoolspooledinputs){
        logger.info("hit /xml/com.genologics.ri.step.Pools.PooledInputs");
        return marshal(steppoolspooledinputs.getClass(), steppoolspooledinputs);
    }

    @PostMapping("/xml/com.genologics.ri.step.PoolsLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.PoolsLink steppoolslink){
        logger.info("hit /xml/com.genologics.ri.step.PoolsLink");
        return marshal(steppoolslink.getClass(), steppoolslink);
    }

    @PostMapping("/xml/com.genologics.ri.step.ProgramStatus")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.ProgramStatus stepprogramstatus){
        logger.info("hit /xml/com.genologics.ri.step.ProgramStatus");
        return marshal(stepprogramstatus.getClass(), stepprogramstatus);
    }

    @PostMapping("/xml/com.genologics.ri.step.ProgramStatusLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.ProgramStatusLink stepprogramstatuslink){
        logger.info("hit /xml/com.genologics.ri.step.ProgramStatusLink");
        return marshal(stepprogramstatuslink.getClass(), stepprogramstatuslink);
    }

    @PostMapping("/xml/com.genologics.ri.step.ReagentLabel")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.ReagentLabel stepreagentlabel){
        logger.info("hit /xml/com.genologics.ri.step.ReagentLabel");
        return marshal(stepreagentlabel.getClass(), stepreagentlabel);
    }

    @PostMapping("/xml/com.genologics.ri.step.ReagentLotLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.ReagentLotLink stepreagentlotlink){
        logger.info("hit /xml/com.genologics.ri.step.ReagentLotLink");
        return marshal(stepreagentlotlink.getClass(), stepreagentlotlink);
    }

    @PostMapping("/xml/com.genologics.ri.step.ReagentLotsLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.ReagentLotsLink stepreagentlotslink){
        logger.info("hit /xml/com.genologics.ri.step.ReagentLotsLink");
        return marshal(stepreagentlotslink.getClass(), stepreagentlotslink);
    }

    @PostMapping("/xml/com.genologics.ri.step.Reagents")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Reagents stepreagents){
        logger.info("hit /xml/com.genologics.ri.step.Reagents");
        return marshal(stepreagents.getClass(), stepreagents);
    }

    @PostMapping("/xml/com.genologics.ri.step.Reagents.OutputReagents")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Reagents.OutputReagents stepreagentsoutputreagents){
        logger.info("hit /xml/com.genologics.ri.step.Reagents.OutputReagents");
        return marshal(stepreagentsoutputreagents.getClass(), stepreagentsoutputreagents);
    }

    @PostMapping("/xml/com.genologics.ri.step.ReagentsLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.ReagentsLink stepreagentslink){
        logger.info("hit /xml/com.genologics.ri.step.ReagentsLink");
        return marshal(stepreagentslink.getClass(), stepreagentslink);
    }

    @PostMapping("/xml/com.genologics.ri.step.Setup")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Setup stepsetup){
        logger.info("hit /xml/com.genologics.ri.step.Setup");
        return marshal(stepsetup.getClass(), stepsetup);
    }

    @PostMapping("/xml/com.genologics.ri.step.Setup.Files")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Setup.Files stepsetupfiles){
        logger.info("hit /xml/com.genologics.ri.step.Setup.Files");
        return marshal(stepsetupfiles.getClass(), stepsetupfiles);
    }

    @PostMapping("/xml/com.genologics.ri.step.SetupLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.SetupLink stepsetuplink){
        logger.info("hit /xml/com.genologics.ri.step.SetupLink");
        return marshal(stepsetuplink.getClass(), stepsetuplink);
    }

    @PostMapping("/xml/com.genologics.ri.step.Step")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Step stepstep){
        logger.info("hit /xml/com.genologics.ri.step.Step");
        return marshal(stepstep.getClass(), stepstep);
    }

    @PostMapping("/xml/com.genologics.ri.step.Step.AvailablePrograms")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.Step.AvailablePrograms stepstepavailableprograms){
        logger.info("hit /xml/com.genologics.ri.step.Step.AvailablePrograms");
        return marshal(stepstepavailableprograms.getClass(), stepstepavailableprograms);
    }

    @PostMapping("/xml/com.genologics.ri.step.StepConfiguration")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.StepConfiguration stepstepconfiguration){
        logger.info("hit /xml/com.genologics.ri.step.StepConfiguration");
        return marshal(stepstepconfiguration.getClass(), stepstepconfiguration);
    }

    @PostMapping("/xml/com.genologics.ri.step.StepCreation")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.StepCreation stepstepcreation){
        logger.info("hit /xml/com.genologics.ri.step.StepCreation");
        return marshal(stepstepcreation.getClass(), stepstepcreation);
    }

    @PostMapping("/xml/com.genologics.ri.step.StepCreation.Inputs")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.StepCreation.Inputs stepstepcreationinputs){
        logger.info("hit /xml/com.genologics.ri.step.StepCreation.Inputs");
        return marshal(stepstepcreationinputs.getClass(), stepstepcreationinputs);
    }

    @PostMapping("/xml/com.genologics.ri.step.User")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.step.User stepuser){
        logger.info("hit /xml/com.genologics.ri.step.User");
        return marshal(stepuser.getClass(), stepuser);
    }

    @PostMapping("/xml/com.genologics.ri.stepconfiguration.ControlTypeLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.ControlTypeLink stepconfigurationcontroltypelink){
        logger.info("hit /xml/com.genologics.ri.stepconfiguration.ControlTypeLink");
        return marshal(stepconfigurationcontroltypelink.getClass(), stepconfigurationcontroltypelink);
    }

    @PostMapping("/xml/com.genologics.ri.stepconfiguration.EppTrigger")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.EppTrigger stepconfigurationepptrigger){
        logger.info("hit /xml/com.genologics.ri.stepconfiguration.EppTrigger");
        return marshal(stepconfigurationepptrigger.getClass(), stepconfigurationepptrigger);
    }

    @PostMapping("/xml/com.genologics.ri.stepconfiguration.Field")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.Field stepconfigurationfield){
        logger.info("hit /xml/com.genologics.ri.stepconfiguration.Field");
        return marshal(stepconfigurationfield.getClass(), stepconfigurationfield);
    }

    @PostMapping("/xml/com.genologics.ri.stepconfiguration.File")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.File stepconfigurationfile){
        logger.info("hit /xml/com.genologics.ri.stepconfiguration.File");
        return marshal(stepconfigurationfile.getClass(), stepconfigurationfile);
    }

    @PostMapping("/xml/com.genologics.ri.stepconfiguration.GenericTypeLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.GenericTypeLink stepconfigurationgenerictypelink){
        logger.info("hit /xml/com.genologics.ri.stepconfiguration.GenericTypeLink");
        return marshal(stepconfigurationgenerictypelink.getClass(), stepconfigurationgenerictypelink);
    }

    @PostMapping("/xml/com.genologics.ri.stepconfiguration.Icebucketfield")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.Icebucketfield stepconfigurationicebucketfield){
        logger.info("hit /xml/com.genologics.ri.stepconfiguration.Icebucketfield");
        return marshal(stepconfigurationicebucketfield.getClass(), stepconfigurationicebucketfield);
    }

    @PostMapping("/xml/com.genologics.ri.stepconfiguration.LockableSetting")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.LockableSetting stepconfigurationlockablesetting){
        logger.info("hit /xml/com.genologics.ri.stepconfiguration.LockableSetting");
        return marshal(stepconfigurationlockablesetting.getClass(), stepconfigurationlockablesetting);
    }

    @PostMapping("/xml/com.genologics.ri.stepconfiguration.NextStep")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.NextStep stepconfigurationnextstep){
        logger.info("hit /xml/com.genologics.ri.stepconfiguration.NextStep");
        return marshal(stepconfigurationnextstep.getClass(), stepconfigurationnextstep);
    }

    @PostMapping("/xml/com.genologics.ri.stepconfiguration.ProcessType")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.ProcessType stepconfigurationprocesstype){
        logger.info("hit /xml/com.genologics.ri.stepconfiguration.ProcessType");
        return marshal(stepconfigurationprocesstype.getClass(), stepconfigurationprocesstype);
    }

    @PostMapping("/xml/com.genologics.ri.stepconfiguration.Queuefield")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.Queuefield stepconfigurationqueuefield){
        logger.info("hit /xml/com.genologics.ri.stepconfiguration.Queuefield");
        return marshal(stepconfigurationqueuefield.getClass(), stepconfigurationqueuefield);
    }

    @PostMapping("/xml/com.genologics.ri.stepconfiguration.ReagentKitLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.ReagentKitLink stepconfigurationreagentkitlink){
        logger.info("hit /xml/com.genologics.ri.stepconfiguration.ReagentKitLink");
        return marshal(stepconfigurationreagentkitlink.getClass(), stepconfigurationreagentkitlink);
    }

    @PostMapping("/xml/com.genologics.ri.stepconfiguration.Step")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.Step stepconfigurationstep){
        logger.info("hit /xml/com.genologics.ri.stepconfiguration.Step");
        return marshal(stepconfigurationstep.getClass(), stepconfigurationstep);
    }

    @PostMapping("/xml/com.genologics.ri.stepconfiguration.Step.EppTriggers")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.Step.EppTriggers stepconfigurationstepepptriggers){
        logger.info("hit /xml/com.genologics.ri.stepconfiguration.Step.EppTriggers");
        return marshal(stepconfigurationstepepptriggers.getClass(), stepconfigurationstepepptriggers);
    }

    @PostMapping("/xml/com.genologics.ri.stepconfiguration.Step.IceBucketFields")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.Step.IceBucketFields stepconfigurationstepicebucketfields){
        logger.info("hit /xml/com.genologics.ri.stepconfiguration.Step.IceBucketFields");
        return marshal(stepconfigurationstepicebucketfields.getClass(), stepconfigurationstepicebucketfields);
    }

    @PostMapping("/xml/com.genologics.ri.stepconfiguration.Step.PermittedContainers")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.Step.PermittedContainers stepconfigurationsteppermittedcontainers){
        logger.info("hit /xml/com.genologics.ri.stepconfiguration.Step.PermittedContainers");
        return marshal(stepconfigurationsteppermittedcontainers.getClass(), stepconfigurationsteppermittedcontainers);
    }

    @PostMapping("/xml/com.genologics.ri.stepconfiguration.Step.PermittedControlTypes")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.Step.PermittedControlTypes stepconfigurationsteppermittedcontroltypes){
        logger.info("hit /xml/com.genologics.ri.stepconfiguration.Step.PermittedControlTypes");
        return marshal(stepconfigurationsteppermittedcontroltypes.getClass(), stepconfigurationsteppermittedcontroltypes);
    }

    @PostMapping("/xml/com.genologics.ri.stepconfiguration.Step.PermittedInstrumentTypes")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.Step.PermittedInstrumentTypes stepconfigurationsteppermittedinstrumenttypes){
        logger.info("hit /xml/com.genologics.ri.stepconfiguration.Step.PermittedInstrumentTypes");
        return marshal(stepconfigurationsteppermittedinstrumenttypes.getClass(), stepconfigurationsteppermittedinstrumenttypes);
    }

    @PostMapping("/xml/com.genologics.ri.stepconfiguration.Step.PermittedReagentCategories")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.Step.PermittedReagentCategories stepconfigurationsteppermittedreagentcategories){
        logger.info("hit /xml/com.genologics.ri.stepconfiguration.Step.PermittedReagentCategories");
        return marshal(stepconfigurationsteppermittedreagentcategories.getClass(), stepconfigurationsteppermittedreagentcategories);
    }

    @PostMapping("/xml/com.genologics.ri.stepconfiguration.Step.QueueFields")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.Step.QueueFields stepconfigurationstepqueuefields){
        logger.info("hit /xml/com.genologics.ri.stepconfiguration.Step.QueueFields");
        return marshal(stepconfigurationstepqueuefields.getClass(), stepconfigurationstepqueuefields);
    }

    @PostMapping("/xml/com.genologics.ri.stepconfiguration.Step.RequiredReagentKits")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.Step.RequiredReagentKits stepconfigurationsteprequiredreagentkits){
        logger.info("hit /xml/com.genologics.ri.stepconfiguration.Step.RequiredReagentKits");
        return marshal(stepconfigurationsteprequiredreagentkits.getClass(), stepconfigurationsteprequiredreagentkits);
    }

    @PostMapping("/xml/com.genologics.ri.stepconfiguration.Step.SampleFields")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.Step.SampleFields stepconfigurationstepsamplefields){
        logger.info("hit /xml/com.genologics.ri.stepconfiguration.Step.SampleFields");
        return marshal(stepconfigurationstepsamplefields.getClass(), stepconfigurationstepsamplefields);
    }

    @PostMapping("/xml/com.genologics.ri.stepconfiguration.Step.StepFields")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.Step.StepFields stepconfigurationstepstepfields){
        logger.info("hit /xml/com.genologics.ri.stepconfiguration.Step.StepFields");
        return marshal(stepconfigurationstepstepfields.getClass(), stepconfigurationstepstepfields);
    }

    @PostMapping("/xml/com.genologics.ri.stepconfiguration.Step.StepProperties")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.Step.StepProperties stepconfigurationstepstepproperties){
        logger.info("hit /xml/com.genologics.ri.stepconfiguration.Step.StepProperties");
        return marshal(stepconfigurationstepstepproperties.getClass(), stepconfigurationstepstepproperties);
    }

    @PostMapping("/xml/com.genologics.ri.stepconfiguration.Step.Transitions")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.Step.Transitions stepconfigurationsteptransitions){
        logger.info("hit /xml/com.genologics.ri.stepconfiguration.Step.Transitions");
        return marshal(stepconfigurationsteptransitions.getClass(), stepconfigurationsteptransitions);
    }

    @PostMapping("/xml/com.genologics.ri.stepconfiguration.StepProperty")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.StepProperty stepconfigurationstepproperty){
        logger.info("hit /xml/com.genologics.ri.stepconfiguration.StepProperty");
        return marshal(stepconfigurationstepproperty.getClass(), stepconfigurationstepproperty);
    }

    @PostMapping("/xml/com.genologics.ri.stepconfiguration.StepSetup")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.StepSetup stepconfigurationstepsetup){
        logger.info("hit /xml/com.genologics.ri.stepconfiguration.StepSetup");
        return marshal(stepconfigurationstepsetup.getClass(), stepconfigurationstepsetup);
    }

    @PostMapping("/xml/com.genologics.ri.stepconfiguration.StepSetup.Files")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.stepconfiguration.StepSetup.Files stepconfigurationstepsetupfiles){
        logger.info("hit /xml/com.genologics.ri.stepconfiguration.StepSetup.Files");
        return marshal(stepconfigurationstepsetupfiles.getClass(), stepconfigurationstepsetupfiles);
    }

    @PostMapping("/xml/com.genologics.ri.userdefined.Field")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.userdefined.Field userdefinedfield){
        logger.info("hit /xml/com.genologics.ri.userdefined.Field");
        return marshal(userdefinedfield.getClass(), userdefinedfield);
    }

    @PostMapping("/xml/com.genologics.ri.userdefined.Type")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.userdefined.Type userdefinedtype){
        logger.info("hit /xml/com.genologics.ri.userdefined.Type");
        return marshal(userdefinedtype.getClass(), userdefinedtype);
    }

    @PostMapping("/xml/com.genologics.ri.version.Version")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.version.Version versionversion){
        logger.info("hit /xml/com.genologics.ri.version.Version");
        return marshal(versionversion.getClass(), versionversion);
    }

    @PostMapping("/xml/com.genologics.ri.version.Versions")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.version.Versions versionversions){
        logger.info("hit /xml/com.genologics.ri.version.Versions");
        return marshal(versionversions.getClass(), versionversions);
    }

    @PostMapping("/xml/com.genologics.ri.workflowconfiguration.ProtocolLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.workflowconfiguration.ProtocolLink workflowconfigurationprotocollink){
        logger.info("hit /xml/com.genologics.ri.workflowconfiguration.ProtocolLink");
        return marshal(workflowconfigurationprotocollink.getClass(), workflowconfigurationprotocollink);
    }

    @PostMapping("/xml/com.genologics.ri.workflowconfiguration.StageLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.workflowconfiguration.StageLink workflowconfigurationstagelink){
        logger.info("hit /xml/com.genologics.ri.workflowconfiguration.StageLink");
        return marshal(workflowconfigurationstagelink.getClass(), workflowconfigurationstagelink);
    }

    @PostMapping("/xml/com.genologics.ri.workflowconfiguration.Workflow")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.workflowconfiguration.Workflow workflowconfigurationworkflow){
        logger.info("hit /xml/com.genologics.ri.workflowconfiguration.Workflow");
        return marshal(workflowconfigurationworkflow.getClass(), workflowconfigurationworkflow);
    }

    @PostMapping("/xml/com.genologics.ri.workflowconfiguration.Workflow.Protocols")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.workflowconfiguration.Workflow.Protocols workflowconfigurationworkflowprotocols){
        logger.info("hit /xml/com.genologics.ri.workflowconfiguration.Workflow.Protocols");
        return marshal(workflowconfigurationworkflowprotocols.getClass(), workflowconfigurationworkflowprotocols);
    }

    @PostMapping("/xml/com.genologics.ri.workflowconfiguration.Workflow.Stages")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.workflowconfiguration.Workflow.Stages workflowconfigurationworkflowstages){
        logger.info("hit /xml/com.genologics.ri.workflowconfiguration.Workflow.Stages");
        return marshal(workflowconfigurationworkflowstages.getClass(), workflowconfigurationworkflowstages);
    }

    @PostMapping("/xml/com.genologics.ri.workflowconfiguration.WorkflowLink")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.workflowconfiguration.WorkflowLink workflowconfigurationworkflowlink){
        logger.info("hit /xml/com.genologics.ri.workflowconfiguration.WorkflowLink");
        return marshal(workflowconfigurationworkflowlink.getClass(), workflowconfigurationworkflowlink);
    }

    @PostMapping("/xml/com.genologics.ri.workflowconfiguration.Workflows")
    ResponseEntity<String> xmlToJsonSample(@RequestBody com.genologics.ri.workflowconfiguration.Workflows workflowconfigurationworkflows){
        logger.info("hit /xml/com.genologics.ri.workflowconfiguration.Workflows");
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