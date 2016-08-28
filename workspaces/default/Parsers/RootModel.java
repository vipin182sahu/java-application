import java.util.ArrayList;

class RootModel {

	public String description;
	public String start_time;
	public String logo;
	public String name;
	public String state;
	public String privacy;
	public String schedule_published_on;
	public int id;
	public String email;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String code_of_conduct;
	public String topic;
	public String location_name;
	public String timezone;
	public String organizer_description;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String organizer_name;
	public String background_image;

	public RootModel(String description, String start_time, String logo, String name, String state, String privacy, String schedule_published_on, int id, String email, CopyrightModel copyright, CreatorModel creator, ArrayList<Social_linksModel> social_links, String end_time, String code_of_conduct, String topic, String location_name, String timezone, String organizer_description, VersionModel version, Call_for_papersModel call_for_papers, String type, String organizer_name, String background_image) {

		this.description = description;
		this.start_time = start_time;
		this.logo = logo;
		this.name = name;
		this.state = state;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.email = email;
		this._copyright = copyright;
		this._creator = creator;
		this.social_links = social_links;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.location_name = location_name;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.organizer_name = organizer_name;
		this.background_image = background_image;

	}

}