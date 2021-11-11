package Week9;

public class STByLinkedList<Key extends Comparable<Key>, Value>
{
    private Node head;

    private class Node
    {
        private Key key;
        private Value value;
        private Node left;
        private Node right;

        public Node(Key key, Value value)
        {
            this.key = key;
            this.value = value;
        }

        public Node(Key key, Value value, Node left, Node right)
        {
            this(key,value);
            this.left = left;
            this.right = right;
        }

    }
    public STByLinkedList(Key key, Value value)
    {
        head = new Node(key, value);
    }

    public STByLinkedList() {};

    public Value get(Key key)
    {
        if (key == null) throw new IllegalArgumentException("calls get() with null key");
        else return find(head,key);
    }

    private Value find(Node node, Key key)
    {
        if (node == null) return null;
        int cmp = key.compareTo(node.key);
        if (cmp == 0) return node.value;
        if (cmp < 0) return find(node.left,key);
        else return find(node.right,key);
    }

    public void insert(Key key, Value value)
    {
        if (key == null) throw new IllegalArgumentException("calls insert() with null key");
        if (!contains(key) && value == null) throw new IllegalArgumentException("calls insert() with null value while key is not exist");
        head = put(key,value, head);
    }

    private Node put(Key key, Value value, Node node)
    {
        if (node == null) return new Node(key, value);
        int cmp = key.compareTo(node.key);
        if (cmp < 0) node.left = put(key,value,node.left);
        else if (cmp > 0) node.right = put(key,value,node.right);
        else
        {
            if (value == null)
                return merge(node.left, node.right);
            else node.value = value;
        }
        return node;
    }

    public void remove(Key key)
    {
        head = search_for_delete(head,key);
    }

    private Node search_for_delete(Node node, Key key)
    {
        int cmp = key.compareTo(node.key);
        if (cmp == 0) return merge(node.right, node.left);
        if (cmp < 0) node.left = search_for_delete(node.left, key);
        else node.right = search_for_delete(node.right, key);
        return node;
    }

    private Node merge(Node c, Node node)
    {
        if (c == null) return node;
        if (node == null) return c;
        int cmp = node.key.compareTo(c.key);
        if (cmp < 0) c.left = merge(c.left, node);
        else c.right = merge(c.right, node);
        return c;
    }

    public boolean contains(Key key)
    {
        return find(head,key) != null;
    }

    public Key min()
    {
        return min(head);
    }

    private Key min(Node node)
    {
        if (node.left == null) return node.key;
        else return min(node.left);
    }

    public Key max()
    {
        return max(head);
    }

    private Key max(Node node)
    {
        if (node.right == null) return node.key;
        else return max(node.right);
    }

    private Key ceiling(Key key)
    {
        return find_ceil(head, key);
    }

    private Key find_ceil(Node node, Key key)
    {
        if (node == null) return null;
        int cmp = key.compareTo(node.key);
        if (cmp == 0) return node.right.key;
        if (cmp < 0) return find_ceil(node.left,key);
        else return find_ceil(node.right,key);
    }

    private Key floor(Key key)
    {
        return find_floor(head, key);
    }

    private Key find_floor(Node node, Key key)
    {
        if (node == null) return null;
        int cmp = key.compareTo(node.key);
        if (cmp == 0) return node.left.key;
        if (cmp < 0) return find_floor(node.left,key);
        else return find_floor(node.right,key);
    }

    public void print()
    {
        print(head);
    }

    private void print(Node node)
    {
        System.out.print(node.value + " ");
        if (node.left != null) print(node.left);
        if (node.right != null) print(node.right);
    }

}