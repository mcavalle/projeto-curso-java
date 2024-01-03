package aula2;

public class Variaveis {
    public static void main(String[] args) {
        //Variaveis
        String nome;
        int idade;
        double altura;

        //Atribuindo valor as variáveis
        nome = "Mariana";
        idade = 26;
        altura = 1.64;

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(altura);

        //Alterando o valor de uma variável
        idade = 45;
        System.out.println(idade);

        //Declaração de uma constante
        final double PI = 3.14;
        // PI = 25;
    }
}
