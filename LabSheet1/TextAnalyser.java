package LabSheet1;

import java.util.Scanner;

public class TextAnalyser {
    public static void main(String[] args) {

        String text, shortestText=" ";
        char ch, nextCh=' ';
        int i=1, j, vowels, words, countWords=0, count_ed;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Please enter piece of text " + i + ": ");
            text=input.nextLine();

            j=0;
            words=0;
            vowels=0;
            count_ed=0;

            while(j<text.length())
            {
                ch=text.charAt(j);

                if(j<text.length()-1)
                    nextCh=text.charAt(j+1);

                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                    vowels++;

                if(ch==' ')
                    countWords++;

                if(ch=='e' && nextCh=='d')
                    count_ed++;

                j++;
            }

            System.out.print("\n\t\t******Text Data******" +
                            "\nNumber of characters: " + text.length() +
                            "\nNumber of lowercase vowels: " + vowels +
                            "\nNumber of words: " + (words+1) +
                            "\nNumber of times \"ed\" appears in the text: " + count_ed + "\n\n\n");

            if(i==1)
                shortestText=text;
            else if(text.length()<shortestText.length())
                shortestText=text;

            countWords+=(words+1);

            i++;
        }

        while(i<=3);

        System.out.print("\n\n\t\t******Overall Results******" +
                "\nShortest piece of text: " + shortestText +
                "\nAverage number of words: " + String.format("%.0f", (countWords/3f)) + "\n\n\n");

        System.exit(0);

    }
}
