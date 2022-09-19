package com.develogical;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QueryProcessor {

    public String process(String query) {
        String queryLowerCase = query.toLowerCase();
        if (queryLowerCase.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (queryLowerCase.contains("oneill cruz")) {
            return ".220 batting average";
        }

        if (queryLowerCase.contains("plus")) {
            Pattern pattern = Pattern.compile("what is (\\d+) plus (\\d+)", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(query);
            if (matcher.find()) {
                int lhs = Integer.parseInt(matcher.group(1));
                int rhs = Integer.parseInt(matcher.group(2));
                int sum = lhs + rhs;
                return Integer.toString(sum);
            }
        }

        if (queryLowerCase.contains("name")) {
            return "Chris and Michael (after we listened to the instructions)";
        }
        return "";
    }
}
