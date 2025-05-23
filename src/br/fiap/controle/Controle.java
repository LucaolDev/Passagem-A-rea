package br.fiap.controle;
import br.fiap.assento.Assento;
import br.fiap.cliente.Cliente;
import br.fiap.cliente.PessoaFisica;
import br.fiap.cliente.PessoaJuridica;
import br.fiap.reserva.Reserva;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.*;

public class Controle {

    private static List<Cliente> listaCliente = new ArrayList<>();
    private static List<Assento> listaAssento = new ArrayList<>();
    private static List<Reserva> listaReserva = new ArrayList<>();

    static {
        // lista de cliente
        listaCliente.add(new PessoaFisica("A", "CA", "123"));
        listaCliente.add(new PessoaFisica("B", "CB", "234"));
        listaCliente.add(new PessoaFisica("C", "CC", "345"));
        listaCliente.add(new PessoaFisica("D", "CD", "456"));

        // lista de assentos
        for(int i = 1; i <= 10; i++){
            listaAssento.add(new Assento(i));
        }
    }

    public void menu() {
        int opcao;

        while(true) {
            try {
                opcao = parseInt(showInputDialog(gerarMenu()));
                switch(opcao) {
                    case 1:
                        reservar();
                        break;
                    case 2:
                        pesquisar();
                        break;
                    case 3:
                        cancelar();
                        break;
                    case 4:
                        return;
                    default:
                        showMessageDialog(null, "Opção inválida");
                }
            }
            catch(NumberFormatException e) {
                showMessageDialog(null, "você deve digitar um número");
            }
        }
    }

    private void cancelar() { }

    private void pesquisar() {
        String indentificador = showInputDialog("CPF/CNPJ para pesquisar");
        for(Reserva reserva : listaReserva){
            if(reserva.getCliente().getIdentificador().equals(indentificador)){
                showMessageDialog(null, reserva);
            }
        }
    }

    private void reservar() { }

    private String gerarMenu() {
        String aux = "SISTEMA DE RESERVA DE PASSAGEM AÉREA\n";
        aux += "1. Reservar\n";
        aux += "2. Pesquisar reserva\n";
        aux += "3. Cancelar reserva\n";
        aux += "4. Finalizar";
        return aux;
    }
}
