package com.naman.lecture31OOP.oop6.generics;

import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size =0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }

    public int removeLast() {
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set (int index, int value){
        data[index] = value;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        // copy the current items int the new array
        for (int i = 0; i< data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(22);

        System.out.println(list.removeLast());
        System.out.println(list);

    }
}
