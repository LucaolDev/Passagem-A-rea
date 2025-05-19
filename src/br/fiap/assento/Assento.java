package br.fiap.assento;

public class Assento {
    private int numero;
    private boolean disponivel;

    public Assento(int numero) {
        this.numero = numero;
        this.disponivel = true;
    }

    @Override
    public String toString() {
        String aux = "";
        aux += "Numero: " + this.numero + "\n";
        aux += "Disponivel: " + this.disponivel + "\n";
        return aux;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
