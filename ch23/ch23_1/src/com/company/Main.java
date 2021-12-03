package com.company;

import java.io.File;
import java.io.*;
import java.lang.reflect.Array;
import java.util.List;
import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        File f=new File("/home/pp-2/Desktop/java/file1.txt");
        /*File list[]=f.listFiles();
        for(File x:list){
            if(x.isDirectory()){

            }
        }*/
        FileInputStream file1=new FileInputStream(f);
        InputStreamReader isr1=new InputStreamReader(file1);
        BufferedReader br1=new BufferedReader(isr1);

        InputStream inputStream = new FileInputStream("/home/pp-2/Desktop/java/file1.txt");
        int numOfWord=0;
        int numOfCharacter=0;
        int numOfWhitespace=0,wordLengthLessThanThree=0;
        String str,line;
        Array arr1[];
        int previousvalue=0;
        int previouskey=0;


        int byteRead,count=0;
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        List<String> values = new ArrayList<String>();


        /*while ((byteRead = inputStream.read()) != -1) {
            System.out.print(((char)byteRead));
            numOfCharacter+=1;
        }*/

        while((line = br1.readLine()) != null) {
            //Splits each line into words
//            String words[] = line.split(" ");
            numOfCharacter+=line.length();
            String words[] = line.split("\\s+");

//            System.out.println("a1 "+words.length);
            for(int i=0;i<words.length;i++){
//                for (int j=0;j<words[0].length();j++)
                if(words[i].length()<3){
//                    System.out.println(""+words[i]);
                    wordLengthLessThanThree++;
                }
            }

            //Counts each word
//            System.out.println(words[8]);

            for (String x:words){

                Character h1= x.charAt(0);
//                System.out.println(x);
                if(!hm.containsKey(h1)){
                    hm.put(h1, 1);
                }else {
                    hm.put(h1,hm.get(h1)+1);
                }

            }
            numOfWord = numOfWord + words.length;
            numOfWhitespace += numOfWord - 1;
        }

        /*while ((str=br1.readLine())!=null){
            System.out.println(str);
            numOfCharacter+=str.length();
            String words[] = str.split("\\s+");
            for(String x:words){
//                System.out.println("word : "+x);

            }

            numOfWord+=words.length;

            numOfWhitespace += numOfWord - 1;
        }*/
        System.out.println("Total word count = "+ numOfWord);

        System.out.println("Total number of characters = "+ numOfCharacter);

        System.out.println("Total number of whitespaces = "+ numOfWhitespace);
//        System.out.println("count = "+ count);
//        System.out.println("hm = "+ hm);
        System.out.println("wordLengthLessThanThree = "+ wordLengthLessThanThree);

        /*hm.forEach((key, value) -> {

            if (value > 1) {
                System.out.println(("key:"+key+" value: "+value));
            }


        });*/
        System.out.println(hm.keySet());
        Set<Character> keySetArr = hm.keySet();
        System.out.println("After sorting ascending order......");

            HashMap<Character, Integer> hm1 =sortByValue(hm);

        for (Map.Entry<Character, Integer> en : hm1.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                    ", Value = " + en.getValue());
            if(previousvalue<en.getValue()){
                previousvalue=en.getValue();
                previouskey=en.getKey();
            }

        }
        System.out.println(previousvalue+" "+(char)previouskey);


//        List<Integer> valueList = new ArrayList<> (hm.values());
//        Collections.sort(valueList);

        String userinput;
        Scanner sc=new Scanner(System.in);
        userinput=sc.nextLine();

        int n = userinput.length();
        int[] freq = new int[50000];

        /*for (int i = 0; i < n; i++)
            System.out.println("aa"+freq[userinput.charAt(i) - 'a']++);*/
        for (int i = 0; i < n; i++) {

            if (freq[userinput.charAt(i) - 'a'] != 0) {

                System.out.print(userinput.charAt(i));
                System.out.print("ss = "+freq[userinput.charAt(i) - 'a'] + " ");

                freq[userinput.charAt(i) - 'a'] = 0;
            }
        }



        for(Character key: keySetArr){
//            System.out.println(key);

        }
    }

    public static HashMap<Character, Integer>
    sortByValue(HashMap<Character, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<Character, Integer> > list
                = new LinkedList<Map.Entry<Character, Integer> >(
                hm.entrySet());

        Collections.sort(
                list,
                (i1,
                 i2) -> i1.getValue().compareTo(i2.getValue()));

        HashMap<Character, Integer> temp
                = new LinkedHashMap<Character, Integer>();
        for (Map.Entry<Character, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
//        System.out.println("Sorting  : "+temp);
        return temp;
    }

}
