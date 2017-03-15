/**
 * 
 */
package cn.shuyouliu.streamapi;

import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * @author zywx
 *
 */
public class OptionalApi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//调用工厂方法创建Optional实例
		Optional<String> name = Optional.of("Sanaulla");
		//传入参数为null，抛出NullPointerException.
		// .. Optional<String> someNull = Optional.of(null);
		
		//下面创建了一个不包含任何值的Optional实例
		//例如，值为'null'
		Optional empty = Optional.ofNullable(null);
		
		//isPresent方法用来检查Optional实例中是否包含值
		if (name.isPresent()) {
		  //在Optional实例内调用get()返回已存在的值
		  System.out.println(name.get());//输出Sanaulla
		}
		
		//执行下面的代码会输出：No value present 
		try {
		  //在空的Optional实例上调用get()，抛出NoSuchElementException
		  System.out.println(empty.get());
		} catch (NoSuchElementException ex) {
		  System.out.println(ex.getMessage());
		}
	}

}
