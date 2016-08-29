import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String schedule_published_on;
	public String timezone;
	public String topic;
	public String description;
	public String type;
	public String email;
	public String start_time;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String end_time;
	public String organizer_name;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String name;
	public String privacy;
	public String code_of_conduct;
	public int id;
	public VersionModel _version;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;

	public RootModel(String location_name, String schedule_published_on, String timezone, String topic, String description, String type, String email, String start_time, CopyrightModel copyright, String organizer_description, String end_time, String organizer_name, CreatorModel creator, Call_for_papersModel call_for_papers, String logo, String name, String privacy, String code_of_conduct, int id, VersionModel version, String state, ArrayList<Social_linksModel> social_links, String background_image) {

		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.topic = topic;
		this.description = description;
		this.type = type;
		this.email = email;
		this.start_time = start_time;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.name = name;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this._version = version;
		this.state = state;
		this.social_links = social_links;
		this.background_image = background_image;

	}

}