using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01_StartPattern
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int n = 5; // controls the size of the diamond (half height)

            // upper half
            for (int i = 1; i <= n; i++)
            {
                // leading spaces
                for (int j = i; j < n; j++)
                    Console.Write(" ");

                // stars and spaces inside
                for (int j = 1; j <= (2 * i - 1); j++)
                {
                    if (j == 1 || j == (2 * i - 1))
                        Console.Write("*");
                    else
                        Console.Write(" ");
                }

                Console.WriteLine();
            }

            // lower half
            for (int i = n - 1; i >= 1; i--)
            {
                // leading spaces
                for (int j = n; j > i; j--)
                    Console.Write(" ");

                // stars and spaces inside
                for (int j = 1; j <= (2 * i - 1); j++)
                {
                    if (j == 1 || j == (2 * i - 1))
                        Console.Write("*");
                    else
                        Console.Write(" ");
                }

                Console.WriteLine();
            }


        }
    }
}



