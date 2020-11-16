package LeetCode;
import java.util.*;

class LRUCache {

    final Node head  = new Node();
    final Node tail = new Node();
    Map<Integer, Node> nodeMap;
    int cacheCapacity;

    public LRUCache(int capacity) {
        nodeMap = new HashMap(capacity);
        this.cacheCapacity = capacity;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        int result = -1;
        Node node = nodeMap.get(key);
        if(node != null) {
            remove(node);
            add(node);
            result = node.val;
        }
        return result;
    }

    public void put(int key, int value) {
        Node node = nodeMap.get(key);
        if(node != null) {
            remove(node);
            node.val = value;
            add(node);
        } else {
            if(nodeMap.size() == cacheCapacity) {
                nodeMap.remove(tail.prev.key);
                remove(tail.prev);
            }
            Node newNode = new Node();
            newNode.key = key;
            newNode.val = value;

            nodeMap.put(key, newNode);
            add(newNode);
        }
    }

    private void add(Node node) {
        Node headNext = head.next;
        node.next = headNext;
        headNext.prev = node;
        head.next = node;
        node.prev = head;
    }

    private void remove(Node node) {
        Node nextNode = node.next;
        Node prevNode = node.prev;

        nextNode.prev = prevNode;
        prevNode.next = nextNode;
    }

    private class Node {
        int key, val;
        Node prev;
        Node next;
    }
}