package com.example.demo.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity(name="products")
public class ProductEntity implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    @Column(length=50, nullable = false)
    private String productId;

    @Column(length=50, nullable = false, unique = true)
    private String name;

    @Column(length=50, nullable = false)
    private int cost;

    @Column(length=120, nullable = false)
    private String category;


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

}
