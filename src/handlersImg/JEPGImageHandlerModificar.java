/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package handlersImg;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import proyecto2.ImageHandler;

/**
 *
 * @author Usuario
 */
public class JEPGImageHandlerModificar extends ImageHandler {

    String nombreCorto;
    BufferedImage jpg;
    BufferedImage bmp;
    BufferedImage bmp2;
    File bmpTemporal;

    public JEPGImageHandlerModificar(String filename) {
        super(filename);
        File file = new File(filename);
        this.nombreCorto = file.getName().replaceAll("\\.\\w+$", "");
    }

    @Override
    public void readFile() throws Exception {
        File file = new File(getFileName());
        jpg = ImageIO.read(file);
        bmpTemporal = new File("./btnTemporal.bmp");
        ImageIO.write(jpg, "bmp", bmpTemporal);
        bmp = ImageIO.read(bmpTemporal);
        bmp2 = ImageIO.read(bmpTemporal);
    }

    @Override
    public void generateFiles() throws Exception {
        for (int i = 0; i < (bmp.getWidth()); i++) {
            for (int j = 0; j < (bmp.getHeight() + 1) / 2; j++) {
                Color colorT = new Color(bmp.getRGB(i, j));

                bmp.setRGB(i, j, bmp.getRGB(i, bmp.getHeight() - 1 - j));

                bmp.setRGB(i, bmp.getHeight() - 1 - j, colorT.getRGB());
            }
        }
        ImageIO.write(bmp, "jpg", new File("./VRotation-" + nombreCorto + ".jpg"));
        bmpTemporal.delete();

        for (int i = 0; i < (bmp2.getWidth() + 1) / 2; i++) {
            for (int j = 0; j < (bmp2.getHeight()); j++) {
                Color colorT = new Color(bmp2.getRGB(i, j));

                bmp2.setRGB(i, j, bmp2.getRGB(bmp2.getWidth() - 1 - i, j));

                bmp2.setRGB(bmp2.getWidth() - 1 - i, j, colorT.getRGB());
            }
        }
        ImageIO.write(bmp2, "jpg", new File("./HRotation-" + nombreCorto + ".jpg"));
        bmpTemporal.delete();
    }

}
