package nameArrayCapping;

public class Kata {
	  public static String[] capMe(String[] strings) {
		  String [] answer = new String[strings.length];
		  if (strings.length==0){
			  return answer;
		  }
		  for (int i=0;i< strings.length;i++ ){
			if (strings[i].length()>0 ){  
				answer[i]=strings[i].substring(0, 1).toUpperCase()+strings[i].substring(1).toLowerCase();
			}
		  }
		  return answer;
  	  }
}
