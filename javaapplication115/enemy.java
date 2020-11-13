package javaapplication115;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.Rectangle2D;
import java.net.URL;
import javax.swing.ImageIcon;
public class enemy {
	Image img;
	public int x = 0;
	public int y= (int) ((Math.random()*300)+20);
	public int count = 0;
	enemy(){
                String imageLocation = "scratch.png";
                URL imageURL = this.getClass().getResource(imageLocation);
		img = Toolkit.getDefaultToolkit().getImage(imageURL);
		runner.start();
	}
	Thread runner = new Thread(new Runnable() {
            public void run() {
		while(true){
                    x += 3;
                    if(x >= 1100){
			img = null;
			runner = null;  
                        // ball pos //
                        if(x>100){
		    x = -500;
	            y =  -500;
                        }                        
                    }
                    try{
			runner.sleep(10);
                    }catch(InterruptedException e){}
                }
            }
	});
	
	public Image getImage(){
            return img;
	}
	
	public int getX(){
            return x;
	}
	public int getY(){
            return y;
	}
	public Rectangle2D getbound(){
    	    return (new Rectangle2D.Double(x,y,45,45));
	}
}
