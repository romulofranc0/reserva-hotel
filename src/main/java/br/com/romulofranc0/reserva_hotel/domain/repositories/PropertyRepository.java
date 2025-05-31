package br.com.romulofranc0.reserva_hotel.domain.repositories;

import br.com.romulofranc0.reserva_hotel.domain.entities.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property, Long> {
}
