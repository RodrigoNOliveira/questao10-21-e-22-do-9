class App {
    public static void main(String[] args) {

        int soma = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                soma = soma + i;

            }

        }
        System.out.println("A soma de todos os números multiplos de 3 ou 5 abaixo de 1000 é de: " + soma);
    }
}