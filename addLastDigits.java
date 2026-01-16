import java.io.*;
import java.util.*;
class UserMainCode{
	public int addLastDigit(int input1, int input2){
		if(input1>0 && input2>0){
			return input1%10 + input2%10;
		}
		else if(input1>0 && input2<0){
			return input1%10 +(-(input2%10));
		}
		else if(input1<0 && input2>0){
			return -(input1%10) + (input2%10);
		}
		else{
			return -(input1%10)+(-(input2%10));
		}