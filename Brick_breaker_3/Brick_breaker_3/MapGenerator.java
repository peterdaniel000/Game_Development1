package Brick_breaker_3;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.Color;

public class MapGenerator {
    
    public int map[][];
    public int BrickWidth;
    public int BrickHeight;

    public MapGenerator(int row, int col) {
        map = new int[row][col];

        for (int i = 0; i < map.length; i++){
            for (int j = 0; j < map[0].length; j++){
                map[i][j] = 1;
            }
        }
    
       BrickWidth = 540/col;
       BrickHeight = 150/row;
    }

           public void draw(Graphics2D g){
            for (int i = 0; i < map.length; i++){
                for (int j = 0; j < map[0].length; j++) {
                    if(map[i][j] > 0){
                        if (map[i][j] > 0){
                            g.setColor(Color.black);
                            g.fillRect(j*BrickWidth + 80,i*BrickHeight + 50, BrickWidth, BrickHeight);

                            g.setStroke(new BasicStroke(3));
                            g.setColor(Color.white);
                            g.drawRect(j*BrickWidth + 80, i*BrickHeight +50, BrickWidth, BrickHeight);
                        }

                    }
                }
            }
         
        
        }

        public void setBrickValue(int value, int row, int col){
            map[row][col] = value;
        }
         

    }
