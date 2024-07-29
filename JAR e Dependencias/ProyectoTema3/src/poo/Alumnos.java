/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author nolas
 */
public class Alumnos extends Datos
{
    int viveCon;
    int carrera;

    public void setViveCon(int viveCon)
    {
        this.viveCon = viveCon;
    }

    public void setCarrera(int carrera)
    {
        this.carrera = carrera;
    }

    public int getViveCon()
    {
        return viveCon;
    }

    public int getCarrera()
    {
        return carrera;
    }

    public Alumnos()
    {
    }

    public Alumnos(int viveCon, int carrera, String cve, String nom, String primerAp, String segundoAp, char sexo, boolean desnutricion, boolean sobrepeso, boolean alergias, boolean obesidad, boolean diabetes, String Otras)
    {
        super(cve, nom, primerAp, segundoAp, sexo, desnutricion, sobrepeso, alergias, obesidad, diabetes, Otras);
        this.viveCon = viveCon;
        this.carrera = carrera;
    }
}
