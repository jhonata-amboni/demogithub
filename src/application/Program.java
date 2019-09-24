/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        Date x1 = new Date();
        System.out.println(sdf.format(d));
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4);
        d = cal.getTime();
        System.out.println(d);
        
        int minutes = cal.get(Calendar.MINUTE);
        int mes = 1 + cal.get(Calendar.MONTH);
        System.out.println("Minutos: " + minutes);
        System.out.println("Mês: " + mes);
    }
    
}
