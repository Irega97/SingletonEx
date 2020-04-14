public class Main {
    public static void main(String[] args) {
        // Hello in 4 different languages
        System.out.println(I18NManager.getInstance().getText("en", "l1"));
        System.out.println(I18NManager.getInstance().getText("es", "l1"));
        System.out.println(I18NManager.getInstance().getText("ca", "l1"));
        System.out.println(I18NManager.getInstance().getText("it", "l1"));
        System.out.println(I18NManager.getInstance().getText("fr", "l1"));
        // Bye in 4 different languages
        System.out.println(I18NManager.getInstance().getText("en", "l2"));
        System.out.println(I18NManager.getInstance().getText("es", "l2"));
        System.out.println(I18NManager.getInstance().getText("ca", "l2"));
        System.out.println(I18NManager.getInstance().getText("it", "l2"));
        System.out.println(I18NManager.getInstance().getText("fr", "l2"));
    }
}

