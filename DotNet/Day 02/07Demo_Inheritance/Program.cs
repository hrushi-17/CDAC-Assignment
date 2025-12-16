namespace _07Demo_Inheritance
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Demo 00

            //baseClass baseClass = new baseClass();
            //baseClass.Method1();

            //DerivedClass derivedClass = new DerivedClass();
            //derivedClass.Method1();
            //derivedClass.Method2();
              
            //baseClass baseClass1 = new DerivedClass();
            //baseClass1.Method1();

            #endregion

            //DerivedClass derivedObj = new DerivedClass(1212);

            #region Method Overloading

            //AdvMath advMath = new AdvMath();
            //Console.WriteLine(advMath.Add(1, 2, 3, 4));
            //advMath.Sub(10, 5);

            #endregion

            #region Override, new , virtual

            AdvMath advMath = new AdvMath();
            advMath.Add(10, 5);
            advMath.Sub(10, 5);
            advMath.Mult(10, 5);

            #endregion
        }
    }
}
