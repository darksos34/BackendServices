package nl.jda.backend.configuration;

import nl.jda.backend.Repo.UserRepository;
import nl.jda.backend.Service.UserService;

public class UserServiceImpl extends UserService {
    public UserServiceImpl(UserRepository userRepository) {
        super(userRepository);
    }
}
