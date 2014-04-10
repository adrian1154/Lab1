public class Hello
{
  public static void main( String argv[] )
    {
      //This is an unwanted but staged comment
      //AUthor: Justine Lin (jcl084@ucsd.edu)
      String name = "World!";
      if (argv.length! = 0)
     {
       name = argv[0];
     }
     System.out.println( "Hello, " + name + "!" );
    }
}
