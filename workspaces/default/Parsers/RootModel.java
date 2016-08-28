import java.util.ArrayList;

class RootModel {

	public String logo;
	public String location_name;
	public String end_time;
	public VersionModel _version;
	public CreatorModel _creator;
	public String state;
	public String description;
	public String organizer_description;
	public CopyrightModel _copyright;
	public String email;
	public String start_time;
	public String background_image;
	public String code_of_conduct;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String privacy;
	public int id;
	public String name;
	public String type;
	public String organizer_name;

	public RootModel(String logo, String location_name, String end_time, VersionModel version, CreatorModel creator, String state, String description, String organizer_description, CopyrightModel copyright, String email, String start_time, String background_image, String code_of_conduct, String schedule_published_on, Call_for_papersModel call_for_papers, String topic, ArrayList<Social_linksModel> social_links, String timezone, String privacy, int id, String name, String type, String organizer_name) {

		this.logo = logo;
		this.location_name = location_name;
		this.end_time = end_time;
		this._version = version;
		this._creator = creator;
		this.state = state;
		this.description = description;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.email = email;
		this.start_time = start_time;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.social_links = social_links;
		this.timezone = timezone;
		this.privacy = privacy;
		this.id = id;
		this.name = name;
		this.type = type;
		this.organizer_name = organizer_name;

	}

}