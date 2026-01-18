import java.io.*;
import java.util.*;
class UserMainCode{
	public int isPrime(int input1){
		int c=0;
		if(input1==2) return 2;
		else{
			for(int i=3;i<(input1+1);i++){
				if(input1%i==0) c++;
			}
		}
		if(c>0) return 1;
		else return 2;
	}
}