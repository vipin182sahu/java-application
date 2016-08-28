import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String topic;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public int id;
	public String logo;
	public String privacy;
	public String organizer_name;
	public String email;
	public String type;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String location_name;
	public String background_image;
	public String organizer_description;
	public VersionModel _version;
	public String start_time;
	public String name;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String timezone;

	public RootModel(String code_of_conduct, String topic, String schedule_published_on, CopyrightModel copyright, int id, String logo, String privacy, String organizer_name, String email, String type, String description, Call_for_papersModel call_for_papers, String state, String location_name, String background_image, String organizer_description, VersionModel version, String start_time, String name, CreatorModel creator, ArrayList<Social_linksModel> social_links, String end_time, String timezone) {

		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.id = id;
		this.logo = logo;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.email = email;
		this.type = type;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.location_name = location_name;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this._version = version;
		this.start_time = start_time;
		this.name = name;
		this._creator = creator;
		this.social_links = social_links;
		this.end_time = end_time;
		this.timezone = timezone;

	}

}