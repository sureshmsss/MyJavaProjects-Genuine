package generic.classess;
class Generics<T> 
{	
	T object;

	Generics(){
		System.out.println("0-param Constructor");
	}
	Generics(T object){
		this.object=object;
	}
	public void show(){
		System.out.println("Type of object : " +object.getClass().getName());
	}
	public T get(){
		return object;
	}
}
