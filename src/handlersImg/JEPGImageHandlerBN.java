/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package handlersImg;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import proyecto2.BmpHandlerCopy;
import proyecto2.ImageHandler;

/**
 *
 * @author Usuario
 */
public class JEPGImageHandlerBN extends ImageHandler {

    String nombreCorto;
    BufferedImage jpg = null;
    BufferedImage bmp;
    File btnTemporal;

    public JEPGImageHandlerBN(String filename) {
        super(filename);
        File file = new File(filename);
        this.nombreCorto = file.getName().replaceAll("\\.\\w+$", "");
    }

    @Override
    public void readFile() throws Exception {
        File file = new File(getFileName());
        jpg = ImageIO.read(file);
        btnTemporal = new File("./btnTemporal.bmp");
        ImageIO.write(jpg, "bmp", btnTemporal);
        bmp = ImageIO.read(btnTemporal);
    }

    @Override
    public void generateFiles() throws Exception {
        for (int x = 0; x < bmp.getWidth(); x++) {
            for (int y = 0; y < bmp.getHeight(); y++) {
                Color color = new Color(bmp.getRGB(x, y));
                int promedio = (color.getBlue() + color.getGreen() + color.getRed()) / 3;
                Color newColor = new Color(promedio, promedio, promedio);
                bmp.setRGB(x, y, newColor.getRGB());
            }
        }
        ImageIO.write(bmp, "jpg", new File("./BN-" + nombreCorto + ".jpg"));
        btnTemporal.delete();
    }

}
