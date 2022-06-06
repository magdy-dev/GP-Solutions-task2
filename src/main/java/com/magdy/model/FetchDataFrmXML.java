package com.magdy.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FetchDataFrmXML {
    public static String fetchDataFrmXML(String fileLocation) throws Exception
    {
        File file = new File(fileLocation);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String temp;
        String result = "";
        while ((temp = br.readLine()) != null) {
            result += temp;
        }

        br.close();
        return result;
    }
}
