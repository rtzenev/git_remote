package rado.cx.conferencedemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rado.cx.conferencedemo.models.Session;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
