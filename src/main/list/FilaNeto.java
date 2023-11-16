package stack;
import array.ListaArray;

public class FilaNeto implements Fila {
    private int capacidade;
    private int[] filaArray;
    private int inicio;
    private int fim;
    private int tamanho;

    public FilaNeto(int capacidade) {
        this.capacidade = capacidade;
        this.filaArray = new int[capacidade];
        this.inicio = 0;
        this.fim = -1;
        this.tamanho = 0;
    }

    @Override
    public boolean isEmpty() {
        return tamanho == 0;
    }

    @Override
    public boolean isFull() {
        return tamanho == capacidade;
    }

    @Override
    public void enqueue(int valor) {
        if (!isFull()) {
            fim = (fim + 1) % capacidade;
            filaArray[fim] = valor;
            tamanho++;
        } else {
            System.out.println("A fila está cheia");
        }
    }

    @Override
    public int dequeue() {
        if (!isEmpty()) {
            int valorRemovido = filaArray[inicio];
            inicio = (inicio + 1) % capacidade;
            tamanho--;
            return valorRemovido;
        } else {
            System.out.println("A fila está vazia");
            return -1;
        }
    }
}
