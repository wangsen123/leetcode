package code;
//The set [1,2,3,��,n] contains a total of n! unique permutations.
//
//By listing and labeling all of the permutations in order,
//We get the following sequence (ie, for n = 3):
//
//"123"
//"132"
//"213"
//"231"
//"312"
//"321"
//Given n and k, return the kth permutation sequence.
//
//Note: Given n will be between 1 and 9 inclusive.
public class PermutationSequence {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.print(getPermutation(3, 6));
	}
	public static String getPermutation(int n, int k) {
		//���鸳ֵ
		int num[]=new int[n];
	    for(int i=0;i<n;++i)
	    	num[i]=i+1;
	    if(n==1){
	    	if(k==1)
	    		return "1";
	    	else {
				return "";
			}
	    }
	    int left=n-2;
	    //����k��
	    for(int count=1;count<k;++count){
	    	left=n-2;
	    	//��left �����һ�����һ�����ֵ�Ⱥ�һ��ֵС
	    	while(left>=0&&num[left]>num[left+1])
	    		left--;
	    	//���ܱ�����
	    	if(left<0)
	    		break;
	    	int mincount=1;
	    	int right=left;
	    	int min=num[left];
	    	//��rightֵ left�����leftֵ�����Сֵ
	    	for(int i=left;i<n;i++){
	    		if(num[i]>num[left]){
	    			if(mincount==1){
	    				right=i;
	    				min=num[i];
	    				mincount=2;
	    			}
	    			else {
						if(num[i]<min){
							right=i;
		    				min=num[i];
						}
							
					}
	    			
	    		}
	    			
	    			
	    	}
	    	//����left��right
	    	int temp=num[left];
	    	num[left]=num[right];
	    	num[right]=temp;
	    	int j=n-1;
	    	//left����ֵ����
	    	for(int i=left+1;i<j;i++,j--){
	    		int temp1=num[i];
	    		num[i]=num[j];
	    		num[j]=temp1;
	    	}
	    }
	    if(left<0)
	    	return "";
	    //��+���ʱ��ʹ��StringBuffer���ܸ�
	    StringBuffer sBuffer=new StringBuffer("");
	    for(int i=0;i<n;i++)
	    	sBuffer.append(num[i]);
	    return sBuffer.toString();
	    
	}
}
