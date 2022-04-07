import java.util.*;

public class Employeee {
	private int empno;
	private String empname;
    private int empsalary;
	public Employeee(int empno, String empname, int empsalary) {
		super();
		this.empno = empno;
		this.empname = empname;
		this.empsalary = empsalary;
	}
	public int getEmpno() {
		return empno;
	}
	public String getEmpname() {
		return empname;
	}
	public int getEmpsalary() {
		return empsalary;
	}
	public String toString() {
		return empno+" "+empname+" "+empsalary;
	}
}
 class CRUDDemo{
	 public static void main(String[] args) {
		 Collection<Employeee> c= new ArrayList<Employeee>();
		 Scanner s = new Scanner(System.in);
		 Scanner s1 = new Scanner(System.in);
		int ch;
		do {
			System.out.println("1.INSERT");
			System.out.println("2.DISPLAY");
			System.out.println("3.SEARCH");
			System.out.println("4.DELETE");
			System.out.println("5.UPDATE");
			System.out.print("Enter Your Choice");
			ch= s.nextInt();
			switch(ch) {
			case 1:
				System.out.print("Enter empno  :");
				int eno=s.nextInt();
						System.out.print("Enter empname  :");
				String ename=s1.nextLine();
				System.out.print("Enter empsalary   :");
				int  salary=s.nextInt();
				c.add(new Employeee(eno,ename,salary));
				break;
			case 2:
				System.out.println("***********************");
				Iterator<Employeee>i=c.iterator();
				while(i.hasNext()) {
					Employeee e=i.next();
					System.out.println(e);
				}
				System.out.println("***********************");
			
			break;
		case 3:
			boolean found=false;
			System.out.println("Enter empno to search  :");
			 int empno =s.nextInt();
			System.out.println("***********************");
			i=c.iterator();
			while(i.hasNext()) {
				Employeee e=i.next();
				if(e.getEmpno()== empno) {
				System.out.println(e);
				found=true;
			}
		
		}
			if(!found) {
				System.out.println("Record not found" );
			}
			System.out.println("************************");
			break;
			
		case 4:
			 found=false;
			System.out.println("Enter empno to Delete  :");
			  empno =s.nextInt();
			System.out.println("***********************");
			i=c.iterator();
			while(i.hasNext()) {
				Employeee e=i.next();
				if(e.getEmpno()== empno) {
				i.remove();
				found=true;
			}
		
		}
			if(!found) {
				System.out.println("Record not found" );
			}else {
				System.out.println("Record is Deleted Successfully");}
			System.out.println("************************");
			break;}
			
			}while(ch!=0);	 
		
		
	  }
	 }
 