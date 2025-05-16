public class ArbolBinario {
    private Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    //metodo para inicial el arbol

    public void inicializarArbol() {
        raiz = new Nodo(10);
        raiz.izquierdo = new Nodo(5);
        raiz.derecho = new Nodo(15);
        raiz.izquierdo.izquierdo = new Nodo(3);
        raiz.izquierdo.derecho = new Nodo(7);
        raiz.derecho.izquierdo = new Nodo(12);
        raiz.derecho.derecho = new Nodo(18);
    }
    //metodo para recorrer el arbol in-orden

    public void inOrden(Nodo nodo){
        if (nodo != null) {
            inOrden(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            inOrden(nodo.derecho);
        
        }
    }
    //obtener la raiz del arbol

    public Nodo getRaiz() {
        return raiz;
    }



}
