/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CreationalDP.AbstractFactory;

/**
 *
 * @author Omar Fayed
 */
//Concrete product A1
public class SedanCar implements ICar{

    @Override
    public void assemble() {
        System.out.println("Sedan car assembled");
    }
}
