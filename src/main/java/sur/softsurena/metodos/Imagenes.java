package sur.softsurena.metodos;

import java.net.URL;
import javax.swing.ImageIcon;

public class Imagenes {

    private final String ruta;
    private URL url;
    
    public Imagenes(String archivoExtension){
        this.ruta = "/sur/softsurena/imagenes/"+archivoExtension;
    }
    
    public Imagenes(){
        this.ruta = "";
    }
    
    public ImageIcon getICono() {
        url = getClass().getResource(ruta);
        return new ImageIcon(url);
    }
    
    public ImageIcon getIcono(String nombreImagenConExtension){
        if(nombreImagenConExtension.isBlank() || nombreImagenConExtension.isEmpty()){
            nombreImagenConExtension = "NoImageTransp 96 x 96.png";
        }
        url = getClass().getResource("/sur/softsurena/imagenes/"+nombreImagenConExtension);
        return new ImageIcon(url);
    }

    public URL getPath() {
        return url;
    }
}
