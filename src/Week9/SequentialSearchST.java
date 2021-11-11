package Week9;

import edu.princeton.cs.algs4.Queue;

public class SequentialSearchST<Key, Value>
{
    private int n;
    private Node head;

    private class Node
    {
        private Key key;
        private Value value;
        private Node next;
        public Node(Key key, Value value, Node next)
        {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    public int size() { return n; }

    public boolean isEmpty() { return size() == 0; }

    public boolean contains(Key key)
    {
        if (key == null) throw new IllegalArgumentException("argument to contains() is null");
        return get(key) != null;
    }

    public Value get(Key key)
    {
        if (key == null) throw new IllegalArgumentException("argument to get() is null");
        for (Node i = head; i != null; i = i.next)
        {
            if (key.equals(i.key)) return i.value;
        }
        return null;
    }

    public void put(Key key, Value value)
    {
        if (key == null) throw new IllegalArgumentException("first argument to put() is null");
        if (value == null)
        {
            delete(key);
            return;
        }

        for (Node i = head; i != null; i = i.next)
        {
            if (key.equals(i.key))
            {
                i.value = value;
                return;
            }
        }

        head = new Node(key, value, head);
        n++;
    }

    public void delete(Key key)
    {
        if (key == null) throw new IllegalArgumentException("argument to delete() is null");
        head = delete(head, key);
    }

    private Node delete(Node node, Key key)
    {
        if (node == null) return null;
        if (key.equals(node.key))
        {
            n--;
            return node.next;
        }
        node.next = delete(node.next, key);
        return node;
    }

    public Iterable<Key> keys()
    {
        Queue<Key> queue = new Queue<Key>();
        for (Node i = head; i != null; i = i.next)
            queue.enqueue(i.key);
        return queue;
    }

}
