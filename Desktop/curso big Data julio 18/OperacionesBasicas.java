/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condiciones;
import java.util.Scanner;
/**
 *
 * @author Erik
 */
public class OperacionesBasicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Byte opc=0;
        double num1=0,num2=0,res=0;
        Scanner dato=new Scanner(System.in);            
        System.out.println("introduce el primer numero: ");
        num1=Double.parseDouble(dato.nextLine());
        System.out.println("Introudce el segundo numero: ");
        num2=Double.parseDouble(dato.nextLine());
        System.out.println("QUE OPERACION DESEAS REALIZAR? Elije una opcion...");
        System.out.println("1: para Suma");
        System.out.println("2: para Resta");
        System.out.println("3: para Multiplicacion");
        System.out.println("4: para Division");
        opc=Byte.parseByte(dato.nextLine());
        if (opc==1){
             res=num1+num2;
             System.out.println("El resultado es: "+res);
        } else if (opc==2){
            res=num1-num2;
            System.out.println("El resultado es: "+res);
        }else if (opc==3){
            res=num1*num2;
            System.out.println("El resultado es: "+res);
        }else if (opc==4){
            res=num1/num2;
            System.out.println("El resultado es: "+res);
        }else{
            System.out.println("Esa no es una opcion");
        }
    }
    
}
agrega algo