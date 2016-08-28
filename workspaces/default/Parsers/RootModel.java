import java.util.ArrayList;

class RootModel {

	public String topic;
	public String organizer_name;
	public String privacy;
	public CreatorModel _creator;
	public int id;
	public String description;
	public String background_image;
	public CopyrightModel _copyright;
	public String type;
	public String location_name;
	public VersionModel _version;
	public String start_time;
	public String timezone;
	public String logo;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public String code_of_conduct;
	public String email;
	public String organizer_description;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String name;

	public RootModel(String topic, String organizer_name, String privacy, CreatorModel creator, int id, String description, String background_image, CopyrightModel copyright, String type, String location_name, VersionModel version, String start_time, String timezone, String logo, String end_time, Call_for_papersModel call_for_papers, String schedule_published_on, String code_of_conduct, String email, String organizer_description, String state, ArrayList<Social_linksModel> social_links, String name) {

		this.topic = topic;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this._creator = creator;
		this.id = id;
		this.description = description;
		this.background_image = background_image;
		this._copyright = copyright;
		this.type = type;
		this.location_name = location_name;
		this._version = version;
		this.start_time = start_time;
		this.timezone = timezone;
		this.logo = logo;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.organizer_description = organizer_description;
		this.state = state;
		this.social_links = social_links;
		this.name = name;

	}

}