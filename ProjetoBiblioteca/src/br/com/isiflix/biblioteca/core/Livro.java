package br.com.isiflix.biblioteca.core;

import java.util.ArrayList;
import java.util.SplittableRandom;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPub;
    private String categoria;
    private int estante;
    private int prateleira;
    private boolean emprestado;


    public String  emprestar() {
        if (emprestado) {
            return "Livro ja emprestado, aguarde retornar!";
        }

        this.emprestado = true;
        return "Emprestado com sucesso";
    }

    public String  devolver() {
        if (emprestado) {
            this.emprestado = false;
            return "Devolução concluida";
        }
        return "Livro ja está devolvido";

    }

    public Livro(String titulo, String autor, int anoPub, String categoria, int estante, int prateleira, boolean emprestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPub = anoPub;
        this.categoria = categoria;
        this.estante = estante;
        this.prateleira = prateleira;
        this.emprestado = emprestado;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPub=" + anoPub +
                ", categoria='" + categoria + '\'' +
                ", estante=" + estante +
                ", prateleira=" + prateleira +
                ", emprestado=" + emprestado +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPub() {
        return anoPub;
    }

    public void setAnoPub(int anoPub) {
        this.anoPub = anoPub;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getEstante() {
        return estante;
    }

    public void setEstante(int estante) {
        this.estante = estante;
    }

    public int getPrateleira() {
        return prateleira;
    }

    public void setPrateleira(int prateleira) {
        this.prateleira = prateleira;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
}
