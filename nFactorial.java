import java.io.*;
import java.util.*;
class UserMainCode{
	public int nFactorial(int input1){
		int f=1;
		if(input1==1) return 1;
		else{
			for (int i=input1;i>1;i--) {
				f=f*i;
			}
		}
		return f;
	}
}