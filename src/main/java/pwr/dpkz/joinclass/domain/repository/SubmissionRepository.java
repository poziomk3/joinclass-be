package pwr.dpkz.joinclass.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pwr.dpkz.joinclass.domain.model.Submission;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface SubmissionRepository extends JpaRepository<Submission, UUID> {
    List<Submission> findByAssignmentId(UUID assignmentId);

    List<Submission> findByAuthorId(UUID authorId);

    Optional<Submission> findTopByAssignmentIdAndAuthorIdOrderBySubmittedAtDesc(UUID assignmentId, UUID authorId);
}
