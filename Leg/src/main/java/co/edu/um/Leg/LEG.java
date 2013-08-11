package co.edu.um.Leg;

/**
 * Created with IntelliJ IDEA.
 * User: ARENITA
 * Date: 11/08/13
 * Time: 02:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class LEG <E> {
    protected NodoLeg<E> primero;
    protected int talla;

    public LEG (){
        primero = null;
        talla = 0;

    }
    public void talla(){

    }
    public void insertar (E x){
        NodoLeg<E> nuevo= new NodoLeg<E>(x);
        nuevo.siguiente=primero;
        primero=nuevo;
        this.talla ++;

    }
    public void insertarEnFin (E x){
        NodoLeg<E> nl= new NodoLeg<E>(x);
        this.talla ++;
        NodoLeg<E> aux = primero;
        if  (aux == null) {
            primero = nl;
        }
        else {
            while (aux.siguiente != null){
                aux= aux.siguiente;
                aux.siguiente=nl;
            }
        }


    }
    public boolean eliminar(E x) {
        NodoLeg<E> aux = primero;
        ant = null;
        boolean res = false;
        while (aux != null){
            ant=aux;
            aux=aux.siguiente;
        }
           if (aux != null){
               res = true;
               this.talla -- ;
               if (ant == null) {
                   primero =aux.siguiente;


                      ant.siguiente = aux.siguiente;

               }

           }


    }
    public String toString(){
        String res ="";
        for (NodoLeg<E> aux = primero;
                aux != null;
                aux=aux.siguiente) {
            res += aux.dato.toString()+"\n";
            return res;
        }


    }

}
