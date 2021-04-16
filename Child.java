package loop_practice;

	class Parent{
		public void bar() {
			System.out.println("It is a bar method of Parent class");
		}
		public void foo() {
			System.out.println("It is a fooMethod parent class");	
		}

	class Child extends Parent{
	 	public void bar() {
	        System.out.println("It is a bar method of child class");
	        }
	        public void foo() {
	        System.out.println("it is foo method of child class");  
	        }
	
	
	    public void main(String[] args) {
	    	Parent parObj=new Child();
	    	Child childObj= new Child();
  		
	    	parObj.foo();
	    	childObj.foo();
  		
	    	parObj.bar();
	    	childObj.bar();
  	
	}

	   
}

	}

