package pwr.dpkz.joinclass.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pwr.dpkz.joinclass.domain.model.Assignment;

import java.util.List;
import java.util.UUID;

public interface AssignmentRepository extends JpaRepository<Assignment, UUID> {
    List<Assignment> findByRoomId(UUID roomId);
}
