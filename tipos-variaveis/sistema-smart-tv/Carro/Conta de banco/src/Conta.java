public class Conta {

    // variavel de instancia
    // O saldo é uma variavel de instancia, pois ela é declarada dentro da classe, mas fora de qualquer metodo. Isso significa que cada objeto da classe Conta terá sua propria copia da variavel saldo.
    double saldo = 7.500; // variavel de instancia

        public void sacar(Double valor) {
            // variavel local de metodo
            double novoSaldo = saldo - valor;

            //somente o método sacar tem acesso a variavel local novoSaldo, pois ela é declarada dentro do metodo sacar. Isso significa que a variavel novoSaldo so existe enquanto o metodo sacar estiver sendo executado.
            System.out.println("Novo saldo: " + novoSaldo);
        }


        public void imprimirSaldo() {
            // disponivel em todo o escopo da classe
            System.out.println("Saldo atual: " + saldo);

    }

        public double calcularDividaExponencial(){
            // variavel local de metodo
            double divida = saldo * 1.1;

            double valorParcela = 50.0;
            double valorMontante = 0.0;
            for (int x = 1; x <=5; x++) {
                double valorCalculado = valorParcela * x;
                valorMontante = valorParcela + valorCalculado;
            }

            //somente o método calcularDividaExponencial tem acesso a variavel local divida, pois ela é declarada dentro do metodo calcularDividaExponencial. Isso significa que a variavel divida so existe enquanto o metodo calcularDividaExponencial estiver sendo executado.
            return valorMontante;
        }


}
