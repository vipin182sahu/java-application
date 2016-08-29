import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String name;
	public String state;
	public String organizer_name;
	public String type;
	public int id;
	public String start_time;
	public String schedule_published_on;
	public String end_time;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public VersionModel _version;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String code_of_conduct;
	public String logo;
	public String privacy;
	public String email;
	public String organizer_description;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;

	public RootModel(String background_image, String name, String state, String organizer_name, String type, int id, String start_time, String schedule_published_on, String end_time, CopyrightModel copyright, CreatorModel creator, VersionModel version, String description, Call_for_papersModel call_for_papers, String topic, String code_of_conduct, String logo, String privacy, String email, String organizer_description, String location_name, ArrayList<Social_linksModel> social_links, String timezone) {

		this.background_image = background_image;
		this.name = name;
		this.state = state;
		this.organizer_name = organizer_name;
		this.type = type;
		this.id = id;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this._copyright = copyright;
		this._creator = creator;
		this._version = version;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.privacy = privacy;
		this.email = email;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.social_links = social_links;
		this.timezone = timezone;

	}

}