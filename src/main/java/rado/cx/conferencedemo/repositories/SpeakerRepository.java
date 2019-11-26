package rado.cx.conferencedemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rado.cx.conferencedemo.models.Speaker;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
