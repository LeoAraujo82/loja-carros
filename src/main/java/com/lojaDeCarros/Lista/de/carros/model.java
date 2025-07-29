package com.lojaDeCarros.Lista.de.carros;

public class model {

    @Entity
    public class Carro {
        @Id @GeneratedValue
        private Long id;
        private String marca;
        private String modelo;
        private int ano;
        private double preco;
    }

}
