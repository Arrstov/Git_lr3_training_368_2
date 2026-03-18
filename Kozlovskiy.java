import View.GameFrame;

import javax.swing.*;

public class SimpleRobotApplication {//первый комментарий

    public static void main(String[] args) {// второй комментарий

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GameFrame mainW = new GameFrame();
                mainW.setVisible(true);
            }
        });
    }
}