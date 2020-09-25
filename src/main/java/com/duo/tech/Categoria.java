package com.duo.tech;

public enum Categoria {
  SILVER("Silver"),
  GOLD("Gold"),
  PLATINUM("Platinum");

  private String categoria;

  private Categoria(String categoria) {
    this.categoria = categoria;
  }

  public String getCategoria() {
    return categoria;
  }
}
