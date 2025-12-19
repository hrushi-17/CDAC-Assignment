namespace _12_Demo_Sealed_Class
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");
        }
    }

    public sealed class CMath
    {
        public int add(int m, int n)
        {
            return m + n;
        }
        public int subtract(int m, int n)
        {
            return m - n;
        }
    }

    public class AdvancedMath
    {
        public virtual int square(int x)
        {
            return x*x;
        }
    }

    public class MyMath : AdvancedMath
    {
        public  virtual void hello()
        {
            Console.WriteLine("Hello, from MyMath.......");
        }
        public  override int square(int x)
        {
            return x*x*100;
        }
    }
    public class MyMath2 :MyMath
    {
        public override void hello()
        {
            Console.WriteLine("Hello, from MyMath2.......");
        }
        public override int square(int x)
        {
            return x * 1;
        }
    }
}
