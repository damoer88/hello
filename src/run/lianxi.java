package run;

public class lianxi {
    public static void main(String[] args){
    	/*����������*/
    	/*int a=2349;
    	int b=a/1000;
    	int c=a/100%10;
    	int d=a/10%10;
    	int e=a%10;
    	int f=e*1000+d*100+c*10+b;
    	System.out.println(f);*/
    	/*ˮ�ɻ�*/
    	/*int i;
    	int j;
    	int k;
    	for(i=0;i<=9;i++){
    		for(j=0;j<=9;j++){
    			for(k=0;k<=9;k++){
    			   int a=i*100+j*10+k;
    			   if((a==i*i*i+j*j*j+k*k*k)&&a!=0&&a!=1){
    				   System.out.println(a);
    			   }
    			}
    		}
    	}*/
    	/*������*/
    	/*int a=65432;
        if(a>9999&&a<100000){
	    	int b=a/10000;
	    	int c=a%10000/1000;
	    	int d=a%1000/100;
	    	int e=a%100/10;
	    	int f=a%10;
	    	if(a==f*10000+e*1000+d*100+c*10+d){
	    		System.out.println("����һ��������");
	    	}else{
	    		System.out.println("�ⲻ��һ��������");
	    	}
        }*/
    	/*���Լ��*/
    	/*int a=6;
    	int b=9;
    	int c=a>b?b:a;
    	for(int i=c;i>0;i--){
    		if(a%i==0&&b%i==0){
    			System.out.println("a��b�����Լ��Ϊ"+i);
    			break;
    		}
    	}*/
    	/*��С������*/
        /*��int a=8;
        int b=10;
        int c=a>b?a:b;
        for(int i=c;i<=a*b;i++){
        	System.out.println();
        	if(i%a==0&&i%b==0){
        		System.out.println("a��b����С������Ϊ"+i);
        		break;
        	}
        }*/
    	/*��int a=8;
    	int b=10;
    	int c=a>b?a:b;
    	while(c<=a*b){
    		if(c%a==0&&c%b==0){
    			System.out.println(c);
    			break;
    		}
    		c++;
    	}*/
    	/*��1��2��3��4���ĸ�������ɶ��ٸ���λ��*/
    	/*int a[]={1,2,3,4};
    	for(int i=0;i<a.length;i++){
    		int b=(a[i])*100;
    		for(int j=0;j<a.length;j++){
    			if(j!=i){
    				int c=(a[j])*10;
    				for(int k=0;k<a.length;k++){
        				if(k!=j&&k!=i){
    						int d=a[k];
    						int e=b+c+d;
    						System.out.println(e);
    			        }
    			
    				}
    			}
    		}
    	}*/
    }
}
