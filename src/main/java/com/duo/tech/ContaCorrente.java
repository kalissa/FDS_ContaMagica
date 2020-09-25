package com.duo.tech;

public class ContaCorrente {
  private double saldo;
  private String nomeCorrentista;
  private String nroConta;
  private Categoria categoria;

  public ContaCorrente(String nome, String nroConta) {
    this.saldo = 0.0;
    this.nomeCorrentista = nome;
    this.nroConta = nroConta;
    this.categoria = Categoria.SILVER;
  }

  public double getSaldo() {
    return saldo;
  }

  protected void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public String getNomeCorrentista() {
    return nomeCorrentista;
  }

  public String getNumeroConta() {
    return nroConta;
  }

  public String getCategoria() {
    return categoria.getCategoria();
  }

  public boolean deposito(double valor) {
    if (valor <= 0) {
      return false;
    }

    if (categoria.equals(Categoria.PLATINUM)) {
      saldo += valor * 1.025;
    } else if (categoria.equals(Categoria.GOLD)) {
      saldo += valor * 1.01;
    } else {
      saldo += valor;
    }

    subirCategoria();
    return true;
  }

  private void subirCategoria() {
    if (saldo >= 200000 && categoria.equals(Categoria.GOLD)) {
      categoria = Categoria.PLATINUM;
    } else if (saldo >= 50000 && categoria.equals(Categoria.SILVER)) {
      categoria = Categoria.GOLD;
    }
  }

  public boolean retirada(double valor) {
    if (valor <= 0 || valor > saldo) {
      return false;
    }

    saldo -= valor;
    descerCategoria();
    return true;
  }

  private void descerCategoria() {
    if (saldo < 100000 && categoria.equals(Categoria.PLATINUM)) {
      categoria = Categoria.GOLD;
    } else if (saldo < 25000 && categoria.equals(Categoria.GOLD)) {
      categoria = Categoria.SILVER;
    }
  }
}
