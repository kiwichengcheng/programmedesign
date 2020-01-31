package com.cc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> input = new ArrayList<>();
        String line;
        while(!(line =sc.nextLine()).equals("")) {
            input.add(line);
        }

        List<List<String>> afterFormat =new ArrayList<>();

        for ( int i = 0 ; i < input.size() ; i++){
            String linetmp = input.get(i);
            int start = 0;
            boolean inQuotes = false;
            List<String> tempFormat = new ArrayList<>();
            for (int j = 0 ; j< linetmp.length() ; j++){
                if(linetmp.charAt(j) == '\"'){
                    inQuotes = !inQuotes;
                }

                if(linetmp.charAt(j) == ',' && !inQuotes){
                    String quoteBefore = linetmp.substring(start, j);
                    if(quoteBefore.startsWith("\"") && quoteBefore.endsWith("\"")){
                        quoteBefore = quoteBefore.substring(1,quoteBefore.length()-1);
                        quoteBefore = quoteBefore.replaceAll("\"\"","\"");
                    }
                    tempFormat.add(quoteBefore);
                    start = j+1;
                }
            }
            tempFormat.add(linetmp.substring(start,linetmp.length()));
            afterFormat.add(tempFormat);
        }

        for(int i = 0 ; i< afterFormat.size() ; i++){
            List<String> data = afterFormat.get(i);
            System.out.println(data.get(0)+"   "+data.get(6)+"   "+data.get(5)+"   "+data.get(4));
        }
    }
}
