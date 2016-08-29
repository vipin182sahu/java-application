import java.util.ArrayList;

class RootModel {

	public String type;
	public String location_name;
	public String code_of_conduct;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String organizer_name;
	public String end_time;
	public String logo;
	public String schedule_published_on;
	public String description;
	public CreatorModel _creator;
	public String privacy;
	public String organizer_description;
	public String state;
	public String name;
	public String email;
	public VersionModel _version;
	public String background_image;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public CopyrightModel _copyright;

	public RootModel(String type, String location_name, String code_of_conduct, String topic, Call_for_papersModel call_for_papers, String start_time, String organizer_name, String end_time, String logo, String schedule_published_on, String description, CreatorModel creator, String privacy, String organizer_description, String state, String name, String email, VersionModel version, String background_image, String timezone, ArrayList<Social_linksModel> social_links, int id, CopyrightModel copyright) {

		this.type = type;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this._creator = creator;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.state = state;
		this.name = name;
		this.email = email;
		this._version = version;
		this.background_image = background_image;
		this.timezone = timezone;
		this.social_links = social_links;
		this.id = id;
		this._copyright = copyright;

	}

}