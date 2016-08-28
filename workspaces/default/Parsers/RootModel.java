import java.util.ArrayList;

class RootModel {

	public String email;
	public String logo;
	public String privacy;
	public VersionModel _version;
	public String description;
	public String background_image;
	public String schedule_published_on;
	public String start_time;
	public String organizer_description;
	public String timezone;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String location_name;
	public String organizer_name;
	public String code_of_conduct;
	public String state;
	public String topic;
	public int id;
	public CopyrightModel _copyright;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String name;

	public RootModel(String email, String logo, String privacy, VersionModel version, String description, String background_image, String schedule_published_on, String start_time, String organizer_description, String timezone, CreatorModel creator, Call_for_papersModel call_for_papers, String type, String location_name, String organizer_name, String code_of_conduct, String state, String topic, int id, CopyrightModel copyright, String end_time, ArrayList<Social_linksModel> social_links, String name) {

		this.email = email;
		this.logo = logo;
		this.privacy = privacy;
		this._version = version;
		this.description = description;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.topic = topic;
		this.id = id;
		this._copyright = copyright;
		this.end_time = end_time;
		this.social_links = social_links;
		this.name = name;

	}

}