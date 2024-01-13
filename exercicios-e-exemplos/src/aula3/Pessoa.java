package aula3;

public class Pessoa {
    String nome;
    int idade;
    double altura;

    public void andar(){
        System.out.println("Andando");
    }

    public void ler(){
        System.out.println("Lendo");
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
    }

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Mariana";
        pessoa1.idade = 26;
        pessoa1.altura = 1.64;

        pessoa1.andar();

        pessoa1.ler();

        pessoa1.exibirInformacoes();

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Lais";
        pessoa2.idade = 22;
        pessoa2.altura = 1.58;

        pessoa2.exibirInformacoes();
    }
}
