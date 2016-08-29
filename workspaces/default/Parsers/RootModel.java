import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String state;
	public String privacy;
	public String background_image;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String description;
	public String name;
	public int id;
	public String organizer_name;
	public String email;
	public String type;
	public String topic;
	public String end_time;
	public String timezone;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String organizer_description;
	public String start_time;
	public String code_of_conduct;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String schedule_published_on, String state, String privacy, String background_image, CreatorModel creator, CopyrightModel copyright, String description, String name, int id, String organizer_name, String email, String type, String topic, String end_time, String timezone, String location_name, ArrayList<Social_linksModel> social_links, String logo, String organizer_description, String start_time, String code_of_conduct, VersionModel version, Call_for_papersModel call_for_papers) {

		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.privacy = privacy;
		this.background_image = background_image;
		this._creator = creator;
		this._copyright = copyright;
		this.description = description;
		this.name = name;
		this.id = id;
		this.organizer_name = organizer_name;
		this.email = email;
		this.type = type;
		this.topic = topic;
		this.end_time = end_time;
		this.timezone = timezone;
		this.location_name = location_name;
		this.social_links = social_links;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this._call_for_papers = call_for_papers;

	}

}