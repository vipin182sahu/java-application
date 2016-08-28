import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String description;
	public String organizer_description;
	public String code_of_conduct;
	public String organizer_name;
	public String background_image;
	public String email;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public VersionModel _version;
	public String timezone;
	public String topic;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String start_time;
	public String privacy;
	public String logo;
	public CopyrightModel _copyright;
	public String type;
	public String state;
	public String location_name;

	public RootModel(String end_time, String description, String organizer_description, String code_of_conduct, String organizer_name, String background_image, String email, int id, ArrayList<Social_linksModel> social_links, String schedule_published_on, VersionModel version, String timezone, String topic, CreatorModel creator, Call_for_papersModel call_for_papers, String name, String start_time, String privacy, String logo, CopyrightModel copyright, String type, String state, String location_name) {

		this.end_time = end_time;
		this.description = description;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.email = email;
		this.id = id;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.timezone = timezone;
		this.topic = topic;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.start_time = start_time;
		this.privacy = privacy;
		this.logo = logo;
		this._copyright = copyright;
		this.type = type;
		this.state = state;
		this.location_name = location_name;

	}

}