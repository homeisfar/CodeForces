import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class J492B
{
	public static void main (String []args)
	{
		Scanner s = new Scanner(System.in);

		int lanterns = s.nextInt();
		int length = s.nextInt();
		int maxDistance = 0;
		int x = 0;
		int []al = new int[lanterns];

		for (int i = 0; i < lanterns; i++)
			al[i] = s.nextInt();
		Arrays.sort(al);

		for (int i = 0; i < al.length-1; i++)
		{
			x = Math.abs(al[i] - al[i+1]);
			if( x > maxDistance)
				maxDistance = x;
		}

		double sol = maxDistance / 2.0;

		if (sol < al[0])
			sol = al[0];

		int finalD = Math.abs(al[al.length-1]-length);
		if (sol < finalD)
			sol = finalD;

		System.out.printf("%.10f\n", sol);
	}
}