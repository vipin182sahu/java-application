import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String privacy;
	public String end_time;
	public String start_time;
	public VersionModel _version;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String type;
	public String background_image;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String email;
	public String name;
	public String organizer_name;
	public String code_of_conduct;
	public String organizer_description;
	public int id;
	public CreatorModel _creator;
	public String location_name;
	public String description;
	public String timezone;

	public RootModel(String schedule_published_on, String privacy, String end_time, String start_time, VersionModel version, String logo, Call_for_papersModel call_for_papers, String topic, String type, String background_image, String state, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String email, String name, String organizer_name, String code_of_conduct, String organizer_description, int id, CreatorModel creator, String location_name, String description, String timezone) {

		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.end_time = end_time;
		this.start_time = start_time;
		this._version = version;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.type = type;
		this.background_image = background_image;
		this.state = state;
		this.social_links = social_links;
		this._copyright = copyright;
		this.email = email;
		this.name = name;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.id = id;
		this._creator = creator;
		this.location_name = location_name;
		this.description = description;
		this.timezone = timezone;

	}

}