package com.company.Game;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Pascal on 12.12.2016.
 */
public class Map {
    public ArrayList<Entity>entitys;
    public ArrayList<Block> blocks;
    public Vector size;

    Map(Game game, double sizeX, double sizeY) {
        this.size = new Vector(sizeX, sizeY);
        ArrayList<Block> block = new ArrayList<Block>();
        block.add(new Block(
            new Vector(20, 20),
            game.models.get("dirt"),
            true
        ));

        this.blocks = block;

        ArrayList<Entity> entity = new ArrayList<Entity>();

        entity.add(new Entity(
            new Vector(100, 123),
            game.models.get("player"),
            new Vector(0, 0),
            new Vector(0, 0)
        ));

        this.entitys = entity;
    }
}