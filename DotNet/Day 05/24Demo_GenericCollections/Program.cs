namespace _24Demo_GenericCollections
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Emp emp = new Emp();
            emp.Eid = 11;
            emp.Ename = "Rushikesh C";
            emp.Address = "Gokhle Villa";

            Emp emp1 = new Emp();
            emp1.Eid = 12;
            emp1.Ename = "Ashhh";
            emp1.Address = "Shivjai Chowk";

            Emp emp2 = new Emp();
            emp2.Eid = 13;
            emp2.Ename = "Chinmay R";
            emp2.Address = "Karvenagar";


            #region List<T>
            List<Emp> list = new List<Emp>();
            list.Add(emp1);
            list.Add(emp2);
            list.Add(emp);
            foreach (Emp e in list){
                Console.WriteLine($"Id->{e.Eid}, Name->{e.Ename}, Address-> {e.Address}");
            }

            #endregion


            #region Dictionary<TKey, TValue>
            Dictionary<int, Emp> empDict = new Dictionary<int, Emp>();
            empDict.Add(emp1.Eid, emp1);
            empDict.Add(emp2.Eid, emp2);
            empDict.Add(emp.Eid, emp);
            foreach (KeyValuePair<int, Emp> element in empDict)
            {
                Emp e = element.Value;
                //element.Key
                Console.WriteLine($"Id: {e.Eid}, Name: {e.Ename}, Address : {e.Address}");
            }
            foreach (int key in empDict.Keys)
            {
                Emp e = empDict[key] as Emp;
                Console.WriteLine($"Key = {key}, Id: {e.Eid}, Name: {e.Ename}, Address : {e.Address}");
            }
            foreach (Emp e in empDict.Values)
            {

                Console.WriteLine($"Id: {e.Eid}, Name: {e.Ename}, Address : {e.Address}");
            }
            #endregion

        }
    }
    public class Emp
    {
        private int _Eid;
        private string _EName;
        private string _Address;


        public int Eid
        {
            get { return _Eid; }
            set { _Eid = value; }

        }
        public string Ename
        {
            get { return _EName; }
            set { _EName = value; }
        }
        public string Address
        {
            get { return _Address; }
            set { _Address = value; }
        }
    }
}
