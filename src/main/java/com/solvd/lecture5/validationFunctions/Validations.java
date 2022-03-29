package com.solvd.lecture5.validationFunctions;

import com.solvd.lecture5.exceptions.AgeException;
import com.solvd.lecture5.exceptions.InvalidDni;
import com.solvd.lecture5.exceptions.InvalidWord;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validations {
    public static boolean checkAge(int age) throws AgeException {
        if(age<0){
            throw new AgeException();
        }else return true;
    }
    public static boolean checkWord(String str) throws InvalidWord {
        Pattern pat = Pattern.compile("[a-zA-Z]\\w{5,29}");
        Matcher mat = pat.matcher(str);
        if (mat.matches()) {
            return true;
        } else {
            throw new InvalidWord();
        }
    }

    public static boolean checkDni(String dni) throws InvalidDni{
        Pattern pat = Pattern.compile("[0-9]\\w{7,8}");
        Matcher mat = pat.matcher(dni);
        if (mat.matches()) {
            return true;
        } else {
            throw new InvalidDni();
        }
    }
}
