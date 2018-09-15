package dev.monkey.tilegame.gfx;

import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int width = 30, height = 30, spacer = 1;
	
	public static BufferedImage player, dirt, grass, stone, tree;

	public static void init() {
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/sheet.png"));
	
		player = sheet.crop(spacer, spacer, width, width);
		dirt = sheet.crop(spacer*2+width, spacer, width, height);
		grass = sheet.crop(spacer*3+width*2, spacer, width, height);
		stone = sheet.crop(spacer*4+width*3, spacer, width, height);
		tree = sheet.crop(spacer, spacer*2+width, width, height);
	}
	
}
