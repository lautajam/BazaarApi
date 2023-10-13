package com.lautajam.BazaarAPI.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * Class representing the client model of the application
 */
@Getter @Setter
@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    long client_id;
    String client_name;
    String client_surname;
    String client_dni;

    /**
     * Empty constructor for the client model
     */
    public Client() {
    }

    /**
     * Constructor for the client model
     * @param client_id The id of the client
     * @param client_name The client_name of the client
     * @param client_surname The client_surname of the client
     * @param client_dni The client_dni of the client
     */
    public Client(long client_id, String client_name, String client_surname, String client_dni) {
        this.client_id = client_id;
        this.client_name = client_name;
        this.client_surname = client_surname;
        this.client_dni = client_dni;
    }
}