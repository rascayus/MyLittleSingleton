public class Unicon {

    private String nombre;
    private static Unicon soyUnico;

    // El constructor es privado, no permite que se genere un constructor por defecto.
    private Unicon(String nombre) {
        this.nombre = nombre;
        System.out.println("Mi nombre es: " + this.nombre);
    }

    public static Unicon getSingletonInstance(String nombre) {
        if (soyUnico == null){
            soyUnico = new Unicon(nombre);
        }
        else{
            System.out.println("No se puede crear el objeto "+ nombre + " porque ya existe un objeto de la clase SoyUnico");
        }
        
        return soyUnico;
    }

	   
    // metodos getter y setter
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
