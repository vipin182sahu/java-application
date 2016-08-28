import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String start_time;
	public String organizer_name;
	public String topic;
	public String description;
	public String code_of_conduct;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String name;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String end_time;
	public String organizer_description;
	public String location_name;
	public String logo;
	public int id;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String state;
	public String email;
	public String background_image;

	public RootModel(String timezone, String start_time, String organizer_name, String topic, String description, String code_of_conduct, VersionModel version, Call_for_papersModel call_for_papers, String type, String name, String schedule_published_on, CopyrightModel copyright, String end_time, String organizer_description, String location_name, String logo, int id, String privacy, ArrayList<Social_linksModel> social_links, CreatorModel creator, String state, String email, String background_image) {

		this.timezone = timezone;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.logo = logo;
		this.id = id;
		this.privacy = privacy;
		this.social_links = social_links;
		this._creator = creator;
		this.state = state;
		this.email = email;
		this.background_image = background_image;

	}

}