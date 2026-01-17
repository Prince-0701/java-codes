import java.io.*;
import java.util.*;
class UserMainCode{
	public int countEven(int input1, int input2, int input3, int input4, int input5){
		int odd=0;
		if(input1%2!=0) odd++;
		if(input2%2!=0) odd++;
		if(input3%2!=0) odd++;
		if(input4%2!=0) odd++;
		if(input5%2!=0) odd++;
		return odd;

	}
}