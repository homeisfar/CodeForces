import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class J492B
{
	public static void main (String []args)
	{
		Scanner s = new Scanner(System.in);

		int lanterns = s.nextInt();
		int length = s.nextInt();
		int maxDistance = 0;
		int x = 0;
		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < lanterns; i++)
			al.add(s.nextInt());
		Collections.sort(al);

		for (int i = 0; i < al.size()-1; i++)
		{
			x = Math.abs(al.get(i) - al.get(i+1));
			if( x > maxDistance)
				maxDistance = x;
		}

		double sol = maxDistance / 2.0;

		if (sol < al.get(0))
			sol = al.get(0);

		int finalD = Math.abs(al.get(al.size()-1)-length);
		if (sol < finalD)
			sol = finalD;

		System.out.printf("%.10f\n", sol);
	}
}