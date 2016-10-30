package CloneDeepDemo;

public class CloneDeepDemo {
	static class Person implements Cloneable{
		 private String name;
		 private int age;
		 public Person(String name,int age){
			 this.name = name;
			 this.age = age;
		 }
		 public String getName(){
			 return name;
		 }
		 public void setName(String name){
			 this.name = name;
		 }
		 public int getAge(){
			 return age;
		 }
		 public void setAge(int age){
			 this.age = age;
		 }
		@Override
		protected Object clone()throws CloneNotSupportedException{
			return super.clone();
		}
	}
    static class Person1 implements Cloneable{
    	Person per;
    	public Person1(Person per){  //�β�ΪPerson���͵Ķ���
    		this.per = per;
    	}
    	public Person getPer(){
    		return per;
    	}
    	public void setPer(Person per){
    		this.per = per;
    	}
    	@Override
    	protected Object clone()throws CloneNotSupportedException{
    		Person1 p =(Person1)super.clone();
    		p.per =(Person)this.per.clone();
    		return p;
    	}
    }
    public static void main(String [] args)throws  CloneNotSupportedException{
    	Person per = new Person("�����",24);
    	Person1 p1 = new Person1(per);
    	Person1 p2 = (Person1)p1.clone();
    	System.out.println("��¡ǰ��" +p1.getPer().getName()+","+p1.getPer().getAge());
    	System.out.println("��¡��" +p2.getPer().getName()+","+p2.getPer().getAge());
    	if(p1 == p2)
    		System.out.println("p1��p2�ĵ�ַ��ȣ�");
    	else
    		System.out.println("p1��p2�ĵ�ַ����ȣ�");
    	if(p1.getPer() == p2.getPer())
    	    System.out.println("p1�е�Person������p2�е�Person������ȣ�");	
    	else
    	    System.out.println("p1�е�Person������p2�е�Person������ȣ�");
     }
}
