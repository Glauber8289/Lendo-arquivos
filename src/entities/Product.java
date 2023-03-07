package entities;

public class Product {
   
	private String nome;
	private Double precoUnitario;
	private int valorTotal;
	public Product(String nome, Double precoUnitario, int valorTotal) {
		super();
		this.nome = nome;
		this.precoUnitario = precoUnitario;
		this.valorTotal = valorTotal;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPrecoUnitario() {
		return precoUnitario;
	}
	public void setPrecoUnitario(Double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	public int getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(int valorTotal) {
		this.valorTotal = valorTotal;
	}
	
    public Double Total () {
    	return valorTotal*precoUnitario;
    }
	
}
