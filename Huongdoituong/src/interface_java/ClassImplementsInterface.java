package interface_java;

public class ClassImplementsInterface implements Interface{
	
	// Lớp này sau khi tạo ra 
    // chỉ có phương thức createAbstractMethod() của Interface
	@Override
	public void createAbstractMethod() {
		System.out.println("Đây là phương thức createAbstractMethod() của Interface");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassImplementsInterface classImplementsInterface=new ClassImplementsInterface();
		classImplementsInterface.createAbstractMethod();

	}

	

}
