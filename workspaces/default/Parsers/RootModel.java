import java.util.ArrayList;

class RootModel {

	public String state;
	public String type;
	public String location_name;
	public int id;
	public String code_of_conduct;
	public String start_time;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public CopyrightModel _copyright;
	public String end_time;
	public String email;
	public String timezone;
	public VersionModel _version;
	public String privacy;
	public String schedule_published_on;
	public String organizer_description;
	public String topic;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String description;
	public String organizer_name;

	public RootModel(String state, String type, String location_name, int id, String code_of_conduct, String start_time, String background_image, Call_for_papersModel call_for_papers, String name, CopyrightModel copyright, String end_time, String email, String timezone, VersionModel version, String privacy, String schedule_published_on, String organizer_description, String topic, String logo, ArrayList<Social_linksModel> social_links, CreatorModel creator, String description, String organizer_name) {

		this.state = state;
		this.type = type;
		this.location_name = location_name;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this._copyright = copyright;
		this.end_time = end_time;
		this.email = email;
		this.timezone = timezone;
		this._version = version;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.logo = logo;
		this.social_links = social_links;
		this._creator = creator;
		this.description = description;
		this.organizer_name = organizer_name;

	}

}