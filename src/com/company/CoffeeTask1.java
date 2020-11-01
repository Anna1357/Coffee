package com.company;

public class CoffeeTask1 extends CoffeeMachine {

    public CoffeeTask1(int coffee_can, int water_can, int coffe_box_can, int coffee, int water, int coffe_box) {
        super( coffee_can, water_can, coffe_box_can, coffee, water, coffe_box );
    }
    public void Expreso(){
        if(isWork()==true){
            if(getWater()>=30 && getCoffee()>=22 && getCoffe_box()+22<getCoffe_box_can())
            {
                setWater( getWater()-30);
                setCoffee( getCoffee()-22 );
                setCoffe_box( getCoffe_box()+22 );
                System.out.println("Ваш еспрессо готов :)");
            }
            else
            {
                if(getWater()<30){
                    System.out.println("Недостаточно воды в кофемашине.");
            }
                if(getCoffee()<22){
                    System.out.println("Недостаточно кофе в кофемашине.");
                }
                if(getCoffe_box()+22>getCoffe_box_can()){
                    System.out.println("Бак отходного кофе переполнен");
                }
            }
        }
        else {
            System.out.println("Кофемашина выключена");
        }
    }
    public void Americano(){
        if(isWork()==true){
            if(getWater()>=100 && getCoffee()>=22 && getCoffe_box()+22<getCoffe_box_can())
            {
                setWater( getWater()-100);
                setCoffee( getCoffee()-22 );
                setCoffe_box( getCoffe_box()+22 );
                System.out.println("Ваш американо готов :)");
            }
            else
            {
                if(getWater()<100){
                    System.out.println("Недостаточно воды в кофемашине.");
                }
                if(getCoffee()<22){
                    System.out.println("Недостаточно кофе в кофемашине.");
                }
                if(getCoffe_box()+22>getCoffe_box_can()){
                    System.out.println("Бак отходного кофе переполнен");
                }
            }
        }
        else {
            System.out.println("Кофемашина выключена");
        }
    }

}
