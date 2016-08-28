import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String location_name;
	public String description;
	public String privacy;
	public String timezone;
	public String start_time;
	public VersionModel _version;
	public String logo;
	public String state;
	public String email;
	public String organizer_name;
	public String type;
	public String topic;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String background_image;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String name;

	public RootModel(String end_time, String code_of_conduct, Call_for_papersModel call_for_papers, CopyrightModel copyright, String location_name, String description, String privacy, String timezone, String start_time, VersionModel version, String logo, String state, String email, String organizer_name, String type, String topic, String organizer_description, ArrayList<Social_linksModel> social_links, int id, String background_image, String schedule_published_on, CreatorModel creator, String name) {

		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.location_name = location_name;
		this.description = description;
		this.privacy = privacy;
		this.timezone = timezone;
		this.start_time = start_time;
		this._version = version;
		this.logo = logo;
		this.state = state;
		this.email = email;
		this.organizer_name = organizer_name;
		this.type = type;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.id = id;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.name = name;

	}

}