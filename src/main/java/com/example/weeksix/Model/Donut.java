package com.example.weeksix.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Donut {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    public Donut() {
    }

    public Donut( String name, boolean frosted, Type donutType) {
        this.name = name;
        this.frosted = frosted;
        DonutType = donutType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFrosted() {
        return frosted;
    }

    public void setFrosted(boolean frosted) {
        this.frosted = frosted;
    }

    public Type getDonutType() {
        return DonutType;
    }

    public void setDonutType(Type donutType) {
        DonutType = donutType;
    }

    private boolean frosted;
    private Type DonutType; // this is an enum variable, it will be either a YEAST or a CAKE as defined in my enums
}
