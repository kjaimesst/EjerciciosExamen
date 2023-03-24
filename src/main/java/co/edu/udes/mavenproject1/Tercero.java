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
public class Tercero {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de latas que deseas apilar: ");
        int cant = sc.nextInt();
        int addition = 3;
        int lastAddition = 1;
        int i = 2;
        int numCans;
        
        if(cant==1||cant==3){
            System.out.println("Si se puede apilar "+cant+" latas");
            System.exit(0);
        }
        if(cant==2){
            System.out.println("No se puede apilar "+cant+" latas, necesitas por lo menos "+(cant+1)+" latas");
            System.exit(0);
        }
        
        while(addition<cant){
            i++;
            lastAddition=addition;
            addition+=i;
        }
        
        if(cant==addition){
            System.out.println("Si se puede apilar "+cant+" latas");
        }else if(cant%lastAddition <= addition%cant){
            numCans = lastAddition;
            System.out.println("No se puede apilar "+cant+" latas, con "+numCans+" latas puedes armar una piramide");
        }else{
            numCans = addition;
            System.out.println("No se puede apilar "+cant+" latas, necesitas por lo menos "+numCans+" latas");
        }
    }
}
