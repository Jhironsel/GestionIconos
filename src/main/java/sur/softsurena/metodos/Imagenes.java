package sur.softsurena.metodos;

import java.awt.Image;
import java.io.InputStream;
import java.net.URL;
import java.util.Objects;
import javax.swing.ImageIcon;
import lombok.Getter;

@Getter
public class Imagenes {

    private String ruta = "";
    private URL url;

    public Imagenes(String archivoExtension) {
        Objects.nonNull(archivoExtension);
        
        if (archivoExtension.isBlank()) {
            archivoExtension = "NoImageTransp 96 x 96.png";
        }
        
        this.ruta = "/sur/softsurena/imagenes/" + archivoExtension;
    }

    private Imagenes() {}

    public ImageIcon getIcono() {
        url = getClass().getResource(ruta);
        return new ImageIcon(url);
    }
    
    public ImageIcon getIcono(int ancho, int alto) {
        url = getClass().getResource(ruta);
        
        Image scaledInstance = new ImageIcon(url)
                .getImage()
                .getScaledInstance(
                        ancho, 
                        alto, 
                        Image.SCALE_DEFAULT
                );
        
        return new ImageIcon(scaledInstance);
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
