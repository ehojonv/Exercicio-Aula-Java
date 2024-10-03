package Main;

import Models.CATEGORIAS_VAGAO;
import Models.Trem;
import Models.Vagao;

public class Main {
    public static void main(String[] args) {
        var vagao1 = new Vagao("1", CATEGORIAS_VAGAO.VAGAO_DE_TORAS,200);
        var trem1 = new Trem("1","O velozinho");

        trem1.addVagao(vagao1);
        trem1.locomover();

        System.out.println(trem1);
    }
}
