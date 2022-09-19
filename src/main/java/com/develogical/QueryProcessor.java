package com.develogical;

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
        if (queryLowerCase.contains("what is your name")) {
            return "Your name is Oneill Cruz";
        }
        return "";
    }
}
