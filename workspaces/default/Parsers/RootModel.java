import java.util.ArrayList;

class RootModel {

	public String email;
	public String timezone;
	public String topic;
	public String location_name;
	public String name;
	public String logo;
	public String schedule_published_on;
	public String organizer_name;
	public String description;
	public String privacy;
	public int id;
	public String start_time;
	public String state;
	public CopyrightModel _copyright;
	public String end_time;
	public VersionModel _version;
	public String organizer_description;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String background_image;

	public RootModel(String email, String timezone, String topic, String location_name, String name, String logo, String schedule_published_on, String organizer_name, String description, String privacy, int id, String start_time, String state, CopyrightModel copyright, String end_time, VersionModel version, String organizer_description, String code_of_conduct, ArrayList<Social_linksModel> social_links, String type, CreatorModel creator, Call_for_papersModel call_for_papers, String background_image) {

		this.email = email;
		this.timezone = timezone;
		this.topic = topic;
		this.location_name = location_name;
		this.name = name;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.description = description;
		this.privacy = privacy;
		this.id = id;
		this.start_time = start_time;
		this.state = state;
		this._copyright = copyright;
		this.end_time = end_time;
		this._version = version;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.type = type;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;

	}

}