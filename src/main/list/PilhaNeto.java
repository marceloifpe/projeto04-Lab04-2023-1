package list;
import java.util.ArrayList;
import array.ListaArray;

public class PilhaNeto implements Pilha {
    ListaArray listaArray;
    //private int indice;

    public PilhaNeto() {
        listaArray = new ListaArray();
        //indice = -1;
    }

    @Override
    public boolean isEmpty() {
        return listaArray.buscaIndice(0) == -1;
    }

    @Override
    public void push(int valor) {
        listaArray.insereInicio(valor);
        //indice++;
    }

    @Override
    public int pop() {
       // if (!isEmpty()) {
            int valorRemovido = listaArray.ultimoElemento();
            //indice--;
            listaArray.removeFim();
            return valorRemovido;
       // } else {
        //    System.out.println("Está vazia");
        //    return -1;
       // }
    }
}