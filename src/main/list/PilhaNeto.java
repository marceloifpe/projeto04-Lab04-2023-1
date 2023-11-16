package list;
import java.util.ArrayList;
import array.ListaArray;

public class PilhaNeto implements Pilha {
    private ListaArray listaArray;
    private int indice;

    public PilhaNeto(int capacidade) {
        listaArray = new ListaArray(capacidade);
        indice = -1;
    }

    @Override
    public boolean isEmpty() {
        return indice == -1;
    }

    @Override
    public void push(int valor) {
        listaArray.insereInicio(valor);
        indice++;
    }

    @Override
    public int pop() {
        if (!isEmpty()) {
            int valorRemovido = listaArray.array[indice];
            indice--;
            return valorRemovido;
        } else {
            System.out.println("Está vazia");
            return -1;
        }
    }