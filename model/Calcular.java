package model;

import java.util.Random;

public class Calcular {
    private int dificuldade;
    private int valor1;
    private int valor2;
    private int operacao;
    private int resultado;

    public Calcular(int dificuldade) {
        Random rand = new Random();
        this.operacao = rand.nextInt(3); // 0 - somar, 1 - diminuir, 2 - multiplicar
        
        // Validando a dificuldade dentro do intervalo esperado (1 a 4)
        if (dificuldade >= 1 && dificuldade <= 4) {
            this.dificuldade = dificuldade;
        } else {
            System.out.println("Dificuldade inválida. Definindo para 1 (Fácil) por padrão.");
            this.dificuldade = 1;
        }
        
        // Gerando valores com base na dificuldade
        int maxValor = (int) Math.pow(10, dificuldade);
        this.valor1 = rand.nextInt(maxValor); 
        this.valor2 = rand.nextInt(maxValor); 
    }
    
    public int getDificuldade() {
        return dificuldade;
    }
    
    public int getValor1() {
        return valor1;
    }
   
    public int getValor2() {
        return valor2;
    }
    
    public int getOperacao() {
        return operacao;
    }

    public String toString() {
        String op;
        if (this.getOperacao() == 0) {
            op = "Somar";
        } else if (this.getOperacao() == 1) {
            op = "Diminuir";
        } else if (this.getOperacao() == 2) {
            op = "Multiplicar";
        } else {
            op = "Operação desconhecida";
        }  
        return "Valor 1: " + this.getValor1() +
                "\nValor 2: " + this.getValor2() +
                "\nDificuldade: " + this.getDificuldade() +
                "\nOperação: " + op; 
    }

    public boolean somar(int resposta) {
        this.resultado = this.getValor1() + this.getValor2();
        boolean certo = false ;

        if (resposta == this.resultado) {
            System.out.println("Resposta correta!");
            certo = true;
        } else {
            System.out.println("Resposta errada!");
        }
        System.out.println(this.getValor1() + " + " + this.getValor2() + " = " + this.resultado);
        return certo;
    }

    public boolean diminuir(int resposta) {
        this.resultado = this.getValor1() - this.getValor2();
        boolean certo = false ;

        if (resposta == this.resultado) {
            System.out.println("Resposta correta!");
            certo = true;
        } else {
            System.out.println("Resposta errada!");
        }
        System.out.println(this.getValor1() + " - " + this.getValor2() + " = " + this.resultado);
        return certo;
    }

    public boolean multiplicar(int resposta) {
        this.resultado = this.getValor1() * this.getValor2();
        boolean certo = false ;

        if (resposta == this.resultado) {
            System.out.println("Resposta correta!");
            certo = true;
        } else {
            System.out.println("Resposta errada!");
        }
        System.out.println(this.getValor1() + " * " + this.getValor2() + " = " + this.resultado);
        return certo;
    }
}
