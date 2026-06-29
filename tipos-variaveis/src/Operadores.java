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
        boolean variavelBoolean = true;
        System.out.println("Variável booleana original: " + variavelBoolean);
        System.out.println(!variavelBoolean); // operador unário NOT

        variavelBoolean = !variavelBoolean; // operador untitário NOT
        System.out.println("Variável booleana após NOT: " + variavelBoolean);



        // Exemplo de operadores ternários
        // O operador ternário é uma forma concisa de expressar uma condição if-else em uma única linha. Ele tem a seguinte sintaxe:
        // condição ? valor_se_verdadeiro : valor_se_falso;

        int idade = 20;
        String resultado = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println("Resultado do operador ternário: " + resultado);

        int a1, b1;
        a1 = 10;
        b1 = 20;
        String resultado1 = "";

        if (a1 > b1) {
            resultado1 = "a1 é maior que b1";
        } else {
            resultado1 = "b1 é maior que a1";
            System.out.println("Resultado do if-else: " + resultado1);
        }


        String resultado2 = (a1 > b1) ? "a1 é maior que b1" : "b1 é maior que a1";
        System.out.println("Resultado do operador ternário: " + resultado2);
        int maior = (a1 > b1) ? a1 : b1;
        System.out.println("O maior valor é: " + maior);


        // Exemplo de operadores relacionais e lógicos combinados


        // Tipos de operadores relacionais: >, <, >=, <=, ==, !=
        int x = 10;
        int y = 20;
        boolean resultado3 = (x > 5) && (y < 30); // operador AND
        System.out.println("Resultado do operador AND: " + resultado3);

        if ((x > 5) && (y < 30)) {
            System.out.println("x é maior que 5 e y é menor que 30");
        } else {
            System.out.println("A condição não é verdadeira");
        }


        // Tipos de operadores lógicos: && (AND), || (OR), ! (NOT)

        if (( x+ 5 > 8) && (y+5 < 3)){

            System.out.println("A condição é verdadeira");
        } else {
            System.out.println("A condição não é verdadeira");
        }

    }


}
