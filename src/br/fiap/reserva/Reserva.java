package br.fiap.reserva;

import br.fiap.assento.Assento;
import br.fiap.cliente.Cliente;
import br.fiap.cliente.PessoaFisica;
import br.fiap.desconto.Desconto;

import java.text.DecimalFormat;
import java.util.Random;

public class Reserva {
    private Cliente cliente;
    private double valorOriginal;
    private double valorFinal;
    private Assento assento;

    public Reserva(Cliente cliente, double valorOriginal, Assento assento) {
        this.cliente = cliente;
        this.valorOriginal = valorOriginal;
        this.assento = assento;
        calcularValorFinal(valorOriginal);
    }

    private void calcularValorFinal(double valorOriginal) {
        if(cliente instanceof Desconto) {
            valorFinal = ((Desconto) cliente).aplicarDesconto(valorOriginal);
        }
        else {
            valorFinal = valorOriginal;
        }
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String aux = "";
        aux += "Cliente: " + cliente.getNome() + "\n";
        aux += "Assento: " + assento.getNumero() + "\n";
        aux += "Valor Original: R$ " + df.format(valorOriginal) + "\n";
        aux += "Valor Final: R$ " + df.format(valorFinal) + "\n";
        return aux;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValorOriginal() {
        return valorOriginal;
    }

    public void setValorOriginal(double valorOriginal) {
        this.valorOriginal = valorOriginal;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public Assento getAssento() {
        return assento;
    }

    public void setAssento(Assento assento) {
        this.assento = assento;
    }
}
