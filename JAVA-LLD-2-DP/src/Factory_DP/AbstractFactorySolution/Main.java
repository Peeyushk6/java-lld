package Factory_DP.AbstractFactorySolution;

public class Main {
    static void main() {
        UIFactory factory = new IOSFactory();

        Button button = factory.createButton();

        Menu menu = factory.createMenu();

        button.click();
        menu.display();
    }
}
