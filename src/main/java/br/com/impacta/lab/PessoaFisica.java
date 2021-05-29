package br.com.impacta.lab;

public class PessoaFisica implements Pessoa {
    
    private String documento, tipo;

    public PessoaFisica (){

    }

    public PessoaFisica (String documento, String tipo){
        setDocumento(documento);
        setTipo(tipo);
    }

    @Override
    public String falarDocumento() {
        return getDocumento();
    }
    
    public String getDocumento() {
        return this.documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }



}
