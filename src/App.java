public class App {
    
    public static void main(String[] args) {
        Cliente Luiz = new Cliente();
        Luiz.setNome("Luiz");
            
        Conta cc = new ContaCorrente(Luiz);
        Conta poupanca = new ContaPoupanca(Luiz);
    
        cc.depositar(100);
        cc.transferir(100, poupanca);
            
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
    
}