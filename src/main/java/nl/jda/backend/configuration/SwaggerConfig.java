package nl.jda.backend.configuration;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;

@Configuration
@RequiredArgsConstructor
public class SwaggerConfig {
    private final ApiConfiguration apiConfiguration;

    @Bean
    public OpenAPI openAPI(){
        return new OpenAPI()
                .info(getInfo());
    }

    private Info getInfo(){
        return new Info().title(apiConfiguration.getTitle())
                .description(apiConfiguration.getDescription())
                .version(apiConfiguration.getVersion());
    }
}
