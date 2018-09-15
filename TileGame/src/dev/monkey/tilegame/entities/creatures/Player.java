package dev.monkey.tilegame.entities.creatures;

import java.awt.Graphics;

import dev.monkey.tilegame.Game;
import dev.monkey.tilegame.gfx.Assets;

public class Player extends Creature {
	
	private Game game;

	public Player(Game game, float x, float y) {
		super(x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		this.game = game;
	}

	public void tick() {
		getInput();
		move();
	}
	
	private void getInput() {
		double multiplier = 1.0;
		
		xMove = 0;
		yMove = 0;

		if(game.getKeyManager().sprint)
			multiplier = 2.0;
		if(game.getKeyManager().control)
			multiplier = 0.5;
		
		if(game.getKeyManager().up)
			yMove = (float) (-speed * multiplier);
		if(game.getKeyManager().down)
			yMove = (float) (speed * multiplier);
		if(game.getKeyManager().left)
			xMove = (float) (-speed * multiplier);
		if(game.getKeyManager().right)
			xMove = (float) (speed * multiplier);
	}

	public void render(Graphics g) {
		g.drawImage(Assets.player, (int) x, (int) y, width, height, null);
	}
	
}
