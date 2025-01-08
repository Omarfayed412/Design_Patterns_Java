/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CreationalDP.AbstractFactory;

/**
 *
 * @author Omar Fayed
 */
public class Client {
    public static void main(String[] args) {
        ICarFactory af = new AmericanFactory();
        ICar car1 = af.createCar();
        ISpecs spec1 = af.createSpecs();
        
        car1.assemble();
        spec1.display();
       
        
        ICarFactory ef = new EuropeanFactory();
        ICar car2 = ef.createCar();
        ISpecs spec2 = af.createSpecs();
        
        car2.assemble();
        spec2.display();

    }
}
