/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.njt.webapp.njtbioskopprojekat.converter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author remmi
 */
public class DateConverter {
    
    public static String convertToDate(Date date){
        DateFormat formater = new SimpleDateFormat("dd-MM-yyyy");
        String converted = formater.format(date);
        return converted;
    }
    
    public static String convertToDateTime(Date date){
        DateFormat formater = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        String converted = formater.format(date);
        return converted;
    }
}
