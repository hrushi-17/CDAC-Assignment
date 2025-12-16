using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _07Demo_Inheritance
{
    internal class baseClass
    {

        private int baseNumber;
        public baseClass() { 
        
        } 

        public baseClass(int num)
        {
            baseNumber = num;
            Console.WriteLine("You passed num = {0}",baseNumber);

        }

        public void Method1() {
            Console.WriteLine("Method from base class");
        }
    }

    internal class DerivedClass : baseClass
    {
        //public DerivedClass(int no) : base(no)
        //{
        //}

        public void Method2()
        {
            Console.WriteLine("Method from derived class");
        }
    }

}
