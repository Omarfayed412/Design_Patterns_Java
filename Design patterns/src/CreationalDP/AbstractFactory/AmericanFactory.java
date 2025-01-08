/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CreationalDP.AbstractFactory;

/**
 *
 * @author Omar Fayed
 */
public class AmericanFactory implements ICarFactory {

    @Override
    public ICar createCar() {
        return new SedanCar();
    }

    @Override
    public ISpecs createSpecs() {
        return new ModernSpecs();
    }
    
}
