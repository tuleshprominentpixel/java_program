package com.company;

public class Main {
    static public int strDist(String fullstring, String sub) {

        if(fullstring.length() < sub.length())
            return 0;

        if(!fullstring.contains(sub))return 0;

        if(fullstring.startsWith(sub)&& fullstring.endsWith(sub))
            return fullstring.length();

        if(fullstring.startsWith(sub) )
            return  strDist(fullstring.substring(0,fullstring.length()-1),sub);

        if(fullstring.endsWith(sub))
            return strDist(fullstring.substring(1,fullstring.length()),sub);

        else return strDist(fullstring.substring(1,fullstring.length()-1),sub);
    }
    public static void main(String[] args) {
        System.out.println(strDist("catcowcat", "cat"));
        System.out.println(strDist("catcowcat", "cow"));
        System.out.println(strDist("cccatcowcatxx", "cat"));
      

    }

}
