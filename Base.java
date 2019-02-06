package first;

public class Inhit {

	void foo() {
		System.out.println("Base");}
	
	}class Derived extends Inhit{
		void foo() {
			System.out.println("Derived");
		}
		}
	public class Base{
		public static void main(String[] args) {
			Inhit b = new Inhit();
			b.foo();//
		}
	}
	

//	Base() {}
//	Base(int i) {}
//	protected void foo()
//	}
//	class Derived extended Base{
//		Derived(){}
//		protected void foo() {}
//		Derived(int i){
//			super(i);
//			
//			super.foo();
//			
//			}
		//int a[] = {1,2,3,4};
//		System.out.println(a.length);
//		for(int i=0; i<a.length;i++) {
//			//System.out.println(a[i]);
//			if(a[i]==3) {
//				System.out.println("");
//				
//			}else {
//				if(i==a.length) {
//					System.out.println("");
//					
//					
//				}
//			}
//			try {
//				System.out.println("a[10]");
//				
//			}catch(Exception A) {
//				System.out.println("");
//				A.printStackTrace();
//			}finally {
//				Thread.sleep(2*1000);
//				System.out.println("clsoe");
//			}
//		}
//}
