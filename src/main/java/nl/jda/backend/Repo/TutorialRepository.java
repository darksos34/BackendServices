package nl.jda.backend.Repo;

import java.util.List;

import nl.jda.backend.Model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findTutorialsByTagsId(Long tagId);
    List<Tutorial> findByTitleContaining(String title);
    List<Tutorial> findByPublished(boolean b);
}
