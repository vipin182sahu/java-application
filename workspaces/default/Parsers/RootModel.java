import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String organizer_name;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String logo;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String type;
	public String location_name;
	public String state;
	public String email;
	public String start_time;
	public String name;
	public int id;
	public String description;
	public String end_time;
	public String privacy;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;

	public RootModel(String organizer_description, String organizer_name, VersionModel version, CopyrightModel copyright, String logo, String topic, Call_for_papersModel call_for_papers, String background_image, String code_of_conduct, CreatorModel creator, String type, String location_name, String state, String email, String start_time, String name, int id, String description, String end_time, String privacy, String schedule_published_on, ArrayList<Social_linksModel> social_links, String timezone) {

		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this._version = version;
		this._copyright = copyright;
		this.logo = logo;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.type = type;
		this.location_name = location_name;
		this.state = state;
		this.email = email;
		this.start_time = start_time;
		this.name = name;
		this.id = id;
		this.description = description;
		this.end_time = end_time;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.timezone = timezone;

	}

}