public class MainClass {

        public static void main(String []args){
          String foo = "abc";
          String boo = new String("abc");
          
          System.out.println(foo == boo);
          System.out.println(foo.equals(boo));
        }
}
