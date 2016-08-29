import java.util.ArrayList;

class RootModel {

	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String timezone;
	public int id;
	public String end_time;
	public String topic;
	public String email;
	public String location_name;
	public String background_image;
	public String privacy;
	public String description;
	public VersionModel _version;
	public String start_time;
	public String organizer_name;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String type;
	public String state;
	public String code_of_conduct;
	public String name;

	public RootModel(String logo, Call_for_papersModel call_for_papers, String organizer_description, String timezone, int id, String end_time, String topic, String email, String location_name, String background_image, String privacy, String description, VersionModel version, String start_time, String organizer_name, CreatorModel creator, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String schedule_published_on, String type, String state, String code_of_conduct, String name) {

		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.id = id;
		this.end_time = end_time;
		this.topic = topic;
		this.email = email;
		this.location_name = location_name;
		this.background_image = background_image;
		this.privacy = privacy;
		this.description = description;
		this._version = version;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this._copyright = copyright;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.name = name;

	}

}