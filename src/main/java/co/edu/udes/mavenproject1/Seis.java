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
public class Seis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce una frase:");
        String phrase = input.nextLine();
        
        int words = 0;
        int letters = 0;
        
        for(int i = 0;i<phrase.length();i++){
            if(phrase.charAt(i)==32){
                words++;
            }
        }
        words++;
        
        System.out.println("La frase tiene "+words+" palabras. Numero de palabras: ");
        
        for(int i = 0;i<phrase.length();i++){
            if(phrase.charAt(i)==32){
                System.out.print(letters+" ");
                letters=0;
                continue;
            }
            letters++;            
        }
        System.out.print(letters);
    }
}
