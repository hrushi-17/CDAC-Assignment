using System.Net;

namespace _14_Demo_Properties
{
    internal class Program
    {
        static void Main(string[] args)
        {
           Employee emp = new Employee();
            emp.Eid = 10;
            int id = emp.Eid;
            Console.WriteLine("EMployee Id |:"+id );
            emp.Name = "Hrushikesh Chothe";
            emp.Address = "Gokhle Nagar";
        }
    }
    public class Employee
    {
        private int _Eid;
        private string _Name;
        private string _Address;
        public int Eid
        {
            
            set
            {
                _Eid = value;
            }
            get
            {
                return _Eid;
            }
        }
        public string Name
        {
            set
            {
               if(value == null)
                {
                     _Name = "Invalid Format";
                }
               else
                {
                    _Name = "Mr/Mrs. "+value;
                }
            }
            get
            {
                return _Name;
            }
        }
        public string Address
        {
            set
            {
                _Address = value;
                Console.WriteLine($"Address : {_Address}");
            }
            get
            {
                return _Address;
            }
        }
        // Properties : - compiler will generate getter ans setter methods for you
        // Syntax:
        //accessModifier DataType PropertyName
        //{
        //    set
        //    {
        //        _PrivateMemeber = value;
        //    }
        //    get
        //    {
        //        return _PrivateMemeber;
        //    }
        //}

        #region Getters and Setters code : old approach
        //public void set_EId(int id)
        //{
        //    _EId = id;
        //}
        //public int get_EId()
        //{
        //    if( _EId == 0 )
        //        return _EId + 1;
        //    else
        //        return _EId;
        //}
        #endregion
    }
}
