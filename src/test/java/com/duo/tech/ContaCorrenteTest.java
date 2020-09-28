package com.duo.tech;

import org.junit.jupiter.api.Test;


public class ContaCorrenteTest {
    private ContaMagica contaMaria;
    private ContaMagica contaJoana;
    private ContaMagica contaFelipe;
    private ContaMagica contaJulia;
    private ContaMagica contaEric;
    private ContaMagica contaKalissa;
    private ContaMagica contaArlindo;
    private ContaMagica contaMarcos;
    private ContaMagica contaSilvia;
    private ContaMagica contaMarcelo;
    private ContaMagica contaAna;
    private ContaMagica contaJuliana;
    private ContaMagica contaLucas;
    private ContaMagica contaGabriela;
    private ContaMagica contaMariana;
    private ContaMagica contaLeonardo;
    private ContaMagica contaMariano;
    private ContaMagica contaRafael;
    private ContaMagica contaJurandir;
  /*
    

    Criar conta e depositar um valor negativo 5000(testar(esperar deposito = False))
    Utilizar a conta 10 e retirar 300.000(testar(esperar deposito = False))
    Utilizar a conta 7 e retirar 0(testar(esperar deposito = False))
    */
  
  @BeforeEach
  public void setup(){

    //1°Conta: Iniciar a conta depositando 40.000(testar se a conta mudou de silver para gold(não pode mudar))
    contaMaria = new ContaMagica();
    contaMaria.deposito(40000); 

    //2°Conta: Iniciar uma conta depositando 50.000(testa se ela mudou de siver para gold(tem que mudar))
    contaJoana = new ContaMagica();
    contaJoana.deposito(50000);

    //3°Conta: Iniciar a conta depositando 51.000(testar(esperar gold))
    contaFelipe = new ContaMagica();
    contaFelipe.deposito(51000);

    //4°Conta: Iniciar uma conta depositando 200.000(testar(valor esperado gold))
    contaJulia = new ContaMagica();
    contaJulia.deposito(200000);

    //5°Conta: Iniciar uma conta depositando 253.894(testar(valor esperando gold))
    contaKalissa = new ContaMagica();
    contaKalissa.deposito(253894);

    //6°Conta: Iniciar uma conta depositando 55.000, realizar outro deposito de 50.000(testar(esperar gold))
    contaArlindo = new ContaMagica();
    contaArlindo.deposito(55000);
    contaArlindo.deposito(50000);

    //7°Conta: Iniciar uma conta depositando 100.000, realizar outro deposito de 100.000(testar(esperar platinum))
    contaMarcos = new ContaMagica();
    contaMarcos.deposito(100000);
    contaMarcos.deposito(100000);

    //8°Conta: Iniciar uma conta depositando 200.000, realizar outro deposito de 1000(testar(esperar platinum))
    contaSilvia = new ContaMagica();
    contaSilvia.deposito(200000);
    contaSilvia.deposito(1000);

    //9°Conta: Iniciar uma conta depositando 200.000, realizar um retirada de 30.000(testar(esperar gold))
    contaMarcelo = new ContaMagica();
    contaMarcelo.deposito(200000);
    contaMarcelo.deposito(30000);

    //10°Conta: Iniciar uma conta depositando 100.000, realizar outro deposito de 220.000(testar(esperar platinum)
    contaAna = new ContaMagica();
    contaAna.deposito(100000);
    contaAna.deposito(220000);

    //11°Conta: Iniciar uma conta depositando 60.000, realizar uma retirada de 20.000(testar(esperar gold))
    contaJuliana = new ContaMagica();
    contaJuliana.deposito(60000);
    contaJuliana.retirada(20000);

    //12°Conta: Iniciar uma conta depositando 60.000, realizar uma retirada de 35.000(testar(esperar gold))
    contaLucas = new ContaMagica();
    contaLucas.deposito(60000);
    contaLucas.retirada(35000);
    
    //13°Conta: Iniciar uma conta depositando 60.000, realizar uma retirada de 45.000(testar(esperar silver))
    contaGabriela = new contaMagica();
    contaGabriela.deposito(60000);
    contaGabriela.retirada(45000);

    //14°Conta: Iniciar uma conta depositando 60.000, realizar um deposito de 200.000, retirar 100.000 (testar(esperar platinum))
    contaMariana = new contaMagica();
    contaMarina.deposito(60000);
    contaMariana.deposito(200000);
    contaMariana.retirada(100000);

    //15°Conta: Iniciar uma conta depositando 50.000, realizar um deposito de 200.000, retirar 150.000(testar(esperar platinum))
    contaLeonardo = new contaMagica();
    contaLeonardo.deposito(50000);
    contaLeonardo.deposito(200000);
    contaLeonardo.retirada(150000);

    //16°Conta: Iniciar uma conta depositando 30.000, realizar um deposito de 200.000, retirar 140.000(testar(esperar gold))
    contaMariano = new contaMagica();
    contaMariano.deposito(30000);
    contaMariano.deposito(200000);
    contaMariano.retirada(140000);

    //17°: Iniciar uma conta depositando 100.000, realizar um deposito de 150.000, retirar 240.000(testar(esperar gold))
    contaRafael = new contaMagica();
    contaRafael.deposito(100000);
    contaRafael.deposito(150000);
    contaRafael.retirada(240000);

    //18°Conta: Iniciar uma conta depositando 100.000, realizar um deposito de 140.000, retirar 240.000, retiro 5.000(testar(esperar silver))
    contaJurandir = new contaMagica();
    contaJurandir.deposito(100000);
    contaJurandir.deposito(140000);
    contaJurandir.retirada(240000);
    contaJurandir.retirada(5000);
    
  }

  //Teste de limites das categorias das contas.
  @ParameterizedTest
  @EnumSource(Categoria.getCategoria, names = {"Silver"})
  void testarCategoriaSilver(Categoria categoria) {
    Categoria categoriaContaAnalisada = contaMaria.getCategoria();
    Categoria categoriaContaAnalisada2 = contaGabriela.getCategoria();
    Categoria categoriaContaAnalisada3 = contaJurandir.getCategoria();
    assertEquals(categoria, categoriaContaAnalisada);
    assertEquals(categoria, categoriaContaAnalisada2);
    assertEquals(categoria, categoriaContaAnalisada3);
  }

  @ParameterizedTest
  @EnumSource(Categoria.getCategoria, names = {"Gold"})
  void testarCategoriaGold(Categoria categoria) {
    Categoria categoriaContaAnalisada = contaJoana.getCategoria();
    Categoria categoriaContaAnalisada2 = contaFelipe.getCategoria();
    Categoria categoriaContaAnalisada3 = contaJulia.getCategoria();
    Categoria categoriaContaAnalisada4 = contaKalissa.getCategoria();
    Categoria categoriaContaAnalisada5 = contaArlindo.getCategoria();
    Categoria categoriaContaAnalisada6 = contaMarcelo.getCategoria();
    Categoria categoriaContaAnalisada7 = contaJuliana.getCategoria();
    Categoria categoriaContaAnalisada8 = contaLucas.getCategoria();
    Categoria categoriaContaAnalisada9 = contaMariano.getCategoria();
    Categoria categoriaContaAnalisada10 = contaRafael.getCategoria();
    assertEquals(categoria, categoriaContaAnalisada);
    assertEquals(categoria, categoriaContaAnalisada2);
    assertEquals(categoria, categoriaContaAnalisada3);
    assertEquals(categoria, categoriaContaAnalisada4);
    assertEquals(categoria, categoriaContaAnalisada5);
    assertEquals(categoria, categoriaContaAnalisada6);
    assertEquals(categoria, categoriaContaAnalisada7);
    assertEquals(categoria, categoriaContaAnalisada8);
    assertEquals(categoria, categoriaContaAnalisada9);
    assertEquals(categoria, categoriaContaAnalisada10);
  }

  @ParameterizedTest
  @EnumSource(Categoria.getCategoria, names = {"Platinum"})
  void testarCategoriaPlatinum(Categoria categoria) {
    Categoria categoriaContaAnalisada = contaMarcos.getCategoria();
    Categoria categoriaContaAnalisada2 = contaSilvia.getCategoria();
    Categoria categoriaContaAnalisada3 = contaAna.getCategoria();
    Categoria categoriaContaAnalisada4 = contaMariana.getCategoria();
    Categoria categoriaContaAnalisada5 = contaLeonardo.getCategoria();
    assertEquals(categoria, categoriaContaAnalisada);
    assertEquals(categoria, categoriaContaAnalisada2);
    assertEquals(categoria, categoriaContaAnalisada3);
    assertEquals(categoria, categoriaContaAnalisada4);
    assertEquals(categoria, categoriaContaAnalisada5);
  }

  //Particionamento

  //Teste do deposito

  //Teste de unidade deposito negativo
  @Test​
  public void depositoNegativo​(){
    Assertions.assertFalse(false, contaJuliana.deposito(-60000));​
  }
  //Teste de unidade para deposito com valor 0
  @Test​
  public void depositoValorZero​(){
    Assertions.assertFalse(false, contaJurandir.deposito(0));​
  }
  //Teste de unidade para retirada (valor acima do limite)
  @Test​
  public void retiradaValorMaior​(){
    Assertions.assertFalse(false, contaMariana.retirar(500000));​
  }
  //Teste de unidade para retirada (valor negativo)
  @Test​
  public void retiradaValorNegativo​(){
    Assertions.assertFalse(false, contaJurandir.retirar(-3000));​
  }
  //Teste de unidade para retirada (valor 0)
  @Test​
  public void retiradaValor0​(){
    Assertions.assertFalse(false, contaJurandir.retirar(0));​
  }
}

















