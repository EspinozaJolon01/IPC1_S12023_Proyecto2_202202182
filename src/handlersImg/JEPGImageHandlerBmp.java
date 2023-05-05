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
public class JEPGImageHandlerBmp extends ImageHandler {

    String nombreCorto;
    BufferedImage jpg;
    BufferedImage bmp;
    File bmpTemporal;

    public JEPGImageHandlerBmp(String filaname) {
        super(filaname);
        File file = new File(filaname);
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

        ImageIO.write(bmp, "jpg", new File("src/Imagenes/BMP-" + nombreCorto + ".bmp"));
        bmpTemporal.delete();
    }

}
