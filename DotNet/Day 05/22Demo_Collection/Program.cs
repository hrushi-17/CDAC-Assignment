using System.Collections;
using System.Security.Cryptography.X509Certificates;

namespace _22Demo_Collection
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region int[]

            //int[] arr = new int[5];
            //arr[0] = 10;
            //arr[1] = 20;
            //arr[2] = 30;
            //arr[3] = 40;
            //arr[4] = 50;

            //for (int i = 0; i < arr.Length; i++)
            //{
            //    Console.WriteLine(arr[i]);
            //}

            #endregion

            #region string[]

            //string[] names = new string[3];
            //names[0] = "Alise";
            //names[1] = "Bob";
            //names[2] = "Charlie";

            //for (int i = 0; i < names.Length; i++)
            //{
            //    Console.WriteLine(names[i]);
            //}

            #endregion

            Emp emp1 = new Emp();
            emp1.EId = 101;
            emp1.EName = "Hugh Jackman";
            emp1.EAddress = "Sydney, Australia";

            Emp emp2 = new Emp();
            emp2.EId = 102;
            emp2.EName = "Tony Stark";
            emp2.EAddress = "Shivaji Nagar";

            Emp emp3 = new Emp();
            emp3.EId = 103;
            emp3.EName = "Tom Ellis";
            emp3.EAddress = "L.A";

            Book book = new Book();
            book.BookName = "The Hobbit";
            book.Author = "J.R.R. Tolkien";

            #region Emp[]

            //Emp[] emps = new Emp[3];

            //emps[0] = emp1;
            //emps[1] = emp2;
            //emps[2] = emp3;

            //for (int i = 0; i < emps.Length; i++)
            //{
            //    Console.WriteLine($"Id: {emps[i].EId}, Name: {emps[i].EName}, Address: {emps[i].EAddress}");
            //}


            #endregion

            #region Object[]

            Object[] objs = new Object[5];
            objs[0] = 100; //Boxing
            objs[1] = "Something";
            objs[2] = emp1;
            objs[3] = book;
            objs[4] = 12.34; //Boxing

            #region Old syntax for type conversion

            //for (int i = 0; i < objs.Length; i++) { 

            //    object element = objs[i];
            //    Type type = element.GetType();
            //    //Console.WriteLine(type.ToString());

            //    if (type.ToString() == "System.Int32") {
            //        int j = Convert.ToInt32(element);
            //        Console.WriteLine($"Value= {j}, Type= {type.ToString()}");
            //    }
            //    if (type.ToString() == "System.String")
            //    {
            //        string str = Convert.ToString(element);
            //        Console.WriteLine($"Value= {str}, Type= {type.ToString()}");
            //    }
            //    if (type.ToString() == "_22Demo_Collection.Program+Book")
            //    {
            //        Book book1 = (Book) element;
            //        Console.WriteLine($"Value= {book1.BookName}, Type= {type.ToString()}");
            //    }
            //}

            #endregion

            //for (int i = 0; i < objs.Length; i++)
            //{
            //    object element = objs[i];

            //    if(element is int)
            //    {
            //        int j = Convert.ToInt32(element);
            //        Console.WriteLine($"Value= {j}, Type= {element.GetType().ToString()}");
            //    }
            //    if (element is string)
            //    {
            //        string str = Convert.ToString(element);
            //        Console.WriteLine($"Value= {str}, Type= {element.GetType().ToString()}");
            //    }
            //    if (element is double)
            //    {
            //        double d = Convert.ToDouble(element);
            //        Console.WriteLine($"Value= {d}, Type= {element.GetType().ToString()}");
            //    }
            //    if (element is Emp)
            //    {
            //        Emp emp = element as Emp;
            //        Console.WriteLine($"Value= {emp.EId} {emp.EName} {emp.EAddress}, Type= {element.GetType().ToString()}");
            //    }
            //    if (element is Book)
            //    {
            //        Book book1 = element as Book;
            //        Console.WriteLine($"Value= {book1.BookName} {book1.Author}, Type= {element.GetType().ToString()}");
            //    }
            //}

            #endregion


            //Non - Generic Collection : System.Collections namespace
            // This is object type collection, its size is dynamic in nature, means grows and shrinks at runtime
            #region ArrayList

            //ArrayList arr = new ArrayList();
            //arr.Add(100);// Boxing
            //arr.Add("Something");
            //arr.Add(emp1);
            //arr.Add(book);
            //arr.Add(12.34);// Boxing

            //for (int i = 0; i < arr.Count; i++)
            //{
            //    object element = arr[i];

            //    if (element is int)
            //    {
            //        int j = Convert.ToInt32(element);
            //        Console.WriteLine($"Value= {j}, Type= {element.GetType().ToString()}");
            //    }
            //    if (element is string)
            //    {
            //        string str = Convert.ToString(element);
            //        Console.WriteLine($"Value= {str}, Type= {element.GetType().ToString()}");
            //    }
            //    if (element is double)
            //    {
            //        double d = Convert.ToDouble(element);
            //        Console.WriteLine($"Value= {d}, Type= {element.GetType().ToString()}");
            //    }
            //    if (element is Emp)
            //    {
            //        Emp emp = element as Emp;
            //        Console.WriteLine($"Value= {emp.EId} {emp.EName} {emp.EAddress}, Type= {element.GetType().ToString()}");
            //    }
            //    if (element is Book)
            //    {
            //        Book book1 = element as Book;
            //        Console.WriteLine($"Value= {book1.BookName} {book1.Author}, Type= {element.GetType().ToString()}");
            //    }
            //}

            #endregion

            #region Hashtable

            //Hashtable ht = new Hashtable();
            //ht.Add(1, 100);
            //ht.Add("A","Apple");
            //ht.Add(2, 23.33);
            //ht.Add(3, emp1);

            ////for (int i = 0; i < ht.Count; i++)
            //    foreach (object key in ht.Keys)
            //    {
            //        Console.WriteLine(key);
            //    }
            //    foreach (object value in ht.Values)
            //    {
            //        Console.WriteLine(value);
            //    }
            //    foreach (object key in ht.Keys)
            //    {
            //        Console.WriteLine($"key= {key} value={ht[key]}");
            //    }

            #endregion

            // Generic Collection : System.Collections.Generic namespace
            #region List<int>

            //List<int> lt = new List<int>();

            //lt.Add(11);
            //lt.Add(12);
            //lt.Add(13);
            //lt.Add(14);
            //for (int i = 0; i < lt.Count; i++)
            //{
            //    Console.WriteLine(lt[i]);
            //}

            #endregion

                #region Tuple
            // WE Discoverd it...
            //object  stDetails = Student(12, "Rushiikesss", "Gokhle Villa");
            //Console.WriteLine(stDetails);


            //Ma'ams Method
            //var stDetails = Student(12, "Rushiikesss", "Gokhle Villa");
            //Console.WriteLine($"Id-> {stDetails.Id} Name-> {stDetails.Name} Address-> {stDetails.Address}");    
            #endregion

            #region Tuples Method
            //static (int Id, string Name, String Address) Student (int id, string nm, string addrss)
            //{
            //    int Id = id;
            //    String Name = nm;
            //    String Address = addrss;
            //    return (Id, Name, Address);
            //}    

            #endregion
        }
        public class Book
        {
            private string _Author;
            private string _BookName;

            public string BookName
            {
                get { return _BookName; }
                set { _BookName = value; }
            }

            public string Author
            {
                get { return _Author; }
                set { _Author = value; }
            }

        }

        public class Emp
        {
            private int _EId;
            private string _EName;
            private string _EAddress;

            public string EAddress
            {
                get { return _EAddress; }
                set { _EAddress = value; }
            }

            public string EName
            {
                get { return _EName; }
                set { _EName = value; }
            }

            public int EId
            {
                get { return _EId; }
                set { _EId = value; }
            }

        }
    }
}
