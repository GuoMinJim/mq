package com.beiming.provider.domain;


import java.io.Serializable;

public class Car implements Serializable {

  private Integer id;

  private String name;

  private String brand;


  public Car() {
  }

  public Car(Integer id, String name, String brand) {
    this.id = id;
    this.name = name;
    this.brand = brand;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }
}
