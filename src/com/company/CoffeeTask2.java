package com.company;

import java.util.Scanner;

public class CoffeeTask2 extends CoffeeTask1{
    int milk;
    int milk_can;
    Scanner scanner=new Scanner( System.in );
    public CoffeeTask2(int coffee_can, int water_can, int coffe_box_can, int coffee, int water, int coffe_box) {
        super( coffee_can, water_can, coffe_box_can, coffee, water, coffe_box );
    }
    public CoffeeTask2(int coffee_can, int water_can, int coffe_box_can, int coffee, int water, int coffe_box,int milk,int milk_can){
        super( coffee_can, water_can, coffe_box_can, coffee, water, coffe_box );
        this.milk=milk;
        this.milk_can=milk_can;
    }
    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }
    public int getMilk_can() {
        return milk_can;
    }

    public void setMilk_can(int milk_can) {
        this.milk_can = milk_can;
    }
    public void Late(){
        if(isWork()==true) {

            System.out.println("Введите количество молока для порции латте:");
            int need_milk = scanner.nextInt();
            if(getWater()>=30 && getCoffee()>=22 && getCoffe_box()+22<getCoffe_box_can() && getMilk()>=need_milk)
            {
                setWater( getWater()-30);
                setCoffee( getCoffee()-22 );
                setCoffe_box( getCoffe_box()+22 );
                setMilk( getMilk()-need_milk );
                System.out.println("Ваш лате готов :)");
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
                if(getMilk()<need_milk){
                    System.out.println("Недостаточно молока в кофемашине");
                }
            }
        }
        else {
            System.out.println("Кофемашина выключена");
        }
    }
    public void Capuchino(){
        if(isWork()==true) {

            System.out.println("Введите количество молока для порции капучино:");
            int need_milk = scanner.nextInt();
            if(getWater()>=30 && getCoffee()>=22 && getCoffe_box()+22<getCoffe_box_can() && getMilk()>=need_milk)
            {
                setWater( getWater()-30);
                setCoffee( getCoffee()-22 );
                setCoffe_box( getCoffe_box()+22 );
                setMilk( getMilk()-need_milk );
                System.out.println("Ваш капучино готов :)");
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
                if(getMilk()<need_milk){
                    System.out.println("Недостаточно молока в кофемашине");
                }
            }
        }
        else {
            System.out.println("Кофемашина выключена");
        }
    }
    @Override
    public String toString() {
        return "Кофемашина содержит: " +
                "Вода =" + getWater() +
                ", Кофе: " + getCoffee() +
                ", Молоко: " + getMilk() +
                ", Емкость для молока: " + getMilk_can() +
                ", Отработанный кофе: " + getCoffe_box() +
                ", Емкость воды: " + getWater_can() +
                ", Емкость кофе: " + getCoffee_can() +
                ", Емкость отработанного кофе: " + getCoffe_box_can() +
                ", Состояние =" + isWork() +
                '}';
    }
}
