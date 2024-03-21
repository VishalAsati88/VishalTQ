package stringassignment;

public class ReverseAllWhiteSpaces {

	public static void main(String[] args) {
		 String str="  j  a  va  s ta   r   ";
		 
		 String str1=str.trim();
		 System.out.println(str1);  //Trim Method for remove both side extra Spaces

		 String str2=str.replaceAll("\\s","");
		 System.out.println(str2);//ReplaceAll Method for remove all white Spaces 
	}

}