/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.car_booking_system.Model;

/**
 *
 * @author Admin
 */
public class Location {
    
    private String adressPickUpCar;
    private  String adressReturnCar;
    private String currentLocationCar;
    
    public Location(){
        
    }
    
    public String getAdressPickUpCar(){
        return adressPickUpCar;
    }
    
    public String getAdressReturnCar(){
        return adressReturnCar;
    }
    
    public String getCurrentLocationCar(){
        return currentLocationCar;
    }
    
    public void setAdressPickUpCar(String adressPickUpCar){
        this.adressPickUpCar = adressPickUpCar;
    }
    
    public void setAdressReturnCar(String adressReturnCar){
        this.adressReturnCar = adressReturnCar;
    }
    
    public void setCurrentLocationCar(String currentLocationCar){
        this.currentLocationCar = currentLocationCar;
    }
    
    
}
