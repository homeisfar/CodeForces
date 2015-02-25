import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class J492B
{
	public static void main (String []args)
	{
		Scanner s = new Scanner(System.in);
		String in = s.nextLine();
		String read[] = in.split(" ");

		int lanterns = Integer.parseInt(read[0]);
		int length = Integer.parseInt(read[1]);
		int maxDistance = 0;
		int x = 0;

		in = s.nextLine();
		read = in.split (" ");

		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < read.length; i++)
			al.add(Integer.parseInt(read[i]));
		Collections.sort(al);

		for (int i = 0; i < al.size()-1; i++)
		{
			x = Math.abs(al.get(i) - al.get(i+1));
			if( x > maxDistance)
				maxDistance = x;
		}

		double sol = maxDistance / 2.0;

		if (sol < Math.abs(al.get(0)))
			sol = al.get(0);

		int finalD = Math.abs(al.get(al.size()-1)-length);
		if (sol < finalD)
			sol = finalD;

		System.out.printf("%.10f\n", sol);
	}
}