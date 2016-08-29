import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public int id;
	public String name;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public VersionModel _version;
	public String timezone;
	public String start_time;
	public String location_name;
	public String logo;
	public String background_image;
	public String email;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String organizer_name;
	public String code_of_conduct;
	public String privacy;
	public String end_time;
	public String type;
	public String topic;
	public CopyrightModel _copyright;

	public RootModel(String organizer_description, int id, String name, CreatorModel creator, Call_for_papersModel call_for_papers, String state, VersionModel version, String timezone, String start_time, String location_name, String logo, String background_image, String email, String description, ArrayList<Social_linksModel> social_links, String schedule_published_on, String organizer_name, String code_of_conduct, String privacy, String end_time, String type, String topic, CopyrightModel copyright) {

		this.organizer_description = organizer_description;
		this.id = id;
		this.name = name;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this._version = version;
		this.timezone = timezone;
		this.start_time = start_time;
		this.location_name = location_name;
		this.logo = logo;
		this.background_image = background_image;
		this.email = email;
		this.description = description;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.end_time = end_time;
		this.type = type;
		this.topic = topic;
		this._copyright = copyright;

	}

}