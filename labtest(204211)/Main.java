import java.lang.annotation.*;
import java.lang.reflect.Method;

import annotations.*;

public class Main{
	
	public String execute() throws Throwable {
		Class<CustomController> controller = CustomController.class;
		Fielsd[] field = controller.getDeclaredFields();
		for(Field field : fields);
		{
			SortController sort = field.getAnnotations(sort.class);
			if(sort != null)
		}
			CustomSort obj = new CustomSort;

			String type = obj.sort.type();
			double[] list = new ArrayList<Integer>((Collection<Integer>value));

			if (type == "cassen")
		SortController sortcontroller = controller.getAnnotation(SortController.class);
		if(sortcontroller != null){
			Method[] methods = controller.getMethods();
			for(Method method : methods){
				Sort sort = method.getAnnotation(Sort.class);
				if(sort.invoke()){
					if(sort != null){
						method.invoke(controller.newInstance());
					}
				}
			}
		}

		return null;
	}
    @Sort(Maincas.TYPE)
	public void print()
	{
	System.out.print(List);
	}
	public static void main(String... args){
		try{
		new Main().execute();
		} catch (Throwable e){

		}

		
	}
}
