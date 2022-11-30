package aula06;

public class Aula_06 {

    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.maisVolume();
        c.abrirMenu();
        c.fecharMenu();
    }
    //consigo apenas aumentar volume e diminuir, não tenho como alterar muito por conta encapsulamento
}