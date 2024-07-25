public class Strings_Methods {
    public static void main(String[] args){
        String name = "Hardik Singh";
        System.out.println(name);

        System.out.println(name.replace('a','k'));
        System.out.println("The new replaced name is "+ name.replace("ardik","appy")); // Replacing substrings of the string

        System.out.println(name.startsWith("Ha")); // Returns true if the name string starts with the subtring or char specified else returns false

        System.out.println(name.endsWith("dik")); // Returns true if the name string ends with the subtring or char specified else returns false

        System.out.println("The character at index 3 is " + name.charAt(3)); // Returns the character at index specified

        System.out.println(name.indexOf("i")); // Returns the index of the starting character of the substring specified '7' specifies from which index to search from 

        System.out.println(name.lastIndexOf("i")); // Returns the index of the starting character of the substring specified from the end
        System.out.println(name.lastIndexOf("i",5)); // Returns the index of the starting character of the substring specified from the end and within the index given 
        
        System.out.println(name.equals("Hardik Singh")); // Compares the string given, to the string initialised. Returns true if match, else returns false 
        System.out.println(name.equals("Hardik")); // Compares the string given, to the string initialised. Returns true if match, else returns false 
        System.out.println(name.equalsIgnoreCase("hardiK sIngh")); // Ignores the case sensitivity

        int value = name.length();
        System.out.printf("The length of the string is %d\n", value);
        
        String name_lower_case = name.toLowerCase();
        System.out.format("Lower case is '%s'", name_lower_case);
        
        String name_upper_case = name.toUpperCase();
        System.out.format("\nUpper case is '%s'\n", name_upper_case);

        // Original string is not changed 
        System.out.println(name);

        // Changing the container of the original String 
        name = name.toUpperCase();
        System.out.format("The upper case is %s\n", name);

        String nontrimmed = "             Hardik";
        System.out.println(nontrimmed);
        String trimmed = nontrimmed.trim();
        System.out.println(trimmed);
        System.out.println(nontrimmed.trim());

        String number = "0123456789";
        System.out.println(number.replace('0','9'));
        System.out.println(number.substring(3)); // Prints the substring from the index specified in the parenthesis
        System.out.println(number.substring(1,4)); // end index is *not* included

        
    }
}
