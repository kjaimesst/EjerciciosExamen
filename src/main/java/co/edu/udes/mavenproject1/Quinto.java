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
public class Quinto {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String way;
        
        System.out.println("Introduce la base del triangulo rectangulo");
        int base = input.nextInt();
        
        System.out.println("Introduce en que direccion debe ir el rectangulo? (Escribe 1  para ascendente y 2 para descendente)");
        do{
            way = input.next();
            way = way.toUpperCase();
            if(!way.equals("1")&&!way.equals("2")){
                System.out.println("INVALIDO, introduce de nuevo");
            }
        }while(!way.equals("1")&&!way.equals("2"));
        
        if(way.equals("2")){
            for(int i=1;i<=base;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
            }
        }
        if(way.equals("1")){
            for(int i=1;i<=base;i++){
                for(int k=1;k<=base-i;k++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
            }
        }
    }
}
