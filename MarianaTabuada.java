/* 
Nome: Mariana de Oliveira
Matrícula: 0050013985
*/


import java.io.IOException;
import java.util.Scanner;

class Main 
{
    public static void main(String[] args) throws IOException 
    {
        int entrada;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ola Mariana, entre com um número: ");
        entrada = scanner.nextInt();
           System.out.println("Tabuada de somar do " + entrada );
        int multiplicador = 0;
        while(multiplicador <= 10)
        {
            int resultado = entrada + multiplicador;
            System.out.println(entrada + "+" + multiplicador + "=" + resultado);   
        
        
            multiplicador++;
            
        }
    }
}
