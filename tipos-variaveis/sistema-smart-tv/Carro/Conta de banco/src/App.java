public class App {
    public static void main(String[] args) throws Exception {
    Conta conta = new Conta();
    conta.imprimirSaldo();

        conta.sacar(500.0);
        System.out.println("Divida Exponencial: " + conta.calcularDividaExponencial());
    }
}
