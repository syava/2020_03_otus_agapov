package ru.otus;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
-Xms16m
-Xmx16m
-Xlog:gc=debug:file=./hw04-gc/logs/gc-%p-%t.log:tags,uptime,time,level:filecount=5,filesize=10m
-XX:+HeapDumpOnOutOfMemoryError
-XX:HeapDumpPath=./hw04-gc/logs/dump

-XX:+UseG1GC
-XX:+UseParallelGC
-XX:+UnlockExperimentalVMOptions -XX:+UseZGC
-XX:+UseSerialGC

---
-Xms8192m
-Xmx8192m
-Xlog:gc=debug:file=./hw04-gc/logs/gc-%p-%t.log:tags,uptime,time,level:filecount=5,filesize=10m
-XX:+HeapDumpOnOutOfMemoryError
-XX:HeapDumpPath=./hw04-gc/logs/dump

-XX:+UseG1GC
-XX:+UseParallelGC

 */

public class OutOfMemory {
    private List<Double> list = new ArrayList<>();
    private Random rd = new Random();

    public static void main(String[] args) {
        new OutOfMemory().addToList();
    }
    public void addToList() {
        long m = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            list.add(rd.nextDouble());
            if (list.size() == 100000000) {
                list.clear();
            }
            //System.out.println(list);
            //sleep(); // use sleep when -Xmx16m
        }

        System.out.println(System.currentTimeMillis() - m);
    }

    private void sleep() {
        try {
            Thread.sleep(0, 1);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}