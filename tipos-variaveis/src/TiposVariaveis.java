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

        char letra = 'A';
        System.out.println("Letra: " + letra);







        // Tipos de referência em Java
        // exemplos de tipos de referência: String, Arrays, Classes, Interfaces

        String nome = "João";
        System.out.println("Nome: " + nome);

        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("Números: " + java.util.Arrays.toString(numeros));

        // Exemplo de classe
        class Pessoa {
            String nome;
            int idade;

            Pessoa(String nome, int idade) {
                this.nome = nome;
                this.idade = idade;
            }

            void apresentar() {
                System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
            }
        }

        Pessoa pessoa = new Pessoa("Maria", 28);
        pessoa.apresentar();

    }

    // Exemplo de interface
    interface Animal {
        void fazerSom();

    }

    // Implementação da interface
    class Cachorro implements Animal {
        public void fazerSom() {
            System.out.println("Au Au!");
        }
    }

    // Exemplo de uso da interface
    public void demonstrarInterface() {
        Animal cachorro = new Cachorro();
        cachorro.fazerSom();
    }

    // Exemplo de uso de arrays
    public void demonstrarArrays() {
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("Números: " + java.util.Arrays.toString(numeros));
    }

    // Exemplo de uso de Strings
    public void demonstrarStrings() {
        String saudacao = "Olá, Mundo!";
        System.out.println(saudacao);
    }

    // Exemplo de super classe e subclasse
    class AnimalSuper {
        void fazerSom() {
            System.out.println("Animal fazendo som");
        }
    }

    class Gato extends AnimalSuper {
        void fazerSom() {
            System.out.println("Miau!");
        }
    }

    // Exemplo de polimorfismo
    public void demonstrarPolimorfismo() {
        AnimalSuper animal = new Gato();
        animal.fazerSom(); // Saída: Miau!
    }

    // Exemplo de encapsulamento
    class PessoaEncapsulada {
        private String nome;
        private int idade;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }
    }

    // Exemplo de uso de encapsulamento
    public void demonstrarEncapsulamento() {
        PessoaEncapsulada pessoa = new PessoaEncapsulada();
        pessoa.setNome("Carlos");
        pessoa.setIdade(35);
        System.out.println("Nome: " + pessoa.getNome() + ", Idade: " + pessoa.getIdade());
    }

    // Exemplo de uso de herança
    class Veiculo {
        void mover() {
            System.out.println("Veículo se movendo");
        }
    }

    class Carro extends Veiculo {
        void mover() {
            System.out.println("Carro se movendo");
        }
    }



    // Exemplo de uso de herança
    public void demonstrarHeranca() {
        Veiculo veiculo = new Carro();
        veiculo.mover(); // Saída: Carro se movendo
    }


    // Exemplo de uso de POO

    public void demonstrarPOO() {
        demonstrarPolimorfismo();
        demonstrarEncapsulamento();
        demonstrarHeranca();
    }




    //O que são construtores em Java?
    // Construtores são métodos especiais usados para inicializar objetos de uma classe. Eles têm o mesmo nome da classe e não possuem tipo de retorno.

    class PessoaConstrutor {
        String nome;
        int idade;

        // Construtor
        PessoaConstrutor(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        void apresentar() {
            System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
        }
    }

    // Exemplo de uso de construtores
    public void demonstrarConstrutores() {
        PessoaConstrutor pessoa = new PessoaConstrutor("Ana", 22);
        pessoa.apresentar();
    }


}
