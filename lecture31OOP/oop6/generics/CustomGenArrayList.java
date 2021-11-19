package com.naman.lecture31OOP.oop6.generics;

import java.util.Arrays;

public class CustomGenArrayList<T> {


    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size =0;

    public CustomGenArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add( T num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }

    public T removeLast() {
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index){
        return (T) (data[index]);
    }

    public int size(){
        return size;
    }

    public void set (int index, T value){
        data[index] = value;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

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
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomGenArrayList<Integer> list = new CustomGenArrayList<>();
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(22);
        System.out.println(list.removeLast());
        System.out.println(list);

    }
}
