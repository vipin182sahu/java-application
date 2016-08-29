import java.util.ArrayList;

class RootModel {

	public String state;
	public CreatorModel _creator;
	public String type;
	public String email;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String schedule_published_on;
	public String code_of_conduct;
	public String start_time;
	public String background_image;
	public String organizer_name;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String topic;
	public String end_time;
	public int id;
	public String privacy;
	public String description;
	public String location_name;
	public String timezone;

	public RootModel(String state, CreatorModel creator, String type, String email, VersionModel version, CopyrightModel copyright, String organizer_description, String schedule_published_on, String code_of_conduct, String start_time, String background_image, String organizer_name, String logo, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String name, String topic, String end_time, int id, String privacy, String description, String location_name, String timezone) {

		this.state = state;
		this._creator = creator;
		this.type = type;
		this.email = email;
		this._version = version;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.topic = topic;
		this.end_time = end_time;
		this.id = id;
		this.privacy = privacy;
		this.description = description;
		this.location_name = location_name;
		this.timezone = timezone;

	}

}