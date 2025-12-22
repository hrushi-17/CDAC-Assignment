using _31Demo_BVSAttribute;
using System.Reflection;
using System.Text.Json.Serialization;

namespace _32Demo_MyApplication
{
    internal class Program
    {
        static void Main(string[] args)
        {

            string asmPath = @"C:\Users\IET\Desktop\Chinmay.NET\Chinmay.NET\33Demo_EmpLib\bin\Debug\net8.0\33Demo_EmpLib.dll";

            Assembly asm = Assembly.LoadFrom(asmPath);
            Type[] allTypes = asm.GetTypes();

            for (int i = 0; i < allTypes.Length; i++)
            {
                Type type = allTypes[i];
                Console.WriteLine(type.Name);

                Attribute[] attributes = type.GetCustomAttributes().ToArray();

                for (int j = 0; j < attributes.Length; j++)
                {
                    Attribute attr = attributes[j];

                    if(attr is BonaventueSystemAttribute)
                    {
                        BonaventueSystemAttribute bvsattr = attr as BonaventueSystemAttribute;
                        Console.WriteLine($"Class {type.Name} is developed by {bvsattr.DeveloperName} of copyright @ {bvsattr.CompanyName}");
                    }

                    if(attr is SerializableAttribute)
                    {
                        Console.WriteLine($"Class {type.Name} is marked as Serializable");
                    }
                }
            }
        }
    }
}



