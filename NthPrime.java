import java.io.*;
import java.util.*;
class UserMainCode{
	public int NthPrime(int input1){
		int count=0;
		int num=1;
		while(count<input1){
			num++;
			int i=2;
			for(i*i<=num && num%i!=0) i++;
			if(i*i>num) count++;
		}
		return num;
	}
}