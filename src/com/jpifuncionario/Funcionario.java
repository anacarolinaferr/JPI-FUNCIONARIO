package com.jpifuncionario;

import java.text.NumberFormat;

public abstract class Funcionario {
    private String nome;
    protected Integer antiguidade;
    protected Double salario;
    private double plus;

    public Funcionario() {

    }

    public Funcionario(String nome, Integer antiguidade, Double salario, double plus) {
        this.nome = nome;
        this.antiguidade = antiguidade;
        this.salario = salario;
        this.plus = plus;
    }

    public abstract double calculePlus();

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public Integer getAntiguidade() {

        return antiguidade;
    }

    public void setAntiguidade(Integer antiguidade) {

        this.antiguidade = antiguidade;
    }

    public Double getSalario() {

        return salario;
    }

    public void setSalario(Double salario) {

        this.salario = salario;
    }

    public double getPlus() {

        return plus;
    }

    public void setPlus(double plus) {

        this.plus = plus;
    }

    @Override
    public String toString() {
        return nome +" "+NumberFormat.getCurrencyInstance().format(getSalario()).replaceAll("\\u00A0", "");
    }
}