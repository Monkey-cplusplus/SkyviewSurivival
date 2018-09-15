package dev.monkey.tilegame.tiles;

import dev.monkey.tilegame.gfx.Assets;

public class RockTile extends Tile {

	public RockTile(int id) {
		super(Assets.stone, id);
	}
	
	public boolean isSolid() {
		return true;
	}
	
}
