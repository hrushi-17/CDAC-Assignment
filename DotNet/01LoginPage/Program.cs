using _01LoginPage.DAL;
using _01LoginPage.Models;

namespace _01LoginPage
{
    internal class Program
    {
        static void Main(string[] args)
        {
            IETDbContext db = new IETDbContext();
            int choice;

            do
            {
                Console.Clear(); // 🔹 optional but recommended

                Console.WriteLine("1. Login");
                Console.WriteLine("2. Create User");
                Console.WriteLine("3. Update Username & Password");
                Console.WriteLine("4. Exit");

                Console.Write("Enter Choice: ");
                choice = Convert.ToInt32(Console.ReadLine());

                switch (choice)
                {
                    case 1: // LOGIN
                        Console.Write("Enter Username: ");
                        string uname = Console.ReadLine();

                        Console.Write("Enter Password: ");
                        string pwd = Console.ReadLine();

                        User user = new User
                        {
                            Username = uname,
                            Password = pwd
                        };

                        if (db.CheckLogin(user))
                            Console.WriteLine($"Welcome {user.Username}");
                        else
                            Console.WriteLine("Invalid Username or Password");
                        break;

                    case 2: // CREATE USER
                        Console.Write("Create Username: ");
                        string newU = Console.ReadLine();

                        Console.Write("Create Password: ");
                        string newP = Console.ReadLine();

                        User createUser = new User { Username = newU, Password = newP };

                        if (db.CreateUser(createUser) > 0)
                            Console.WriteLine("User Created Successfully ✅");
                        else
                            Console.WriteLine("User Creation Failed ❌");
                        break;

                    case 3: // UPDATE USER
                        Console.Write("Enter Existing Username: ");
                        string oldU = Console.ReadLine();

                        Console.Write("Enter New Username: ");
                        string updU = Console.ReadLine();

                        Console.Write("Enter New Password: ");
                        string updP = Console.ReadLine();

                        User updatedUser = new User { Username = updU, Password = updP };

                        if (db.UpdateUser(oldU, updatedUser) > 0)
                            Console.WriteLine("User Updated Successfully ✅");
                        else
                            Console.WriteLine("User Not Found ❌");
                        break;

                    case 4:
                        Console.WriteLine("Thank You... 👋");
                        continue; // loop exit

                    default:
                        Console.WriteLine("Invalid Choice ❌");
                        break;
                }

                Console.WriteLine("\nPress any key to continue...");
                Console.ReadKey();

            } while (choice != 4);
        }
    }
}
