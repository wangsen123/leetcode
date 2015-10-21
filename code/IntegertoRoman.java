package code;
//Given an integer, convert it to a roman numeral.
//
//Input is guaranteed to be within the range from 1 to 3999.
import java.util.HashMap;
import java.util.Map;

public class IntegertoRoman {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.print(intToRoman(365));
	}
    public static String intToRoman(int num) {
       Map<Integer,String> map=new HashMap<>();
   	   map.put(1,"I");
   	   map.put(5,"V");
   	   map.put(10,"X");
   	   map.put(50,"L");
   	   map.put(100,"C");
   	   map.put(500,"D");
   	   map.put(1000,"M");
   	   int count=1000;
   	   StringBuilder sb=new StringBuilder();
   	   while(count>0){
   		   	if((num/count)%10>0){
   			   int bitnum=(num/count)%10;
   			   String one=map.get(count);
   			  //five,ten可能为空，但用不到
   			   String five=map.get(5*count);
   			   String ten=map.get(10*count);
   			   switch (bitnum) {
   			   		case 1:
   			   			sb.append(one);
   			   			break;
   			   		case 2:
   			   			sb.append(one+one);
   			   			break;
   			   		case 3:
   			   			sb.append(one+one+one);
   			   			break;
   			   		case 4:
   			   			sb.append(one+five);
   			   			break;
   			   		case 5:
   			   			sb.append(five);
   			   			break;
   			   		case 6:
   			   			sb.append(five+one);
   			   			break;
   			   		case 7:
   			   			sb.append(five+one+one);
   			   			break;
   			   		case 8:
   			   			sb.append(five+one+one+one);
   			   			break;
			
   			   		default:
   			   			sb.append(one+ten);
   			   			break;
			}
   			   
   		   }
   		   count=count/10;
   			   
   	   }
   	   return sb.toString();
   	   
    }
}
