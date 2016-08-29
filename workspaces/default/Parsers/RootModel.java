import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String logo;
	public String organizer_description;
	public String state;
	public String type;
	public String topic;
	public VersionModel _version;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public CreatorModel _creator;
	public int id;
	public String start_time;
	public String schedule_published_on;
	public String location_name;
	public String background_image;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String name;
	public String timezone;

	public RootModel(String privacy, String logo, String organizer_description, String state, String type, String topic, VersionModel version, String organizer_name, CopyrightModel copyright, String end_time, ArrayList<Social_linksModel> social_links, String description, CreatorModel creator, int id, String start_time, String schedule_published_on, String location_name, String background_image, String email, Call_for_papersModel call_for_papers, String code_of_conduct, String name, String timezone) {

		this.privacy = privacy;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.state = state;
		this.type = type;
		this.topic = topic;
		this._version = version;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.end_time = end_time;
		this.social_links = social_links;
		this.description = description;
		this._creator = creator;
		this.id = id;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.background_image = background_image;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.timezone = timezone;

	}

}