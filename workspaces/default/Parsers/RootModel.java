import java.util.ArrayList;

class RootModel {

	public String start_time;
	public int id;
	public String state;
	public String location_name;
	public CreatorModel _creator;
	public String description;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String schedule_published_on;
	public String timezone;
	public String end_time;
	public String type;
	public String organizer_name;
	public String privacy;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String email;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String topic;
	public String background_image;

	public RootModel(String start_time, int id, String state, String location_name, CreatorModel creator, String description, String code_of_conduct, Call_for_papersModel call_for_papers, VersionModel version, String schedule_published_on, String timezone, String end_time, String type, String organizer_name, String privacy, CopyrightModel copyright, String organizer_description, String email, String logo, ArrayList<Social_linksModel> social_links, String name, String topic, String background_image) {

		this.start_time = start_time;
		this.id = id;
		this.state = state;
		this.location_name = location_name;
		this._creator = creator;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.end_time = end_time;
		this.type = type;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.email = email;
		this.logo = logo;
		this.social_links = social_links;
		this.name = name;
		this.topic = topic;
		this.background_image = background_image;

	}

}