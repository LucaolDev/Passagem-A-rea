package br.fiap.cliente;

public class PessoaFisica extends Cliente{
    private String cpf;

    public PessoaFisica(String nome, String contato, String cpf) {
        super(nome, contato);
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        String aux = super.toString();
        aux += "CPF: " + cpf + "\n";
        return aux;
    }

    @Override
    public String getIdentificador() {
        return this.cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
