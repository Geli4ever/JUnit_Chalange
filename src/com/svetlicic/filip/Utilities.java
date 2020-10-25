package com.svetlicic.filip;

import java.util.ArrayList;
import java.util.Arrays;

public class Utilities {

    //Returns a char array containing every nth char. When
    //sourceArray.length < n, returns sourceArray
    public char[] everyNthChar(char[] sourceArray, int n){

        if(sourceArray.length < n){
            return sourceArray;
        }

        char[] chars = new char[(sourceArray.length / n)];

        for(int i = n - 1, j = 0; i < sourceArray.length; i += n, j++){
            chars[j] = sourceArray[i];
        }

        return chars;
    }

    public String removePairs(String source){

        if(source == null || source.length() < 2 ){
            return source;
        }

        StringBuilder sb = new StringBuilder();
        char[] string = source.toCharArray();
        for(int i = 0; i < string.length - 1; i++){
            if(string[i] == string[i + 1]){
                continue;
            }
            sb.append(string[i]);
        }

        sb.append(string[string.length - 1]);

        return sb.toString();
    }

    public int converter(int a, int b){
            return (a/b) + (a*30) - 2;
    }

    public String nullIfOddLength(String source){
        if(source.length() % 2 == 0){
            return source;
        }
        return null;
    }
}
