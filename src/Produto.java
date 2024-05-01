public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;
    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDataValidade(Data dataValidade){
        this.dataValidade = dataValidade;
    }

    public String toString() {
        return "Produto { " +
                " Nome: " + getNome() + "," +
                " Preço: " + getPreco() + "," +
                " Data validade: " + getDataValidade() +
                "}";
    }

    public boolean estaVencido(Data dataValidadeProduto) {
        if (dataValidadeProduto.getAno() < dataValidade.getAno())
            return false; //nao ta vencido
        else if (dataValidadeProduto.getAno() == dataValidade.getAno())
            if (dataValidadeProduto.getMes() < dataValidade.getMes())
                return false; //nso ta vencido
            else if (dataValidadeProduto.getMes() == dataValidade.getMes())
                if (dataValidadeProduto.getDia() <= dataValidade.getDia())
                    return false;
        return true;
    }
}
