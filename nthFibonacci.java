import java.io.*;
import java.util.*;
class UserMainCode{
	public int nthFibonacci(int input1){
		int a=0,b=1;
		if(input1==1) return 0;
		else if(input1==2) return 1;
		else {
			for(int i=3;i<(input1+1);i++){
				int c=a+b;
				a=b;
				b=c;
			}
		}
		return b;
	}
}