package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Schachbrett extends GraphicalObject {

    public void schachbrett() {

        DrawTool drawTool = new DrawTool();

        for (int i = 1; i <= 8; i++) {

            for (int j = 1; j <= 8; j++) {
                if (((i + j) % 2 == 0)) {

                    drawTool.setColor(Color.WHITE);
                } else {
                    drawTool.setColor(Color.BLACK);

                }
            }
        }
    }
}
