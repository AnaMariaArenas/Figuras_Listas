package co.edu.um.Leg;

/**
 * Created with IntelliJ IDEA.
 * User: ARENITA
 * Date: 11/08/13
 * Time: 02:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class NodoLeg <E> {
    E dato;
    NodoLeg <E> siguiente;
    NodoLeg (E dato){
        this (dato, null);
        }
    NodoLeg(E dato, NodoLeg<E> siguiente){
        this.dato = dato;
        this.siguiente = siguiente;
    }
}
