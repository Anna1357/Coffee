package com.company;

public class CoffeeTask3 extends CoffeeTask2{
int coffee_mol;
int coffee_mol_can;
    public CoffeeTask3(int coffee_can, int water_can, int coffe_box_can, int coffee, int water, int coffe_box, int milk, int milk_can,int coffee_mol,int coffee_mol_can) {
        super( coffee_can, water_can, coffe_box_can, coffee, water, coffe_box, milk, milk_can );
        this.coffee_mol=coffee_mol;
        this.coffee_mol_can=coffee_mol_can;
    }
    public int getCoffee_mol() {
        return coffee_mol;
    }

    public void setCoffee_mol(int coffee_mol) {
        this.coffee_mol = coffee_mol;
    }
    public int getCoffee_mol_can() {
        return coffee_mol_can;
    }

    public void setCoffee_mol_can(int coffee_mol_can) {
        this.coffee_mol_can = coffee_mol_can;
    }
    @Override
    public void Americano() {
        super.Americano();
    }

    @Override
    public void Late() {
        super.Late();
    }
    public void AmericanoWithCoffeeMol(){
        if(isWork()==true) {
            if(getWater()>=100 && ((getCoffee()>=22 &&  getCoffe_box()+22<getCoffe_box_can() )|| getCoffee_mol()>=22))
            {
                if(getCoffee_mol()>=22)
                {
                    setCoffee_mol( getCoffee_mol()-22 );
                }
                else{
                    setCoffee_mol( getCoffee_mol()+22 );
                    setCoffee( getCoffee()-22 );
                    setCoffe_box( getCoffe_box()+22 );
                }
                setWater( getWater()-100);
                System.out.println("Ваш американо готов :)");

            }
            else
            {
                if(getWater()<100){
                    System.out.println("Недостаточно воды в кофемашине.");
                }
                if(getCoffee()<22 && getCoffee_mol()<22){
                    System.out.println("Недостаточно кофе в кофемашине.");
                }
                if(getCoffe_box()+22>getCoffe_box_can() && getCoffee()>=22){
                    System.out.println("Бак отходного кофе переполнен");
                }
            }
        }
    }
    public void LateWithCoffeeMol(){
        if(isWork()==true) {

            System.out.println("Введите количество молока для порции латте:");
            int need_milk = scanner.nextInt();
            if(getWater()>=30 && ((getCoffee()>=22 &&  getCoffe_box()+22<getCoffe_box_can() )|| getCoffee_mol()>=22) && getMilk()>=need_milk)
            {
                if(getCoffee_mol()>=22)
                {
                    setCoffee_mol( getCoffee_mol()-22 );
                }
                else{
                    setCoffee_mol( getCoffee_mol()+22 );
                    setCoffee( getCoffee()-22 );
                    setCoffe_box( getCoffe_box()+22 );
                }
                setWater( getWater()-30);
                setMilk( getMilk()-need_milk );
                System.out.println("Ваш лате готов :)");
            }
            else
            {
                if(getWater()<30){
                    System.out.println("Недостаточно воды в кофемашине.");
                }
                if(getCoffee()<22 && getCoffee_mol()<22){
                    System.out.println("Недостаточно кофе в кофемашине.");
                }
                if(getCoffe_box()+22>getCoffe_box_can() && getCoffee()>=22){
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
                ", Молотого кофе: " + getCoffee_can() +
                ", Емкость молотого кофе: " + getCoffe_box_can() +
                ", Состояние =" + isWork() +
                '}';
    }
}
