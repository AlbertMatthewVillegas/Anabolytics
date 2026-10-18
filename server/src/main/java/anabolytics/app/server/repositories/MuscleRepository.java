package anabolytics.app.server.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import anabolytics.app.server.entities.MuscleEntity;

public interface MuscleRepository extends JpaRepository<MuscleEntity, UUID> {
}
