import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String topic;
	public String logo;
	public String state;
	public String code_of_conduct;
	public String organizer_description;
	public CopyrightModel _copyright;
	public int id;
	public String timezone;
	public String start_time;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String email;
	public String schedule_published_on;
	public String location_name;
	public String description;
	public String type;
	public String privacy;
	public String name;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;

	public RootModel(String organizer_name, String topic, String logo, String state, String code_of_conduct, String organizer_description, CopyrightModel copyright, int id, String timezone, String start_time, CreatorModel creator, Call_for_papersModel call_for_papers, VersionModel version, String email, String schedule_published_on, String location_name, String description, String type, String privacy, String name, String end_time, ArrayList<Social_linksModel> social_links, String background_image) {

		this.organizer_name = organizer_name;
		this.topic = topic;
		this.logo = logo;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.id = id;
		this.timezone = timezone;
		this.start_time = start_time;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.description = description;
		this.type = type;
		this.privacy = privacy;
		this.name = name;
		this.end_time = end_time;
		this.social_links = social_links;
		this.background_image = background_image;

	}

}