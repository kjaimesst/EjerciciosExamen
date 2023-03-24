/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.mavenproject1;

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Oriana
 */
public class Siete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el tamaño del vector 1");
        int sizeOne = sc.nextInt();
        int [] arrayOne = new int[sizeOne];
        
        System.out.println("Introduce el tamaño del vector 2");
        int sizeTwo = sc.nextInt();
        int [] arrayTwo = new int[sizeTwo];
        
        System.out.println("Introduce los valores del vector 1");
        for(int i=0;i<sizeOne;i++){
            System.out.println("Introduce un numero entero");
            arrayOne[i] = sc.nextInt();
        }
        
        System.out.println("Introduce los valores del vector 2");
        for(int i=0;i<sizeTwo;i++){
            System.out.println("Introduce un numero entero");
            arrayTwo[i] = sc.nextInt();
        }
        int [] arrayPlus = new int [sizeOne+sizeTwo];
        for(int i=0;i<(sizeOne+sizeTwo);i++){
            if(i<sizeOne){
                arrayPlus[i]=arrayOne[i];
            }else{
                arrayPlus[i]=arrayTwo[i-sizeOne];
            }
        }
        
        Arrays.sort(arrayPlus);
        
        System.out.println("El nuevo vector:\nAscendente:");
        for(int i=0;i<arrayPlus.length;i++){
            System.out.print(arrayPlus[i]+" ");
        }
        System.out.println("Descendente:");
        for(int i=arrayPlus.length;i>0;i--){
            System.out.print(arrayPlus[i-1]+" ");
        }
    }
}
