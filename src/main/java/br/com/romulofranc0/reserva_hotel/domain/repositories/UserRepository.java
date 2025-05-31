package br.com.romulofranc0.reserva_hotel.domain.repositories;

import br.com.romulofranc0.reserva_hotel.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
