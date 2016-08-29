import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public CreatorModel _creator;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String timezone;
	public String email;
	public String organizer_description;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public VersionModel _version;
	public String background_image;
	public CopyrightModel _copyright;
	public String start_time;
	public String topic;
	public String code_of_conduct;
	public String end_time;
	public String logo;
	public String state;
	public String type;
	public String location_name;
	public int id;

	public RootModel(String organizer_name, CreatorModel creator, String name, ArrayList<Social_linksModel> social_links, String schedule_published_on, String timezone, String email, String organizer_description, String privacy, Call_for_papersModel call_for_papers, String description, VersionModel version, String background_image, CopyrightModel copyright, String start_time, String topic, String code_of_conduct, String end_time, String logo, String state, String type, String location_name, int id) {

		this.organizer_name = organizer_name;
		this._creator = creator;
		this.name = name;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.email = email;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this._version = version;
		this.background_image = background_image;
		this._copyright = copyright;
		this.start_time = start_time;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.logo = logo;
		this.state = state;
		this.type = type;
		this.location_name = location_name;
		this.id = id;

	}

}