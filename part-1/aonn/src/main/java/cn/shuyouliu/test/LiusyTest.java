/**
 * 
 */
package cn.shuyouliu.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import cn.shuyouliu.anno.Liusy;

/**
 * @author zywx
 *
 */
public class LiusyTest {

	@Liusy(name="xxx")
	public String myinit(String x){
		System.out.println("myinit");
		return x;
	}
	/**
	 * 
	 */
	public LiusyTest() {
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LiusyTest lt = new LiusyTest();
		Method x[] = LiusyTest.class.getMethods();
		for (Method y : x){
			Liusy tmp = y.getAnnotation(Liusy.class);
			if (tmp != null){
				
				Object ret="";
				try {
					ret = y.invoke(lt, tmp.name());
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
				System.out.println(ret);
			}
		}
	}

}
