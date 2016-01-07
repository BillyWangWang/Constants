package billywangwang.main;

import java.awt.image.BufferedImage;

import billywangwang.main.graphics.SpriteSheet;

public class Resources {
	
	public SpriteSheet tileSheet;
	public BufferedImage grass;
	
	public Resources(){
		tileSheet = new SpriteSheet("/img/Sprite Sheet.png");
		grass = tileSheet.getImage(0, 0, 32, 32);
	}

}
