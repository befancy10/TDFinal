package enemies;

import static helpz.Constants.Enemies.BATBAT;

import managers.EnemyManager;

public class bat extends Enemy {

	public bat(float x, float y, int ID, EnemyManager em) {
		super(x, y, ID, BATBAT,em);
	}

}