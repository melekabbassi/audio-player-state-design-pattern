import ui.Player;
import ui.UI;

public class App {
    public static void main(String[] args) throws Exception {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
