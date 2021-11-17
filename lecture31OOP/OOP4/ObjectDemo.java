package com.naman.lecture31OOP.OOP4;

public class ObjectDemo {

    int num;

    public ObjectDemo(int num) {
        this.num = num;
    }

    // we will go in details of how to create it in hash map lecture
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    // already covered
    // gives the string representation
    @Override
    public String toString() {
        return super.toString();
    }

    // called during garbage collection
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(22);
        ObjectDemo obj1 = new ObjectDemo(22);

        System.out.println(obj.hashCode());
        System.out.println(obj1.hashCode());
    }
}
