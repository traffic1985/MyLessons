public class Main {

   static byte b = 12; //  8 бит от -128 ДО 127
   static short sh = 8; //    16 бит от -32768 до 32767
   static int i = 99; // 32 бита от от -2 147 483 648 до 2 147 483 647
   static long l = 42315; // 64 бит	от -9 223 372 036 854 775 808 до 9 223 372 036 854 775 807

   static float f = 2.5f; // 32	от -1.4e-45f до 3.4e+38f
   static double d = 2.5; // 64	от -4.9e-324 до 1.7e+308

    static boolean b1 = true; // 8 бит в массивах, 32 бита (не в массивах используется int)
    static boolean b2 = false;

    static String st = "Hello world";
    static char c = 'z';


    public static void main(String[] args) {

        System.out.println("byte "+b);
        System.out.println("short "+sh);
        System.out.println("int " +i);
        System.out.println("long "+l);

        System.out.println("float "+f);
        System.out.println("double "+d);
        System.out.println("boolean "+b1);
        System.out.println("boolean "+b2);

        System.out.println(st);
        System.out.println(c);

    }


}
