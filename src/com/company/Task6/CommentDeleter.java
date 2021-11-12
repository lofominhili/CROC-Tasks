package com.company.Task6;

public class CommentDeleter {
    private static final String example = "/*\n*My first ever program in Java!\n*/\nclass Hello {// class body starts here\n/* main method */\npublic static void main(String[] args/* we put command line arguments here*/) {// this line prints my first greeting to the screen\nSystem.out.println(\"Hi!\");// :)\n }\n} // the end\n// to be continued...\n";
    private static String result = "";

    public static String DeleteComments() {
        for (int i = 0; i < example.length(); i++) {
            if (example.charAt(i) == '/' && example.charAt(i + 1) != '/') {
                i++;
                while (example.charAt(i) != '/') {
                    i++;
                }
            } else if (example.charAt(i) == '/' && example.charAt(i + 1) == '/') {
                i += 2;
                while (example.charAt(i + 1) != '\n') {
                    i++;
                }
                result += '\n';
            } else {
                result += example.charAt(i);
            }
        }
        return result;
    }
}
