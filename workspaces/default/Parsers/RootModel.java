import java.util.ArrayList;

class RootModel {

	public String email;
	public String end_time;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String privacy;
	public String schedule_published_on;
	public String description;
	public String background_image;
	public String logo;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public VersionModel _version;
	public String location_name;
	public String organizer_name;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String state;
	public String start_time;
	public String topic;
	public String timezone;
	public String name;

	public RootModel(String email, String end_time, String type, Call_for_papersModel call_for_papers, int id, String privacy, String schedule_published_on, String description, String background_image, String logo, CopyrightModel copyright, CreatorModel creator, VersionModel version, String location_name, String organizer_name, String organizer_description, ArrayList<Social_linksModel> social_links, String code_of_conduct, String state, String start_time, String topic, String timezone, String name) {

		this.email = email;
		this.end_time = end_time;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.background_image = background_image;
		this.logo = logo;
		this._copyright = copyright;
		this._creator = creator;
		this._version = version;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.start_time = start_time;
		this.topic = topic;
		this.timezone = timezone;
		this.name = name;

	}

}