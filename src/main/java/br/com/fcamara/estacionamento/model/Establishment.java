package br.com.fcamara.estacionamento.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity(name = "ESTABLISHMENT")
public class Establishment {

    @Id
    @SequenceGenerator(name = "seq_establishment", sequenceName = "seq_establishment", allocationSize = 1)
    @GeneratedValue(generator = "seq_establishment", strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    private String cnpj;

    @Embedded
    private Address address;

    private String telephone;

    @Column(name = "motorcycle_vacancy")
    private int motorcycleVacancy;

    @Column(name = "car_vacancy")
    private int carVacancy;

    @OneToMany(mappedBy = "establishment")
    private Set<Vehicle> vehicles;
}
