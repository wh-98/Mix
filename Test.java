
public class Test {

	public static void main(String[] args) {
		// �ײ�A
		SubMealBuilderA a = new SubMealBuilderA();
		//�ײ�A�ķ���Ա
		 KFCWaiter waiter = new KFCWaiter(a);
		 //����ײ�
	        Meal mealA = waiter.construct();      
	        System.out.print("A�ײ��У�");
	        System.out.println("ʳ�"+mealA.getfood()+"��   "+"��Ʒ��"+mealA.getdrinks());
	}

}
