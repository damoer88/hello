package run;

public class runn {
     public static void main(String[] args){
    	/*����*/
    	 /*int year=2018;		
    	 if((year%4==0&&year%100!=0)||year%400==0){
    		 System.out.println("����һ������");
    		 
    	 }else{
    		 System.out.println("����һ��ƽ��");   
    	 }*/ 
    	/*a��b��*/
    	 /*int a=3;
    	int b=2;
    	a=a^b;
    	b=a^b;
    	a=a^b;
    	System.out.println(a);
    	System.out.println(b);*/
    	 /*++*/
    	 /*int a=2;
    	 int b=a++;
    	 System.out.println(a++);
    	 System.out.println(b);*/
    	 /*100���������ĺ�*/
    	 int result=0;
    	 int i;
    	 int j;
    	 for(i=2;i<100;i++){
    		for(j=2;j<i;j++){
    			if(i%j==0){
    				result=0;
    			}else{
    				result=result+i;
    			} 
    		}
    		System.out.println(result);
    	 }
    	 
     }
		 
}


	

