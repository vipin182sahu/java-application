import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String privacy;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String description;
	public VersionModel _version;
	public String state;
	public String start_time;
	public String logo;
	public int id;
	public String location_name;
	public String topic;
	public String timezone;
	public String email;
	public String code_of_conduct;
	public String end_time;
	public String type;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String name;
	public String background_image;

	public RootModel(String organizer_description, String privacy, String organizer_name, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String description, VersionModel version, String state, String start_time, String logo, int id, String location_name, String topic, String timezone, String email, String code_of_conduct, String end_time, String type, CreatorModel creator, String schedule_published_on, String name, String background_image) {

		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this._copyright = copyright;
		this.description = description;
		this._version = version;
		this.state = state;
		this.start_time = start_time;
		this.logo = logo;
		this.id = id;
		this.location_name = location_name;
		this.topic = topic;
		this.timezone = timezone;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.type = type;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.background_image = background_image;

	}

}