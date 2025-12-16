using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography.X509Certificates;
using System.Text;
using System.Threading.Tasks;

namespace _01_NETDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            for (int i = 0; i < 40; i++)
            {
                int count = 0;
                for (int j = 2; j < i / 2; j++)
                {
                    if (i % j == 0)
                    {
                        count++;
                    }


                }
                if (count > 0)
                    Console.WriteLine("The Number is NOT Prime -" + i);
                else
                    Console.WriteLine("Is Prime -" + i);

            }

        }
    }
}
