
package excepciones;

/**
 *
 * @author FRANCO
 */
public class PatenteExeption extends Exception{

    public static final String LONGITUD_NO_CORRECTA = "La longitud debe ser de 6 caracteres";
    public static final String PARTE_NUMERICA_NO_CORRECTA = "La parte númerica de su patente  debe ser un numero";
    public static final String PARTE_LETRA_NO_CORRECTA = "La parte de la letra de su patente debe ser una letra entre A y Z";
    public static final String FORMATO_NO_CORRECTO = "patente incorrecta";
    
        public PatenteExeption(String mensaje){
        super(mensaje);
    }
    
}
