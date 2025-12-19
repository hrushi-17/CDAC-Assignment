namespace _11_Demo_Singleton
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, Ma'am!");
            while (true)
            {
                Console.WriteLine("Enter your Db choice. 1. SqlServer, 2. MySql Server, 3. Oracle Server");
                int dbchoice = Convert.ToInt32(Console.ReadLine());

                DatabaseFactory fc = new DatabaseFactory();
                Database someDatabaseObject = fc.GetDatabase(dbchoice);
                Console.WriteLine("Enter db operation choice : 1. Insert, 2. Update, 3. Delete");
                int opChoice = Convert.ToInt32(Console.ReadLine());
                switch (opChoice)
                {
                    case 1:
                        someDatabaseObject.insert();
                        break;
                    case 2:
                        someDatabaseObject.update();
                        break;
                    case 3:
                        someDatabaseObject.delete();
                        break;

                    default:
                        Console.WriteLine("Invalid Operation Choice:........");
                        break;

                }
                Console.WriteLine("You wnt to Continue? (y/n)");
                String ynchoice = Console.ReadLine();
                if (ynchoice == "n" || ynchoice == "N")
                {
                    break;
                }
            }

        }
    }

    public abstract class Database
    {
        public Logger _logger = null;

        public Database()
        {
            _logger = Logger.GetLogger();
        }
        protected abstract void DoInsert();
        protected abstract void DoUpdate();
        protected abstract void DoDelete();
        protected abstract string GetDataBaseName();

        public void insert()
        {
            DoInsert();
            _logger.Log($"Insert from {GetDataBaseName()} Done.");
        }
        public void update()
        {
            DoUpdate();
            _logger.Log($"Insert from {GetDataBaseName()} Done.");
        }
        public void delete()
        {
            DoDelete();
            _logger.Log($"Insert from {GetDataBaseName()} Done.");
        }
    }

    public class DatabaseFactory
    {
        public Database GetDatabase(int dbchoice)
        {
            Database db = null;
            switch (dbchoice)
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
    }
    public class SqlServer : Database
    {
        protected override string GetDataBaseName()
        {
            return "Sql Server..!!";
        }
        protected override void DoInsert()
        {
            Console.WriteLine("Record Inserted in Sql Successfully");
        }
        protected override void DoUpdate()
        {
            Console.WriteLine("Record Updated in Sql Successfully");
        }
        protected override void DoDelete()
        {
           Console.WriteLine("Record Deleted in Sql Successfully");
        }

    }

    public class MySqlServer : Database
    {
        protected override string GetDataBaseName()
        {
            return "MySql Server..!!";
        }
        protected override void DoInsert()
        {
            Console.WriteLine("Record Inserted in MySql Successfully");
        }
        protected override void DoUpdate()
        {
            Console.WriteLine("Record Updated in MySql Successfully");
        }
        protected override void DoDelete()
        {
            Console.WriteLine("Record Deleted in MySql Successfully");
        }

    }

    public class OracleServer : Database
    {
        protected override string GetDataBaseName()
        {
            return "Oracle Server..!!";
        }
        protected override void DoInsert()
        {
            Console.WriteLine("Record Inserted in OracleServer Successfully");
        }
        protected override void DoUpdate()
        {
            Console.WriteLine("Record Updated in OracleServer Successfully");
        }
        protected override void DoDelete()
        {
            Console.WriteLine("Record Deleted in OracleServer Successfully");
        }

    }

    public class Logger
    {
        private static readonly Logger _logger1 = new Logger();
        private Logger()
        {
            Console.WriteLine("Logger object is created for the FirstTime..!");
        }
        public static Logger GetLogger()
        {
            return _logger1;
        }

        public void Log(string msg)
        {
            Console.WriteLine($"--logged at {0}, message : {1}", DateTime.Now.ToString(), msg);
        }
    }


}
