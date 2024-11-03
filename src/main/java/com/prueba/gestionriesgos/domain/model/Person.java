package com.prueba.gestionriesgos.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * Represents a Person.
 * This class is mapped to the "Person" table in the database.
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "person")
public class Person {

    /**
     * The unique identifier for the curb.
     * It is auto-generated by the database and serves as the primary key of the "person" table.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    private Integer personId;

    /**
     * The last name of the person.
     */
    @NonNull
    @Column(name = "last_name", nullable = false, length = 50)
    private String firstName;

    /**
     * The age of the person.
     */
    @NonNull
    @Column(name = "age", nullable = false)
    private Integer age;

    /**
     * The occupation of the person.
     */
    @NonNull
    @Column(name = "occupation", nullable = false, length = 50)
    private String occupation;
}