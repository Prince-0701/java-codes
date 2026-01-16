import java.io.*;
import java.util.*;
class UserMainCode{
	public int secondLastDigitOf(int input1){
		input1=input1/10;
		if(input1==0){
			return -1;
		}
		else{
			if(input1<0){
				return -(input1%10);
			}
			else{
				return input1%10;
			}
		}
	}
}