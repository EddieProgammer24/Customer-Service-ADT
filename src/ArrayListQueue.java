

import java.util.ArrayList;
import java.util.Iterator;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class ArrayListQueue
{
    // declare an array list
    static ArrayList<String> list = new ArrayList<String>();

    public static void main(String args[])
    {
        // declare a Date object and its formatting
        Date myDate = new Date();
        String myDateFormat = "MM/dd/yyyy";
        SimpleDateFormat dtToday = new SimpleDateFormat(myDateFormat);

        // populate the list with some initial elements (queue)
        list.add("customer 1");
        list.add("customer 2");
        list.add("customer 3");
        list.add("customer 4");
        list.add("customer 5");

        // declare a StringBuilder object to display the list elements
        StringBuilder sb = new StringBuilder();
        // declare an Iterator object to cycle through the list elements
        Iterator<String> itr = list.iterator();

        // use a looping structure to display the list elements
        System.out.println("iterate through ArrayList elements ...");
        while(itr.hasNext())
        {
            // append the elements to the StringBuilder object
            sb.append(itr.next() + "\n");
        }

        // display the elements that are in the list (queue)
        JOptionPane.showMessageDialog(null, dtToday.format(myDate) +
                "\n" + "display queue \n" + sb);
    }
}

