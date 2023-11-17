package list;
import java.util.ArrayList;
import array.ListaArray;


public class Fila2 implements FilaComPilha {

    ListaArray listaArray;
    private int tam;

    public Fila2(){
        listaArray = new ListaArray();
        tam = 0;
    }


    @Override
    public void enqueue(int item) {
        Fila2 recebe = new Fila2();
        while (!listaArray.isEmpty()) {
            recebe.push(listaArray.pop());
        }
        recebe.push(item);
        while (!recebe.isEmpty()) {
            listaArray.push(recebe.pop());
        }
        tam++;
    }

    private int pop() {
        return 0;
    }


    private void push(int item) {
    }


    @Override
    public int dequeue() {
        tam--;
        return listaArray.pop();
       
    }

    @Override
    public boolean isEmpty() {
        return listaArray.isEmpty();
    }

    @Override
    public int size() {
        return tam;
    }


    // public String isFull() {
    //     return null;
    // }
    
}