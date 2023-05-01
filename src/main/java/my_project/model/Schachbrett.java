package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;
import my_project.Config;

import java.awt.*;

public class Schachbrett extends GraphicalObject {

    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(new Color(50, 0, 50));

        for(int i = 0; i*50 < Config.WINDOW_HEIGHT;i++){
            for (int j = 0; j*50 < Config.WINDOW_WIDTH;j++){
                drawTool.drawFilledRectangle(j*100, i*100,50, 50);
                drawTool.drawFilledRectangle(50+j*100, 50+i*100, 50, 50);
            }
        }
    }
}