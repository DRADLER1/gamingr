package com.company;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

public class GamePanel extends JPanel implements Runnable {
    //  SCREEN SETTING
    final int originalTileSize =16; // 16X16 tile
    final int scale = 3;
    final int tileSize = originalTileSize * scale; // 48X48 tile
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize*maxScreenCol; //768 pixel
    final int screenHieght = tileSize*maxScreenRow;
    Thread gameThread;

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHieght));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
    }
    public void startGameThread(){
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        while (gameThread != null){
//            System.out.println("The game loop is running");
            // 1. UPDATE:  update information such as character position
            // 2. DRAW: draw the screen with the updated information
        }

    }
}
//github successfull
//manya confirm
//SHGDHGDHG
// seershika