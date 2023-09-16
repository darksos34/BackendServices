package nl.jda.backend.Repo;


import nl.jda.backend.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {


}
