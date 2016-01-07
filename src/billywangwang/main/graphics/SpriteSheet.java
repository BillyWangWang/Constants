package billywangwang.main.graphics;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpriteSheet {
	
	public BufferedImage image;
	
	public SpriteSheet(String path){
		try {
			image = ImageIO.read(SpriteSheet.class.getResourceAsStream(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
	
	public BufferedImage getImage(int col, int row, int w, int h){
		return image.getSubimage(col * w, row * h, w, h);
	}
}