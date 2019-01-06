package com.em.azure.demo.azuredemo.entity;

import javax.persistence.*;


@Entity
@Table(name="empdir")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column
    private String name;


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

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
