package domain;

public class Monitor implements Produto{

    private String nome;
    private double valor;
    private boolean is220;

    public Monitor(String nome,double valor, boolean is220){
        this.nome = nome;
        this.valor = valor;
        this.is220 = is220;
    }
    
    @Override
    public double getValor() {
        return 0;
    }

    @Override
    public double getDesconto() {
        return 0;
    }

    @Override
    public int getAltura() {
        return 0;
    }

    @Override
    public int getLargura() {
        return 0;
    }

    @Override
    public int getPeso() {
        return 0;
    }
}
