package Mini_project_2;

class Hours {
	public void hours(float tot_hrs,float Salary_perhr) {
		float min=40,max=60,ot_hrs=0,ot_sal=0,basic_hrs=0,basic_sal=0;
		
		if(tot_hrs>=40 && tot_hrs<=60) { 
			if(Salary_perhr>=50) {
				ot_hrs=tot_hrs-40;
				basic_hrs=tot_hrs-ot_hrs;
				basic_sal=basic_hrs*Salary_perhr;
				ot_sal=ot_hrs*(Salary_perhr*1.5f);
				
				
				System.out.println("Basic Salary : Rs"+basic_sal);
				System.out.println("Overtime Salary : Rs"+ot_sal);
				System.out.println("Net Salary : Rs"+(basic_sal + ot_sal));
			}
			else {
				System.out.println("Minimum Salary 50Rs/Per hour");
			}
		}
		else {
			System.out.println("Minimum Working hours 40hrs and Maximum Working hours 60hrs/Per Week");
		}
		
		
	}
}