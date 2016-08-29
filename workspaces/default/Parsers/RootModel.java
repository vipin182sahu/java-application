import java.util.ArrayList;

class RootModel {

	public String type;
	public String organizer_name;
	public String schedule_published_on;
	public String background_image;
	public String privacy;
	public String topic;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String start_time;
	public String end_time;
	public String state;
	public String timezone;
	public String email;
	public VersionModel _version;
	public String organizer_description;
	public CopyrightModel _copyright;
	public int id;
	public String name;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String location_name;

	public RootModel(String type, String organizer_name, String schedule_published_on, String background_image, String privacy, String topic, String description, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String logo, String start_time, String end_time, String state, String timezone, String email, VersionModel version, String organizer_description, CopyrightModel copyright, int id, String name, String code_of_conduct, CreatorModel creator, String location_name) {

		this.type = type;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.privacy = privacy;
		this.topic = topic;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.logo = logo;
		this.start_time = start_time;
		this.end_time = end_time;
		this.state = state;
		this.timezone = timezone;
		this.email = email;
		this._version = version;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.id = id;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.location_name = location_name;

	}

}