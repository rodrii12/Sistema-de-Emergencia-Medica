package Interfaces_Graficas;

/**
 *
 * @author FRANCO
 */
public class Metodos {

    /**
     * Valida un DNI Comprueba si tiene entre 8 y 9 caracteres Comprueba si la
     * parte numerica es correcta Comprueba si la letra es correcta Comprueba si
     * el numero y la letra es corrrecta
     *
     * @param DNI
     * @throws DNIException
     */
    public static void validarDNI(String DNI) throws DNIException {

        //Comprobamos la longitud del dni
        if (!(DNI.length() >= 8 && DNI.length() <= 8)) {
            throw new DNIException(DNIException.LONGITUD_NO_CORRECTA);
        }
      
        
       String parte_numerica = DNI.substring(0, DNI.length());     
               int numeroDNI = 0;

        try {
            
            numeroDNI = Integer.parseInt(parte_numerica);
        } catch (NumberFormatException e) {
            throw new DNIException(DNIException.PARTE_NUMERICA_NO_CORRECTA);
        }

    }
}
