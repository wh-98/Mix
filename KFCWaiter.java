public class KFCWaiter {
    private MealBuilder mb;

    public KFCWaiter(MealBuilder mb){
    	 this.mb = mb;
    }
    public Meal construct(){
    	 //׼��ʳ��
        mb.BuildFood();
        //׼������
        mb.BuildDrinks();        
        //׼����ϣ�����һ���������ײ͸��ͻ�
        return mb.getMeal();
    }


}
