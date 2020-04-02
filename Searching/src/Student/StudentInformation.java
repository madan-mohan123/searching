package Student;

public class StudentInformation implements Comparable<StudentInformation> {
private String name,Email,coarse;
private int roll;
private float cpi;

//getter,setter
public void setName(String name) {
	this.name=name;
}
public void setEmail(String Email) {
	this.Email=Email;
} 
public void setCoarse(String coarse) {
	this.coarse=coarse;
}
public void setRoll(int roll) {
	this.roll=roll;
}
public void setCpi(float cpi) {
	this.cpi=cpi;
}
public String getName() { 
	return name;
}
public String getEmail() {
	return Email;
}
public String getCoarse() {
	return coarse;
}
public int getRoll() {
	return roll;
}
public float getCpi() {
	return cpi;
}
@Override
public int compareTo(StudentInformation o1) {
	
	return this.roll-o1.getRoll();
} 
@Override
public String toString() {
	return name + "\t\t" + coarse + "\t\t" + roll + "\t\t"
			+ cpi +"\t\t" + Email ;
}

}
