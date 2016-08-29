import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String description;
	public String type;
	public String timezone;
	public int id;
	public String code_of_conduct;
	public String end_time;
	public String email;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public CreatorModel _creator;
	public String location_name;
	public String state;
	public String logo;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public VersionModel _version;
	public String organizer_description;
	public String topic;
	public String privacy;
	public CopyrightModel _copyright;

	public RootModel(String background_image, String description, String type, String timezone, int id, String code_of_conduct, String end_time, String email, String schedule_published_on, Call_for_papersModel call_for_papers, String name, CreatorModel creator, String location_name, String state, String logo, String organizer_name, ArrayList<Social_linksModel> social_links, String start_time, VersionModel version, String organizer_description, String topic, String privacy, CopyrightModel copyright) {

		this.background_image = background_image;
		this.description = description;
		this.type = type;
		this.timezone = timezone;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this._creator = creator;
		this.location_name = location_name;
		this.state = state;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.start_time = start_time;
		this._version = version;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.privacy = privacy;
		this._copyright = copyright;

	}

}