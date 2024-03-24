package jdbc1;

public class JavaBean 
{
   private int width;
   private int height;
public int getWidth() {
	return width;
}
public void setWidth(int width) {
	if(width>1000)
	this.width = 1000;
	else if(width>500)
	this.width=500;
	else
		this.width=width;
}
public int getHeight() {
	return height;
}
public void setHeight(int height) 
{
	if(height>1000)
		this.height = 1000;
		else if(height>500)
		this.height=500;
		else
			this.height=height;
	
}
   
}
