package enemies;

import static helpz.Constants.Enemies.GHOST;

import managers.EnemyManager;

public class ghost extends Enemy {

	public ghost(float x, float y, int ID,EnemyManager em) {
		super(x, y, ID, GHOST,em);
		
	}

}