//1. Write a program to check if a given number is positive, negative, or zero. through command lines
class CheckNumber{
	public static void main(String []args){
		
		for(int i=0;i<args.length;i++){
			if(Integer.parseInt(args[i]) > 0)
				System.out.println(Integer.parseInt(args[i])+" Number is positive");
			else if(Integer.parseInt(args[i])<0)
				System.out.println(Integer.parseInt(args[i])+" Number is negative");
			else
				System.out.println(Integer.parseInt(args[i])+" NUmber is Zero");
		}
	}
}