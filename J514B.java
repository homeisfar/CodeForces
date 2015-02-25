import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class J514B
{
	public static void main(String args[])
	{
		ArrayList<Integer> sX = new ArrayList<Integer>();
		ArrayList<Integer> sY = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		String in = s.nextLine();
		String []split = in.split(" ");

		int stormTroopers = Integer.parseInt(split[0]);
		int gun[] = new int[2];
		int maxX = 0;
		int maxY = 0;
		gun[0] = Integer.parseInt(split[1]);
		gun[1] = Integer.parseInt(split[2]);

		for(int i = 0; i < stormTroopers; i++)
		{
			in = s.nextLine();
			split = in.split(" ");
			int x = Integer.parseInt(split[0]);
			int y = Integer.parseInt(split[1]);
			if (Math.abs(x) > maxX)
				maxX = x;
			if (Math.abs(y) > maxY)
				maxY = y;
			sX.add(x);
			sY.add(y);
		}



		System.out.println("stormTroopers:" + stormTroopers);
		System.out.println("gunx:" + gun[0]);
		System.out.println("guny:" + gun[1]);
		System.out.println("maxx:" + maxX);
		System.out.println("maxy:" + maxY);

		System.out.println("sX:" + sX);
		System.out.println("sY:" + sY);

		int [][]grid = new int[maxX][maxY];
	}	
}
