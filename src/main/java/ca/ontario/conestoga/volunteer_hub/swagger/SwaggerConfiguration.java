package ca.ontario.conestoga.volunteer_hub.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
public class SwaggerConfiguration {
  @Profile("dev")
  @Bean
  public OpenAPI openAPIDev() {
    Server server = new Server();
    server.setUrl("http://localhost:8080");
    server.setDescription("Production server");

    return new OpenAPI()
        .info(this.getApiInfo())
        .servers(List.of(server));
  }

  @Profile("prod")
  @Bean
  public OpenAPI openAPIProd() {
    Server server = new Server();
    server.setUrl("https://volunteer-hub-exnzolcstq-uc.a.run.app");
    server.setDescription("Production server");

    return new OpenAPI()
        .info(this.getApiInfo())
        .servers(List.of(server));
  }

  private Info getApiInfo() {
    return new Info()
              .title("Volunteer API Document")
              .description("")
              .contact(new Contact().name("Shaowen He").url("https://github.com/andsw/VolunteerHub").email("she7744@conestogac.on.ca"))
              .license(new License())
              .summary("")
              .termsOfService("")
              .version("1.0");
  }
}