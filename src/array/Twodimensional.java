package array;
public class Twodimensional
{

	public static void main(String[] args)
	{
    double[][]a= new double[3][2];
		
		a[0][0]=1.2;
		a[0][1]=2.3;
		a[1][0]=4.5;
		a[1][1]=5.5;
		a[2][0]=7.8;
		a[2][1]=8.9;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}

	}

}
