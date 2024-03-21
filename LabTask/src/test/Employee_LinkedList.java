package test;

import java.util.Iterator;
import java.util.LinkedList;

public class Employee_LinkedList {
	
	public static void print(LinkedList<Employee> list){
	   Iterator <Employee> itr=list.iterator();
	   while(itr.hasNext()){
		   Employee e=itr.next();
		   System.out.println(e);
	   }
	   
	}
	
	public static void search (LinkedList<Employee> list,int empId){
		
		int dno=0;
		for(Employee emp:list){
			
			if(emp.getEmpId()==empId){
				dno=emp.getD().getDeptId();
				break;
			}
		}
		System.out.println("Department num for employee having eId is 10 ");
		System.out.println(dno);
		System.out.println(".....................");
		
		
		Iterator <Employee> itr=list.iterator();
		while(itr.hasNext()){
			
			Employee e=itr.next();
			if(e.getD().getDeptId()==dno){
				
				itr.remove();
			}
		}
		
		for(Employee e:list){
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		
		LinkedList<Employee> list = new LinkedList <>();
		 
		Department d1=new Department(111,"R&D");
		Department d2=new Department(141,"CS");
		Department d3=new Department(118,"Science");
		Department d4=new Department(120,"TeleComm");
		Department d5=new Department(101,"Maths");
		
		list.add(new Employee(10,"Vishal",d1));
		list.add(new Employee(15,"Sanket",d2));
		list.add(new Employee(11,"Sagar",d3));
		list.add(new Employee(14,"Nishant",d4));
		list.add(new Employee(18,"Ashish",d5));
		list.add(new Employee(19,"Aniket",d2));
		print(list);
		System.out.println(".........");
		
		search(list,10);	
		
		
	
		

	}

}
