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
        HashMap<Character, Integer> hm10 = new HashMap<Character, Integer>();
        for (Map.Entry<Character, Integer> en : hm1.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                    ", Value = " + en.getValue());
//            hm10.put(en.getKey(),en.getValue());
//            System.out.println(hm10);
            if(previousvalue<en.getValue()){
                previousvalue=en.getValue();
                previouskey=en.getKey();
            }

        }
        System.out.println(previousvalue+" "+(char)previouskey);
//        System.out.println(hm1);

        /*-------------------*/
        /*System.out.println("New");
        System.out.println(hm10);
        LinkedHashMap<Character,String> reverseMap = new LinkedHashMap<Character,String>();*/

//        System.out.println(hm10.lastEntry()+"last");
        /*NavigableSet<Integer> keySet = hm10.navigableKeySet();
        Iterator<Integer> iterator = keySet.descendingIterator();
        Integer i1;
        while(iterator.hasNext())
        {
            i1 = iterator.next();
            reverseMap.put(i1,hm10.get(i1));
        }
        System.out.println(reverseMap);*/


        /*HashMap<Character, Integer> hm2 =sortByValue1(hm);

        for (Map.Entry<Character, Integer> en : hm2.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                    ", Value = " + en.getValue());
            if(previousvalue>en.getValue()){
                previousvalue=en.getValue();
                previouskey=en.getKey();
            }

        }*/

//        List<Integer> valueList = new ArrayList<> (hm.values());
//        Collections.sort(valueList);
/*------------------------*/
        /*String userinput;
        Scanner sc=new Scanner(System.in);
        userinput=sc.nextLine();

        int n = userinput.length();
        int[] freq = new int[50000];

        for (int i = 0; i < n; i++)
            System.out.println("aa"+freq[userinput.charAt(i) - 'a']++);
        for (int i = 0; i < n; i++) {

            if (freq[userinput.charAt(i) - 'a'] != 0) {

                System.out.print(userinput.charAt(i));
                System.out.print("ss = "+freq[userinput.charAt(i) - 'a'] + " ");

                freq[userinput.charAt(i) - 'a'] = 0;
            }
        }



        for(Character key: keySetArr){
            System.out.println(key);

        }*/
        /*--------------------*/
        String s1;
        Scanner sc1 = new Scanner(System.in);
//            System.out.println();
        s1=sc1.nextLine();
        try {
            List<String> list = new ArrayList<String>();
            int totalWords = 0;
            int uniqueWords = 0;

            File fr = new File("/home/pp-2/Desktop/java/file1.txt");
            Scanner sc = new Scanner(fr);


            while (sc.hasNext()) {
                String words = sc.next();
                String[] space = words.split(" ");
                for (int i = 0; i < space.length; i++) {
//                     System.out.println("list : "+space[i]+" s1 "+s1);
                    if(s1.equals(space[i])) {
                        list.add(space[i]);
//                        System.out.println("okkkkkkkkk");
                    }
                }
                totalWords++;
            }
            System.out.println("Words with their frequency..");
            Set<String> uniqueSet = new HashSet<String>(list);
            for (String word : uniqueSet) {
                System.out.println(word + " count of  word : " + Collections.frequency(list,word));
            }
        } catch (Exception e) {

            System.out.println("File not found");

        }
        /*------------Characters level statistics like total words -*/
        charCount("Each charecter ow much time repeat "+s1);
        System.out.println();
        wordsReverse(s1);
    }

    public static HashMap<Character, Integer>
    sortByValue(HashMap<Character, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<Character, Integer> > list = new LinkedList<Map.Entry<Character, Integer> >(
                hm.entrySet());

        Collections.sort(list,
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
    public static HashMap<Character, Integer>
    sortByValue1(HashMap<Character, Integer> hm1)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<Character, Integer> > list = new LinkedList<Map.Entry<Character, Integer> >(
                hm1.entrySet());

        Collections.sort(list,
                (i2,
                 i1) -> i2.getValue().compareTo(i1.getValue()));

        HashMap<Character, Integer> temp= new LinkedHashMap<Character, Integer>();
        for (Map.Entry<Character, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
//        System.out.println("Sorting  : "+temp);
        return temp;
    }

    /*------------*/
    public static void charCount(String s)
    {

        Map<Character, Integer> data = new HashMap<Character, Integer>();


        for(int i = 0; i < s.length(); i++)
        {
            if(data.containsKey(s.charAt(i)))
            {
                data.put(s.charAt(i), data.get(s.charAt(i)) + 1);
            }
            else
            {
                data.put(s.charAt(i), 1);
            }
        }

        for(int i = 0; i < s.length(); i++)
        {

            if(data.get(s.charAt(i)) != 0)
            {
                System.out.print(s.charAt(i));
                System.out.print(data.get(s.charAt(i)) + " ");
                data.put(s.charAt(i), 0);
            }
        }
    }

    /*-----------------*/
    static void wordsReverse(String str)
    {
        Stack<Character> st=new Stack<Character>();

        for (int i = 0; i < str.length(); ++i) {
            if ((str.charAt(i) != ' '))
                st.push(str.charAt(i));

            else {
                while (st.empty() == false) {
                    System.out.print(st.pop());

                }
                System.out.print(" ");
            }
        }

        while (st.empty() == false) {
            System.out.print(st.pop());

        }
    }



}
