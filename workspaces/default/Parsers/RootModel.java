import java.util.ArrayList;

class RootModel {

	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public String organizer_description;
	public String logo;
	public CopyrightModel _copyright;
	public String name;
	public String code_of_conduct;
	public VersionModel _version;
	public String state;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String type;
	public String email;
	public String topic;
	public String schedule_published_on;
	public CreatorModel _creator;
	public int id;
	public String timezone;
	public String end_time;
	public String privacy;
	public String organizer_name;

	public RootModel(String location_name, Call_for_papersModel call_for_papers, String description, String organizer_description, String logo, CopyrightModel copyright, String name, String code_of_conduct, VersionModel version, String state, String background_image, ArrayList<Social_linksModel> social_links, String start_time, String type, String email, String topic, String schedule_published_on, CreatorModel creator, int id, String timezone, String end_time, String privacy, String organizer_name) {

		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this._copyright = copyright;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.state = state;
		this.background_image = background_image;
		this.social_links = social_links;
		this.start_time = start_time;
		this.type = type;
		this.email = email;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.id = id;
		this.timezone = timezone;
		this.end_time = end_time;
		this.privacy = privacy;
		this.organizer_name = organizer_name;

	}

}