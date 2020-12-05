package day37_CustomClass;

import java.time.LocalDate;

public class Best11Player {

    public static void main(String[] args) {

        Player GK = new Player();
        Player DF1 = new Player();
        Player DF2 = new Player();
        Player DF3 = new Player();
        Player DF4 = new Player();
        Player MD1 = new Player();
        Player MD2 = new Player();
        Player LW = new Player();
        Player RW = new Player();
        Player CF1 = new Player();
        Player CF2 = new Player();

        GK.setInfo("Juventus", "Buffon", "GK", 1, LocalDate.of(1980, 01, 01), 8.9, 45);
        GK.getInfo();
        System.out.println("-------------------");
        DF1.setInfo("Barcelona", "Puyol", "CB", 4, LocalDate.of(1981, 01, 01), 8.9, 55);
        DF1.getInfo();
        System.out.println("-------------------");
        DF2.setInfo("Inter", "Cannavaro", "CB", 5, LocalDate.of(1973, 9, 13), 8.9, 25);
        DF2.getInfo();
        System.out.println("-------------------");
        DF3.setInfo("Barcelona", "D.Alves", "RB", 2, LocalDate.of(1983, 5, 6), 8.6, 20);
        DF3.getInfo();
        System.out.println("-------------------");
        DF4.setInfo("Real Madrid", "S.Ramos", "LB", 3, LocalDate.of(1986, 3, 30), 8.9, 35);
        DF4.getInfo();
        System.out.println("-------------------");
        MD1.setInfo("Barcelona", "Xavi", "CM", 6, LocalDate.of(1980, 1, 25), 9.1, 50);
        MD1.getInfo();
        System.out.println("-------------------");
        MD2.setInfo("Barcelona", "Iniesta", "CM", 8, LocalDate.of(1984, 5, 11), 9.0, 55);
        MD2.getInfo();
        System.out.println("-------------------");
        LW.setInfo("Barcelona", "L.Messi", "LW", 10, LocalDate.of(1987, 6, 24), 9.5, 80);
        LW.getInfo();
        System.out.println("-------------------");
        RW.setInfo("Manchester United", "G.Ronaldo", "RW", 7, LocalDate.of(1985, 2, 5), 9.5, 100);
        RW.getInfo();
        System.out.println("-------------------");
        CF1.setInfo("Arsenal", "T.Henry", "CF", 9, LocalDate.of(1977, 8, 17), 8.9, 35);
        CF1.getInfo();
        System.out.println("-------------------");
        CF2.setInfo("Barcelona", "S.Eto", "CF", 10, LocalDate.of(1981, 3, 10), 8.9, 45);
        CF2.getInfo();


    }
}
