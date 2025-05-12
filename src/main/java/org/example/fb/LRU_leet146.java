package org.example.fb;

import java.util.HashMap;
import java.util.Map;


public class LRU_leet146 {

  private final int capacity;

  private LRUNode startNode;
  private LRUNode endNode;

  Map<Integer, LRUNode> map;
  public LRU_leet146(int capacity) {
    this.capacity = capacity;
    map = new HashMap<Integer, LRUNode>();
  }

  public int get(int key){
    LRUNode node = map.get(key);
    if(node == null){
      LRUNode nodePrev = node.getPrev();
      LRUNode nodeNext = node.getNext();
      if(nodePrev!=null){
        nodePrev.setNext(nodeNext);
        node.setNext(startNode);
        startNode.setPrev(node);
        startNode = node;
      }
      if(nodeNext!=null){
        nodeNext.setPrev(nodePrev);
      }
    }
    return node!=null ? node.getKey(): -1;
  }

  public void put(int key, int value) {
    LRUNode node = new LRUNode(key, value);
    map.put(key, node);
    if(startNode == null){
      startNode = node;
    } else {
      startNode.setPrev(node);
      node.setNext(startNode);
      startNode = node;
    }
  }




}

class LRUNode{
  private int key;
  private int data;
  private LRUNode next;
  private LRUNode prev;

  public LRUNode(int key, int data) {
    this.data = data;
    this.key = key;
  }

  public LRUNode getPrev() {
    return prev;
  }

  public void setPrev(LRUNode prev) {
    this.prev = prev;
  }

  public LRUNode getNext() {
    return next;
  }

  public void setNext(LRUNode next) {
    this.next = next;
  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public int getKey() {
    return key;
  }

  public void setKey(int key) {
    this.key = key;
  }


}
