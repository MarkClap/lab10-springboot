package com.tecsup.petclinic.entities;
import jakarta.persistence.*;
import lombok.Data;

/**
 *
 * @author Deivid Laura
 *
 */
@Entity(name = "owners")
@Data
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String first_name;
    private String last_name;
    private String address;
    private String city;
    private Integer telephone;

    public Owner(String firstName, String lastName, String address, String city, Integer telephone) {

    }

    public Owner(Integer id, String first_name, String last_name, String address, String city, Integer telephone) {
        super();
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.city = city;
        this.telephone = telephone;
    }


    public Owner() {

    }
}
