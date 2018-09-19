using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Collections;
using System.ComponentModel;
using System.Diagnostics.CodeAnalysis;
using System.Globalization;
using System.IO;
using System.Linq;
using System.Reflection;
using System.Runtime.Serialization;
using System.Text.RegularExpressions;
using System.Text;
using System;

class Solution {

    // Complete the compareTriplets function below.
    //* [ <alice> <bob> ]
    static List<int> compareTriplets(List<int> a, List<int> b) {
        var retval = new List<int>();

        //* there are only 3 - brute force
        int alice = (a[0] > b[0] ? 1 : 0)
         + (a[1] > b[1] ? 1 : 0)
         + (a[2] > b[2] ? 1 : 0);
        retval.Add(alice);

        int bob = (a[0] < b[0] ? 1 : 0)
         + (a[1] < b[1] ? 1 : 0)
         + (a[2] < b[2] ? 1 : 0);
        retval.Add(bob);

        return retval;
    }

    static void Main(string[] args) {
        TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

        List<int> a = Console.ReadLine().TrimEnd().Split(' ').ToList().Select(aTemp => Convert.ToInt32(aTemp)).ToList();

        List<int> b = Console.ReadLine().TrimEnd().Split(' ').ToList().Select(bTemp => Convert.ToInt32(bTemp)).ToList();

        List<int> result = compareTriplets(a, b);

        textWriter.WriteLine(String.Join(" ", result));

        textWriter.Flush();
        textWriter.Close();
    }
}
