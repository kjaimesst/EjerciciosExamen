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
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce la fecha:  ");
        System.out.println("Dia: ");
        int day = input.nextInt();
        System.out.println("Mes: ");
        int month = input.nextInt();
        System.out.println("Year: ");
        int year = input.nextInt();
        
        if(day<0||month<0||year<0){
            System.out.println("La fecha que introduciste es invalida");
            System.exit(0);
        }
        
        int daysPassed = 0;
        boolean isValid = false;
        
        switch(month){
            case 1:{
                if(day>0&&day<=31){
                    isValid=true;
                }
                break;
            }
            case 2:{
                daysPassed=31;
                if(day==29&&year%4==0){
                    isValid=true;
                }else if(day>0&&day<=28){
                    isValid=true;
                }
                break;
            }
            case 3:{
                daysPassed=59;
                if(day>0&&day<=31){
                    isValid=true;
                }
                break;
            }
            case 4:{
                daysPassed=90;
                if(day>0&&day<=30){
                    isValid=true;
                }
                break;
            }
            case 5:{
                daysPassed=120;
                if(day>0&&day<=31){
                    isValid=true;
                }
                break;
            }
            case 6:{
                daysPassed=151;
                if(day>0&&day<=30){
                    isValid=true;
                }
                break;
            }
            case 7:{
                daysPassed=181;
                if(day>0&&day<=31){
                    isValid=true;
                }
                break;
            }
            case 8:{
                daysPassed=212;
                if(day>0&&day<=31){
                    isValid=true;
                }
                break;
            }
            case 9:{
                daysPassed=243;
                if(day>0&&day<=30){
                    isValid=true;
                }
                break;
            }
            case 10:{
                daysPassed=273;
                if(day>0&&day<=31){
                    isValid=true;
                }
                break;
            }
            case 11:{
                daysPassed=304;
                if(day>0&&day<=30){
                    isValid=true;
                }
                break;
            }
            case 12:{
                daysPassed=334;
                if(day>0&&day<=31){
                    isValid=true;
                }
                break;
            }
            default:{
                break;
            }
        }
        
        daysPassed=daysPassed+day;
        if(month!=2&&daysPassed>=60&&year%4==0){
            daysPassed++;
        }
        
        if(isValid){
            System.out.println("La fecha que introduciste es valida");
            System.out.println("Los dias que transcurrieron hasta ese dia son "+daysPassed+" dias");
        }else{
            System.out.println("La fecha que introduce invalida");
        }
      }
}