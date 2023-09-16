
package nl.jda.backend.Controller;

import lombok.AllArgsConstructor;
import nl.jda.backend.Model.User;
import nl.jda.backend.Repo.UserRepository;
import nl.jda.backend.Service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:8080")
@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class UserController {
    private final UserService userService;
    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers(@RequestParam(required = false) String title) {

        return null;
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") long id) {

        return null;
    }

    @PostMapping("/user")
    public ResponseEntity<User> createUser(@RequestBody User tutorial) {

        return null;
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") long id, @RequestBody User tutorial) {

        return null;
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable("id") long id) {

        return null;
    }

    @DeleteMapping("/user")
    public ResponseEntity<HttpStatus> deleteAllUsers() {

        return null;
    }

    @GetMapping("/user/published")
    public ResponseEntity<List<User>> findByPublished() {

        return null;
    }

}
