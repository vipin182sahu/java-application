import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String code_of_conduct;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public int id;
	public String logo;
	public String email;
	public String organizer_name;
	public String name;
	public VersionModel _version;
	public CreatorModel _creator;
	public String topic;
	public String description;
	public String timezone;
	public String start_time;
	public String state;
	public String location_name;
	public String background_image;
	public String organizer_description;
	public CopyrightModel _copyright;

	public RootModel(String privacy, String code_of_conduct, String type, ArrayList<Social_linksModel> social_links, String schedule_published_on, Call_for_papersModel call_for_papers, String end_time, int id, String logo, String email, String organizer_name, String name, VersionModel version, CreatorModel creator, String topic, String description, String timezone, String start_time, String state, String location_name, String background_image, String organizer_description, CopyrightModel copyright) {

		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.id = id;
		this.logo = logo;
		this.email = email;
		this.organizer_name = organizer_name;
		this.name = name;
		this._version = version;
		this._creator = creator;
		this.topic = topic;
		this.description = description;
		this.timezone = timezone;
		this.start_time = start_time;
		this.state = state;
		this.location_name = location_name;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this._copyright = copyright;

	}

}