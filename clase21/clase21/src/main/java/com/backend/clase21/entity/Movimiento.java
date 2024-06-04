package com.backend.clase21.entity;

import javax.persistence.*;

@Entity
@Table(name = "Movimientos")
public class Movimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MOVIMIENTO_ID")
    private Long id;

    @Column(length = 100, nullable = false)
    private String descripcion;

    private Double monto;

    public Movimiento() {
    }

    public Movimiento(Long id, String descripcion, Double monto) {
        this.id = id;
        this.descripcion = descripcion;
        this.monto = monto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }
}
