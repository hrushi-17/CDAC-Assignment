namespace _23Demo_Generic
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Without Template Swap Method Code

            //int a = 12;
            //int b = 7;
            //CMath cmath = new CMath();
            //Console.WriteLine($"Before Swapping A={a}, B={b}");
            //cmath.Swap(ref a,ref b);
            //Console.WriteLine($"After Swapping A={a}, B={b}");

            //string s1= "Hello";
            //string s2 = "Bye";
            //Console.WriteLine($"Before Swapping S1={s1}, S2={s2}");
            //cmath.Swap(ref s1, ref s2);
            //Console.WriteLine($"After Swapping S1={s1}, S2={s2}"); 
            #endregion

            #region With Template Swap Method Code
            int a = 23;
            int b = 57;
            CMath cm = new CMath();
            Console.WriteLine($"Before Swapping -> X: {a}, Y: {b}");
            cm.Swap<int>(ref a,ref b );

            Console.WriteLine();

            string s = "Bhai Bhai Bhai";
            string s1 = "Bye....";
            Console.WriteLine($"Before Swapping -> X:{s}, Y:{s1} ");
            cm.Swap<string>(ref s,ref s1 );


            #endregion
        }
    }

    public class CMath
    {

        public void Swap <R>(ref R a,ref R b)
        {
            R temp = a;
            a = b;
            b = temp;

            Console.WriteLine($"After Swapping -> X: {a}, Y: {b}");

        }
        //public void Swap(ref string x, ref string y)
        //{
        //    string temp = x;
        //    x = y;
        //    y = temp;
        //}

    }
}
