import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String start_time;
	public String type;
	public String state;
	public CopyrightModel _copyright;
	public String topic;
	public String schedule_published_on;
	public String code_of_conduct;
	public String location_name;
	public String logo;
	public String name;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public CreatorModel _creator;
	public String email;
	public String background_image;
	public String end_time;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public VersionModel _version;
	public String organizer_name;

	public RootModel(String organizer_description, String start_time, String type, String state, CopyrightModel copyright, String topic, String schedule_published_on, String code_of_conduct, String location_name, String logo, String name, String privacy, ArrayList<Social_linksModel> social_links, String timezone, CreatorModel creator, String email, String background_image, String end_time, int id, Call_for_papersModel call_for_papers, String description, VersionModel version, String organizer_name) {

		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.type = type;
		this.state = state;
		this._copyright = copyright;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.logo = logo;
		this.name = name;
		this.privacy = privacy;
		this.social_links = social_links;
		this.timezone = timezone;
		this._creator = creator;
		this.email = email;
		this.background_image = background_image;
		this.end_time = end_time;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this._version = version;
		this.organizer_name = organizer_name;

	}

}