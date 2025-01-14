public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    private double latestPunchIn;
    private boolean currentlyWorking;


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getLatestPunchIn() {
        return latestPunchIn;
    }

    public void setLatestPunchIn(double latestPunchIn) {
        this.latestPunchIn = latestPunchIn;
    }

    public boolean isCurrentlyWorking() {
        return currentlyWorking;
    }

    public void setCurrentlyWorking(boolean currentlyWorking) {
        this.currentlyWorking = currentlyWorking;
    }

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay() {
        return hoursWorked * payRate;
    }

    public double getRegularHours() {
        if(hoursWorked <= 40) {
            return hoursWorked;
        } else {
            return 40;
        }
    }
    public double getOvertimeHours() {
        if(hoursWorked <= 40) {
            return 0;
        } else {
            return hoursWorked - 40;
        }
    }

    public void punchIn(double startTime) {
        this.latestPunchIn = startTime;
        this.currentlyWorking = true;
}
    public double punchOut(double endTime) {
        if(!this.currentlyWorking) {
            return 0;
        } else {
            double hoursLatestShift = endTime - this.latestPunchIn;
            this.hoursWorked += hoursLatestShift;
            this.currentlyWorking = false;
            return hoursLatestShift;
        }
    }
}
