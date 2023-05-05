/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package handlersImg;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import proyecto2.ImageHandler;

/**
 *
 * @author Usuario
 */
public class JEPGImageHandlerJPEG extends ImageHandler {

    String nombreCorto;
    BufferedImage jpg;
    BufferedImage bmp;
    File bmpTemporal;

    public JEPGImageHandlerJPEG(String filename) {
        super(filename);
        File file = new File(filename);
        this.nombreCorto = file.getName().replaceAll("\\.\\w+$", "");
    }

    @Override
    public void readFile() throws Exception {
        File file = new File(getFileName());
        jpg = ImageIO.read(file);
        bmpTemporal = new File("src/Imagenes/Temporal/Temporal.bmp");
        ImageIO.write(jpg, "bmp", bmpTemporal);
        bmp = ImageIO.read(bmpTemporal);

    }

    @Override
    public void generateFiles() throws Exception {
        ImageIO.write(bmp, "jpg", new File("src/Imagenes/JPG-" + nombreCorto + ".jpg"));
        bmpTemporal.delete();
    }

}
