package model;

import java.io.Serializable;

public class Curso implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome;
    private int duracao;
    private String professor;
    private Float valor;

    public Curso() {
    }

    public Curso(String nome, int duracao, String professor, Float valor) {
        this.nome = nome;
        this.duracao = duracao;
        this.professor = professor;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", duracao=" + duracao +
                ", professor='" + professor + '\'' +
                ", valor=" + valor +
                '}';
    }
}
