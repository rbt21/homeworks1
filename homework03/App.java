package main.java.com.homework3;

public class App {
    public static void main(String[] agrs) {
        Television tv1 = new Television("Sams" +
                "ung", 55, true);
        Television tv2 = new Television("LG", 42, false);
        System.out.println(tv1);
        System.out.println(tv2);
        tv2.setModel("LG updated model");
        tv2.setScreenSize(48);
        System.out.println(tv2);
    }
}
