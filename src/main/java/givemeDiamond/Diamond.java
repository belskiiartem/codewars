package givemeDiamond;

import java.time.format.FormatStyle;

public class Diamond {
	  public static String print(int n) {
		  if (n%2==0 || n<0 ){
			  return null;
		  }
		  
		  StringBuffer answer = new StringBuffer();
		  String asterisk="";
		  int center = n-n/2;
		  String space="";
		  //before center
		  for (int i=0; i<center; i++){
			  asterisk="*";
			  if (i>=1){
					  for (int i1=0;i1<i;i1++){
						  asterisk+="**";
					  }
			  }
			  
			  for (int i2=center-i-1;i2>0;i2--){
				  space+=" ";
			  }
			  answer.append(space+asterisk+"\n");
			  space="";
		  }
		  
		  //after center
		  for (int i1=center-1; i1>0; i1--){
			  String asteriscAfetrCenter="*";
			  for (int i2=1;i2<i1; i2++){
				  asteriscAfetrCenter+="**";
			  }
			  for (int i3=0;i3<center-i1;i3++){
				  space+=" ";
			  }
			  answer.append(space+asteriscAfetrCenter+"\n");
			  space="";

		  }
		  
		  
		  return answer.toString();
	  }

}
