package com.company;

public abstract class CoffeeMachine {
    private int coffee;
    private int coffee_can;
    private int water;
    private int water_can;
    private int coffe_box;
    private int coffe_box_can;
    private boolean work;

    public CoffeeMachine(int coffee_can, int water_can, int coffe_box_can, int coffee, int water, int coffe_box) {
        this.coffee_can = coffee_can;
        this.water_can = water_can;
        this.coffe_box_can = coffe_box_can;
        this.water = water;
        this.coffee = coffee;
        this.coffe_box = 0;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getCoffee() {
        return coffee;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    public int getCoffee_can() {
        return coffee_can;
    }

    public void setCoffee_can(int coffee_can) {
        this.coffee_can = coffee_can;
    }

    public int getWater_can() {
        return water_can;
    }

    public void setWater_can(int water_can) {
        this.water_can = water_can;
    }

    public int getCoffe_box() {
        return coffe_box;
    }

    public void setCoffe_box(int coffe_box) {
        this.coffe_box = coffe_box;
    }

    public int getCoffe_box_can() {
        return coffe_box_can;
    }

    public void setCoffe_box_can(int coffe_box_can) {
        this.coffe_box_can = coffe_box_can;
    }

    public boolean isWork() {
        return work;
    }

    public void setWork(boolean work) {
        this.work = work;
    }

    public void turn_in() {
        this.work = true;
    }

    public void turn_out() {
        this.work = false;
    }

    public void clean_coffe_box() {
        this.coffe_box = 0;
    }

    @Override
    public String toString() {
        return "Кофемашина содержит: " +
                "Вода =" + water +
                ", Кофе: " + coffee +
                ", Отработанный кофе: " + coffe_box +
                ", Емкость воды: " + water_can +
                ", Емкость кофе: " + coffee_can +
                ", Емкость отработанного кофе: " + coffe_box_can +
                ", Состояние =" + work +
                '}';
    }
}
