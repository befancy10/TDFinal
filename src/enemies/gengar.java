package enemies;

import static helpz.Constants.Enemies.GENGAR;

import managers.EnemyManager;

public class gengar extends Enemy {

	public gengar(float x, float y, int ID, EnemyManager em) {
		super(x, y, ID, GENGAR, em);
	}

}