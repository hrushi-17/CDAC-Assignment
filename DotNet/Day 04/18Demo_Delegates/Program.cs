namespace _18Demo_Delegates
{

    // A delegate is a Type Safe Function Pointer
    // - Event Handlers

    // Syntax : 
    // (accessModifier) delegate (Return-Type of Method) (Delegate NAme)(Parameter-Type(s));

    public delegate void MyDelegate();
    public delegate void MyDelegate2(String str);
    public delegate int AddDelegate(int m, int n);
    public delegate int MySquareDelegate(int m);
    internal class Program
    {
        static void Main(string[] args)
        {
            Cmath mn = new Cmath();
            AddDelegate mydel = new AddDelegate(mn.add);
            Console.WriteLine("Enter the 1st Number-> ");
            int n = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter the 2nd Number-> ");
            int m = Convert.ToInt32(Console.ReadLine());

            int addProduct = mydel(m, n);

            MySquareDelegate sq = new MySquareDelegate(mn.square);
            int sq1 = sq(n);
            int sq2 = sq(m);

            Welcome wc = new Welcome();
            MyDelegate m1 = new MyDelegate(wc.Hello);
            MyDelegate2 m2 = new MyDelegate2(wc.Greet);

            m1.Invoke();
            m2.Invoke("Hrushi");

            Console.WriteLine($"THe Addition of Numbers is-> {addProduct}  ");
            Console.WriteLine($"......whereas the Square of 1st Number is {sq1} and 2nd Number is {sq2}");


        }
    }
    public class Cmath
    {
        public int add(int x, int y)
        {
            return x + y;
        }
        public int square(int x)
        {
            return x * x;
        }
    }
    public class Welcome
    {
        public void Hello()
        {
            Console.WriteLine("Batman");
        }

        public void Greet(string name)
        {
            Console.WriteLine($"Welcome Avenger...{name}");
        }
    }
}
