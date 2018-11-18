package excepciones;

/**
 *
 * @author FRANCO
 */
public class Metodos {

    
    public static void validarDNI(Integer DNI) throws DNIException {
        String dni = String.valueOf(DNI);
        
        //Comprobamos la longitud del dni
        if (!(dni.length() >= 8 && dni.length() <= 8)) {
            throw new DNIException(DNIException.LONGITUD_NO_CORRECTA);
        }
      
        
       String parte_numerica = dni.substring(0, dni.length());     
               int numeroDNI = 0;

        try {
            
            numeroDNI = Integer.parseInt(parte_numerica);
        } catch (NumberFormatException e) {
            throw new DNIException(DNIException.PARTE_NUMERICA_NO_CORRECTA);
        }

    }
    

}
