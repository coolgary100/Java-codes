import java.util.LinkedList;

public class Product {
	LinkedList <String> tags = new LinkedList <String> ();
	public Product (LinkedList <String> tags) {
		this.tags = tags; 
	}
	
	private void addTag(String tag){
		tags.add(tag);
	}
	
	public void addTags(LinkedList<String> tags){
		for (int index = 0; index < tags.size(); index++){
			addTag(tags.get(index));
		}
	}
	
	public void changeGender(String gender) {
		if(gender != "Female" || gender != "Male" ) {
			throw new IllegalArgumentException();
		}
		else {
			tags.addFirst(gender);
		}
	}
	//null the measurements that you don't need
	public void changeType(String type) {
		tags.add(1, type);
	}
	
	public void changeStyle(String style) {
		tags.add(2, style);
	}
	
	public String getGender() {
		return tags.getFirst();
	}
	
	public String getType() {
		return tags.get(1);
	}
	
	public String getStyle() {
		return tags.get(2);
	}
	
	public void changeBust(String bust) {
		tags.add(3, bust);
	}
	
	public String getBust() {
		return tags.get(3);
	}
	
	public void changeWaist(String waist) {
		tags.add(4, waist);
	}
	
	public String getWasit() {
		return tags.get(4);
	}
	
	public void changeHeight(String height) {
		tags.add(5, height);
	}
	
	public String getHeight() {
		return tags.get(5);
	}
	
	public void changeHip(String hip) {
		tags.add(6, hip);
	}
	
	public String getHip() {
		return tags.get(6);
	}
	
	public LinkedList <String> getTags() {
		return tags;
	}
	
}
