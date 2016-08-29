import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String start_time;
	public String timezone;
	public String organizer_name;
	public String name;
	public String state;
	public String type;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public int id;
	public CopyrightModel _copyright;
	public String topic;
	public String email;
	public String organizer_description;
	public String description;
	public String schedule_published_on;
	public String logo;
	public CreatorModel _creator;
	public String location_name;

	public RootModel(String code_of_conduct, String privacy, Call_for_papersModel call_for_papers, VersionModel version, String start_time, String timezone, String organizer_name, String name, String state, String type, String end_time, ArrayList<Social_linksModel> social_links, String background_image, int id, CopyrightModel copyright, String topic, String email, String organizer_description, String description, String schedule_published_on, String logo, CreatorModel creator, String location_name) {

		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.start_time = start_time;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.name = name;
		this.state = state;
		this.type = type;
		this.end_time = end_time;
		this.social_links = social_links;
		this.background_image = background_image;
		this.id = id;
		this._copyright = copyright;
		this.topic = topic;
		this.email = email;
		this.organizer_description = organizer_description;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this._creator = creator;
		this.location_name = location_name;

	}

}