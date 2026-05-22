/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula1505;

/**
 *
 * @author cristiano.aborba
 */
public class Aula1505 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Produto produto = new Produto();
        produto.nome = "Celular";
        produto.desc = "Esse é um celular Iphone 17";
        produto.preco = "Por apenas R$15000";
        produto.lote = "SP1010";
        
        Produto notebook = new Produto();
        notebook.nome = "Macbook";
        notebook.desc = "Macbook incrível, próprio para estudantes!";
        notebook.preco = "Apenas R$20000";
        notebook.lote = "SP0909";
        
        Produto mouse = new Produto();
        mouse.nome = "Razer";
        mouse.desc = "Mouse gamer, perfeito para jogar um CS";
        mouse.preco = "Por apenas R$200";
        mouse.lote = "SP1234";
        
        Produto teclado = new Produto();
        teclado.nome = "Logitech";
        teclado.desc = "Teclado mecânico perfeito para gamers de plantão";
        teclado.preco = "Por apenas R$400";
        teclado.lote = "SP4321";
        
        Produto monitor = new Produto();
        monitor.nome = "AOC";
        monitor.desc = "Monitor da marca AOC, 120GHZ";
        monitor.preco = "Por apenas R$700 na promoção";
        monitor.lote = "RJ123132";
        
        Fornecedor shopee = new Fornecedor();
        shopee.nome = "CrisEletrônicos";
        shopee.cnpj = "34234234";
        shopee.endereço = "Rua São João";
        shopee.email = "criseletricos@gmail.com";
        
        Fornecedor ml = new Fornecedor();
        ml.nome = "EletronicosSãoJoão";
        ml.cnpj = "23742734";
        ml.endereço = "Rua São João";
        ml.email = "eletronicossj@ml.com";
        
    }
    
}
