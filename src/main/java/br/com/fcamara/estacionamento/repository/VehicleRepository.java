package br.com.fcamara.estacionamento.repository;

import br.com.fcamara.estacionamento.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
