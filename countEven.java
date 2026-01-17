import java.io.*;
import java.util.*;
class UserMainCode{
	public int countEven(int input1, int input2, int input3, int input4, int input5){
		int even=0;
		if(input1%2==0) even++;
		if(input2%2==0) even++;
		if(input3%2==0) even++;
		if(input4%2==0) even++;
		if(input5%2==0) even++;
		return even;

	}
}