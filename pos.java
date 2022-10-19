public class twentyseven {
public static void main(String[] args)
{
String S1="Welcome";
String S2="Java";
 StringBuffer sb = new StringBuffer(S1);
 sb.reverse(); String str1 = "come";
 String str2 = "go";
 ASSESSMENT 5
 System.out.println(S1.charAt(2));
 System.out.println(S1.charAt(3));
 System.out.println(S1.length());
 System.out.println(S2.length());
 System.out.println(S1 + S2);
 System.out.println(S1.compareTo(S2));
 System.out.println( S1.contains(str1));
 System.out.println(S2.contains(str2));
 System.out.println( S1.indexOf('o'));
 System.out.println( S2.lastIndexOf('a'));
 System.out.println(sb); sb.reverse();
 System.out.println(S2.toLowerCase());
 System.out.println(S1.toUpperCase());
 System.out.println(S1.startsWith("W"));
 System.out.println(S1.startsWith("P"));
 String replace = S1.replace('e', 'E');
 System.out.println(replace);
 String replaces = S2.replace("a", "oo");
 System.out.println(replaces);
}
} 
