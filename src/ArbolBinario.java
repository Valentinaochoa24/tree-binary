
public class ArbolBinario {
    Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    // Insertar un número
    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private Nodo insertarRec(Nodo raiz, int valor) {
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }
        if (valor < raiz.valor)
            raiz.izquierdo = insertarRec(raiz.izquierdo, valor);
        else if (valor > raiz.valor)
            raiz.derecho = insertarRec(raiz.derecho, valor);
        return raiz;
    }

    // Recorrido Inorden
    public void inorden() {
        inordenRec(raiz);
        System.out.println();
    }

    private void inordenRec(Nodo raiz) {
        if (raiz != null) {
            inordenRec(raiz.izquierdo);
            System.out.print(raiz.valor + " ");
            inordenRec(raiz.derecho);
        }
    }

    // Buscar un número
    public boolean buscar(int valor) {
        return buscarRec(raiz, valor);
    }

    private boolean buscarRec(Nodo raiz, int valor) {
        if (raiz == null) return false;
        if (raiz.valor == valor) return true;
        return valor < raiz.valor
                ? buscarRec(raiz.izquierdo, valor)
                : buscarRec(raiz.derecho, valor);
    }
}
