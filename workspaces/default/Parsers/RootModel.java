import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String privacy;
	public String code_of_conduct;
	public String type;
	public String topic;
	public CreatorModel _creator;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public String schedule_published_on;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String logo;
	public String location_name;
	public String organizer_description;
	public String start_time;
	public String name;
	public String email;
	public String end_time;
	public VersionModel _version;
	public String timezone;

	public RootModel(String background_image, String privacy, String code_of_conduct, String type, String topic, CreatorModel creator, String state, Call_for_papersModel call_for_papers, String description, String schedule_published_on, int id, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String organizer_name, String logo, String location_name, String organizer_description, String start_time, String name, String email, String end_time, VersionModel version, String timezone) {

		this.background_image = background_image;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.topic = topic;
		this._creator = creator;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.social_links = social_links;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.name = name;
		this.email = email;
		this.end_time = end_time;
		this._version = version;
		this.timezone = timezone;

	}

}