public class Main {
    public static void main(String[] args) throws Exception {
        Cliente venilton = new Cliente("Patrick", "15896325");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(300);
        cc.sacar(50);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

        Banco banco = new Banco();
        banco.adicionarConta(cc);
        banco.adicionarConta(poupanca);
        banco.totalContas();
        banco.imprimirContas();
    }
}
