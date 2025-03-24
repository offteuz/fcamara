package br.com.fcamara.estacionamento.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Embeddable
public class Address {

    @Column(name = "postal_code")
    private String postalCode;

    private String street;

    private String number;

    private String neighborhood;

    private String city;

    private String state;

    private String country;
}
