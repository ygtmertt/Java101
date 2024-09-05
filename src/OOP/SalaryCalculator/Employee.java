package OOP.SalaryCalculator;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    public double tax() {
        if(this.salary>=1000) {
            return (double) (this.salary * 3) /100;
        }
        else {
            return 0;
        }
    }

    public int bonus() {
        if(this.workHours>=40) {
            int extraShift=0;
            for(int i=this.workHours; i>=40; i--) {
                extraShift++;
            }
            return extraShift*30;
        }
        else {
            return 0;
        }
    }

    public double raiseSalary() {
        if(2021-this.hireYear<10) {
            return (double) (salary * 5) /100;
        }
        else if(2021-this.hireYear>9 && 2021-this.hireYear<20) {
            return (double) (this.salary * 10) /100;
        }
        else {
            return (double) (this.salary * 19) /100;
        }
    }

    public String toString() {
        return "Employee Name:\t"+this.name+"\n"+
                "Gross Salary:\t"+this.salary+"\n"+
                "Work Hours:\t"+this.workHours+"\n"+
                "Hire Year:\t"+this.hireYear+"\n"+
                "Tax:\t"+tax()+"\n"+
                "Bonus:\t"+bonus()+"\n"+
                "Salary Raise:\t"+raiseSalary()+"\n"+
                "Salary with Taxes and Bonuses:\t"+(this.salary+bonus()-tax())+"\n"+
                "Total Salary:\t"+(this.salary+raiseSalary()+bonus()-tax())+"\n";

    }
}
