import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String logo;
	public String privacy;
	public String organizer_description;
	public VersionModel _version;
	public String start_time;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String state;
	public String description;
	public String schedule_published_on;
	public String topic;
	public String email;
	public String name;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public int id;
	public String timezone;
	public String background_image;

	public RootModel(String end_time, String logo, String privacy, String organizer_description, VersionModel version, String start_time, String code_of_conduct, ArrayList<Social_linksModel> social_links, String type, String state, String description, String schedule_published_on, String topic, String email, String name, String organizer_name, CopyrightModel copyright, String location_name, Call_for_papersModel call_for_papers, CreatorModel creator, int id, String timezone, String background_image) {

		this.end_time = end_time;
		this.logo = logo;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this._version = version;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.type = type;
		this.state = state;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.email = email;
		this.name = name;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.id = id;
		this.timezone = timezone;
		this.background_image = background_image;

	}

}