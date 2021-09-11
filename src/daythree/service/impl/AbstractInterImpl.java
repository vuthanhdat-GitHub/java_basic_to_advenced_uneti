package daythree.service.impl;

import daythree.service.AbstractInter;
import daythree.service.AbstractInter2;

public class AbstractInterImpl implements AbstractInter , AbstractInter2 {

    @Override
    public void print(String name) {
        System.out.println(name);
    }

    @Override
    public void print(String name, String action) {

    }

    @Override
    public void print(String name, String action, String data) {

    }

    @Override
    public void print(String name, int data) {
        if (data == 0) {
            System.out.println(name);
        }
    }

    @Override
    public void printLine(String name) {

    }
}
