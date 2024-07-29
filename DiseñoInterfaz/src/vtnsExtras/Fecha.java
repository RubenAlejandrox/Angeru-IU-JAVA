/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vtnsExtras;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author nolas
 */
public class Fecha
{
    Calendar fecha = new GregorianCalendar();
    String anio =Integer.toString(fecha.get(Calendar.YEAR));
    String mes =Integer.toString(fecha.get(Calendar.MONTH)+1);
    String dia =Integer.toString(fecha.get(Calendar.DATE));
    
    
    Date fecha2 = Calendar.getInstance().getTime();
    
    String fechaCompleta= dia+"/"+mes+"/"+anio;
    
    String hora =Integer.toString(fecha.get(Calendar.HOUR_OF_DAY));
    String minutos =Integer.toString(fecha.get(Calendar.MINUTE));
    
    String horaCompleta= hora+":"+minutos;
}
