import java.util.ArrayList;

class RootModel {

	public String description;
	public VersionModel _version;
	public String code_of_conduct;
	public String organizer_description;
	public String schedule_published_on;
	public String start_time;
	public String state;
	public String background_image;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String organizer_name;
	public String logo;
	public String privacy;
	public String name;
	public CopyrightModel _copyright;
	public String type;
	public String end_time;
	public String topic;
	public int id;

	public RootModel(String description, VersionModel version, String code_of_conduct, String organizer_description, String schedule_published_on, String start_time, String state, String background_image, String timezone, ArrayList<Social_linksModel> social_links, String email, String location_name, Call_for_papersModel call_for_papers, CreatorModel creator, String organizer_name, String logo, String privacy, String name, CopyrightModel copyright, String type, String end_time, String topic, int id) {

		this.description = description;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.state = state;
		this.background_image = background_image;
		this.timezone = timezone;
		this.social_links = social_links;
		this.email = email;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.privacy = privacy;
		this.name = name;
		this._copyright = copyright;
		this.type = type;
		this.end_time = end_time;
		this.topic = topic;
		this.id = id;

	}

}