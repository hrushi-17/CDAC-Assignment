using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _43Demo_ConnectedADO.Models
{
    // Models Layer
    // Buissness Entities Layer
    // Plain CLR Object [POCO]
    public class Emp
    {
        public int EId { get; set; }
        public string? EName { get; set; }
        public string? EAddress { get; set; }
    }
}
