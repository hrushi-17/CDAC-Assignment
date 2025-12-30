namespace _40Demo_LINQ
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<Emp> emps = new List<Emp>()
           {

                new Emp() { Id = 1, Name = "Ganesh", Address = "Pune" },
                new Emp() { Id = 2, Name = "Mitesh", Address = "Mumbai" },
                new Emp() { Id = 3, Name = "Suresh", Address = "Patna" },
                new Emp() { Id = 4, Name = "Prathmesh", Address = "Pune" },
                new Emp() { Id = 5, Name = "Naresh", Address = "Mumbai" },
                new Emp() { Id = 6, Name = "Jignesh", Address = "Puri" },
                new Emp() { Id = 7, Name = "Suyash", Address = "Nashik" },
                new Emp() { Id = 8, Name = "Durgesh", Address = "Pune" },
                new Emp() { Id = 9, Name = "Pritesh", Address = "Pune" }
           };

            Console.WriteLine("Enter the first City Letter: ");
            string? ch = Console.ReadLine().ToLower();

            #region Csharp Syntax
            //var filteredEmployeeBasedonCity = new List<Emp>();
            //foreach (Emp emp in emps)
            //{
            //    if (emp.Address.ToLower().StartsWith(ch))
            //        filteredEmployeeBasedonCity.Add(emp);
            //}
            #endregion


            #region LINQ: Language Integrated Query Syntax
            var result = (from emp in emps select emp.Name);

            //IQueryable <T> collection

                foreach (var nm in result)
            {
                Console.WriteLine($"{nm}");
                //Console.WriteLine($"Id- {}");
            }
            #endregion
            #region MS SQL Query

            var filteredEmployeeCollectionBasedonCity = ( from emp in emps
                                                          where emp.Address.ToLower().
                                                          StartsWith(ch) select emp);

            foreach (Emp emp1 in filteredEmployeeCollectionBasedonCity)
            {
                Console.WriteLine($"Id-{emp1.Id}, Name- {emp1.Name}, Address- {emp1.Address} ");
            }
            #endregion
        }
    }
    public class Emp
    {
        public int Id { get; set; }
        public string Name { get; set; }
        public string Address { get; set; }
    }
}
