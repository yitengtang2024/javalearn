import com.yiteng.domain.User;
import com.yiteng.domain.UserManager;
import com.yiteng.ui.GameJFrame;
import com.yiteng.ui.LoginJFrame;
import com.yiteng.ui.RegisterJFrame;

import java.io.IOException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        //load users from file
        try {
            userManager.loadFromFile("src/com/yiteng/domain/users.txt");
        } catch (IOException e) {
            System.out.println("No existing user data found.");
        }

        //new GameJFrame();

        new LoginJFrame(userManager);

        //new RegisterJFrame(userManager);

        //save users on application exit
        // Save users on application exit
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                userManager.saveToFile("src/com/yiteng/domain/users.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }));
    }
}
