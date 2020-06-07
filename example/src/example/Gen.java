package example;

class Gen<T>{
	T ob;   		//Declare an object of type T
	
	//Pass the constructor an reference to object of type T
	Gen(T o){
		ob=o;
	}
	
	//Return ob
	T getob() {
		return ob;
	}
	
	//Show type of T
	void showType() {
		System.out.println("Type of T is "+ob.getClass().getName());
	}
}