/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CreationalDP.AbstractFactory;

/**
 *
 * @author Omar Fayed
 */
//Abstract factory
public interface ICarFactory {
    public ICar createCar();
    public ISpecs createSpecs();
}
