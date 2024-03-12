package org.example;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class extractCustomerIdFromXML {
    public static void main(String[] args) {

        String data = ""; // Your data here

        // Define the regex pattern
        Pattern pattern = Pattern.compile("<CUSTOMERID>(.*?)</CUSTOMERID>");
        Matcher matcher = pattern.matcher(data);

        // Set to store distinct customer IDs
        Set<String> customerIds = new HashSet<>();

        // Find and add all distinct matches to the set
        while (matcher.find()) {
            String customerId = matcher.group(1);
            customerIds.add(customerId);
        }

        // Print the set of distinct customer IDs
        for (String customerId : customerIds) {
            System.out.println(customerId);
        }
    }


}
