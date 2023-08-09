package domain;

public class Teclado implements Produto{

    private String nome;
    private double valor;

    public Teclado(String nome,double valor){
        this.nome = nome;
        this.valor = valor;
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
