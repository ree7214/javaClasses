package com.class31;
//Task4
public class Car {
    
    double carPrice;
    String color;
    
    Car(double carPrice,String color){
        this.carPrice=carPrice;
        this.color=color;
    }
    public void calculateSalePrice() {
        System.out.println(carPrice);
    }
}
class Truck extends Car{
    
    double weight;
    
    Truck(double carPrice,String color,double weight){
        super(carPrice, color);
        this.weight=weight;     
    }
    public void calculateSalePrice() {
        if (weight>2000) {
            carPrice=carPrice*0.9;  
        }else {
            carPrice=carPrice*0.8;
        }
        System.out.println(carPrice);
    }
}
class Sedan extends Car{
    
    double length;
    
    Sedan(double carPrice,String color,double length){
        super(carPrice, color);
        this.length=length;     
    }
        
    public void calculateSalePrice() {
        if (length>20) {
            carPrice=carPrice*0.95; 
        }else {
            carPrice=carPrice*0.9;
        }
        System.out.println(carPrice);
    }
}
