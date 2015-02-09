using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Plough
{
    class Child_Staircase_Problem
    {
        static void Main(string[] args)
        {
            Child_Staircase_Problem csp = new Child_Staircase_Problem();
            Console.Out.WriteLine("Ans: " + csp.Solution(10));
            Console.Read();
        }
        public double Solution(double n)
        {
            double result = 0.0;
            if (n == 0.0 | n == 1.0)
                return 1.0;
            if (n == 2.0)
                return 2.0;
            if (n == 3.0)
                return 4.0;
            if(n>3)
            {
                result = Solution(n - 1) + Solution(n - 2) + Solution(n - 3); 
            }
            return result;
        }


    }
}
