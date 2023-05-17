package com.perspicuity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class PerspicuityDemoApplication {

    //TODO AOP logging
    //TODO should services have static methods?

    public static void main(String[] args) {
        SpringApplication.run(PerspicuityDemoApplication.class, args);
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public NamespaceMapper singletonBean(@Value("${clarityPackage}") String clarityPackage,
                                         @Value("${clarityPackageRoot}") String clarityPackageRoot,
                                         @Value("${clarityUri}") String clarityUri,
                                         @Value("${schemaDirectory}") String schemaDirectory) {
        return new NamespaceMapper(clarityPackage, clarityPackageRoot, clarityUri, schemaDirectory);
    }

}


