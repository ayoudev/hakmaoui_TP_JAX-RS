package ma.emsi.jaxwebservices.config;

import ma.emsi.jaxwebservices.JaxWebservicesApplication;
import ma.emsi.jaxwebservices.controller.CompteController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Myconfig {

@Bean
    public ResourceConfig getResourceConfig() {
        ResourceConfig config = new ResourceConfig();
         config.register(CompteController.class);
        return config;
    }
}
