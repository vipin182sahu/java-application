import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String privacy;
	public String end_time;
	public String timezone;
	public String logo;
	public CopyrightModel _copyright;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public CreatorModel _creator;
	public String background_image;
	public String topic;
	public String name;
	public String state;
	public String schedule_published_on;
	public String organizer_description;
	public String description;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String email;
	public String code_of_conduct;
	public int id;

	public RootModel(String organizer_name, String privacy, String end_time, String timezone, String logo, CopyrightModel copyright, String type, ArrayList<Social_linksModel> social_links, String start_time, CreatorModel creator, String background_image, String topic, String name, String state, String schedule_published_on, String organizer_description, String description, VersionModel version, Call_for_papersModel call_for_papers, String location_name, String email, String code_of_conduct, int id) {

		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.end_time = end_time;
		this.timezone = timezone;
		this.logo = logo;
		this._copyright = copyright;
		this.type = type;
		this.social_links = social_links;
		this.start_time = start_time;
		this._creator = creator;
		this.background_image = background_image;
		this.topic = topic;
		this.name = name;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.description = description;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.id = id;

	}

}