namespace _09_OOP_Interface
{

    //System.out.println("Hello World!");
    // S.O.L.I.D Princliples 
    // Interfaces are for:
    // 1. Achieving Abstraction
    // 2. Achieving Multiple Inheritance
    // 3. Loose Coupling
    // 4. Open Contracts
    // 5. Templated Programming
    // 6. No need for Type casting
    // Factory Design Pattern : Object creation logic is separated from the main program logic.

    internal class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {
                Console.WriteLine("Enter your Db choice. 1. SqlServer, 2. MySql Server, 3. Oracle Server");
                int dbchoice = Convert.ToInt32(Console.ReadLine());

                DatabaseFactory fc = new DatabaseFactory();
                Idatabase someDatabaseObject = fc.GetSomeDatabase(dbchoice);
                Console.WriteLine("Enter db operation choice : 1. Insert, 2. Update, 3. Delete");
                int opChoice = Convert.ToInt32(Console.ReadLine());
                switch (opChoice)
                {
                    case 1:
                        someDatabaseObject.Insert();
                        break;
                    case 2:
                        someDatabaseObject.Update();
                        break;
                    case 3:
                        someDatabaseObject.Delete();
                        break;

                    default:
                        Console.WriteLine("Invalid Operation Choice:........");
                        break;
                }
            }

        }
    }

    public interface Idatabase
    {
        void Insert();
        void Update();
        void Delete();
    }
    public class DatabaseFactory()
    {
        public Idatabase GetSomeDatabase(int DbChoice)
        {
            Idatabase db = null;
            switch (DbChoice)
            {
                case 1:
                    db = new SqlServer();
                    break;
                case 2:
                    db = new MySqlServer();
                    break;
                case 3:
                    db = new OracleServer();
                    break;
                default:
                    db = null;
                    break;

            }
            return db;
        }
        public class SqlServer : Idatabase
        {
            public void Insert()
            {
                Console.WriteLine("Record Inserted in Sql Successfully");
            }
            public void Update()
            {
                Console.WriteLine("Record Updated in Sql Successfully");
            }
            public void Delete()
            {
                Console.WriteLine("Record Deleted in Sql Successfully");
            }
        }
        public class MySqlServer : Idatabase
        {
            public void Insert()
            {
                Console.WriteLine("Record Inserted in MySql Successfully");
            }
            public void Update()
            {
                Console.WriteLine("Record Updated in MySql Successfully");
            }
            public void Delete()
            {
                Console.WriteLine("Record Deleted in MySql Successfully");
            }
        }
        public class OracleServer : Idatabase
        {
            public void Insert()
            {
                Console.WriteLine("Record Inserted in OracleServer Successfully");
            }
            public void Update()
            {
                Console.WriteLine("Record Updated in OracleServer Successfully");
            }
            public void Delete()
            {
                Console.WriteLine("Record Deleted in OracleServer Successfully");
            }
        }
    }

}
