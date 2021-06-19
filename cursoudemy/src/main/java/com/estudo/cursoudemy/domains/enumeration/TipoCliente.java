package com.estudo.cursoudemy.domains.enumeration;

public enum TipoCliente {

    PESSOAFISICA(1, "Pesssoa Fícia"),
    PESSOAJURIDICA(2, "Pessoa Júridica");

    private  int cod;
    private String descrico;

    private TipoCliente(int cod, String descrico) {
        this.cod = cod;
        this.descrico = descrico;
    }

    public int getCod() {
        return cod;
    }

    public String getDescrico() {
        return descrico;
    }

    public static TipoCliente toEnum(Integer cod) {

        if (cod == null) {
            return null;
        }
        for (TipoCliente x: TipoCliente.values()) {
            if (cod.equals(x.getCod())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Id inválido: " + cod);
    }
}
