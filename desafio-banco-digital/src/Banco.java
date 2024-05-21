import java.util.ArrayList;
import java.util.List;

public class Banco {
	private List<Conta> contas;

	public Banco() {
		this.contas = new ArrayList<>();
	}

	public void adicionarConta(Conta c) {
		contas.add(c);
	}

	public void imprimirContas() {
		System.out.println(contas);
	}

	public void totalContas() {
		System.out.println(contas.size());
	}
}
