package j.page.j.page;

public class PetMaster {

	public static void main(String[] args) {
		String petReaction;
		Pet myPet = new Pet ();
		int kg = myPet.eat("banana");
		System.out.println (kg);
		petReaction = myPet. say(" ��� ���");
		System.out.println (petReaction);
	}
}