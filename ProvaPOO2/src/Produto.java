public class Produto {

    private String nome;
    private int quantidade;
    private String valor;
    private int codigo;

    
    
    public Produto() {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String string) {
        this.valor = string;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Produto [codigo=" + codigo + ", nome=" + nome + ", quantidade=" + quantidade + ", valor=" + valor + "]";
    }
}    
