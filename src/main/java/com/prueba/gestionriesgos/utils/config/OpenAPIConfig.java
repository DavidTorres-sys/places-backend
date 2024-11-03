package com.prueba.gestionriesgos.utils.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * Configuration class for OpenAPI documentation of the Places API.
 * This class defines a method to configure OpenAPI documentation for the API endpoints.
 */
@Configuration
public class OpenAPIConfig {

    @Value("${backend-api.openapi.dev-url}")
    private String devUrl;

    @Bean
    public OpenAPI myOpenAPI() {
        Server devServer = new Server();
        devServer.setUrl(devUrl);
        devServer.setDescription("Server URL in Development environment");

        Contact contact = new Contact();
        contact.setEmail("davidesteban1863@gmail.com");
        contact.setName("Places API Support");
        contact.setUrl("https://www.places.com");

        License mitLicense = new License().name("MIT License").url("https://places.com/licenses/mit/");

        Info info = new Info()
                .title("Places API")
                .version("1.0")
                .contact(contact)
                .description("This API expose the endpoints for places.").termsOfService("https://www.places.com/terms")
                .license(mitLicense);

        return new OpenAPI().info(info).servers(List.of(devServer));
    }
}
