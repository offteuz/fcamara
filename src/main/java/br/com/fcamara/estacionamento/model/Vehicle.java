package br.com.fcamara.estacionamento.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity(name = "VEHICLE")
public class Vehicle {

    @Id
    @SequenceGenerator(name = "seq_vehicle", sequenceName = "seq_vehicle", allocationSize = 1)
    @GeneratedValue(generator = "seq_vehicle", strategy = GenerationType.SEQUENCE)
    private Long id;

    private String mark;

    private String model;

    private String color;

    private String plate;

    private String type;

    @ManyToOne
    @JoinColumn(name = "establishment_id", referencedColumnName = "id")
    @JsonIgnore
    private Establishment establishment;
}
