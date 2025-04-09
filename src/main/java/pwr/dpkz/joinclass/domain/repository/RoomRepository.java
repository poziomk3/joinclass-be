package pwr.dpkz.joinclass.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pwr.dpkz.joinclass.domain.model.Room;

import java.util.List;
import java.util.UUID;

public interface RoomRepository extends JpaRepository<Room, UUID> {
    List<Room> findByOwnerId(UUID ownerId);
}
