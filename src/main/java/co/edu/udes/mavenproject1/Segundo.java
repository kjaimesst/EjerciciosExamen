/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author Oriana
 */
public class Segundo {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year=0, dd=0, total=0,mm=0;
           
           System.out.println("Year");
           year=sc.nextInt();
           System.out.println("Mes");
           mm=sc.nextInt();
    
           if(mm>12){
               System.out.println("Invalido");
               System.exit(0);         
           }
           if(mm==1 || mm==3 || mm==5 || mm==7 || mm==8 || mm==10 || mm==12){
               System.out.println("dia");
               dd=sc.nextInt();
               if(dd>31){
                   System.out.println("Invalido");
                   System.exit(0);
               }
           }
           if(mm==4 || mm==6 || mm==9 || mm==11){
               System.out.println("dia");
               dd=sc.nextInt();
               if(dd>30){
                   System.out.println("Invalido");
                   System.exit(0);
               }
           }
           if(year%4==0){
               if(mm==2){
                   System.out.println("dia");
                   dd=sc.nextInt();
                   if(dd>29){
                       System.out.println("Invalido");
                       System.exit(0);
                   }
               }
           }else if(year%4!=0){
               if(mm==2){
                   System.out.println("dia");
                   dd=sc.nextInt();
                   if(dd>28){
                       System.out.println("Invalido");
                       System.exit(0);
                   }
               }
           }
           for(int i=0; i<mm;i++){
               if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12){
                total=total+31;
               }
               if(i==4 || i==6 || i==9 || i==11){
               total=total+30;
               }
               if(year%4==0 && i==2){
                   total=total+29;
               }else if(year%4!=0 && i==2){
               total=total+28;
               } 
           }
           for(int i=0; i<dd; i++){
           total++;
           }
           System.out.println("El total de dias transcurrieron es: "+total);
   }
    
}