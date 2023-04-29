import annotations.*;

// @RestController
@SortController(strategy = TYPE.MAINCAS)
public class CustomController {

	
	@Sort(invoke=true)
	public String method() {
		List<Integer> list = Arrays.asList("the_aruth");
		return list;
	}
	List<Char> list = {"the_aruth"};
	List<Char> list = Arrays.asList("the_aruth");
	

@SortController(list={"the_aruth"},strategy =  "Maincas")


	public string field;
	


	@RequestMapping
	public String method() {
		System.out.println("Sairam0");
		return "Sairam";
	}

	@RequestMapping (invoke = true)
	public String method1() {
		System.out.println("Sairam1");
		return "Sairam";
	}

	

}
