import java.util.ArrayList;

class RootModel {

	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String name;
	public String code_of_conduct;
	public CreatorModel _creator;
	public VersionModel _version;
	public String end_time;
	public String privacy;
	public String location_name;
	public String schedule_published_on;
	public String email;
	public String organizer_name;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String topic;
	public String logo;
	public String start_time;
	public int id;
	public String background_image;
	public String type;
	public CopyrightModel _copyright;

	public RootModel(String state, ArrayList<Social_linksModel> social_links, String timezone, String name, String code_of_conduct, CreatorModel creator, VersionModel version, String end_time, String privacy, String location_name, String schedule_published_on, String email, String organizer_name, String description, Call_for_papersModel call_for_papers, String organizer_description, String topic, String logo, String start_time, int id, String background_image, String type, CopyrightModel copyright) {

		this.state = state;
		this.social_links = social_links;
		this.timezone = timezone;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this._version = version;
		this.end_time = end_time;
		this.privacy = privacy;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.organizer_name = organizer_name;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.logo = logo;
		this.start_time = start_time;
		this.id = id;
		this.background_image = background_image;
		this.type = type;
		this._copyright = copyright;

	}

}