
package com.mycompany.lerentradas;

import java.util.Scanner;
import java.util.Locale;

public class SaudePessoal {
    
    String nome;
    int idade;
    int peso;
    double altura;
    String sexo;
    double calculo;
    Scanner scanner;

    public SaudePessoal(){
     this.scanner = new Scanner(System.in);  //Construtor para nicializar o scanner
     this.scanner.useLocale(Locale.US);
        
    }
      // Aqui inicia a coleta dos dados (Nome,Idade,Peso,Altura).
    void nome(){
        
        System.out.print("Digite seu nome");
        this.nome = scanner.nextLine();    //Armazena o nome digitado na variavel
        
        
        
   
        
    }
    
    
    
    
    void idade(){
        System.out.print("Digite a idade");
        this.idade= scanner.nextInt();
        scanner.nextLine(); // ✅ ESSENCIAL: Consome a quebra de linha
        
      
    }
    
    void peso(){
        System.out.print("Digite seu peso");
        this.peso=scanner.nextInt();
        scanner.nextLine(); // ✅ ESSENCIAL: Consome a quebra de linha
    }
    
    
    void altura(){
        System.out.print("Digite sua altura (SEM PONTOS OU VIRGULAS)");
        this.altura=scanner.nextDouble();
        scanner.nextLine(); // ✅ ESSENCIAL: Consome a quebra de linha
       
        
         
    }
    
    void sexo(){
        
        System.out.print("Digite seu Sexo (M/F)");
        this.sexo= scanner.nextLine();
        
        if(sexo.equalsIgnoreCase("M")){
           Homen();
        }
        else if(sexo.equalsIgnoreCase("F")){
            mulher();
        }else{
            System.out.print("Sexo inválido! Digite M ou F.");
            
        }
        
        
        
        
    }
    
     void Homen(){
        
        calculo= 66.47+(13.75* peso)+(5*altura)-(6.76*idade);
        
        System.out.println(calculo);
        
        
        
    }
    
    void mulher(){
        calculo= 655.1+(9.56*peso)+(1.85*altura)-(6.76*idade);
        System.out.println(calculo);
    }
    
    
    
    
    
    void resultado(){
        System.out.println("\n=== RESULTADO FINAL ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.println("Sexo: " + sexo);
        System.out.println("TMB: " + calculo + " calorias/dia");
    }
    
    void fechar(){
        scanner.close();  // Fecha o construtor Scanner
        
    }
    
    
    
    
}
