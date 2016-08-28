import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String start_time;
	public String timezone;
	public int id;
	public String topic;
	public String schedule_published_on;
	public String end_time;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String description;
	public String type;
	public String location_name;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String state;
	public String privacy;
	public String logo;
	public String organizer_name;
	public String name;

	public RootModel(String code_of_conduct, String start_time, String timezone, int id, String topic, String schedule_published_on, String end_time, CreatorModel creator, Call_for_papersModel call_for_papers, String email, String description, String type, String location_name, String organizer_description, ArrayList<Social_linksModel> social_links, String background_image, CopyrightModel copyright, VersionModel version, String state, String privacy, String logo, String organizer_name, String name) {

		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.timezone = timezone;
		this.id = id;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.description = description;
		this.type = type;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.background_image = background_image;
		this._copyright = copyright;
		this._version = version;
		this.state = state;
		this.privacy = privacy;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this.name = name;

	}

}