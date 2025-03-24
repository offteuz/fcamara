package br.com.fcamara.estacionamento.repository;

import br.com.fcamara.estacionamento.model.Establishment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstablishmentRepository extends JpaRepository<Establishment, Long> {
}
