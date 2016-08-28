import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String privacy;
	public CreatorModel _creator;
	public String location_name;
	public String timezone;
	public String logo;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public int id;
	public CopyrightModel _copyright;
	public String description;
	public String topic;
	public String state;
	public String schedule_published_on;
	public String end_time;
	public VersionModel _version;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String organizer_name;
	public String type;
	public String name;

	public RootModel(String background_image, String privacy, CreatorModel creator, String location_name, String timezone, String logo, String email, Call_for_papersModel call_for_papers, String code_of_conduct, int id, CopyrightModel copyright, String description, String topic, String state, String schedule_published_on, String end_time, VersionModel version, String start_time, ArrayList<Social_linksModel> social_links, String organizer_description, String organizer_name, String type, String name) {

		this.background_image = background_image;
		this.privacy = privacy;
		this._creator = creator;
		this.location_name = location_name;
		this.timezone = timezone;
		this.logo = logo;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this._copyright = copyright;
		this.description = description;
		this.topic = topic;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this._version = version;
		this.start_time = start_time;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.type = type;
		this.name = name;

	}

}