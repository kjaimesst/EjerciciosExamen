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
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el numero de latas que deseas apilar: ");
        int can = input.nextInt();
        int sum = 3;
        int lastSum = 1;
        int i = 2;
        int numOfCans;
        
        if(can==1||can==3){
            System.out.println("Si se puede apilar "+can+" latas");
            System.exit(0);
        }
        if(can==2){
            System.out.println("No se puede apilar "+can+" latas, necesitas por lo menos "+(can+1)+" latas");
            System.exit(0);
        }
        
        while(sum<can){
            i++;
            lastSum=sum;
            sum+=i;
        }
        
        if(can==sum){
            System.out.println("Si se puede apilar "+can+" latas");
        }else if(can%lastSum <= sum%can){
            numOfCans = lastSum;
            System.out.println("No se puede apilar "+can+" latas, con "+numOfCans+" latas puedes armar una piramide");
        }else{
            numOfCans = sum;
            System.out.println("No se puede apilar "+can+" latas, necesitas por lo menos "+numOfCans+" latas");
        }
    }
}
