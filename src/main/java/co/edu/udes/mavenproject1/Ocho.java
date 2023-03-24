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
public class Ocho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int [][] matrix = new int [5][12];
        String [] nameSignature = new String [5];
        String [] months = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", 
            "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int [] additionSignatures = new int [5];
        int [] sumMonths = new int [12];
        int mostSignatureStudied;
        int leastStudiedSignature;
        int iMax, iMin;
        
        System.out.println("Horas de estudio mensuales por materia");
        
        for(int i=0;i<5;i++){
            System.out.println("Introduce el nombre de la materia: "+(i+1)+": ");
            nameSignature[i] = sc.nextLine();
        }
        
        for(int i=0;i<5;i++){
            additionSignatures[i] = 0;
            for(int j=0;j<12;j++){
                System.out.println("Introduce las horas estudiadas de la materia "+nameSignature[i]+" en "+months[j]+": ");
                matrix[i][j] = sc.nextInt();
                additionSignatures[i] += matrix[i][j];
            }
        }
        for(int j=0;j<12;j++){
            sumMonths[j]=0;
            for(int i=0;i<5;i++){
                sumMonths[j]+=matrix[i][j];
            }
        }
        
        mostSignatureStudied = additionSignatures[0];
        iMax = 0;
        for(int i=1;i<5;i++){
            if(additionSignatures[i]>mostSignatureStudied){
                mostSignatureStudied = additionSignatures[i];
                iMax = i;
            }
        }
        
        leastStudiedSignature = additionSignatures[0];
        iMin = 0;
        for(int i=1;i<5;i++){
            if(additionSignatures[i]<leastStudiedSignature){
                leastStudiedSignature = additionSignatures[i];
                iMin = i;
            }
        }
        
        System.out.println("El total de horas anual de cada asignatura: ");
        for(int i=0;i<5;i++){
            System.out.println(nameSignature[i]+": "+additionSignatures[i]);
        }
        System.out.println("Este es el total de horas mensual estudiadas: ");
        for(int i=0;i<12;i++){
            System.out.println(months[i]+": "+sumMonths[i]);
        }
        System.out.println("La materia con mas horas de estudio fue: "+nameSignature[iMax]+", con un total de "+mostSignatureStudied+" horas");
        System.out.println("La materia con menos horas de estudio fue: "+nameSignature[iMin]+", con un total de "+leastStudiedSignature+" horas");
        
    }
}
