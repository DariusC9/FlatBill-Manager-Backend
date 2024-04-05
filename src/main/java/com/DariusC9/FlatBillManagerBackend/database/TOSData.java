package com.DariusC9.FlatBillManagerBackend.database;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TOSData {
    private List<String> data;
    public TOSData() {

        String tos = "By downloading and using this app, you agree to abide by our terms of service.\n" +
                " Enjoy a seamless experience with us!";
        data = new ArrayList<>(Arrays.asList(tos));
    }
    public List<String> getData() { return data; }
}
