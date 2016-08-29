import java.util.ArrayList;

class RootModel {

	public String email;
	public String organizer_description;
	public String description;
	public String start_time;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String timezone;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String privacy;
	public VersionModel _version;
	public String type;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public CreatorModel _creator;
	public String background_image;
	public String logo;
	public String code_of_conduct;
	public String topic;
	public String organizer_name;
	public String name;

	public RootModel(String email, String organizer_description, String description, String start_time, String schedule_published_on, CopyrightModel copyright, String timezone, String end_time, Call_for_papersModel call_for_papers, int id, String privacy, VersionModel version, String type, String state, ArrayList<Social_linksModel> social_links, String location_name, CreatorModel creator, String background_image, String logo, String code_of_conduct, String topic, String organizer_name, String name) {

		this.email = email;
		this.organizer_description = organizer_description;
		this.description = description;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.timezone = timezone;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.privacy = privacy;
		this._version = version;
		this.type = type;
		this.state = state;
		this.social_links = social_links;
		this.location_name = location_name;
		this._creator = creator;
		this.background_image = background_image;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.name = name;

	}

}