/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author nolas
 */
public class ModificacionArchivos
{

    public static void guarda(String s, Object obj)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream(s);
            ObjectOutputStream arch = new ObjectOutputStream(fos);
            arch.writeObject(obj);
            arch.close();
        } catch (FileNotFoundException ex)
        {
            System.out.println("No se encontro el archivo");
        } catch (Exception e)
        {
            System.out.println("Error.." + e.toString());
        }
    }

    public static Object carga(String s)
    {
        Object obj = null;
        try
        {
            FileInputStream fos = new FileInputStream(s);
            ObjectInputStream arch = new ObjectInputStream(fos);
            obj = arch.readObject();
            arch.close();
        } catch (FileNotFoundException ex)
        {
            System.out.println("No se encontro el archivo");
        } catch (Exception e)
        {
            System.out.println("Error.." + e.toString());
        }
        return obj;
    }

    public static void guarda(String s, Object obj[])
    {
        try
        {
            FileOutputStream fos = new FileOutputStream(s);
            ObjectOutputStream arch = new ObjectOutputStream(fos);
            arch.writeObject(obj);
            arch.close();
        } catch (FileNotFoundException ex)
        {
            System.out.println("No se encontro el archivo");
        } catch (Exception e)
        {
            System.out.println("Error.." + e.toString());
        }

    }

    public static Object[] cargaArr(String s)
    {
        Object obj[] = null;
        try
        {
            FileInputStream fos = new FileInputStream(s);
            ObjectInputStream arch = new ObjectInputStream(fos);
            obj = (Object[]) arch.readObject();
            arch.close();
        } catch (FileNotFoundException ex)
        {
            System.out.println("No se encontro el archivo");
        } catch (Exception e)
        {
            System.out.println("Error.." + e.toString());
        }
        return obj;
    }

    public static void guardaMat(String s, Object obj[][])
    {
        try
        {
            FileOutputStream fos = new FileOutputStream(s);
            ObjectOutputStream arch = new ObjectOutputStream(fos);
            arch.writeObject(obj);
            arch.close();
        } catch (FileNotFoundException ex)
        {
            System.out.println("No se encontro el archivo");
        } catch (Exception e)
        {
            System.out.println("Error.." + e.toString());
        }

    }

    public static Object[][] cargaMat(String s)
    {
        Object obj[][] = null;
        try
        {
            FileInputStream fos = new FileInputStream(s);
            ObjectInputStream arch = new ObjectInputStream(fos);
            obj = (Object[][]) (Object[]) arch.readObject();
            arch.close();
        } catch (FileNotFoundException ex)
        {
            System.out.println("No se encontro el archivo");
        } catch (Exception e)
        {
            System.out.println("Error.." + e.toString());
        }
        return obj;
    }
}
