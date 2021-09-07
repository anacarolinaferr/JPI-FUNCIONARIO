package com.jpifuncionario;


import java.text.NumberFormat;

public class Vendedor extends Funcionario{
    private Double comissao;
    private static final double PLUS = 5000;
    private double total;

    public Vendedor(String nome, Integer antiguidade, Double salario, Double comissao) {
        super(nome, antiguidade, salario, PLUS);
        this.comissao = comissao;
    }

    public double getComissao() {

        return comissao;
    }

    public static double getPLUS() {

        return PLUS;
    }

    @Override
    public double calculePlus() {
        if (antiguidade > 5 && comissao > 5000) {
            this.total = salario + comissao + PLUS;
        }
        return this.total;
    }

    @Override
    public String toString() {

        return "Funcionário vendedor: " + super.getNome()+" "+ NumberFormat.getCurrencyInstance().format(total).replaceAll("\\u00A0", "");
    }
}