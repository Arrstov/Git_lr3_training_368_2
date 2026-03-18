import View.GameFrame;

import javax.swing.*;

public class SimpleRobotApplication {//первый комментарий

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GameFrame mainW = new GameFrame();// еще один коммит
                mainW.setVisible(true);
            }
        });
    }
}