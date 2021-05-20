package com.testApp.fizzbuzz;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class FizzbuzService {

    public String getResult(Integer i) {

        if (isMultipleOf(i, 105)) {
            return "FizzBuzzBazz";
        }
        if (isMultipleOf(i, 35)) {
            return "BuzzBazz";
        }
        if (isMultipleOf(i, 21)) {
            return "FizzBazz";
        }
        if (isMultipleOf(i, 15)) {
            return "fizzbuzz";
        }
        if (isMultipleOf(i, 3)) {
            return "fizz";
        }
        if (isMultipleOf(i, 5)) {
            return "buzz";
        }
        if (isMultipleOf(i, 7)) {
            return "Bazz";
        }

        return String.valueOf(i);
    }

    public List<String> getResults(Integer input) {
        List<String> resultsList = new ArrayList<>();
        for (int i = 1; i <= input; i++) {
            resultsList.add(this.getResult(i));
        }

        return resultsList;
    }

    private static boolean isMultipleOf(int input, int i) {
        return input % i == 0;
    }


}