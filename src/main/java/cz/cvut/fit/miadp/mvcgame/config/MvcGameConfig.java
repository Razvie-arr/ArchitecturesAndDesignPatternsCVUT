package cz.cvut.fit.miadp.mvcgame.config;

import cz.cvut.fit.miadp.mvcgame.model.Position;

import java.util.concurrent.ThreadLocalRandom;

public class MvcGameConfig {
    public static final int MAX_X = 1280;
    public static final int MAX_Y = 720;
    public static final int MOVE_STEP = 10;
    public static final int CANNON_POS_X = 50;
    public static final int CANNON_POS_Y = MAX_Y / 2;
    public static final int INIT_POWER = 10;
    public static final double INIT_ANGLE = 0;
    public static final double ANGLE_STEP = Math.PI / 18;
    public static final int POWER_STEP = 1;
    public static final double GRAVITY = 9.8;
    public static final int GAMEINFO_POS_X = 10;
    public static final int GAMEINFO_POS_Y = 20;

    public static Position createEnemyPosition() {
        int enemyPosX = ThreadLocalRandom.current().nextInt(MAX_X / 2, MAX_X);
        int enemyPosY = ThreadLocalRandom.current().nextInt(10, MAX_Y - 10);
        return new Position(enemyPosX, enemyPosY);
    }
}