package br.com.romulofranc0.reserva_hotel.domain.entities;

import br.com.romulofranc0.reserva_hotel.domain.entities.enums.PropertyType;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    @Enumerated(EnumType.STRING)
    private PropertyType type;

    private float price;

    @OneToMany(mappedBy = "property")
    private List<Reservation> reservations;

}
