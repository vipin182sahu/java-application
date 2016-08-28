import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String description;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String name;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String email;
	public int id;
	public String type;
	public String organizer_description;
	public String code_of_conduct;
	public String schedule_published_on;
	public String logo;
	public String topic;
	public String timezone;
	public VersionModel _version;
	public String privacy;
	public String organizer_name;

	public RootModel(String background_image, String description, String location_name, ArrayList<Social_linksModel> social_links, String end_time, String name, String start_time, Call_for_papersModel call_for_papers, String state, CreatorModel creator, CopyrightModel copyright, String email, int id, String type, String organizer_description, String code_of_conduct, String schedule_published_on, String logo, String topic, String timezone, VersionModel version, String privacy, String organizer_name) {

		this.background_image = background_image;
		this.description = description;
		this.location_name = location_name;
		this.social_links = social_links;
		this.end_time = end_time;
		this.name = name;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this._creator = creator;
		this._copyright = copyright;
		this.email = email;
		this.id = id;
		this.type = type;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.topic = topic;
		this.timezone = timezone;
		this._version = version;
		this.privacy = privacy;
		this.organizer_name = organizer_name;

	}

}