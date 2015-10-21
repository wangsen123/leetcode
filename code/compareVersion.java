package code;

public class compareVersion {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
	public int compareVersion(String version1, String version2) {
        int flag1[]=new int[version1.length()+1];
        int flag2[]=new int[version2.length()+1];
        int i;
        for(i=0;i<version1.length();i++){
        	if(version1.substring(i, i+1).equals("."))
        		flag1[i]=1;
        }
        flag1[i]=1;
        for(i=0;i<version2.length();i++){
        	if(version2.substring(i, i+1).equals("."))
        		flag2[i]=1;
        }
        flag2[i]=1;
        int pre1=0;
        int pre2=0;
        int m=0;
        int n;
        for(n=0;m<=version1.length()&&n<=version2.length();m++){
        	while(flag1[m]!=1)
        		m++;
        	while(flag2[n]!=1)
        		n++;
        	if(Integer.parseInt(version1.substring(pre1, m))>Integer.parseInt(version2.substring(pre2, n)))
        		return 1;
        	if(Integer.parseInt(version1.substring(pre1, m))<Integer.parseInt(version2.substring(pre2, n)))
        		return -1;
        	pre1=m+1;
        	pre2=n+1;
        	n++;
        }
        if(m<=version1.length())
        	for(;m<=version1.length();m+=1){
        		while(flag1[m]!=1)
            		m++;
        		if(Integer.parseInt(version1.substring(pre1, m))==0){
        			pre1=m+1;
        			continue;
        		}
            	return 1;
        	}	
        		
        if(n<=version2.length())
        	for(;n<=version2.length();n+=1){
        		while(flag2[n]!=1)
        			n++;
        		if(Integer.parseInt(version2.substring(pre2, n))==0){
        			pre2=n+1;
        			continue;
        		}
        	return -1;
        	}
        return 0;
    }
}
