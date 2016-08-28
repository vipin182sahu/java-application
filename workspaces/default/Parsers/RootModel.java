import java.util.ArrayList;

class RootModel {

	public String type;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String email;
	public String name;
	public String schedule_published_on;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String topic;
	public String location_name;
	public int id;
	public String organizer_description;
	public CreatorModel _creator;
	public VersionModel _version;
	public String end_time;
	public String state;
	public CopyrightModel _copyright;
	public String start_time;
	public String privacy;
	public String background_image;
	public String description;
	public String organizer_name;

	public RootModel(String type, Call_for_papersModel call_for_papers, String logo, String email, String name, String schedule_published_on, String timezone, ArrayList<Social_linksModel> social_links, String code_of_conduct, String topic, String location_name, int id, String organizer_description, CreatorModel creator, VersionModel version, String end_time, String state, CopyrightModel copyright, String start_time, String privacy, String background_image, String description, String organizer_name) {

		this.type = type;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.email = email;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.location_name = location_name;
		this.id = id;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this._version = version;
		this.end_time = end_time;
		this.state = state;
		this._copyright = copyright;
		this.start_time = start_time;
		this.privacy = privacy;
		this.background_image = background_image;
		this.description = description;
		this.organizer_name = organizer_name;

	}

}