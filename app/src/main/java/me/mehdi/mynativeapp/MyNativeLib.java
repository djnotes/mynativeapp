package me.mehdi.mynativeapp;

/**
 * Created by johndoe on 3/24/18.
 */

public class MyNativeLib {
    static {
        System.loadLibrary("mynativelib");
    }

    public static native float mean(int[] a);
}
