package nl.jda.backend.Service;

import lombok.RequiredArgsConstructor;
import nl.jda.backend.Model.User;
import nl.jda.backend.Repo.UserRepository;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public List<User> getAllUsers(){
        List<User> users = new ArrayList<>();
        return users;
    }
}
