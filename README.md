# perspicuity

This project is meant to jumping-off point into working with [Illumina's ClarityLIMS](https://support-docs.illumina.com/SW/ClarityLIMS/ClarityAPI/Content/SW/ClarityLIMS/API/Menu/Overview_swCL.htm) when using Spring Boot (or Java in general). It provides a means to convert all of the ClarityLIMS API's datatypes to Java objects to be manipulated, then back to XML payloads to hit API endpoints.

This project is compatible up to Java 8. This is mostly due to [JAXB's compatibility issues past Java 8](https://www.jesperdj.com/2018/09/30/jaxb-on-java-9-10-11-and-beyond/). I may update the project to raise the highest Java version to a more recent version in the future.

### It comes packaged with 

1. The Clarity API's datatype schema files
2. A custom NamepaceMapper for JAXB to convert the schemas to POJOs
3. A separate one-file turn-key Java application that will <b>auto-generate</b> two Controllers, "JsonController" and "XmlController", so you can start unmarshalling/marshalling <b>all</b> Clarity payloads right away
4. Unit tests with example XML endpoint payloads

## Overview

Some of the objectives here are 

1. Complete and total coverage of the API
2. Being lightweight
3. Future-proof (in the event of new types, altered schemas, etc.)

Therefore, reflection and generic methods are used for marshalling/unmarshalling. Since reflection is generally not ideal for production purposes, the project can easily be regarded as "tooling" for a larger project involving Clarity LIMS.

a 4th, lesser objective was to not have the project married to ClarityLIMS, but instead have it work out-of-the-box for another set of .xsd files. So, care was taken not to hard-code ClarityLIMS-specific literals or type names. With some changes to application.properties and changing the templates in ControllerGenerator.java, one could have a very robust jumping-off point for a different platform entirely.

## Getting Started
Clone the repo and go!

1. Make sure your project is set-up with a Java 8 JDK
2. Run
```
mvn clean package -Dmaven.test.skip=true
```
this will also run the JAXB xjc Maven goal, which will generate .java files for each ClarityLIMS datatype (it will read all of the .xsd files in .../xsd)

3. Run ControllerGenerator.java to generate JsonController.java and XmlController.java in src/main/java/com/perspicuity/controller
