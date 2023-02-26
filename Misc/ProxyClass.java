package Misc;
//Import required libraries
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

// demoInvocationHandler class
class demoInvocationHandler implements InvocationHandler {
	@Override
	public Object invoke(Object proxy, Method method,
						Object[] args) throws Throwable
	{
		return null;
	}
}

// demoInterface
interface demoInterface {
}

// Driver code
public class ProxyClass {

	public static void main(String[] args)
	{
		// Object created
		InvocationHandler h = new demoInvocationHandler();

		// ProxyClass objects stored in list
		List proxyClass = (List)Proxy.newProxyInstance(
			ProxyClass.class.getClassLoader(),
			new Class[] { List.class },
			new demoInvocationHandler());
		System.out.println(
			Proxy.getInvocationHandler(proxyClass));
	}
}
