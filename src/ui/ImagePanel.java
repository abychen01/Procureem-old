package ui;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel extends JPanel{
    private String path;
    public ImagePanel(String path) {
        this.path = path;
    }   
    private BufferedImage image;

    public ImagePanel() {
       try {                
          image = ImageIO.read(new File(path));
           System.out.println("Image loaded");
       } catch (IOException ex) {
            ex.printStackTrace();
       }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        System.out.println("In paint component");
        g.drawImage(image, 0, 0, this); // see javadoc for more info on the parameters            
    }

}