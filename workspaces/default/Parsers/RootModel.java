import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String privacy;
	public String code_of_conduct;
	public String topic;
	public String location_name;
	public int id;
	public String logo;
	public String start_time;
	public String state;
	public String type;
	public String end_time;
	public String timezone;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String email;
	public String description;
	public VersionModel _version;
	public String background_image;
	public String name;

	public RootModel(String schedule_published_on, String organizer_name, CopyrightModel copyright, String privacy, String code_of_conduct, String topic, String location_name, int id, String logo, String start_time, String state, String type, String end_time, String timezone, String organizer_description, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, CreatorModel creator, String email, String description, VersionModel version, String background_image, String name) {

		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.location_name = location_name;
		this.id = id;
		this.logo = logo;
		this.start_time = start_time;
		this.state = state;
		this.type = type;
		this.end_time = end_time;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.email = email;
		this.description = description;
		this._version = version;
		this.background_image = background_image;
		this.name = name;

	}

}