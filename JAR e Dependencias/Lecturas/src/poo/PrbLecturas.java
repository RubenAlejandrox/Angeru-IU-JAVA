/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

/**
 *
 * @author nolas
 */
public class PrbLecturas
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.print("Dame un numero: ");
        int a= Lecturas.entero(true);
        System.out.println(a);
        
        System.out.print("Dame un numero decimal: ");
        double z=Lecturas.doblePositivo(true);//True para que se repita mil veces  False para que solo se intente una vez
        System.out.println(z);
        
        System.out.print("Dame una Cadena: ");
        String w=Lecturas.cadena();//True para que se repita mil veces  False para que solo se intente una vez
        System.out.println(w);
    }
    
}
