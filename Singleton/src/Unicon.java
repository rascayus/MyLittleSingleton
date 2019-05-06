/**
 * @author Grupo de trabajo Singleton DAW Severo Ochoa
 * @since 02.05.2019
 * @version 1.1.0
 *
 */
public class Unicon {

    private String nombre;
    private static Unicon soyUnico;

    // El constructor es privado, no permite que se genere un constructor por defecto.
    private Unicon(String nombre) {
        this.nombre = nombre;
        System.out.println("Mi nombre es: " + this.nombre);
    }

    /**
     * @param nombre
     * @return único objeto posible
     */
    public static Unicon getSingletonInstance(String nombre) {
        if (soyUnico == null){
            soyUnico = new Unicon(nombre);
        }
        else{
            System.out.println("No se puede crear el objeto "+ nombre + " porque ya existe un objeto de la clase SoyUnico");
        }
        
        return soyUnico;
    }

	   
    //Sobreescribimos el mÃ©todo clonar para no permitirlo
    @Override
    public Unicon clone(){
        try {
            throw new CloneNotSupportedException();
        } catch (CloneNotSupportedException ex) {
            System.out.println("No se puede clonar un objeto de la clase SoyUnico");
        }
        return null; 
    }

}
