package com.jpifuncionario;

public class Main {

    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Carolina", 5, 3000d, 6000d);
        vendedor.calculePlus();
        System.out.println(vendedor);

        Entregador entregador = new Entregador("João",4,3500d,"3");
        entregador.calculePlus();
        System.out.println(entregador);
    }
}