using System;

public class Example
{
    public static void Main()
    {
        String[] s = Console.ReadLine().Split(' ');

        int n = Int32.Parse(s[0]);
        int m = Int32.Parse(s[1]);

        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                Console.Write("*");
            }
            Console.WriteLine();
        }
    }
}
