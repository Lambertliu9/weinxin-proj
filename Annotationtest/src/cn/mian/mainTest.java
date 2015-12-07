package cn.mian;

public class mainTest {

	public static void main(String[] args) {
		Class<AnnotationTest> testClass= AnnotationTest.class;
		//因为注解作用于类上面，所以可通过isAnnotationPresent来判断是否是一个
		//有UserNameAnnotationPresent注解的类
		if (testClass.isAnnotationPresent(UserNameAnnotations.class)) {
			System.out.println("this is a Annotation class");
			UserNameAnnotations userNameAnnotation = (UserNameAnnotations) testClass.getAnnotation(UserNameAnnotations.class);
			if (userNameAnnotation !=null) {
				System.out.println("value:" +userNameAnnotation.value());
			}else{
				System.out.println("null");
			}
		}else{
			System.out.println("this is not Annotation class");
		}
	}
}
