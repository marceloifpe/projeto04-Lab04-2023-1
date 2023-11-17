import list.EstruturaElementar;
import list.PilhaNeto;
import list.FilaNeto;
import list.Fila2;

public class Main {
    public static void main(String[] args) {

        //teste01
        PilhaNeto novaPilha = new PilhaNeto();

        novaPilha.push(1);
        novaPilha.push(2);
        novaPilha.push(3);

        System.out.println("Pop"+novaPilha.pop());
        System.out.println("Pop"+novaPilha.pop());

        System.out.println("Está vazio"+novaPilha.isEmpty());

    
    }
}

//teste02
//  FilaNeto minhaFila = new FilaNeto();

//         System.out.println("Está vazia: " + minhaFila.isEmpty());

//         minhaFila.enqueue(1);
//         minhaFila.enqueue(2);
//         minhaFila.enqueue(3);
//         minhaFila.enqueue(4);

//         System.out.println("Dequeue: " + minhaFila.dequeue());
//         System.out.println("Dequeue: " + minhaFila.dequeue());

//         minhaFila.enqueue(3);

//         while (!minhaFila.isEmpty()) {
//             System.out.println("Dequeue: " + minhaFila.dequeue());
//         }

//         System.out.println("Está vazia: " + minhaFila.isEmpty());
//     }
// }

//teste03
// Fila2 filacompilha = new Fila2();

// System.out.println("Está vazia: " + filacompilha.isEmpty());

// filacompilha.enqueue(1);
// filacompilha.enqueue(2);
// filacompilha.enqueue(2);
// filacompilha.enqueue(5);

// System.out.println("Está vazia: " + filacompilha.isEmpty());
// System.out.println("Tamanho: " + filacompilha.size());
//     }
// }