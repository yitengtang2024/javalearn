import com.yiteng.domain.User;
import com.yiteng.domain.UserManager;
import com.yiteng.ui.GameJFrame;
import com.yiteng.ui.LoginJFrame;
import com.yiteng.ui.RegisterJFrame;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        //new GameJFrame();

        new LoginJFrame(userManager);

        //new RegisterJFrame(userManager);
    }
}
