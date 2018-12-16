package uet.oop.bomberman.entities.character.enemy.ai;

import uet.oop.bomberman.entities.character.Bomber;
import uet.oop.bomberman.entities.character.enemy.Enemy;

public class AIOvape extends AI {
    Bomber _bomber;
    Enemy _e;
    AIBalloon aiBalloon;

    public AIOvape(Bomber bomber, Enemy e) {
        _bomber = bomber;
        _e = e;
        aiBalloon = new AIBalloon();
    }

    @Override
    public int calculateDirection() {
        // TODO: cài đặt thuật toán tìm đường đi
        int random = (int) (Math.random() * 3);
        return calculateDirection(random);
    }

    public int calculateDirection(int random) {
        if (random == 0) return calculateColDirection();
        if (random == 1) return calculateRowDirection();

        return aiBalloon.calculateDirection();
    }

    protected int calculateColDirection() {
        if (_bomber.getXTile() < _e.getXTile()) return 3;
        if (_bomber.getXTile() > _e.getXTile()) return 1;

        return -1;
    }

    protected int calculateRowDirection() {
        if (_bomber.getYTile() < _e.getYTile()) return 0;
        if (_bomber.getYTile() > _e.getYTile()) return 2;

        return -1;
    }
}
