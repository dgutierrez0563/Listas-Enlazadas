
package Pilas;

/**
 *
 * @author 68NK7
 */
public class Pilas {
    int longitud=-1;
    int capacidad=0;
    int []array;
    public Pilas (int tamano){
    array=new int[tamano];
    capacidad=tamano;
    }
    public boolean esVacia(){
        if(longitud==-1){
            return true;
        }
        else{
            return false;
        }
    }
    public void insertar(int dato){
        if(longitud+1<capacidad){
            longitud++;
            array[longitud]=dato;
        }
        else{
            System.out.println("pla vacia");
        }
    }
    void eliminar(){
        int tem=-1;
        if(esVacia()){
            System.out.println("pla vacia");
        }
        else{
            tem=array[longitud];
            array[longitud]=-1;
            capacidad--;
        }
    }
    void imprimir(){
        if(esVacia()){
            System.out.println("pla vacia");
        }
        else{
            for(int x=0;x<=longitud;x++){
                System.out.println(array[longitud]);
            }
        }
    }
}
