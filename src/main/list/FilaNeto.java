package list;
import array.ListaArray;
import array.ListaArray;


public class FilaNeto implements Fila {
    // private int capacidade;
    // private int[] filaArray;
    // private int inicio;
    // private int fim;
    // private int tamanho;
    ListaArray listaArray;


    public FilaNeto() {
        listaArray = new ListaArray();
    }

    @Override
    public void enqueue(int valor) {
        listaArray.insereFim(valor);
    }

    @Override
    public int dequeue() {
        int valorRemovido = listaArray.ultimoElemento();
            //indice--;
            listaArray.removeFim();
            return valorRemovido;
    }

    @Override
    public boolean isEmpty() {
        return listaArray.buscaIndice(0) == -1;

    }

    @Override
    public int size(){
        return listaArray.size();

    }

    @Override
    public boolean isFull() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isFull'");
    }

    // @Override
    // public boolean isFull() {
    //     return listaArray.indice_final == listaArray.capacidade;
    // }
}
