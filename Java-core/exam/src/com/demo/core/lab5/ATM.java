package com.demo.core.lab5;

public interface ATM {
    boolean withdraw(int a, double b);
    boolean deposit(int aa, double bb);
    boolean queryBlance(int c);
    boolean login(String aaa, String bbb);
    boolean logout(String cc );
}
