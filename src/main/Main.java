import list.EstruturaElementar;
import list.PilhaNeto;

public class Main {
    public static void main(String[] args) {
        PilhaNeto novaPilha = new PilhaNeto(5);

        novaPilha.push(1);
        novaPilha.push(2);
        novaPilha.push(3);

        System.out.println("Pop"+novaPilha.pop());
        System.out.println("Pop"+novaPilha.pop());

        System.out.println("Está vazio"+novaPilha.isEmpty());

    
    }
}
//  FilaNeto minhaFila = new FilaNeto(5);

//         System.out.println("Está vazia: " + minhaFila.isEmpty());

//         minhaFila.enqueue(1);
//         minhaFila.enqueue(2);
//         minhaFila.enqueue(3);
//         minhaFila.enqueue(4);

//         System.out.println("Está cheia: " + minhaFila.isFull());

//         System.out.println("Dequeue: " + minhaFila.dequeue());
//         System.out.println("Dequeue: " + minhaFila.dequeue());

//         minhaFila.enqueue(5);

//         System.out.println("Está cheia: " + minhaFila.isFull());

//         while (!minhaFila.isEmpty()) {
//             System.out.println("Dequeue: " + minhaFila.dequeue());
//         }

//         System.out.println("Está vazia: " + minhaFila.isEmpty());
//     }
// }