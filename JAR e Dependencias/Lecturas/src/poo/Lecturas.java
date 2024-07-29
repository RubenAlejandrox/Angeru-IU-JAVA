/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author nolas
 */
public class Lecturas
{

    private static InputStreamReader isr = new InputStreamReader(System.in);
    private static BufferedReader br = new BufferedReader(isr);

    public static boolean booleano(int opc)
    {
        boolean ban;
        do
        {
            if (opc == 1)
            {
                return true;
            }
            if (opc == 2)
            {
                return false;
            } else
            {
                System.out.println("Opcion no valida...");
            }
        } while (ban = true);
        return true;
    }

    public static int entero()
    {
        try
        {
            return Integer.parseInt(br.readLine());
        } catch (IOException ex)
        {
            System.out.println("Problema de E/S");
        } catch (NumberFormatException ex)
        {
            System.out.println("Error...Se esperaba un entero");
        } catch (Exception ex)
        {
            System.out.println("Error...." + ex.getMessage());
        }
        return 0;
    }

    public static int enteroPositivo(boolean b)
    {
        do
        {
            try
            {

                int x = Integer.parseInt(br.readLine());
                if (x > 0)
                {
                    return x;
                } else
                {
                    System.out.println("Se esperaba un entero positivo, vuelve a intentarlo");
                    System.out.print("Dame un numero: ");
                }
            } catch (Exception ex)
            {
                System.out.println("Se esperaba un entero, vuelve a intentarlo...");
                System.out.print("Dame un numero: ");
            }
        } while (b);
        return 0;
    }

    public static int entero(boolean b)
    {
        do
        {
            try
            {

                int x = Integer.parseInt(br.readLine());
                if (x >= 0)
                {
                    return x;
                } else
                {
                    System.out.println("Se esperaba un entero positivo, vuelve a intentarlo");
                    System.out.print("Dame un numero: ");
                }
            } catch (Exception ex)
            {
                System.out.println("No valido, vuelve a intentarlo...");
                System.out.print("Dame un numero: ");
            }
        } while (b);
        return 0;
    }

    public static double doblePositivo(boolean b)
    {
        do
        {
            try
            {
                double x = Double.parseDouble(br.readLine());
                if (x > 0)
                {
                    return x;
                } else
                {
                    System.out.println("Se esperaba un entero decimal positivo, vuelve a intentarlo");
                    System.out.print("Dame un numero: ");
                }
            } catch (Exception ex)
            {
                System.out.println("No valido, vuelve a intentarlo...");
                System.out.print("Dame un numero: ");
            }
        } while (b);
        return 0;
    }

    public static String cadena()
    {
        try
        {
            return br.readLine();
        } catch (Exception ex)
        {
            System.out.println("Error...." + ex.getMessage());
            System.out.println("Error...." + ex.toString());
            System.out.println("Vuleve a intentarlo...");
        }
        return "";
    }
    //Estos no los ocupamos por el momento

    public static char caracter(boolean b)
    {
        do
        {
            char c = ' ';
            try
            {
                c = (char) br.read();

                //String s = br.readLine();
            } catch (Exception ex)
            {
                System.out.println("Vuleve a intentarlo...");
            }
            return c;

        } while (b);
    }

    public static String caracterPrueba(boolean b)
    {
        do
        {
            int c = ' ';
            try
            {
                c = (char) br.read();
                if (c >= 65 && c <= 90 || c >= 97 && c <= 122)
                {
                    String a = String.valueOf(c);
                    return a;
                } else
                {
                    System.out.println("Caracter invalido");
                }

                //String s = br.readLine();
            } catch (Exception ex)
            {
                System.out.println("Vuleve a intentarlo...");
            }
            return "";

        } while (b);

    }
}
