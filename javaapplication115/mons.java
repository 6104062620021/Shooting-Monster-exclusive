package javaapplication115;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
public class mons{
    public ImageIcon[] im = new ImageIcon[7];
    public int x;
    public int count = 0;
    mons(){
        for(int i=0;i<im.length;i++){
            im[i] = new ImageIcon(this.getClass().getResource((i+1)+".png"));
            
	}
    }
}
