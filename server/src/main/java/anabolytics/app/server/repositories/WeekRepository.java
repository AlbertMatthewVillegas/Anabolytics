package anabolytics.app.server.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import anabolytics.app.server.entities.WeekEntity;

public interface WeekRepository extends JpaRepository<WeekEntity, UUID> {
}
