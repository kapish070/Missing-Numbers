/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author kapish
 */
import static java.lang.String.format;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.HashMap;
import java.text.ParseException;
import java.util.Collections;
public class hashmap 
{
public static void main(String args[])throws ParseException
{
    Scanner sc=new Scanner(System.in);
    HashMap<Date,Integer>hmap=new HashMap<Date,Integer>();
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        int a=0;
        String a1=sc.next();
        Date d1=sdf.parse(a1);
       
        Integer b1=sc.nextInt();
  
        String a2=sc.next();
        Date d2=sdf.parse(a2);
        Integer b2=sc.nextInt();
        Date d3=sdf.parse("1970-01-01");
        Date d4=sdf.parse("2100-01-01");
        missing m=new missing();
        m.test(d1, b1, d2, b2, d3, d4,a);
        
}
}
class missing
{

    Object test;
void test(Date d1,int b1,Date d2,int b2,Date d3,Date d4,int a)
{
   HashMap<Date,Integer>hmap=new HashMap<Date,Integer>();
    if(  d1.compareTo(d3)>0 && b1>0 && b1<=1000000 && b2>0 && b2<=1000000 && d1.compareTo(d4)<0  )
    {    
         
    Calendar calendar1 = Calendar.getInstance();
    calendar1.setTime(d1);

    Calendar calendar2 = Calendar.getInstance();
    calendar2.setTime(d2);
    hmap.put(d1,b1);
    Date currentDate = calendar1.getTime();
    while(!currentDate.equals(calendar2.getTime())){
        calendar1.add(Calendar.DAY_OF_MONTH, 1);
         //hmap.put(currentDate, b2);
        currentDate = calendar1.getTime();
        //System.out.println(currentDate);
        //hmap.put(d1,b1);
        hmap.put(currentDate, b2);
        
        //hmap.put(currentDate,b2);

    }
       a=(b2-b1)/2;
        b2=a;
        //hmap.put(d2,b2);
         Map<Date, Integer> m1 = new TreeMap(hmap);
         SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
          for (Map.Entry<Date, Integer> entry : m1.entrySet())
    {
        
        System.out.print(df.format(entry.getKey())+" " +b1+" ");
        b1=b1+a;
    }
    }
         else
         {
         System.out.print("1");        
         }
    
         
}

    void test(String d1, int b1, String d2, int b2, String d3, String d4, int a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}