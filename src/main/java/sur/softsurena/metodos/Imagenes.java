package sur.softsurena.metodos;

import java.io.InputStream;
import java.net.URL;
import javax.swing.ImageIcon;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//import javafx.scene.image.PixelWriter;
//import javafx.scene.image.WritableImage;
//import javafx.scene.layout.AnchorPane;
//import javafx.scene.layout.Background;
//import javafx.scene.layout.BackgroundImage;
//import javafx.scene.layout.BackgroundPosition;
//import javafx.scene.layout.BackgroundRepeat;
//import javafx.scene.layout.BackgroundSize;
//import javax.imageio.ImageIO;

public class Imagenes {

    private final String ruta;
    private URL url;

    public Imagenes(String archivoExtension) {
        this.ruta = "/sur/softsurena/imagenes/" + archivoExtension;
    }

    public Imagenes() {
        this.ruta = "";
    }

    public ImageIcon getICono() {
        url = getClass().getResource(ruta);
        return new ImageIcon(url);
    }

    public ImageIcon getIcono(String nombreImagenConExtension) {
        if (nombreImagenConExtension.isBlank()) {
            nombreImagenConExtension = "NoImageTransp 96 x 96.png";
        }
        url = getClass().getResource("/sur/softsurena/imagenes/" + nombreImagenConExtension);
        return new ImageIcon(url);
    }

    public URL getPath() {
        return url;
    }

//    /**
//     * Metodo utilizado para cambiar los fondos de los anchorPane.
//     *
//     * Luego lo pondré en prueba con otro tipo de componente de la JAVAFX.
//     *
//     * @param anchorPane Es un objecto de la clase AnchorPane.
//     * @param ruta Es la ruta de la imagen. Este es un ejemplo:
//     * "Imagenes/Usuario.png".
//     * @param br Permite definir si la imagen se repite en el eje x.
//     * @param br2 Permite definir si la imagen se repite en el eje y.
//     * @param bp Define si la posicion en la imagen en el anchorPane.
//     */
//    public static void cambiarBackGroundAnchorPane(AnchorPane anchorPane,
//            String ruta, BackgroundRepeat br, BackgroundRepeat br2,
//            BackgroundPosition bp) {
//
//        BackgroundSize bs = new BackgroundSize(1, 1, true, true, false, false);
//
//        Image image = new Image(new Imagenes().dame(ruta));
//
//        BackgroundImage backgroundImage
//                = new BackgroundImage(image, br, br2, bp, bs);
//
//        Background background = new Background(backgroundImage);
//        anchorPane.setBackground(background);
//    }

    private InputStream dame(String ruta) {
        return getClass().getResourceAsStream(ruta);
    }

//    public static Image convertToFxImage(String nombreImagenConExtension) throws IOException {
//        
//        BufferedImage image = ImageIO.read(new Imagenes().dame(nombreImagenConExtension));
//
//        WritableImage wr = null;
//        if (image != null) {
//            wr = new WritableImage(image.getWidth(), image.getHeight());
//            PixelWriter pw = wr.getPixelWriter();
//            for (int x = 0; x < image.getWidth(); x++) {
//                for (int y = 0; y < image.getHeight(); y++) {
//                    pw.setArgb(x, y, image.getRGB(x, y));
//                }
//            }
//        }
//
//        return new ImageView(wr).getImage();
//    }
}
