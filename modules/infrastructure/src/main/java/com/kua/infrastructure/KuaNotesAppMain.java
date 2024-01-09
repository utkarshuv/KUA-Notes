package com.kua.infrastructure;

import io.micronaut.runtime.Micronaut;

public class KuaNotesAppMain {
    public static void main(String[] args) {
        Micronaut.run(KuaNotesAppMain.class, args);
        System.out.println("UV Checks :: It works");
    }
}
