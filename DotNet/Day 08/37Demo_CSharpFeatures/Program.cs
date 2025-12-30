using System.Collections;
using System.Linq;

namespace _37Demo_CSharpFeatures
{
    internal class Program
    {
        //public delegate bool MyDelegate(int num);
        static void Main(string[] args)
        {
            //Console.WriteLine("Enter the number: ");
            //int no = Convert.ToInt32(Console.ReadLine());

            #region Normal Function Call for Check Method :

            //var result = Check(no);
            //if (result)
            //{
            //    Console.WriteLine($"Number: {no} is greater than 10");
            //}
            //else
            //{
            //    Console.WriteLine($"Number: {no} is not greater than 10");
            //}


            #endregion

            #region Check Method Call with MyDelegate :

            //MyDelegate del = new MyDelegate(Check);
            //var result = del(no);
            //if (result)
            //{
            //    Console.WriteLine($"Number: {no} is greater than 10");
            //}
            //else
            //{
            //    Console.WriteLine($"Number: {no} is not greater than 10");
            //}

            #endregion

            #region Anonymous Methods with Mydelegate and delegate keyword: 
            // Anonymous Methods: Methods without name, local methods, can not be used elesewhere in application, used for short purposes, like conditional check OR holder

            //MyDelegate  del = new MyDelegate(delegate (int num) {
            //    return num > 10; 
            //});

            //MyDelegate  del = delegate (int num) {
            //    return num > 10;
            //};

            ////var result = del(no);
            ////if (result)
            //if (del(no))
            //{
            //    Console.WriteLine($"Number: {no} is greater than 10");
            //}
            //else
            //{
            //    Console.WriteLine($"Number: {no} is not greater than 10");
            //}

            #endregion

            #region Lamabada Expression : => goes to operator:

            ////MyDelegate del = (int num) => { 
            ////    return num > 10; 
            ////};

            //// Lambada Expression(=> goes to operator)

            //MyDelegate del = num => num > 10;

            //if (del(no))
            //{
            //    Console.WriteLine($"Number: {no} is greater than 10");
            //}
            //else
            //{
            //    Console.WriteLine($"Number: {no} is not greater than 10");
            //}

            #endregion

            #region Predicate<T> in-built delegate 

            //// Predicate is in-built delegate which always points to a method which checks some condition and returns true/ false - boolean kind of output

            //Predicate<int> del = num => num > 10;

            //if (del(no))
            //{
            //    Console.WriteLine($"Number: {no} is greater than 10");
            //}
            //else
            //{
            //    Console.WriteLine($"Number: {no} is not greater than 10");
            //}

            #endregion

            #region In-built Sum Extension Method and normal MySum Method

            //int[] arr = new int[] { 1, 2, 3, 4 };

            //var result = arr.Sum();
            //Console.WriteLine($"Sum1 = {result}");

            //var result1 = MySum(arr);
            //Console.WriteLine($"Sum2 = {result1}");

            //string[] names = new string[] { "Hugh", "Jackman", "Tom" };

            //var result2 = MySum(names);
            //Console.WriteLine($"Sum3 = {result2}");

            ////var result4 = names.Sum(); //use Concat for string
            //var result4 = string.Concat(names);
            //Console.WriteLine($"Sum4 = {result4}");

            #endregion

            #region Regular valid email id checking code : 

            //Console.WriteLine("Enter the Email ID: ");
            //string? email = Console.ReadLine();
            //if(email != null)
            //{
            //    if(MyClass.CheckForValidEmailID(email))
            //    {
            //        Console.WriteLine("Valid Email ID");
            //    }
            //    else
            //    {
            //        Console.WriteLine("Invalid Email ID");
            //    }
            //}

            #endregion

            #region Extension Methods: Demo 01

            //// Extending in-built Data Types functionalities by writting specific classes using below Rules:
            //// To create Extension menthod:
            //// 1. Declare a static class
            //// 2. Declare a static method
            //// 3. Write 'this' keyword in front of that paramaeter which datatype functionality you want to extend!
            //// 4. Please NOte: this should always be a first parameter to the method.
            //// 5. We can pass other parametrs after this paarameter.

            //Console.WriteLine("Enter the Email ID: ");
            //string? email = Console.ReadLine();

            //if(email != null)
            //{
            //    if (email.CheckForValidEmailID())
            //    {
            //        Console.WriteLine("Valid Email ID");
            //    }
            //    else
            //    {
            //        Console.WriteLine("Invalid Email ID");
            //    }
            //}

            #endregion

            #region Extension Methods: Demo 02

            //int[] numbers = { 101, 102, 103, 104, 105 };
            //string[] days = { "Mon", "Tue", "Wed", "Sun" };

            //List<int> output1 = numbers.ConvertToList(1111);

            //foreach (int item in output1)
            //{
            //    Console.WriteLine($"{item}");
            //}

            //List<string> output2 = days.ConvertToList(4444);
            //foreach (var item in output2)
            //{
            //    Console.WriteLine($"{item}");
            //}

            #endregion

            #region Itertor

            #region Demo 01 :

            //int[] arr = { 1, 2, 3, 4, 5 };
            ////arr[5] = 6;

            //foreach (int ele in arr) { 

            //    Console.WriteLine(ele);
            //}

            //List<int> lstArr = new List<int>();
            //lstArr.Add(12);

            //foreach (int ele in lstArr)
            //{
            //    Console.WriteLine(ele);
            //}

            #endregion

            #region CustomCollection Demo 02

            //MyCustomCollection customCollection = new MyCustomCollection();
            //customCollection.AddElement(10);
            //customCollection.AddElement(20);
            //customCollection.AddElement(30);

            //var result = customCollection.GetElements;
            //for (int i = 0; i<result.Count; i++)
            //{
            //    Console.WriteLine(result[i]);
            //}

            //foreach (var item in result)
            //{
            //    Console.WriteLine(item);
            //}

            //foreach (var item in customCollection)
            //{
            //    Console.WriteLine($"---{item}");
            //}

            MyCollection collection = new MyCollection();
            foreach (string day in collection)
            {
                Console.WriteLine(day);
            }

            #endregion

            #endregion
        }

        public static bool Check(int num)
        {
            return num > 10;
        }

        public static T MySum<T>(IEnumerable<T> arr) 
        {
            dynamic sum = 0;
            foreach (var ele in arr)
            {
                sum += ele;
            }
            return sum;
        
        }

    }
    public static class MyClass //: String : not allowed. sesled class
    {
        public static bool CheckForValidEmailID(this string email)
        {
            return email.Contains("@b.com");
        }
        public static List<T> ConvertToList<T>(this  IEnumerable<T> source, int nonsenseParameter)
        {
            List<T> list = new List<T>();
            foreach (var item in source)
            {
                list.Add(item);
            }
            Console.WriteLine($"Nonsense Parameter Value = {nonsenseParameter}");
            return list;
        }
    }

    public class MyCustomCollection : IEnumerable
    {
        private ArrayList arr = new ArrayList();

        public ArrayList GetElements
        {
            //set { 
            //    arr.Add(value); 
            //}
            get { 
                return arr; 
            }
            
        }
        public void AddElement(int element)
        {
            arr.Add(element);
        }


        public IEnumerator GetEnumerator()
        {
            for (int i = 0; i < arr.Count; i++)
            {
                yield return arr[i];
                // yield keyword forces CLR to remeber last element index, which we have returned from this for loop and next time returns next element by increasing index as per the for loop syntax condition.
            }
        }
    }

    public class MyCollection : IEnumerable
    {
        private string[] days = new string[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        public IEnumerator GetEnumerator()
        {
            for (int i = 0; i < days.Length; i++)
            {
                string day = days[i];
                yield return day;// yield keyword is used to return the value from the iterator method. And it maintains last index value.
            }
        }

        //public string[] Days 
        //{

        //    get { return days; }
        //}
    }



}
