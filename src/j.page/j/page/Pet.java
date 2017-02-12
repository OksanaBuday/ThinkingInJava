package j.page.j.page;

public class Pet {
	int age;
	float weight;
	float streight;
	String colour;
	
	public void sleep () {
		System.out.println ("�������");
	}
	
    public int eat (String food) {
	  System.out.println ("��� ���: " + food);
	  return 10;
    }
    
	public String say (String aWord) {
	  String petResponse = "�� ��" + aWord;
	  return petResponse;  
    }
}