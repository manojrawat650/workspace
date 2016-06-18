package java2;

 class Child 
 {	  
	private String a;
	
	private String b;

	static
	  {
		System.out.println("a");
	  }
	public Child(String a, String b) {
		super();
		this.a = a;
		this.b = b;
	}

	public Child(){
		System.out.println("ssg");
	}
	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}
	 
 }
