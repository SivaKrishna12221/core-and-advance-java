package javatpoint;

public class ClassEncapsulation 
/*
 * the encapsulation is a process of wrapping code and data together
 * in a single unit;it is the example of capsule it cotains some particle
 * 
 * Encapsulation means it is a process of making our fields as private and access
 * those fields with public methods by using settter and getter methods
 * 
 * 1)It provides you to control over the data.
 * 2)It is a way to achieve the data hiding. because other class 
 * will not able to access date through the private data members
 * 3)the encapsulate test is easy to test so it is better 
 * 4)Standard ide providing the setter and getter methods for the private data
 * so it is easy and fast to create ecapsulated data
 * 
 */
{
	private String student;
    private String branch="bsc";
	public String getStudent() {
		return student;
	}

	public void setStudent(String student)
	{
		this.student=student;
	}
	public String getBranch()
	{
		return branch;
	}

	
}
