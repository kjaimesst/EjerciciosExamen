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
public class Cuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce cuantos numeros deseas ver en esta sucesion: ");
        int num = sc.nextInt();
        
        int fibonacci1 = 1;
        int fibonacci2 = 1;
        int nextFibonacci;
        
        if(num==1){
            System.out.println(fibonacci1);
            System.exit(0);
        }
        if(num==2){
            System.out.println(fibonacci1+" "+fibonacci2);
            System.exit(0);
        }
        
        System.out.print(fibonacci1+" "+fibonacci2);
        
        for(int i=2;i<num;i++){
            nextFibonacci = fibonacci1+fibonacci2;
            System.out.print(" "+nextFibonacci);
            fibonacci1=fibonacci2;
            fibonacci2=nextFibonacci;
        }
    }
}
