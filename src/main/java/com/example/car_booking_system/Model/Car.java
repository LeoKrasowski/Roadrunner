/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.car_booking_system.Model;

/**
 *
 * @author Admin
 */
public class Car {
    private Long id;
    private String model;
    private String licensePlate;
    private TransmissionType transmission;
    private EngineType engine;
    private int seats;
    private ClassType carType;
    private boolean available = true;
    
    
    public Car(){
    }
    
    public Long getId(){
        return id;
    }
    
    public String getModel(){
        return model;
    }
    
    public String getLicensePlate(){
        return licensePlate;
    }
    
    public TransmissionType getTransmission(){
        return transmission;
    }
    
    public EngineType getEngine(){
        return engine;
    }
    
    public int getSeats(){
        return seats;
    }
    
    public ClassType getCarType(){
        return carType;
    }
    
    public boolean isAvailable(){
        return available;
    }
    
    
    public void setModel(String model){
        this.model = model;
    }
    
    public void setLincensePlate(String licensePlate){
        this.licensePlate = licensePlate;
    }
    
    public void setTransmission(TransmissionType transmission){
        this.transmission = transmission;
    }
    
    public void setEngine(EngineType engine){
        this.engine = engine;
    }
    
    public void setSeats(int seats){
        this.seats = seats;
    }
    
    public void setCarType(ClassType carType){
        this.carType = carType;
    }
    
    public void setAvailable(boolean available){
        this.available = available;
    }
}
