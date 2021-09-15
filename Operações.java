
package principal;

import java.util.Scanner;
public class Operações {
    static Scanner grava=new Scanner(System.in);
static int op, val1, val2;
public static void soma(){
    int soma;
op=grava.nextInt();
System.out.println("Digite um valor para soma");
val1=grava.nextInt();
System.out.println("Digite outro valor para soma");
val2=grava.nextInt();
soma=val1+val2;
System.out.println("O resultado da soma é:"+soma);

}
public static void subtração(){
    int subtração;
op=grava.nextInt();
System.out.println("Digite um valor para subtração");
val1=grava.nextInt();
System.out.println("Digite outro valor para substração");
val2=grava.nextInt();
subtração=val1-val2;
System.out.println("O resultado da soma é:"+subtração);

}
public static void divisão(){
    int divisão;
op=grava.nextInt();
System.out.println("Digite um valor para divisão");
val1=grava.nextInt();
System.out.println("Digite outro valor para divisão");
val2=grava.nextInt();
divisão=val1/val2;
System.out.println("O resultado da soma é:"+divisão);

}
public static void multiplicação(){
    int multiplicação;
op=grava.nextInt();
System.out.println("Digite um valor para multiplicação");
val1=grava.nextInt();
System.out.println("Digite outro valor para multiplicação");
val2=grava.nextInt();
multiplicação=val1*val2;
System.out.println("O resultado da soma é:"+multiplicação);

}


}