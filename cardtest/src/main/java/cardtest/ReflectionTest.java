package cardtest;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import issuermanagement.Wrapper;

public class ReflectionTest {
	
	@Test
	public void testflow() throws InstantiationException, IllegalAccessException
	{
		Class<Wrapper> wrap=Wrapper.class;
		
		System.out.println(wrap);
		
		System.out.println("-------------------------");
		
		 Object wM = wrap.newInstance();
		 
		 System.out.println(wM);
		 
		 System.out.println("-------------------------");
		 
		 Method[] methodName = wrap.getDeclaredMethods();
		 
		 for (Method method : methodName) {
			 
			 System.out.println(method);
			 
	
			
		}
	}

}
