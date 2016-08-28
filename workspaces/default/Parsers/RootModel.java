import java.util.ArrayList;

class RootModel {

	public String type;
	public String schedule_published_on;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String state;
	public String description;
	public CreatorModel _creator;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String background_image;
	public String organizer_name;
	public String timezone;
	public CopyrightModel _copyright;
	public String location_name;
	public String code_of_conduct;
	public String topic;
	public VersionModel _version;
	public String start_time;
	public String email;
	public String organizer_description;
	public String name;

	public RootModel(String type, String schedule_published_on, String privacy, ArrayList<Social_linksModel> social_links, int id, String state, String description, CreatorModel creator, String logo, Call_for_papersModel call_for_papers, String end_time, String background_image, String organizer_name, String timezone, CopyrightModel copyright, String location_name, String code_of_conduct, String topic, VersionModel version, String start_time, String email, String organizer_description, String name) {

		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.social_links = social_links;
		this.id = id;
		this.state = state;
		this.description = description;
		this._creator = creator;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this._copyright = copyright;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this._version = version;
		this.start_time = start_time;
		this.email = email;
		this.organizer_description = organizer_description;
		this.name = name;

	}

}