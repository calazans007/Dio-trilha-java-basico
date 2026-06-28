public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");



        // Declaração de variáveis vs constantes


        // variáveis são declaradas com a palavra-chave var e podem ser alteradas posteriormente
        var idade = 25; // Variável

        int idade2 = 30; // Variável

        idade = 26; // Alterando o valor da variável idade

        // constantes são declaradas com a palavra-chave final e não podem ser alteradas após a atribuição inicial
        final double PI = 3.14159; // Constante



         // Tipos primitivos em Java
        // exemplos de tipos primitivos: int, double, boolean, char, byte, short, long, float

        short idadeShort = 1;
        System.out.println("Idade (short): " + idadeShort);

        byte idadeByte = 127;
        System.out.println("Idade (byte): " + idadeByte);

        int idade = 127;
        System.out.println("Idade: " + idade);

        double altura = 1.75;
        System.out.println("Altura: " + altura);

        int anoFabricacao = 2020;
        System.out.println("Ano de fabricação: " + anoFabricacao);

        double salarioMensal = 7500.50;
        System.out.println("Salário mensal: " + salarioMensal);

        long populacaoMundial = 7800000000L;
        System.out.println("População mundial: " + populacaoMundial);

        boolean isJavaFun = true;
        System.out.println("Java é divertido? " + isJavaFun);

        float pi = 3.14f;
        System.out.println("Valor de pi: " + pi);
    }
}
