public class Conta {
	//para que o atributo não seja acessado, lido ou atribuido diretamente usamos o private para proibir qualquer ação direta nele
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	public void deposita(double valor) { //criando método deposita
		this.saldo += valor;
	}
	public boolean saca(double valor) { 
		if(this.saldo >= valor) { 
	        this.saldo -= valor; 
	        return true;
		} else {
	    return false;
		}
	}
	public boolean transfere(double valor, Conta destino) { 
		if(this.saldo >= valor) { 
			this.saldo -= valor; 
	        destino.deposita(valor);
	        return true;
	    } else {
	    return false;
	    }
	}
	public double getSaldo() {
		return this.saldo;
	}
}











