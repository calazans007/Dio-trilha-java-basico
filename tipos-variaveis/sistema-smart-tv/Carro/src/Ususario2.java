public class Ususario2 {
    public static void main(String[] args) throws Exception {

        Carro carro1 = new Carro();
        carro1.modelo = "Fusca";
        System.out.println("Modelo do carro: " + carro1.modelo);

        carro1.cor = "Azul";
        System.out.println("Cor do carro: " + carro1.cor);

        carro1.placa = "ABC-1234";
        System.out.println("Cor do carro: " + carro1.cor);

        carro1.ano = 1980;
        carro1.aceleracao = "Acelerando o carro";
        System.out.println("Ano do carro: " + carro1.ano);

        carro1.freio = "Freando o carro";
        System.out.println("Freio do carro: " + carro1.freio);

        carro1.acelerar();
        System.out.println(carro1.aceleracao);
        carro1.frear();
        System.out.println(carro1.freio);

    }
}
