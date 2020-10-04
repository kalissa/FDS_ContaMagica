package com.duo.tech;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import org.junit.jupiter.api.Test;

public class ContaCorrenteTest {
    private ContaCorrente contaMaria;
    private ContaCorrente contaJoana;
    private ContaCorrente contaFelipe;
    private ContaCorrente contaJulia;
    private ContaCorrente contaKalissa;
    private ContaCorrente contaArlindo;
    private ContaCorrente contaMarcos;
    private ContaCorrente contaSilvia;
    private ContaCorrente contaMarcelo;
    private ContaCorrente contaAna;
    private ContaCorrente contaJuliana;
    private ContaCorrente contaLucas;
    private ContaCorrente contaGabriela;
    private ContaCorrente contaMariana;
    private ContaCorrente contaLeonardo;
    private ContaCorrente contaMariano;
    private ContaCorrente contaRafael;
    private ContaCorrente contaJurandir;
    private ContaCorrente contaJosue;
    private ContaCorrente contaCarlinha;
  /*

    Criar conta e depositar um valor negativo 5000(testar(esperar deposito = False))
    Utilizar a conta 10 e retirar 300.000(testar(esperar deposito = False))
    Utilizar a conta 7 e retirar 0(testar(esperar deposito = False))
    */

  @BeforeEach
  public void setup(){

    //1°Conta: Iniciar uma conta depositando 40.000(testar se a conta mudou de silver para gold(não pode mudar))
    contaMaria = new ContaCorrente("Maria", "123");
    contaMaria.deposito(40000);

    //2°Conta: Iniciar uma conta depositando 50.000(testa se ela mudou de siver para gold(tem que mudar))
    contaJoana = new ContaCorrente("Joana", "123");
    contaJoana.deposito(50000);

    //3°Conta: Iniciar uma conta depositando 51.000(testar(esperar gold))
    contaFelipe = new ContaCorrente("Felipe", "123");
    contaFelipe.deposito(51000);

    //4°Conta: Iniciar uma conta depositando 200.000(testar(valor esperado gold))
    contaJulia = new ContaCorrente("Julia", "123");
    contaJulia.deposito(200000);

    //5°Conta: Iniciar uma conta depositando 253.894(testar(valor esperando gold))
    contaKalissa = new ContaCorrente("Kalissa", "123");
    contaKalissa.deposito(253894);

    //6°Conta: Iniciar uma conta depositando 55.000, realizar outro deposito de 50.000(testar(esperar gold))
    contaArlindo = new ContaCorrente("Arlindo", "123");
    contaArlindo.deposito(55000);
    contaArlindo.deposito(50000);

    //7°Conta: Iniciar uma conta depositando 100.000, realizar outro deposito de 100.000(testar(esperar platinum))
    contaMarcos = new ContaCorrente("Marcos", "123");
    contaMarcos.deposito(100000);
    contaMarcos.deposito(100000);

    //8°Conta: Iniciar uma conta depositando 200.000, realizar outro deposito de 1000(testar(esperar platinum))
    contaSilvia = new ContaCorrente("Silvia", "123");
    contaSilvia.deposito(200000);
    contaSilvia.deposito(1000);

    //9°Conta: Iniciar uma conta depositando 200.000, realizar um retirada de 30.000(testar(esperar gold))
    contaMarcelo = new ContaCorrente("Marcelo", "123");
    contaMarcelo.deposito(200000);
    contaMarcelo.retirada(30000);

    //10°Conta: Iniciar uma conta depositando 100.000, realizar outro deposito de 220.000(testar(esperar platinum)
    contaAna = new ContaCorrente("Ana", "123");
    contaAna.deposito(100000);
    contaAna.deposito(220000);

    //11°Conta: Iniciar uma conta depositando 60.000, realizar uma retirada de 20.000(testar(esperar gold))
    contaJuliana = new ContaCorrente("Juliana", "123");
    contaJuliana.deposito(60000);
    contaJuliana.retirada(20000);

    //12°Conta: Iniciar uma conta depositando 60.000, realizar uma retirada de 35.000(testar(esperar gold))
    contaLucas = new ContaCorrente("Lucas", "123");
    contaLucas.deposito(60000);
    contaLucas.retirada(35000);

    //13°Conta: Iniciar uma conta depositando 60.000, realizar uma retirada de 45.000(testar(esperar silver))
    contaGabriela = new ContaCorrente("Gabriela", "123");
    contaGabriela.deposito(60000);
    contaGabriela.retirada(45000);

    //14°Conta: Iniciar uma conta depositando 60.000, realizar um deposito de 200.000, retirar 100.000 (testar(esperar platinum))
    contaMariana = new ContaCorrente("Mariana", "123");
    contaMariana.deposito(60000);
    contaMariana.deposito(200000);
    contaMariana.retirada(100000);

    //15°Conta: Iniciar uma conta depositando 50.000, realizar um deposito de 200.000, retirar 150.000(testar(esperar platinum))
    contaLeonardo = new ContaCorrente("Leonardo", "123");
    contaLeonardo.deposito(50000);
    contaLeonardo.deposito(200000);
    contaLeonardo.retirada(150000);

    //16°Conta: Iniciar uma conta depositando 30.000, realizar um deposito de 200.000, retirar 140.000(testar(esperar gold))
    contaMariano = new ContaCorrente("Mariano", "123");
    contaMariano.deposito(30000);
    contaMariano.deposito(200000);
    contaMariano.retirada(140000);

    //17°: Iniciar uma conta depositando 100.000, realizar um deposito de 150.000, retirar 240.000(testar(esperar gold))
    contaRafael = new ContaCorrente("Rafael", "123");
    contaRafael.deposito(100000);
    contaRafael.deposito(150000);
    contaRafael.retirada(240000);

    //18°Conta: Iniciar uma conta depositando 100.000, realizar um deposito de 140.000, retirar 240.000, retiro 5.000(testar(esperar silver))
    contaJurandir = new ContaCorrente("Jurandir", "123");
    contaJurandir.deposito(100000);
    contaJurandir.deposito(140000);
    contaJurandir.retirada(240000);
    contaJurandir.retirada(500);

    //Depois do codecoverage

    //19º
    contaJosue = new ContaCorrente("Josue", "123");
    contaJosue.deposito(60000);
    contaJosue.deposito(200000);
    contaJosue.retirada(200000);
    contaJosue.retirada(55000);

    //20º
    contaCarlinha = new ContaCorrente("Carlinha", "123");
    contaCarlinha.deposito(60000);
    contaCarlinha.deposito(200000);
    contaCarlinha.deposito(200000);
    contaCarlinha.deposito(200000);
  }

  @ParameterizedTest
  @EnumSource(value = Categoria.class, names = {"SILVER"})
  void testarCategoriaSilver(Categoria categoria) {
    String categoriaContaAnalisada = contaMaria.getCategoria();
    String categoriaContaAnalisada2 = contaGabriela.getCategoria();
    String categoriaContaAnalisada3 = contaJurandir.getCategoria();
    assertEquals(categoria.getCategoria(), categoriaContaAnalisada);
    assertEquals(categoria.getCategoria(), categoriaContaAnalisada2);
    assertEquals(categoria.getCategoria(), categoriaContaAnalisada3);
  }

  @ParameterizedTest
  @EnumSource(value = Categoria.class, names = {"GOLD"})
  void testarCategoriaGold(Categoria categoria) {
    String categoriaContaAnalisada = contaJoana.getCategoria();
    String categoriaContaAnalisada2 = contaFelipe.getCategoria();
    String categoriaContaAnalisada3 = contaJulia.getCategoria();
    String categoriaContaAnalisada4 = contaKalissa.getCategoria();
    String categoriaContaAnalisada5 = contaArlindo.getCategoria();
    String categoriaContaAnalisada6 = contaMarcelo.getCategoria();
    String categoriaContaAnalisada7 = contaJuliana.getCategoria();
    String categoriaContaAnalisada8 = contaLucas.getCategoria();
    String categoriaContaAnalisada9 = contaMariano.getCategoria();
    String categoriaContaAnalisada10 = contaRafael.getCategoria();
    assertEquals(categoria.getCategoria(), categoriaContaAnalisada);
    assertEquals(categoria.getCategoria(), categoriaContaAnalisada2);
    assertEquals(categoria.getCategoria(), categoriaContaAnalisada3);
    assertEquals(categoria.getCategoria(), categoriaContaAnalisada4);
    assertEquals(categoria.getCategoria(), categoriaContaAnalisada5);
    assertEquals(categoria.getCategoria(), categoriaContaAnalisada6);
    assertEquals(categoria.getCategoria(), categoriaContaAnalisada7);
    assertEquals(categoria.getCategoria(), categoriaContaAnalisada8);
    assertEquals(categoria.getCategoria(), categoriaContaAnalisada9);
    assertEquals(categoria.getCategoria(), categoriaContaAnalisada10);
  }

  @ParameterizedTest
  @EnumSource(value = Categoria.class, names = {"PLATINUM"})
  void testarCategoriaPlatinum(Categoria categoria) {
    String categoriaContaAnalisada = contaMarcos.getCategoria();
    String categoriaContaAnalisada2 = contaSilvia.getCategoria();
    String categoriaContaAnalisada3 = contaAna.getCategoria();
    String categoriaContaAnalisada4 = contaMariana.getCategoria();
    String categoriaContaAnalisada5 = contaLeonardo.getCategoria();
    assertEquals(categoria.getCategoria(), categoriaContaAnalisada);
    assertEquals(categoria.getCategoria(), categoriaContaAnalisada2);
    assertEquals(categoria.getCategoria(), categoriaContaAnalisada3);
    assertEquals(categoria.getCategoria(), categoriaContaAnalisada4);
    assertEquals(categoria.getCategoria(), categoriaContaAnalisada5);
  }

  @Test
  public void depositoNegativo() {		
    assertEquals(false, contaAna.deposito(-4300));
  }

  @Test
  public void depositoZero() {		
    assertEquals(false, contaAna.deposito(0));
  }

  @Test
  public void depositoPlatina() {		
    contaAna.deposito(1000);
    assertEquals(323225.0,contaAna.getSaldo());
  }

  @Test
  public void retiradaNegativa() {		
    assertFalse(contaAna.retirada(-10000));
  }

  @Test
  public void retiradaMaiorValorQSaldo() {		
    assertFalse(contaAna.retirada(100000000));
  }

  @Test
  public void descerSilver() {		
    contaLeonardo.retirada(70000);
    contaLeonardo.retirada(25000);
    assertEquals("Silver",contaLeonardo.getCategoria());
  }

  @Test
  public void depositoPlatina2() {		
    contaCarlinha.deposito(1000);
    assertEquals(673025.0,contaCarlinha.getSaldo());
  }  
}
