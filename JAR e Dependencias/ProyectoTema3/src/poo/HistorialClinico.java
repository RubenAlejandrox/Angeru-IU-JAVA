/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author nolas
 */
public class HistorialClinico implements Serializable
{
    private String padecimiento;
    private String antecedentes;
    private String medicamento;
    private String planTratamiento;
    private Date fecha;

    public void setPadecimiento(String padecimiento)
    {
        this.padecimiento = padecimiento;
    }

    public void setAntecedentes(String antecedentes)
    {
        this.antecedentes = antecedentes;
    }

    public void setMedicamento(String medicamento)
    {
        this.medicamento = medicamento;
    }

    public void setPlanTratamiento(String planTratamiento)
    {
        this.planTratamiento = planTratamiento;
    }

    public void setFecha(Date fecha)
    {
        this.fecha = fecha;
    }

    public String getPadecimiento()
    {
        return padecimiento;
    }

    public String getAntecedentes()
    {
        return antecedentes;
    }

    public String getMedicamento()
    {
        return medicamento;
    }

    public String getPlanTratamiento()
    {
        return planTratamiento;
    }

    public Date getFecha()
    {
        return fecha;
    }

    public HistorialClinico()
    {
    }

    public HistorialClinico(String padecimiento, String antecedentes, String medicamento, String planTratamiento, Date fecha)
    {
        this.padecimiento = padecimiento;
        this.antecedentes = antecedentes;
        this.medicamento = medicamento;
        this.planTratamiento = planTratamiento;
        this.fecha = fecha;
    }

    @Override
    public String toString()
    {
        return "Fecha: " + getFecha()+"\nPadecimiento: " + getPadecimiento() + "\nAntecedentes: " + getAntecedentes() + "\nMedicamento:" + getMedicamento() + "\nPlan de tratamiento: " + getPlanTratamiento() ;
    }
}
