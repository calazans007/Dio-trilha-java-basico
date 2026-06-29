public class Operadores {
    public static void main(String[] args) {
        // Exemplo de operadores aritméticos

        String nomeCompleto = "Linguagem" + " " + "Java";
        System.out.println("Nome completo: " + nomeCompleto);

        String contatenacao = "Olá, " + "mundo!";
        System.out.println("Concatenação: " + contatenacao);

        contatenacao += " Bem-vindo ao Java!";
        System.out.println("Concatenação com +=: " + contatenacao);

        contatenacao = contatenacao + " Vamos aprender operadores.";
        System.out.println("Concatenação com +: " + contatenacao);

        contatenacao = 1 + 1 + 1 +"1"; // A soma é feita da esquerda para a direita, então o resultado será "31"
        System.out.println("Resultado da expressão: " + contatenacao);

        contatenacao = 1 + "1" + 1 + 1; // A soma é feita da esquerda para a direita, então o resultado será "1111"
        System.out.println("Resultado da expressão: " + contatenacao);



        int a = 10;
        int b = 5;
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);

        // Exemplo de operadores relacionais
        boolean maiorQue = a > b;
        boolean menorQue = a < b;
        boolean igualA = a == b;
        System.out.println("a é maior que b? " + maiorQue);
        System.out.println("a é menor que b? " + menorQue);
        System.out.println("a é igual a b? " + igualA);

        // Exemplo de operadores lógicos
        boolean condicao1 = true;
        boolean condicao2 = false;
        boolean resultadoE = condicao1 && condicao2; // AND
        boolean resultadoOU = condicao1 || condicao2; // OR
        boolean resultadoNAO = !condicao1; // NOT
        System.out.println("Resultado AND: " + resultadoE);
        System.out.println("Resultado OR: " + resultadoOU);
        System.out.println("Resultado NOT: " + resultadoNAO);


        // Exemplo de operadores unarios
        int numero = 5;
        System.out.println("Número original: " + numero);
        numero++; // operador unário de incremento de número
        int numeroPositivo = +numero; // operador unário positivo
        int numeroNegativo = -numero; // operador unário negativo
        System.out.println("Número positivo: " + numeroPositivo);
        System.out.println("Número negativo: " + numeroNegativo);
        



    }
}
