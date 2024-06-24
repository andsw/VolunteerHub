package ca.ontario.conestoga.volunteer_hub.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {
  @Bean
  public OpenAPI openAPI() {
    return new OpenAPI().info(this.getApiInfo());
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
