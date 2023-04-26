/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package handlersImg;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import proyecto2.EstructuraDeDatos;
import proyecto2.ImageHandler;

/**
 *
 * @author Usuario
 */
public class JEPGImagenHandlerColores extends ImageHandler {

    String nombreCorto;
    BufferedImage jpg = null;
    BufferedImage bmp;
    BufferedImage bmpGREEn;
    BufferedImage bmpBlue;
    BufferedImage bmpSerpia;
    File btnTemporal;

    public JEPGImagenHandlerColores(String filename) {
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
        bmpGREEn = ImageIO.read(btnTemporal);
        bmpBlue = ImageIO.read(btnTemporal);
        bmpSerpia = ImageIO.read(btnTemporal);
    }

    @Override
    public void generateFiles() throws Exception {
        for (int x = 0; x < bmp.getWidth(); x++) {
            for (int y = 0; y < bmp.getHeight(); y++) {
                Color color = new Color(bmp.getRGB(x, y));
                Color newColor = new Color(color.getRed(), 0, 0);
                bmp.setRGB(x, y, newColor.getRGB());

            }

        }
        ImageIO.write(bmp, "jpg", new File("./Red-Image-" + nombreCorto + ".jpg"));
        btnTemporal.delete();

        for (int x = 0; x < bmpGREEn.getWidth(); x++) {
            for (int y = 0; y < bmpGREEn.getHeight(); y++) {
                Color color = new Color(bmpGREEn.getRGB(x, y));
                Color newColor = new Color(0, color.getGreen(), 0);
                bmpGREEn.setRGB(x, y, newColor.getRGB());

            }

        }
        ImageIO.write(bmpGREEn, "jpg", new File("./Grean-Image-" + nombreCorto + ".jpg"));
        btnTemporal.delete();

        for (int x = 0; x < bmpBlue.getWidth(); x++) {
            for (int y = 0; y < bmpBlue.getHeight(); y++) {
                Color color = new Color(bmpBlue.getRGB(x, y));
                Color newColor = new Color(0, 0, color.getBlue());
                bmpBlue.setRGB(x, y, newColor.getRGB());
            }

        }
        ImageIO.write(bmpBlue, "jpg", new File("./blue-Image-" + nombreCorto + ".jpg"));
        btnTemporal.delete();

        for (int x = 0; x < bmpSerpia.getWidth(); x++) {
            for (int y = 0; y < bmpSerpia.getHeight(); y++) {
                Color color = new Color(bmpSerpia.getRGB(x, y));
                Color newColor = new Color((int) (0.4 * color.getRed()), (int) (0.23 * color.getGreen()), (int) (0.16 * color.getBlue()));
                bmpSerpia.setRGB(x, y, newColor.getRGB());
            }

        }
        ImageIO.write(bmpSerpia, "jpg", new File("./Sepia-Image-" + nombreCorto + ".jpg"));
        btnTemporal.delete();
    }

}
