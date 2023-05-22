import java.util.Stack;

public class Torre {
    private Stack<Integer> discos;

    public Torre() {
        discos = new Stack<>();
    }

    public void push(int disco) {
        discos.push(disco);
    }

    public int pop() {
        return discos.pop();
    }

    public int peek() {
        return discos.peek();
    }

    public boolean estaVacia() {
        return discos.isEmpty();
    }
}


