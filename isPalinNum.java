import java.io.*;
import java.util.*;
class UserMainCode{
	public int isPalinNum(int input1){
		int a=0,t=input1;
		while(input1>0){
            int r=input1%10;
            a=(a*10)+r;
            input1/=10;
        }
        if(a==t) return 2;
        else return 1;
	}
}