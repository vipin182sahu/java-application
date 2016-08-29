import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String start_time;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String type;
	public String end_time;
	public String email;
	public String state;
	public String topic;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String privacy;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String organizer_description;
	public String code_of_conduct;
	public String description;
	public String background_image;
	public String timezone;
	public int id;
	public String location_name;

	public RootModel(String schedule_published_on, String start_time, String name, ArrayList<Social_linksModel> social_links, VersionModel version, String type, String end_time, String email, String state, String topic, String logo, Call_for_papersModel call_for_papers, CreatorModel creator, String privacy, CopyrightModel copyright, String organizer_name, String organizer_description, String code_of_conduct, String description, String background_image, String timezone, int id, String location_name) {

		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.name = name;
		this.social_links = social_links;
		this._version = version;
		this.type = type;
		this.end_time = end_time;
		this.email = email;
		this.state = state;
		this.topic = topic;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.privacy = privacy;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.background_image = background_image;
		this.timezone = timezone;
		this.id = id;
		this.location_name = location_name;

	}

}