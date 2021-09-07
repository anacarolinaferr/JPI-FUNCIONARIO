package com.jpifuncionario.exercicio4;

import java.text.NumberFormat;

public class Entregador extends Funcionario {
    private static final double PLUS = 5000;
    private String zona;
    private double total;

    public Entregador(String nome, Integer antiguidade, Double salario, String zona) {
        super(nome, antiguidade, salario);
        this.zona = zona;
    }

    public static double getPLUS() {
        return PLUS;
    }

    public String getZona() {
        return zona;
    }

    @Override
    public double calculePlus() {
        if (antiguidade > 3 && zona.equals("3")) {
            this.total = salario + PLUS;
        }else{
            this.total = salario;
        }
        return this.total;
    }

    @Override
    public String toString() {
        return "Funcionário entregador: " + super.getNome()+" "+ NumberFormat.getCurrencyInstance().format(total).replaceAll("\\u00A0", "");
    }
}