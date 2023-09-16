package nl.jda.backend.configuration;

import nl.jda.backend.Repo.UserRepository;
import nl.jda.backend.Service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "nl.jda.backend.Repo")
public class JpaConfig {
    private final UserRepository userRepository;

    public JpaConfig(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Bean("userService")
    public UserService userService(){
        return new UserServiceImpl(userRepository);
    }
}
