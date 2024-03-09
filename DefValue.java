
public class DefValue{
static boolean b = true;
static int i = 7;
static double d = 11.04;
static long l = 1227050138;
static char f= 'Z';
static float y = 5.4f;
static byte c = 8;
public static void main(String[] args) {

DefValue val = new DefValue(); 
System.out.println("Default boolean : " + val.b); 
System.out.println("Default integer : "+ val.i); 
System.out.println("Default double : " + val.d); 
System.out.println("Default long : " + val.l); 
System.out.println("Default float: " + val.f);
System.out.println("Default float: " + val.y);
System.out.println("Default char : "+ val.c);

    }
}