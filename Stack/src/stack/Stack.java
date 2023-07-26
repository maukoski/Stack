package stack;

import java.util.NoSuchElementException;

/**
 * This Stack class implements a data structure that follows the
 * Last-In-First-Out (LIFO) principle. This means that the last item inserted or
 * pushed into the stack is the first one to be removed or popped. The stack has
 * a fixed size which is specified during the instantiation of the class.
 *
 * The stack is implemented using an array, where the size of the array equals
 * the size of the stack. The class provides the main stack operations: `push`
 * for inserting an element to the top of the stack, `pop` for removing the
 * topmost element, and `printTop` for displaying the value of the topmost
 * element.
 *
 * If an attempt is made to `push` an element into a full stack, an
 * IllegalStateException is thrown. If an attempt is made to `pop` an element
 * from an empty stack, or to `printTop` when the stack is empty, a
 * NoSuchElementException is thrown.
 *
 * @author William Xavier Maukoski
 * @version 1.0
 */
public class Stack {

    private int[] pilha;    // Array that will store the stack's elements.
    private int topo;   // Attribute that keeps a reference to the last inserted element in the stack.

    /**
     * Constructs a Stack object.
     *
     * @param TAM Attribute that defines the stack size.
     */
    public Stack(int TAM) throws IllegalArgumentException {
        if (TAM < 1) {
            throw new IllegalArgumentException("The stack size must be  a natural number and bigger than zero");
        }
        this.pilha = new int[TAM];
        this.topo = -1;
    }

    /**
     * Prints the entire stack.
     */
    public void printStack() {
        for (int i = 0; i <= this.topo; i++) {
            System.out.print(" " + this.getStack()[i]);
        }
    }

    //Checks whether the stack is empty or not.
    private boolean isEmpty() {
        return this.topo == -1;
    }

    /**
     * Inserts data to the top of the stack.
     *
     * <p>
     * This method attempts to insert data into the stack. If the stack is full,
     * insertion is not possible and the method will throw an
     * IllegalStateException.
     *
     * @param valor Data to be inserted into the stack.
     * @throws IllegalStateException if the stack is full.
     */
    public boolean push(int valor) throws IllegalStateException {
        if (this.isFull()) {
            throw new IllegalStateException("The stack is full");
        }
        this.topo++;
        this.getStack()[this.topo] = valor;
        return true;
    }

    /**
     * Removes the last inserted element from the stack.
     *
     * <p>
     * This method attempts to remove the last inserted data from the stack. If
     * the stack is empty (i.e., has no elements), removal is not possible and
     * the method will throw a NoSuchElementException.
     *
     * @return The last inserted element in the stack
     * @throws NoSuchElementException if the stack is empty
     */
    public int pop() throws NoSuchElementException {
        if (this.isEmpty()) {
            throw new NoSuchElementException("The stack is empty");
        }
        int ret = this.getStack()[this.topo];
        this.getStack()[this.topo] = 0;
        this.topo--;
        return ret;
    }

    private boolean isFull() {
        return this.topo == this.getStack().length - 1;
    }

    /**
     * Displays the value of the top element in the stack.
     *
     * <p>
     * This method attempts to access the element at the top of the stack and
     * display it. If the stack is empty (i.e., has no elements), accessing the
     * top element is not possible, and the method will throw a
     * NoSuchElementException.
     *
     * @throws NoSuchElementException if the stack is empty
     */
    public void printTop() throws NoSuchElementException {
        if (!this.isEmpty()) {
            System.out.println("The top value of the stack is: " + this.getStack()[this.topo]);
        } else {
            throw new NoSuchElementException("The stack is empty");
        }
    }

    private int[] getStack() {
        return this.pilha;
    }
}
