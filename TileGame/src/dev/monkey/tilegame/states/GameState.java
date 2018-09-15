package dev.monkey.tilegame.states;

import java.awt.Graphics;

import dev.monkey.tilegame.Game;
import dev.monkey.tilegame.entities.creatures.Player;
import dev.monkey.tilegame.tiles.Tile;
import dev.monkey.tilegame.worlds.World;

public class GameState extends State {
	
	private Player player;
	private World world;
	
	public GameState(Game game) {
		super(game);
		player = new Player(game, 34, 3);
		world = new World("res/worlds/world1.lvl");
	}
	
	@Override
	public void tick() {
		world.tick();
		player.tick();
	}
	
	@Override
	public void render(Graphics g) {
		world.render(g);
		player.render(g);
	}

}
