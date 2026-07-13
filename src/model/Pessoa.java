package model;


public abstract class Pessoa {
    private String nome;
    private static int totalPessoasCriadas = 0;
    public Pessoa(String nome){
        this.nome = nome;
        totalPessoasCriadas++;
    }
    public abstract String getTipo();
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        if (nome != null && !nome.trim().isEmpty()){
            this.nome = nome;
        }
        
    }
    public static int getTotalPessoasCriadas(){
        return totalPessoasCriadas;
    }
}
