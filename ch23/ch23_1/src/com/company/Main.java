package com.company;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.List;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws Exception {
        // write your code here
        int numOfWord = 0;
        int numOfNumbers = 0;
        int uniqueWord = 0;
        int uniqueNumber = 0;
        int numOfCharacter = 0;
        int numOfWhitespace = 0;
        int wordLengthLessThanThree = 0;
        String oneLineOfFile;
        StringBuilder allLineOfFile = new StringBuilder();
        String file = "/home/pp-2/Desktop/java/file1.txt";

        HashMap<String, Integer> uniqueNumberHashmap = new HashMap<>();
        HashMap<String, Integer> uniqueWordHashmap = new HashMap<>();
        HashMap<Integer, Integer> wordLengthCount = new HashMap<>();

        FileInputStream file1 = new FileInputStream(file);
        InputStreamReader isr1 = new InputStreamReader(file1);
        HashMap<Character, Integer> hashMap1;
        try (BufferedReader br1 = new BufferedReader(isr1)) {


            hashMap1 = new HashMap<>();

            while ((oneLineOfFile = br1.readLine()) != null) {
                oneLineOfFile = oneLineOfFile.replace(".", "");

                numOfCharacter += oneLineOfFile.length();
                String[] words = oneLineOfFile.split("\\s+");

                Pattern numberPattern = Pattern.compile("[1-9]+");
                Matcher matchNumberPattern = numberPattern.matcher(oneLineOfFile);

                while (matchNumberPattern.find()) {
                    String word = matchNumberPattern.group();
                    if (!uniqueNumberHashmap.containsKey(word))
                        uniqueNumberHashmap.put(word, 1);
                    else
                        uniqueNumberHashmap.put(word, uniqueNumberHashmap.get(word) + 1);
                }

                // Extracting words from string
                Pattern p = Pattern.compile("[a-zA-Z]+");

                allLineOfFile.append(oneLineOfFile).append(" \n ");
                Matcher m = p.matcher(oneLineOfFile);

                while (m.find()) {
                    String word = m.group();
                    if (!uniqueWordHashmap.containsKey(word)) {
                        uniqueWordHashmap.put(word, 1);
                    } else {
                        uniqueWordHashmap.put(word, uniqueWordHashmap.get(word) + 1);
                    }
                }

                /*-----------------------------------*/
                for (String word : words) {
                    //Filter words which length is less than 3.
                    if (word.length() < 3) {
                        wordLengthLessThanThree++;
                    }
                    try {
                        Integer.parseInt(word);
                        numOfNumbers += 1;

                    } catch (NumberFormatException e) {
                        //Print word length wise unique count
                        int wordLength = word.length();
                        if (!wordLengthCount.containsKey(wordLength)) {
                            wordLengthCount.put(wordLength, 1);
                        } else {
                            wordLengthCount.put(wordLength, wordLengthCount.get(wordLength) + 1);
                        }
                        numOfWord += 1;
                    }
                }


                for (String x : words) {

                    Character characterOne = x.charAt(0);
                    if (!hashMap1.containsKey(characterOne)) {
                        hashMap1.put(characterOne, 1);
                    } else {
                        hashMap1.put(characterOne, hashMap1.get(characterOne) + 1);
                    }


                }
                numOfWhitespace += numOfWord - 1;
            }
        }
        for (Map.Entry<String, Integer> entry : uniqueWordHashmap.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueWord += 1;
            }
        }
        for (Map.Entry<String, Integer> entry : uniqueNumberHashmap.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueNumber += 1;
            }
        }
        //Print word length wise unique count
        for (Map.Entry<Integer, Integer> entry : wordLengthCount.entrySet()) {
            logger.info("length of word = {}  count = {}", entry.getKey(), entry.getValue());
        }


        logger.info("Total word count = {}", numOfWord);
        logger.info("Total Numbers count = {}", numOfNumbers);
        logger.info("uniquqe Numbers count = {}", uniqueNumber);
        logger.info("uniquqe Word count = {}", uniqueWord);

        logger.info("Total number of characters = {}", numOfCharacter);
        logger.info("Total number of whitespaces = {}", numOfWhitespace);
        logger.info("wordLengthLessThanThree = {}", wordLengthLessThanThree);

        logger.info("After sorting ascending order......");

        HashMap<Character, Integer> ascendingOrderHashmap = sortByValue(hashMap1);
        HashMap<Character, Integer> descendingOrderHashmap = sortByValue1(hashMap1);
        printHashmap(ascendingOrderHashmap);


        logger.info("After sorting decending order......");
        printHashmap(descendingOrderHashmap);

        logger.info("Print top N characters which have more words");
        for (Map.Entry<Character, Integer> en : descendingOrderHashmap.entrySet()) {
            if (en.getValue() > 2)
                logger.info("Key = {} , Value = {} ", en.getKey(), en.getValue());
        }

        String reverseWordResult = Arrays.stream(allLineOfFile.toString().split(" "))
                .map(oneWord -> new StringBuilder(oneWord).reverse())
                .collect(Collectors.joining(" "));

        logger.info("reverseWordResult");
        logger.info(reverseWordResult);
        printCharacterWithFreq(allLineOfFile.toString());

        String userInput;
        Scanner sc1 = new Scanner(System.in);
        logger.info("Find word : ");
        userInput = sc1.nextLine();

        List<String> wordList = new ArrayList<>();

        FileInputStream file2 = new FileInputStream(file);
        InputStreamReader isr2 = new InputStreamReader(file2);
        try (BufferedReader br2 = new BufferedReader(isr2)) {
            while ((oneLineOfFile = br2.readLine()) != null) {
                String[] space = oneLineOfFile.split(" ");

                IntStream.range(0, space.length).filter(i -> userInput.equals(space[i])).mapToObj(i -> space[i]).forEach(wordList::add);
            }
        } catch (Exception e) {
            logger.info("Exception is {}", e.toString());
        }
        logger.info("Words with their frequency..");
        HashSet<String> uniqueSet = new HashSet<>(wordList);


        for (String word : uniqueSet) {
            logger.info(" {} count of  word : {}", word, Collections.frequency(wordList, word));
            if (Collections.frequency(wordList, word) > 1) {
                logger.info("Word is not unique ");
            } else {
                logger.info("word is unique  ");
            }
        }

        /*------------Characters level statistics like total words -*/
        logger.info("charcater count :");
        charCount(userInput);
        logger.info("---------");
        /*------------Reverse word------------------*/
        wordsReverse(userInput);
    }

    public static void printHashmap(Map<Character, Integer> hashMap) {
        for (Map.Entry<Character, Integer> en : hashMap.entrySet()) {
            logger.info("Key = {} , Value = {}", en.getKey(), en.getValue());
        }
    }

    public static HashMap<Character, Integer> sortByValue(Map<Character, Integer> ascendingSortHashmap) {
        // Create a list from elements of HashMap
        List<Map.Entry<Character, Integer>> list = new LinkedList<>(ascendingSortHashmap.entrySet());

        list.sort(Map.Entry.comparingByValue());

        HashMap<Character, Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> ascendingSort : list) {
            temp.put(ascendingSort.getKey(), ascendingSort.getValue());
        }
        return temp;
    }

    public static HashMap<Character, Integer> sortByValue1(HashMap<Character, Integer> descendingSortHashmap) {
        descendingSortHashmap = descendingSortHashmap.entrySet()
                .stream()
                .sorted((i1, i2) -> i2.getValue().compareTo(i1.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));

        return descendingSortHashmap;
    }

    /*------------*/
    public static void charCount(String userInputString) {

        Map<Character, Integer> data = new HashMap<>();
        for (int i = 0; i < userInputString.length(); i++) {
            if (data.containsKey(userInputString.charAt(i))) {
                data.put(userInputString.charAt(i), data.get(userInputString.charAt(i)) + 1);
            } else {
                data.put(userInputString.charAt(i), 1);
            }
        }

        for (int i = 0; i < userInputString.length(); i++) {
            if (data.get(userInputString.charAt(i)) != 0) {
                logger.info(" {} is occur  {} ", userInputString.charAt(i), data.get(userInputString.charAt(i)));
                data.put(userInputString.charAt(i), 0);
            }
        }
    }

    /*-----------------*/
    static void wordsReverse(String str) {
        StringBuilder reverseWord = new StringBuilder();
        Stack<Character> wordReverseStack = new Stack<>();

        for (int i = 0; i < str.length(); ++i) {
            if ((str.charAt(i) != ' ')) {
                wordReverseStack.push(str.charAt(i));
            }
        }

        while (!wordReverseStack.empty()) {
            reverseWord.append(wordReverseStack.pop());
        }
        logger.info("Reverse word : {}", reverseWord);
    }

    public static void printCharacterWithFreq(String s) {
        Map<Character, Integer> charcterFreqHashmap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (charcterFreqHashmap.containsKey(s.charAt(i))) {
                charcterFreqHashmap.put(s.charAt(i), charcterFreqHashmap.get(s.charAt(i)) + 1);
            } else {
                charcterFreqHashmap.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (charcterFreqHashmap.get(s.charAt(i)) != 0) {
                logger.info("character : {} {}", s.charAt(i), charcterFreqHashmap.get(s.charAt(i)));
                charcterFreqHashmap.put(s.charAt(i), 0);
            }
        }
    }
}
