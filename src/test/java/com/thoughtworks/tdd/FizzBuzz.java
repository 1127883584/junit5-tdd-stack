package com.thoughtworks.tdd;

public class FizzBuzz {
    public String say(int student){
        String result = "";
        if (student % 3 == 0 || student % 5 == 0 ||  student % 7 == 0){
            if (student % 3 == 0) {
                result += "Fizz";
            }
            if (student % 5 == 0) {
                result += "Buzz";
            }
            if (student % 7 == 0) {
                result += "Whizz";
            }
        } else {
            result = String.valueOf(student);
        }
        return result;
    }
}
