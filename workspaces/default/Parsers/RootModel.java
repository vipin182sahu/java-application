import java.util.ArrayList;

class RootModel {

	public String logo;
	public String background_image;
	public String type;
	public String organizer_description;
	public String location_name;
	public CreatorModel _creator;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String topic;
	public String state;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public VersionModel _version;
	public String description;
	public String timezone;
	public String privacy;
	public int id;
	public String name;
	public String email;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;

	public RootModel(String logo, String background_image, String type, String organizer_description, String location_name, CreatorModel creator, String code_of_conduct, CopyrightModel copyright, String topic, String state, String start_time, ArrayList<Social_linksModel> social_links, String end_time, VersionModel version, String description, String timezone, String privacy, int id, String name, String email, String schedule_published_on, Call_for_papersModel call_for_papers, String organizer_name) {

		this.logo = logo;
		this.background_image = background_image;
		this.type = type;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.topic = topic;
		this.state = state;
		this.start_time = start_time;
		this.social_links = social_links;
		this.end_time = end_time;
		this._version = version;
		this.description = description;
		this.timezone = timezone;
		this.privacy = privacy;
		this.id = id;
		this.name = name;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;

	}

}