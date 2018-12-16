package uet.oop.bomberman.entities.character.enemy.ai;

public class AIDoll extends AI {
    @Override
    public int calculateDirection() {

        return random.nextInt(4);

    }



}
