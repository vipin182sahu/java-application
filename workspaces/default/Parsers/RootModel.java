import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String end_time;
	public String description;
	public VersionModel _version;
	public String code_of_conduct;
	public String topic;
	public String email;
	public String logo;
	public CreatorModel _creator;
	public String type;
	public String name;
	public String organizer_description;
	public String schedule_published_on;
	public int id;
	public String background_image;
	public String state;
	public String timezone;
	public String location_name;

	public RootModel(String organizer_name, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String privacy, Call_for_papersModel call_for_papers, String start_time, String end_time, String description, VersionModel version, String code_of_conduct, String topic, String email, String logo, CreatorModel creator, String type, String name, String organizer_description, String schedule_published_on, int id, String background_image, String state, String timezone, String location_name) {

		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.social_links = social_links;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.end_time = end_time;
		this.description = description;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.email = email;
		this.logo = logo;
		this._creator = creator;
		this.type = type;
		this.name = name;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.background_image = background_image;
		this.state = state;
		this.timezone = timezone;
		this.location_name = location_name;

	}

}