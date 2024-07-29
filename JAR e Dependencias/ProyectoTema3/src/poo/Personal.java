/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author nolas
 */
public class Personal extends Datos
{
    char estatus;

    public void setEstatus(char estatus)
    {
        this.estatus = estatus;
    }

    public char getEstatus()
    {
        return estatus;
    }

    public Personal()
    {
    }

    public Personal(char estatus, String cve, String nom, String primerAp, String segundoAp, char sexo, boolean desnutricion, boolean sobrepeso, boolean alergias, boolean obesidad, boolean diabetes, String Otras)
    {
        super(cve, nom, primerAp, segundoAp, sexo, desnutricion, sobrepeso, alergias, obesidad, diabetes, Otras);
        this.estatus = estatus;
    }
}
