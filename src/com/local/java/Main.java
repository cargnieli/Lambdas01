package com.local.java;

public class Main {

    public static void main(String[] args) {
	Funcao funcao = valor -> valor;
        System.out.println(funcao.gerar("Robson das Neves"));
    }
}


interface Funcao {
    String gerar(String valor);
}