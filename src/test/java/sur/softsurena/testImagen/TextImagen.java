package sur.softsurena.testImagen;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import sur.softsurena.metodos.Imagenes;

public class TextImagen {

    private Imagenes imagen;
    
    public TextImagen() {
        
    }

    @BeforeAll
    public static void setUpClass() {
        
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        imagen = new Imagenes("Foto 247 x 269.jpg");
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void getImagen() {
        
        int alto = imagen.getICono().getIconHeight();
        int ancho = imagen.getICono().getIconWidth();
        
        
        assertEquals(alto, 269);
        assertEquals(ancho, 247);
        
        
    }
}
