//Assignment 6.3

//Write a program to search an element in a one-dimensional array using Binary Search Algorithm.


package assignment_6_3;
import java.io.*;
public class SearchArray {
	int a[];
	int n;
	static BufferedReader br = new BufferedReader(new
	InputStreamReader(System.in));
	public SearchArray(int nn) // Constructor
	{
	a = new int[nn];
	n = nn;
	}
	public static void main(String args[]) throws IOException
	{
	System.out.print("\nEnter the size of the array : ");
	int nn = Integer.parseInt(br.readLine());
	SearchArray call = new SearchArray(nn);
	System.out.println("\nEnter " +nn +" elements :");
	call.readArray();
	// Ask for the search technique
	System.out.println("Choose Search Technique :\n");
	System.out.println("1 : Linear Search");
	System.out.println("2 : Binary Search (the array should be 	sorted in ascending order)");
	System.out.print("\nYour Choice : ");
	int choice = Integer.parseInt(br.readLine());
	int v;
	switch(choice)
	{
	case 1:
	System.out.print("\nEnter the number to be searched : ");
	v = Integer.parseInt(br.readLine());
	call.linearSearch(v);
	break;
	case 2:
	System.out.print("\nEnter the number to be searched : ");
	v = Integer.parseInt(br.readLine());
	call.binarySearch(v);
	break;
	default :
	System.out.println("\nInvalid Choice !");
	break;
	}
	}
	public void readArray() throws IOException
	{
	for(int i=0;i<n;i++)
	a[i] = Integer.parseInt(br.readLine());
	}
	public void linearSearch(int v)
	{
	int f=-1;
	for(int i=0;i<n;i++)
	{
	if(a[i]==v)
	{
	f=i;
	break;
	}
	}
	if(f==-1)
	System.out.println("\n" +v +" NOT found !");
	else
	System.out.println("\n" +v +" is in location " +f);
	}
	public void binarySearch(int v)
	{
	int f=-1;
	int l=0,m=0,u=n-1;
	while(l<=u && f==-1)
	{
	m = (l+u)/2;
	if(a[m]==v)
	f = m;
	else
	if(a[m]>v)
	u = m-1;
	else
	l = m+1;
	}
	if(f==-1)
	System.out.println("\n" +v +" NOT found !");
	else
	System.out.println("\n" +v +" is in location " +m);
	}

}
