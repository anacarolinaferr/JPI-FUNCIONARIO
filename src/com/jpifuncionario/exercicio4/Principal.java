package com.jpifuncionario.exercicio4;

import com.jpifuncionario.exercicio4.Entregador;
import com.jpifuncionario.exercicio4.Vendedor;

public class Principal {

    public static void main(String[] args) {
        Funcionario carlos = new Vendedor("Carlos",8,3000d,0d);
        carlos.calculePlus();
        System.out.println(carlos);

        Funcionario maria = new Vendedor("Maria",6,6000d,7000d);
        maria.calculePlus();
        System.out.println(maria);

        Funcionario joao = new Entregador("João",4,3500d,"3");
        joao.calculePlus();
        System.out.println(joao);

        Funcionario rosa = new Entregador("Rosa",4,4500d,"2");
        rosa.calculePlus();
        System.out.println(rosa);
    }

}
