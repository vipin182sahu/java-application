import java.util.ArrayList;

class RootModel {

	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String type;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String timezone;
	public String description;
	public String code_of_conduct;
	public String organizer_description;
	public VersionModel _version;
	public String email;
	public String location_name;
	public String state;
	public String organizer_name;
	public String name;
	public String logo;
	public String privacy;
	public String start_time;
	public int id;
	public CreatorModel _creator;
	public String background_image;

	public RootModel(String topic, ArrayList<Social_linksModel> social_links, String end_time, String type, String schedule_published_on, Call_for_papersModel call_for_papers, CopyrightModel copyright, String timezone, String description, String code_of_conduct, String organizer_description, VersionModel version, String email, String location_name, String state, String organizer_name, String name, String logo, String privacy, String start_time, int id, CreatorModel creator, String background_image) {

		this.topic = topic;
		this.social_links = social_links;
		this.end_time = end_time;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.timezone = timezone;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this._version = version;
		this.email = email;
		this.location_name = location_name;
		this.state = state;
		this.organizer_name = organizer_name;
		this.name = name;
		this.logo = logo;
		this.privacy = privacy;
		this.start_time = start_time;
		this.id = id;
		this._creator = creator;
		this.background_image = background_image;

	}

}