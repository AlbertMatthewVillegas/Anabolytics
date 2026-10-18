package anabolytics.app.server.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import anabolytics.app.server.entities.SessionEntity;

public interface SessionRepository extends JpaRepository<SessionEntity, UUID> {
}
