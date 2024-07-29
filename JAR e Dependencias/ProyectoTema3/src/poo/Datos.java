/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import java.io.Serializable;

/**
 *
 * @author nolas
 */
public class Datos implements Serializable
{
    private String cve;
    private String nom;
    private String primerAp;
    private String segundoAp;
    private char sexo;
    private boolean desnutricion;
    private boolean sobrepeso;
    private boolean alergias;
    private boolean obesidad;
    private boolean diabetes;
    private String Otras;

    public void setCve(String cve)
    {
        this.cve = cve;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public void setPrimerAp(String primerAp)
    {
        this.primerAp = primerAp;
    }

    public void setSegundoAp(String segundoAp)
    {
        this.segundoAp = segundoAp;
    }

    public void setSexo(char sexo)
    {
        this.sexo = sexo;
    }

    public void setDesnutricion(boolean desnutricion)
    {
        this.desnutricion = desnutricion;
    }

    public void setSobrepeso(boolean sobrepeso)
    {
        this.sobrepeso = sobrepeso;
    }

    public void setAlergias(boolean alergias)
    {
        this.alergias = alergias;
    }

    public void setObesidad(boolean obesidad)
    {
        this.obesidad = obesidad;
    }

    public void setDiabetes(boolean diabetes)
    {
        this.diabetes = diabetes;
    }

    public void setOtras(String Otras)
    {
        this.Otras = Otras;
    }

    public String getCve()
    {
        return cve;
    }

    public String getNom()
    {
        return nom;
    }

    public String getPrimerAp()
    {
        return primerAp;
    }

    public String getSegundoAp()
    {
        return segundoAp;
    }

    public char getSexo()
    {
        return sexo;
    }

    public boolean isDesnutricion()
    {
        return desnutricion;
    }

    public boolean isSobrepeso()
    {
        return sobrepeso;
    }

    public boolean isAlergias()
    {
        return alergias;
    }

    public boolean isObesidad()
    {
        return obesidad;
    }

    public boolean isDiabetes()
    {
        return diabetes;
    }

    public String getOtras()
    {
        return Otras;
    }

    public Datos()
    {
    }

    public Datos(String cve, String nom, String primerAp, String segundoAp, char sexo, boolean desnutricion, boolean sobrepeso, boolean alergias, boolean obesidad, boolean diabetes, String Otras)
    {
        this.cve = cve;
        this.nom = nom;
        this.primerAp = primerAp;
        this.segundoAp = segundoAp;
        this.sexo = sexo;
        this.desnutricion = desnutricion;
        this.sobrepeso = sobrepeso;
        this.alergias = alergias;
        this.obesidad = obesidad;
        this.diabetes = diabetes;
        this.Otras = Otras;
    }

    @Override
    public String toString()
    {
        return "Datos{" + "cve=" + getCve() + ", nom=" + getNom() + ", primerAp=" + getPrimerAp() + ", segundoAp=" + getSegundoAp() + ", sexo=" + getSexo() + ", desnutricion=" + isDesnutricion() + ", sobrepeso=" + isSobrepeso() + ", alergias=" + isAlergias() + ", diabetes=" + isDiabetes() + ", Otras=" + getOtras() + '}';
    }
}
