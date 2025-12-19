namespace _13_Demo_Notepad
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");

            SpellCheckerFactory fc = new SpellCheckerFactory();
            ISpellChecker spell = fc.GetSpellChecker("sp");
            Notepad np = new Notepad(spell);
            np.cut();
            np.spellCheck();

            HindiSpellChecker hin  = new HindiSpellChecker();
            Notepad forHindi = new Notepad(hin);
            forHindi.cut();
            forHindi.spellCheck();
        }
    }

    public class Notepad
    {
        private ISpellChecker _checker;
        // Notepad has dependency based on some Interface/ Abstract class in constructors. : Constructor level Dependency Injection Design Pattern

        public Notepad(ISpellChecker checker)
        {
            SpellCheckerFactory fact = new SpellCheckerFactory();
            if (checker == null)
            {
                _checker = fact.GetSpellChecker("en");
            }
            else
            {
                _checker = checker;
            }
        }

        public void cut()
        {
            Console.WriteLine("Text cut functionality done !");
        }
        public void copy()
        {
            Console.WriteLine("Text copy functionality done !");
        }
        public void paste()
        {
            Console.WriteLine("Text paste functionality done !");
        }
        public void spellCheck()
        {
            _checker.CheckSpell();
        }
    }

    public interface ISpellChecker
    {
        void CheckSpell();
    }

    public class SpellCheckerFactory
    {
        ISpellChecker _spell = null;
        public ISpellChecker GetSpellChecker(string lang)
        {
            switch (lang)
            {
                case "en":
                    _spell = new EnglishSpellChecker();
                    break;
                case "gr":
                    _spell = new GermanSpellChecker();
                    break;
                case "sp":
                    _spell = new SpanishSpellChecker();
                    break;
                default:
                    _spell = new EnglishSpellChecker();
                    break;

            }
            return _spell;

        }
    }
    public class EnglishSpellChecker : ISpellChecker
    {
        public void CheckSpell()
        {
            Console.WriteLine("Speck Check done for English Text");
        }
    }
    public class GermanSpellChecker : ISpellChecker
    {
        public void CheckSpell()
        {
            Console.WriteLine("Speck Check done for German Text");
        }
    }
    public class SpanishSpellChecker : ISpellChecker
    {
        public void CheckSpell()
        {
            Console.WriteLine("Speck Check done for Spanish Text");
        }
    }
    public class HindiSpellChecker : ISpellChecker
    {
        public void CheckSpell()
        {
            Console.WriteLine("Speck Check done for Hindi Text");
        }
    }

}
