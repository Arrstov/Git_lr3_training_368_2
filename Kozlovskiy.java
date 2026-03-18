import View.GameFrame;

import javax.swing.*;

public class SimpleRobotApplication {//первый комментарий

    public static void main(String[] args) {// второй комментарий

        SwingUtilities.invokeLater(new Runnable() {// 3 комментарий
            public void run() {
                GameFrame mainW = new GameFrame();
                mainW.setVisible(true);
            }
        });
    }
}