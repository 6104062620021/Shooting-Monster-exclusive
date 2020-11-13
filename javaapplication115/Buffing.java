
package javaapplication115;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.Rectangle2D;
import java.net.URL;
import javax.swing.ImageIcon;
public class Buffing extends enemy{
    Image img;
    public int count = 0;
    Buffing(){
        String imageLocation = "gift.png";
        URL imageURL1 = this.getClass().getResource(imageLocation);
	img = Toolkit.getDefaultToolkit().getImage(imageURL1);
	runner.start();
    }
    Thread runner = new Thread(new Runnable() {
	public void run() {
            while(true){
		x += 4;
		if(x >= 1100){
                    img = null;
                    runner = null;
                    
                    // ball pos 
                    x = -500;
                    y = -500;
		}
		try{
                    runner.sleep(45);
		}catch(InterruptedException e){}
            }
	}
    });
    public Image getImage(){
	return img;
    }

}

