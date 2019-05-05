
public class main {

	public static void main(String[] args) {
        
        Unicon juan = Unicon.getSingletonInstance("Juan Diego Alonso");
        Unicon ramon = Unicon.getSingletonInstance("Ramón García");
        // aqui intentamos clonar pero nos da error
        try{
            Unicon richard = juan.clone();
            System.out.println(richard);
        }catch (NullPointerException ex){
            ex.printStackTrace();
        }
        
        // juan y ramon son referencias a un único objeto de la clase Unicon
        System.out.println(ramon);
        System.out.println(juan);   
    }
}