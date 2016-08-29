import java.util.ArrayList;

class RootModel {

	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String privacy;
	public CreatorModel _creator;
	public String logo;
	public VersionModel _version;
	public String end_time;
	public String state;
	public String topic;
	public String schedule_published_on;
	public String email;
	public String organizer_description;
	public String type;
	public int id;
	public String timezone;
	public String code_of_conduct;
	public String start_time;
	public CopyrightModel _copyright;
	public String background_image;

	public RootModel(String name, ArrayList<Social_linksModel> social_links, String organizer_name, String description, Call_for_papersModel call_for_papers, String location_name, String privacy, CreatorModel creator, String logo, VersionModel version, String end_time, String state, String topic, String schedule_published_on, String email, String organizer_description, String type, int id, String timezone, String code_of_conduct, String start_time, CopyrightModel copyright, String background_image) {

		this.name = name;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.privacy = privacy;
		this._creator = creator;
		this.logo = logo;
		this._version = version;
		this.end_time = end_time;
		this.state = state;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.organizer_description = organizer_description;
		this.type = type;
		this.id = id;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this._copyright = copyright;
		this.background_image = background_image;

	}

}