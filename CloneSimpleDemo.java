package CloneSimpleDemo;

public  class CloneSimpleDemo {
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
 public static void main (String [] args)throws CloneNotSupportedException{
	 Person p1 = new Person("任我行",35);
	 Person p2 = (Person)p1.clone();
	 System.out.println("克隆前: " + p1.getName()+","+p1.getAge());
	 System.out.println("克隆后: " + p2.getName()+","+p2.getAge());
	 if(p1 == p2)
		 System.out.println("p1和p2的地址相等！");
	 else
		 System.out.println("p1和p2的地址不相等！");
 }	

}
