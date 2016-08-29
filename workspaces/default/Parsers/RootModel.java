import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String state;
	public String location_name;
	public String code_of_conduct;
	public String timezone;
	public String organizer_description;
	public String end_time;
	public int id;
	public String type;
	public String start_time;
	public String email;
	public String logo;
	public String name;
	public String description;
	public String topic;
	public CreatorModel _creator;
	public CopyrightModel _copyright;

	public RootModel(String privacy, String schedule_published_on, ArrayList<Social_linksModel> social_links, VersionModel version, String background_image, Call_for_papersModel call_for_papers, String organizer_name, String state, String location_name, String code_of_conduct, String timezone, String organizer_description, String end_time, int id, String type, String start_time, String email, String logo, String name, String description, String topic, CreatorModel creator, CopyrightModel copyright) {

		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this._version = version;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.state = state;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.id = id;
		this.type = type;
		this.start_time = start_time;
		this.email = email;
		this.logo = logo;
		this.name = name;
		this.description = description;
		this.topic = topic;
		this._creator = creator;
		this._copyright = copyright;

	}

}