/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodoingresar;

/**
 *
 * @author adilm
 */
public class Metodoingresar {
double cantidad=5;
double dSaldo=10;
    public void retirar (double cantidad)
    {
        if (cantidad <= 0)
        {
            System.out.println("No se puede retirar una cantidad negativa");
        }
        else if (dSaldo < cantidad)
        {
            System.out.println("No se hay suficiente saldo");
        }
        else
        {
       
        }
    }
    
}
