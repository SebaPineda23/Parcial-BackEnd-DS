package com.Api.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Persona extends Base{

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "dni")
    private int dni;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_domicilio")
    private Domicilio domicilio;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(name = "persona_libro",
            joinColumns = @JoinColumn(name = "fk_persona"),
            inverseJoinColumns = @JoinColumn(name = "fk_libro"))
    private List<Libro> libros = new ArrayList<Libro>();




}