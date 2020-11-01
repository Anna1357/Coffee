package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner( System.in );
	CoffeeTask1 Philips=new CoffeeTask1( 200,300,500,40,120,0 );
	CoffeeTask2 Philips2=new CoffeeTask2( 200,300,500,40,120,0,100,700 );
	CoffeeTask3 Philips3=new CoffeeTask3( 200,200,300,4,400,400,40,100,10,1000 );
	Philips.turn_in();
	Philips.Expreso();
        Philips.Expreso();
        Philips2.turn_in();
        Philips2.Capuchino();
        Philips3.turn_in();
        Philips3.AmericanoWithCoffeeMol();
    }
}
