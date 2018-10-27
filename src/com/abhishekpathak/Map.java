package com.abhishekpathak;

import java.awt.*;

public class Map {

    int map_array[][];
    int collider_width;
    int collider_height;

    Map(int rows, int columns) {
        map_array = new int[rows][columns];

        for(int i = 0; i < map_array.length; i++){
            for(int j = 0; j < map_array[0].length; j++){
                map_array[i][j] = 1;
            }
        }


        collider_height = (150)/rows;
        collider_width = (600)/columns;

    }

    public void draw(Graphics2D g) {
        for (int i = 0; i < map_array.length; i++) {
            for (int j = 0; j < map_array[0].length; j++) {
                if (map_array[i][j] > 0) {
                    g.setColor(Color.green);
                    g.fillRect(j * collider_width + 80, i * collider_height + 60, collider_width, collider_height);

                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.ORANGE);
                    g.drawRect(j * collider_width + 80, i * collider_height + 60, collider_width, collider_height);

                }


            }


        }
    }}