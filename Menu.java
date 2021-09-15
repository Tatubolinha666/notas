
package principal;

import java.io.InputStream;
import java.util.Scanner;


public class Menu {
    public static void MeuMenu();static {
    Scanner grava= new Scannner(System.in);
int op;
do{
   System.out.println("Selecione a operação desejada");
   System.out.println("1-Soma");
   System.out.println("2-Subtração");
   System.out.println("3-Divisão");
   System.out.println("4-Multiplicação");
   System.out.println("5-Sair");
            op=grava.nextInt();
            if(op==1){
         Operações.soma();
            }else if(op==2){
            }else if(op==3){
            }else if(op==4){
            }
}while(op!=5);
}

 
}