package com.example.demo;

/*
*
* a page data provided to service
*
* returns wrapped text
*
*
*
*
* */


import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class WrappingService {



    /*
    *
    * sfjas  asdfjasdlj  lasjfdlkasjdk asdf
    *
    *
    * */

    public String doWrapping(String inputText, int maxCharInLine) {

        int offset = 0;
        int limit = maxCharInLine;

        StringBuffer out = new StringBuffer();

        while (offset < inputText.length()){

            String line = "";

            if (inputText.length() > limit){
                line = inputText.substring(offset, limit);
            }else {
                line = inputText.substring(offset, inputText.length());
                out.append(line);
                return out.toString();
            }

            if (inputText.charAt(limit+1) == ' '){
                offset = limit;
            }else {
                int findEndIndex = limit;
                StringBuffer brokenWord = new StringBuffer();
                while (inputText.charAt(findEndIndex) != ' '){
                    brokenWord.append(inputText.charAt(findEndIndex));
                    findEndIndex++;
                }
                line = line + brokenWord.toString();
                offset = findEndIndex;
                limit = offset+maxCharInLine;
            }

            out.append(line);
            out.append("\n");


        }

        return out.toString();

    }




}
