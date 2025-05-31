package br.com.romulofranc0.reserva_hotel.domain.repositories;

import br.com.romulofranc0.reserva_hotel.domain.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
