package j.page.j.page;

public class ConsoleApp {
    public static void main ( String [] arguments )
    {
		 //int myScore=11;
		 double myScore=11; //������� � ��� �����... �������� ��� �� �����
		 myScore--; //11-1 = 10; ��� ��������... �� �� �����������
		 myScore=myScore*2;// 10*2 = 22
		 myScore=myScore/3;// 20/3 = ? 6,666(6) ��� � ���� �������� 6. ����?....
		 System.out.println ("my score is " + myScore);
		 // I will write comments in English
		 // this creates variable i of type int... assigns 0
		 // and then runs for 0, 1, 2, 3, .... 9, but NOT 10, because i < 10, and not i <= 10
		 int count = 0;
		 for(int i = 0; i < 10; ++i) {
			 System.out.print (" " + i + " + ");
			 // when you have a loop you can do funny and interesting things
			 count = count + i;
		 }
		 System.out.println (" = " + count);
    }
}
