package com.yearup.ANT_POS_PROTOTYPE_BACKEND.model;


import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;


@Entity
@Table(name = "category")
@JsonPropertyOrder({
        "categoryId",
        "category_name"
})
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_name")
    private String name;

    public Category(){

    }

    public Category(String category_name) {
        this.name = category_name;
    }

    public String getCategory_name() {
        return name;
    }

    public void setCategory_name(String category_name) {
        this.name = category_name;
    }
}
