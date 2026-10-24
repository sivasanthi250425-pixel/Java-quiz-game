

import java.util.Scanner;

public class Main {
	public static void main(String [] arg) {
		Scanner sc=new Scanner(System.in);
		
		
		String[] q= {"What is purpose of main?","what is void","what is class?"};
		String[][] options= {{"1.stop", "2.storing","3.start execute","4.terminate"},
				{"1.return type","2.file","3.constructor","4.just keyword"},
				{"1.blue print","2.instance","3.data type","4.object"}};
				
		int[] ans= {3,1,1};
		int score=0;
		int guess;
        System.out.println("************************************");
        System.out.println("Welcome to java quiz");
        System.out.println("************************************");
        for(int i=0;i<q.length;i++) {
        	System.out.println(q[i]);
        	for(String o:options[i]) {
        		System.out.println(o);
        	}
        	guess=sc.nextInt();
        	if(guess==ans[i]) {
        		System.out.println("correct");
        		score++;
        	}else {
        		
            	System.out.println("wrong");
        	}
        	
        }
        int s=0;
    	System.out.println(score+" out of 3");
    	if(score==3) {
    		
        	System.out.println("great"
        			+ "");
    	}
        
		
}
}
