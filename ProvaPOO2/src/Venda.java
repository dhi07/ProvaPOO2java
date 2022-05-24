import java.time.LocalDate;

public class Venda {

    private String nomeVenda;
    private double valorUnitVenda;
    private String dataVenda;
    private int quantidadeVenda;
    
    public Venda(String nomeVenda, double valorUnitVenda, String dataVenda, int quantidadeVenda) {
        this.nomeVenda = nomeVenda;
        this.valorUnitVenda = valorUnitVenda;
        this.dataVenda = dataVenda;
        this.quantidadeVenda = quantidadeVenda;
    }

    public Venda() {
    }

    public String getNomeVenda() {
        return nomeVenda;
    }

    public void setNomeVenda(String nomeVenda) {
        this.nomeVenda = nomeVenda;
    }

    public double getValorUnitVenda() {
        return valorUnitVenda;
    }

    public void setValorUnitVenda(double valorUnitVenda) {
        this.valorUnitVenda = valorUnitVenda;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String string) {
        this.dataVenda = string;
    }

    public int getQuantidadeVenda() {
        return quantidadeVenda;
    }

    public void setQuantidadeVenda(int quantidadeVenda) {
        this.quantidadeVenda = quantidadeVenda;
    }

    @Override
    public String toString() {
        return "Venda [dataVenda=" + dataVenda + ", nomeVenda=" + nomeVenda + ", quantidadeVenda=" + quantidadeVenda
                + ", valorUnitVenda=" + valorUnitVenda + "]";
    }

	public void setValorUnitVenda(String next) {
	}
    
}
