import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String location_name;
	public String privacy;
	public String name;
	public String type;
	public String start_time;
	public String organizer_description;
	public String end_time;
	public String background_image;
	public String description;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String code_of_conduct;
	public String timezone;
	public int id;
	public CreatorModel _creator;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String schedule_published_on;
	public String state;
	public CopyrightModel _copyright;

	public RootModel(String organizer_name, String location_name, String privacy, String name, String type, String start_time, String organizer_description, String end_time, String background_image, String description, String email, ArrayList<Social_linksModel> social_links, VersionModel version, String code_of_conduct, String timezone, int id, CreatorModel creator, String topic, Call_for_papersModel call_for_papers, String logo, String schedule_published_on, String state, CopyrightModel copyright) {

		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.privacy = privacy;
		this.name = name;
		this.type = type;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.background_image = background_image;
		this.description = description;
		this.email = email;
		this.social_links = social_links;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.id = id;
		this._creator = creator;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this._copyright = copyright;

	}

}