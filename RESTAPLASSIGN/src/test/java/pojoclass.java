
public class pojoclass {
private int userId;
private int id;
private String title;
private String body;

public pojoclass()
{
	
}

public pojoclass(int UID)
{
	this.setUserId(UID);
	
}

public pojoclass(int UID,int ID,String title,String body)
{
	this.setUserId(UID);
	this.setId(ID);
	this.setTitle(title);
	this.setBody(body);
}

public int getUserId() {
	return userId;
}

public void setUserId(int userId) {
	this.userId = userId;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getBody() {
	return body;
}

public void setBody(String body) {
	this.body = body;
}
}

