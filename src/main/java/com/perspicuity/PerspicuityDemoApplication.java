
package com.perspicuity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

/**
 * @author Andrew Mingola
 */
@SpringBootApplication
public class PerspicuityDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PerspicuityDemoApplication.class, args);
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public NamespaceMapper singletonBean(@Value("${clarityPackageRoot}") String clarityPackageRoot,
                                         @Value("${clarityUri}") String clarityUri,
                                         @Value("${schemaDirectory}") String schemaDirectory) {
        return new NamespaceMapper(clarityPackageRoot, clarityUri, schemaDirectory);
    }

}


