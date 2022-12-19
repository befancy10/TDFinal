package enemies;

import static helpz.Constants.Enemies.JELLYFISH;

import managers.EnemyManager;

public class jelly extends Enemy {

	public jelly(float x, float y, int ID, EnemyManager em) {
		super(x, y, ID, JELLYFISH,em);
		
	}

}