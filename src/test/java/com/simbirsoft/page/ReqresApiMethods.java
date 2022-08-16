package com.simbirsoft.page;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReqresApiMethods {
    private static String checkQuantity(String data) {
        String regexp = "<input name=\"itemquantity\\d{7}\" type=\"text\" value=\"\\d{1,}\" class=\"qty-input\" \\/>";
        Pattern pattern = Pattern.compile(regexp);
        Matcher math = pattern.matcher(data);
        math.find();
        String quantity = math.group();
        return quantity;
    }
}
