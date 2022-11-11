package main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {
    // SCREEN SETTINGS
    final int originalTileSize = 16; // 16 * 16 px - size of game's tiles
    final int  scale = 3; // scaling tiles as they look smile on screens

    final int tileSize = originalTileSize * scale; // actual size of our tiles
    // The game are divided into squares
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize * maxScreenCol;
    final int screenHeight = tileSize * maxScreenRow;

    Thread gameThread;

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
    }

    public void startGameThread() {
        gameThread = new Thread(this);
    }

    @Override
    public void run() {

    }
}
