import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String code_of_conduct;
	public String description;
	public String email;
	public String timezone;
	public String type;
	public String start_time;
	public String state;
	public VersionModel _version;
	public String background_image;
	public CreatorModel _creator;
	public String organizer_name;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String location_name;
	public String organizer_description;
	public String topic;
	public int id;
	public String schedule_published_on;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String name;

	public RootModel(String privacy, String code_of_conduct, String description, String email, String timezone, String type, String start_time, String state, VersionModel version, String background_image, CreatorModel creator, String organizer_name, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String end_time, String location_name, String organizer_description, String topic, int id, String schedule_published_on, String logo, Call_for_papersModel call_for_papers, String name) {

		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.email = email;
		this.timezone = timezone;
		this.type = type;
		this.start_time = start_time;
		this.state = state;
		this._version = version;
		this.background_image = background_image;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.social_links = social_links;
		this.end_time = end_time;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.name = name;

	}

}