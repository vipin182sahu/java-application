import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String topic;
	public String organizer_name;
	public String description;
	public String logo;
	public CopyrightModel _copyright;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public int id;
	public String organizer_description;
	public CreatorModel _creator;
	public VersionModel _version;
	public String schedule_published_on;
	public String email;
	public String state;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String privacy;
	public String location_name;
	public String end_time;
	public String background_image;

	public RootModel(String timezone, String topic, String organizer_name, String description, String logo, CopyrightModel copyright, String type, Call_for_papersModel call_for_papers, String start_time, int id, String organizer_description, CreatorModel creator, VersionModel version, String schedule_published_on, String email, String state, String name, ArrayList<Social_linksModel> social_links, String code_of_conduct, String privacy, String location_name, String end_time, String background_image) {

		this.timezone = timezone;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.description = description;
		this.logo = logo;
		this._copyright = copyright;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.id = id;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.state = state;
		this.name = name;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.location_name = location_name;
		this.end_time = end_time;
		this.background_image = background_image;

	}

}