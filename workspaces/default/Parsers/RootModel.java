import java.util.ArrayList;

class RootModel {

	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String code_of_conduct;
	public String schedule_published_on;
	public String privacy;
	public String organizer_name;
	public int id;
	public String logo;
	public String topic;
	public CopyrightModel _copyright;
	public String email;
	public VersionModel _version;
	public String organizer_description;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String type;
	public String state;
	public CreatorModel _creator;
	public String start_time;
	public String timezone;
	public String name;

	public RootModel(String end_time, ArrayList<Social_linksModel> social_links, String location_name, String code_of_conduct, String schedule_published_on, String privacy, String organizer_name, int id, String logo, String topic, CopyrightModel copyright, String email, VersionModel version, String organizer_description, String description, Call_for_papersModel call_for_papers, String background_image, String type, String state, CreatorModel creator, String start_time, String timezone, String name) {

		this.end_time = end_time;
		this.social_links = social_links;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.id = id;
		this.logo = logo;
		this.topic = topic;
		this._copyright = copyright;
		this.email = email;
		this._version = version;
		this.organizer_description = organizer_description;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.type = type;
		this.state = state;
		this._creator = creator;
		this.start_time = start_time;
		this.timezone = timezone;
		this.name = name;

	}

}