package ar.edu.iua;

//cola
public class Queue<T> {

    private Node<T> front;
    private Node<T> back;


    public Queue() {
        front = null;
        back = null;
    }


    public void put(T data) {
        if(null == back) {
            back = new Node<T>(data);
            front = back;
        } else {
            back.setNext(new Node<T>(data, null));
            back = back.getNext();
        }

    }


    public T pull() throws Exception {
        if (front == null)
            throw new Exception();

        T tmp = front.getData();
        if (front.getNext() == null) {
            front = back = null;
        } else {
            front = front.getNext();
        }
        return tmp;
    }    

}
