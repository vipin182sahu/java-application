import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String privacy;
	public String name;
	public String code_of_conduct;
	public String type;
	public String email;
	public String timezone;
	public CreatorModel _creator;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String location_name;
	public String logo;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public VersionModel _version;
	public String topic;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String state;
	public String description;
	public String organizer_name;

	public RootModel(String start_time, String privacy, String name, String code_of_conduct, String type, String email, String timezone, CreatorModel creator, String end_time, Call_for_papersModel call_for_papers, int id, String location_name, String logo, String background_image, ArrayList<Social_linksModel> social_links, String organizer_description, VersionModel version, String topic, CopyrightModel copyright, String schedule_published_on, String state, String description, String organizer_name) {

		this.start_time = start_time;
		this.privacy = privacy;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.email = email;
		this.timezone = timezone;
		this._creator = creator;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.location_name = location_name;
		this.logo = logo;
		this.background_image = background_image;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this._version = version;
		this.topic = topic;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.description = description;
		this.organizer_name = organizer_name;

	}

}