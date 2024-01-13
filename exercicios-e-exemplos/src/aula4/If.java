package aula4;

public class If {
    public static void main(String[] args) {
        int nota = 10;

        if (nota >= 6){
            System.out.println("Aprovado!");
        }
        else if (nota < 6 && nota >= 4){
            System.out.println("Recuperacao!");
        }
        else {
            System.out.println("Reprovado!");
        }

    }
}
