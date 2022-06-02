import java.util.ArrayList;
import java.util.List;
public class ListUtils {
	
	public <T> List generateList(T...items ){
		List<T> list = new ArrayList<>();
		for(T item : items)
		list.add(item);
		return list;
	}
	
	
	
	

}
