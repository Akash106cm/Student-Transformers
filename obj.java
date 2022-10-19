class twentyeigth {

 static int noOfObjects = 0;
 {
 noOfObjects += 1;
 }

public twentyeigth()
 { }
 public twentyeigth(int n)
 { }
 public twentyeigth(String s)
 {
 }
 public static void main(String args[])
 { twentyeigth c1 = new twentyeigth();
 twentyeigth c2 = new twentyeigth(5);
 twentyeigth c3 = new twentyeigth("GFG");
 System.out.println(twentyeigth.noOfObjects);
 }
}
