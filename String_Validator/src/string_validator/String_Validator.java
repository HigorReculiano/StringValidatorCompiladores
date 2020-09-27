/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string_validator;

/**
 *
 * @author higor
 */
import java.util.Scanner;
import java.util.Stack;

public class String_Validator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Character> pilha = new Stack<>();
        String palavra = scan.next();
        Boolean falha = false;
        char aux;

        for (int i = 0; i < palavra.length(); i++) {
            
            if (palavra.charAt(i) == '[' || palavra.charAt(i) == '(' || palavra.charAt(i) == '{' || palavra.charAt(i) == '<') {
                pilha.push(palavra.charAt(i));
            } else if (palavra.charAt(i) == ']' || palavra.charAt(i) == ')' || palavra.charAt(i) == '}' || palavra.charAt(i) == '>') {
                if(pilha.empty())
                {
                    System.out.println("String inválida");
                    falha = true;
                    break;
                }
                aux = pilha.pop();
                if ((aux == '[' && palavra.charAt(i) == ']') || (aux == '{' && palavra.charAt(i) == '}') || (aux == '(' && palavra.charAt(i) == ')')
                        || (aux == '<' && palavra.charAt(i) == '>')) {
                    continue;
                } else {
                    falha = true;
                    System.out.println("String inválida");
                    break;
                }

            } else {
                falha = true;
                System.out.println("Caracteres inválidos detectados");
                break;
            }
            
        }
        if(falha == false)
        {
          System.out.println("String Válida");  
        }
         
    }

}
