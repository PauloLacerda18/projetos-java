package PROJETOS1;

import java.util.Locale;
public class locale {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault(Locale.Category.DISPLAY));
        System.out.println(Locale.getDefault(Locale.Category.FORMAT));
    }
}

