import java.util.ArrayList;

class RootModel {

	public String description;
	public String location_name;
	public String organizer_name;
	public String organizer_description;
	public String name;
	public String start_time;
	public int id;
	public String logo;
	public String type;
	public String code_of_conduct;
	public String timezone;
	public CreatorModel _creator;
	public String email;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String end_time;
	public String privacy;
	public String topic;
	public CopyrightModel _copyright;

	public RootModel(String description, String location_name, String organizer_name, String organizer_description, String name, String start_time, int id, String logo, String type, String code_of_conduct, String timezone, CreatorModel creator, String email, String state, ArrayList<Social_linksModel> social_links, VersionModel version, String schedule_published_on, Call_for_papersModel call_for_papers, String background_image, String end_time, String privacy, String topic, CopyrightModel copyright) {

		this.description = description;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.name = name;
		this.start_time = start_time;
		this.id = id;
		this.logo = logo;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this._creator = creator;
		this.email = email;
		this.state = state;
		this.social_links = social_links;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.end_time = end_time;
		this.privacy = privacy;
		this.topic = topic;
		this._copyright = copyright;

	}

}