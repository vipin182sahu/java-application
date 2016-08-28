import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String description;
	public String topic;
	public String start_time;
	public String location_name;
	public String background_image;
	public String organizer_name;
	public String email;
	public CopyrightModel _copyright;
	public String end_time;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String timezone;
	public String schedule_published_on;
	public String code_of_conduct;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String type;
	public String organizer_description;
	public String logo;
	public String name;

	public RootModel(String privacy, String description, String topic, String start_time, String location_name, String background_image, String organizer_name, String email, CopyrightModel copyright, String end_time, CreatorModel creator, ArrayList<Social_linksModel> social_links, VersionModel version, String timezone, String schedule_published_on, String code_of_conduct, int id, Call_for_papersModel call_for_papers, String state, String type, String organizer_description, String logo, String name) {

		this.privacy = privacy;
		this.description = description;
		this.topic = topic;
		this.start_time = start_time;
		this.location_name = location_name;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.email = email;
		this._copyright = copyright;
		this.end_time = end_time;
		this._creator = creator;
		this.social_links = social_links;
		this._version = version;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.type = type;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this.name = name;

	}

}