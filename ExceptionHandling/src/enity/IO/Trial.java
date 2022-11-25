package enity.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Writer;

public class Trial {

	public static void main(String[] args) throws Exception {
	
		File f1= new File("D:\\RawData\\Pattern1.txt");
		
		Writer w=new FileWriter(f1);

		int height=5;
		int width=5;
		
		for(int i=0;i<height;++i)
		{
			for(int j=0;j<width;++j)
			{
				if(i==0 || i==3)
				{
					w.write("*");
				}else {
					if(j==0 ||j==(width-1))
							w.write("*");
					else
						w.write(" ");
				}
			}
			w.write("\n");
		}
		w.write("\n\n\n");
		
		for(int i=0;i<height;++i)
		{
			for(int j=0;j<width;++j)
			{
				if(i==0 || i==2||i==4)
				{
					w.write("*");
				}else {
					if(j==0 ||j==(width-1))
							w.write("*");
					else
						w.write(" ");
				}
			}
			w.write("\n");
		}
	w.write("\n\n\n");
		
		for(int i=0;i<height;++i)
		{
			for(int j=0;j<width;++j)
			{
				if(i==0 ||i==4)
				{
					w.write("*");
				}else {
					if(j==0 )
							w.write("*");
					else
						w.write(" ");
				}
			}
			w.write("\n");
		}
w.write("\n\n\n");
		
		for(int i=0;i<height;++i)
		{
			for(int j=0;j<width;++j)
			{
				if(i==0 ||i==4)
				{
					if(j==4)
					{
						w.write(" ");
					}else
					{
						w.write("*");
					}
				
				}
				else {
					if(j==0||j==(width-1))
							w.write("*");
					else
						w.write(" ");
				}
			}
			w.write("\n");
		}
w.write("\n\n\n");
		
		for(int i=0;i<height;++i)
		{
			for(int j=0;j<width;++j)
			{
				if(i==0 ||i==2||i==4)
				{
					w.write("*");
				}else {
					if(j==0 )
							w.write("*");
					else
						w.write(" ");
				}
			}
			w.write("\n");
		}
w.write("\n\n\n");
		
		for(int i=0;i<height;++i)
		{
			for(int j=0;j<width;++j)
			{
				if(i==0 ||i==2)
				{
					w.write("*");
				}else {
					if(j==0 )
							w.write("*");
					else
						w.write(" ");
				}
			}
			w.write("\n");
		}
		
w.write("\n\n\n");
		
		for(int i=0;i<height;++i)
		{
			for(int j=0;j<width;++j)
			{
				if(i==0 ||i==4||(i==2))
				{
					w.write("*");
				}else {
					if(j==0) 
							w.write("*");
					else
						
						w.write(" ");
				}
			}
			w.write("\n");
		}
w.write("\n\n\n");

for(int i=0;i<height;++i)
{
	for(int j=0;j<width;++j)
	{
		if(i==0 ||i==2)
		{
			w.write("*");
		}else {
			if(j==0 )
					w.write("*");
			else
				w.write(" ");
		}
	}
	w.write("\n");
}
w.write("\n\n\n");
		w.close();

	}

}
