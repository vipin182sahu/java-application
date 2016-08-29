import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String timezone;
	public String description;
	public String organizer_description;
	public String background_image;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String start_time;
	public String code_of_conduct;
	public String privacy;
	public CreatorModel _creator;
	public String logo;
	public String topic;
	public VersionModel _version;
	public String type;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public CopyrightModel _copyright;
	public String organizer_name;
	public int id;
	public String location_name;

	public RootModel(String schedule_published_on, String timezone, String description, String organizer_description, String background_image, String name, Call_for_papersModel call_for_papers, String end_time, String start_time, String code_of_conduct, String privacy, CreatorModel creator, String logo, String topic, VersionModel version, String type, String state, ArrayList<Social_linksModel> social_links, String email, CopyrightModel copyright, String organizer_name, int id, String location_name) {

		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.description = description;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this._creator = creator;
		this.logo = logo;
		this.topic = topic;
		this._version = version;
		this.type = type;
		this.state = state;
		this.social_links = social_links;
		this.email = email;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.id = id;
		this.location_name = location_name;

	}

}