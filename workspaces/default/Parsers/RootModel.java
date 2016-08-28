import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String name;
	public CreatorModel _creator;
	public VersionModel _version;
	public int id;
	public String start_time;
	public String logo;
	public String state;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String type;
	public String code_of_conduct;
	public String topic;
	public String description;
	public String schedule_published_on;
	public String privacy;
	public String email;
	public String organizer_name;
	public String timezone;
	public String end_time;
	public String background_image;

	public RootModel(CopyrightModel copyright, String name, CreatorModel creator, VersionModel version, int id, String start_time, String logo, String state, String location_name, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String organizer_description, String type, String code_of_conduct, String topic, String description, String schedule_published_on, String privacy, String email, String organizer_name, String timezone, String end_time, String background_image) {

		this._copyright = copyright;
		this.name = name;
		this._creator = creator;
		this._version = version;
		this.id = id;
		this.start_time = start_time;
		this.logo = logo;
		this.state = state;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.email = email;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.end_time = end_time;
		this.background_image = background_image;

	}

}