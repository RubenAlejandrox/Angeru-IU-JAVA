/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author nolas
 */
public class PrbProyecto
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Datos arrDatos[] = null;
        
        int opc, opc2;
        HistorialClinico matH[][] = null;

        Date fecha = Calendar.getInstance().getTime();
        System.out.println(fecha);
        String mnu[] =
        {
            "REGISTRO", "MODIFICACIONES", "CONSULTAS", "REGISTRO DE HISTORIAL CLINICO", "REPORTES DE INFORMACION", "SALIR"
        };
        String mnuRegistro[] =
        {
            "ALUMNOS", "PERSONAL"
        };
        String mnuConsultas[] =
        {
            "CONSULTAR ALUMNOS", "CONSULTAR PERSONAL"
        };
        String mnuHistorial[] =
        {
            "REGISTRAR CONSULTA", "DESPLEGAR CONSULTAS DE ALUMNO/PERSONAL"
        };
        String mnuReportes[] =
        {
            "HOMBRES", "MUJERES",
            "ALERGIAS", "SOBREPESO", "DIABETES", "DESNUTRICION,", "OBESIDAD", "OTRAS",
            "PERSONAS CON MAYOR FRECUENCIA EN CITAS MEDICAS", "PERSONAS CON MENOR FRECUENCIA EN CITAS MEDICAS", "SALIR"
        };

        arrDatos = (Datos[]) ModificacionArchivos.cargaArr("../Datos/Datos.dat");
        matH = (HistorialClinico[][]) ModificacionArchivos.cargaMat("../DatosMat/HistorialC.dat");

        do
        {
            opc = ManipulacionProyecto.pintaMenu(mnu, "PRINCIPAL");

            switch (opc)
            {
                case 1:
                    //Agregar datos
                    opc = ManipulacionProyecto.pintaMenu(mnuRegistro, "REGISTRO");
                    arrDatos = ManipulacionProyecto.agregar(arrDatos, opc, true);
                    matH = ManipulacionProyecto.agregarfila(matH);
                    break;
                case 2:
                    //Modificar datos
                    opc = ManipulacionProyecto.pintaMenu(mnuRegistro, "MODIFICACIONES");
                    arrDatos = ManipulacionProyecto.modificacion(opc, arrDatos);

                    break;
                case 3:
                    //Consulta separada para alumnos y para personal
                    opc = ManipulacionProyecto.pintaMenu(mnuConsultas, "CONSULTAS");
                    ManipulacionProyecto.Consulta(true, opc, arrDatos);
                    //ManipulacionProyecto.consultas(arrDatos, opc);
                    break;
                case 4:
                    //Registro de consultas                    
                    matH = ManipulacionProyecto.agregarColumna(matH, arrDatos);
                    break;
                case 5:
                    //desplegar consultas de una persona                    
                    //opc= ManipulacionProyecto.pintaMenu(mnuReportes, "REPORTES");
                    ManipulacionProyecto.opcionesReportes(mnuReportes, opc, arrDatos, matH);

                    //podemos hacer lo de opc=Manip... y despues cambiar el valor que no sea 6 para que no se salga
                    break;
                case 6:
                    //Metodo que te ayuda a ver las consultas
                    ManipulacionProyecto.contadorMatriz(matH);

                    break;
                case 7:
                    //Metodo para desplegar el historial clinico
                    ManipulacionProyecto.despHistorial(matH, arrDatos);
                    break;
                case 9:
                    ManipulacionProyecto.imprimirPorFechas(matH);
                    break;

                default:
                    System.out.println("Opcion no valida, vuelve a intentarlo.");
                    break;
            }

        } while (opc != 10);
        ModificacionArchivos.guarda("../Datos/Datos.dat", arrDatos);
        ModificacionArchivos.guardaMat("../DatosMat/HistorialC.dat", matH);
    }
    
}
