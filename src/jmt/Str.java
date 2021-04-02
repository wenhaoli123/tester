package jmt;
public class Str {
	
	/*public static void main(String[] args) {
		String a="241;97";
		//        012345
		//System.out.print(a.substring(3));//从第3个取到最后1个
		//System.out.print(a.substring(0,3));//从第1个取到第3个
		//String b[]=a.split(";");
		//for(String i:b)
		//	System.out.println(i);
		
		//根据指定分号拆分并取拆分后的第1个
		//System.out.println(a.split(";")[0]);
		
		System.out.println(left(a,3));
		//调用split方法，给s赋值为a,给split_s赋值为分号
		System.out.println(split(a,";"));
	} */
	
	public static String left(String s,int n){
		//取字符串s左边n个字符
		return s.substring(0,n);
	}
	
	public static String split(String s,String split_s){
		//取split_s最左边的字符  //split_s是变量
		return s.split(split_s)[0];
	}
}