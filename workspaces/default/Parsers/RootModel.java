import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String logo;
	public String end_time;
	public CreatorModel _creator;
	public int id;
	public String code_of_conduct;
	public String organizer_name;
	public String privacy;
	public String state;
	public String type;
	public VersionModel _version;
	public String background_image;
	public String organizer_description;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public String topic;
	public String timezone;
	public String location_name;

	public RootModel(String schedule_published_on, CopyrightModel copyright, String logo, String end_time, CreatorModel creator, int id, String code_of_conduct, String organizer_name, String privacy, String state, String type, VersionModel version, String background_image, String organizer_description, String email, ArrayList<Social_linksModel> social_links, String start_time, String name, Call_for_papersModel call_for_papers, String description, String topic, String timezone, String location_name) {

		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.logo = logo;
		this.end_time = end_time;
		this._creator = creator;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.state = state;
		this.type = type;
		this._version = version;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.email = email;
		this.social_links = social_links;
		this.start_time = start_time;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this.topic = topic;
		this.timezone = timezone;
		this.location_name = location_name;

	}

}