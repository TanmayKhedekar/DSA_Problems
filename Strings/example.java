package Strings;

public class example {
    public static void main(String[] args) {
        
        /*Length */
        String name="tanmay khedekar";
        int length=name.length();
        System.out.println(length);
        
        /*charAt */
        char c=name.charAt(2);
        System.out.println(c);

        /*Equals */
        String name2="Tanmay Khedekar";
        System.out.println(name.equals(name2));
        System.out.println(name.equalsIgnoreCase(name2));

        /*CompareTo */
        System.out.println(name2.compareTo(name2));
        

        /*ASCII VALUES */
        System.out.println('r'+ 0);

        /*SubString */
        String num="Tanmay Khedekar";
        String substring=name.substring(5,8);
        System.out.println(substring);

        /*Upper lower case */
        System.out.println(num.toLowerCase());
        System.out.println(num.toUpperCase());

        /*Replace */
        System.out.println(num.replace(num,substring));

        /*Starts and ends */
        System.out.println(name.startsWith("tan"));
        System.out.println(name.endsWith("ar"));
        System.out.println(name.indexOf(c, c));

        /*Format */
        String tan=String.format("MY name is %s and I am %d years old","john",22);















    }
    
}
