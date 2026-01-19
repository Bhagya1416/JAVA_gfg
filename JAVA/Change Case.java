class Solution {
    public static void changeCase(String s) {
        String capitalizedFirst = Character.toUpperCase(s.charAt(0)) + s.substring(1);
        String uppercaseString = s.toUpperCase();
        System.out.println(capitalizedFirst);
        System.out.println(uppercaseString);
    }
}
