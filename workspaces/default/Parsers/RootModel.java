import java.util.ArrayList;

class RootModel {

	public String name;
	public String start_time;
	public int id;
	public String end_time;
	public String state;
	public String background_image;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public VersionModel _version;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String topic;
	public String timezone;
	public String privacy;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String description;
	public String type;
	public String location_name;

	public RootModel(String name, String start_time, int id, String end_time, String state, String background_image, String organizer_description, Call_for_papersModel call_for_papers, String code_of_conduct, VersionModel version, String organizer_name, CopyrightModel copyright, String topic, String timezone, String privacy, CreatorModel creator, String schedule_published_on, String email, ArrayList<Social_linksModel> social_links, String logo, String description, String type, String location_name) {

		this.name = name;
		this.start_time = start_time;
		this.id = id;
		this.end_time = end_time;
		this.state = state;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.topic = topic;
		this.timezone = timezone;
		this.privacy = privacy;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.social_links = social_links;
		this.logo = logo;
		this.description = description;
		this.type = type;
		this.location_name = location_name;

	}

}