package cn.edu.javase.集合;

import java.util.*;

public class A implements Collection {
    public static void main(String[] args) {
        List l=new ArrayList();
        l.add(null);
        l.add(null);
        l.add(1);
        l.add(1);
        System.out.println(l.size());
        Set s=new HashSet();
        s.add(null);
        s.add(null);
        //s.add(1);
        //s.add(1);
        Map m=new HashMap();
        Set <Map.Entry<String,String>> set = m.entrySet();
        System.out.println(s.size());
    }
    @Override
    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
