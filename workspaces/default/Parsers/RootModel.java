import java.util.ArrayList;

class RootModel {

	public String type;
	public String privacy;
	public String end_time;
	public String timezone;
	public VersionModel _version;
	public int id;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String topic;
	public String state;
	public String description;
	public String name;
	public String start_time;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String organizer_description;
	public String schedule_published_on;
	public String email;
	public String background_image;
	public String logo;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String type, String privacy, String end_time, String timezone, VersionModel version, int id, String organizer_name, CopyrightModel copyright, String topic, String state, String description, String name, String start_time, String location_name, ArrayList<Social_linksModel> social_links, String code_of_conduct, CreatorModel creator, String organizer_description, String schedule_published_on, String email, String background_image, String logo, Call_for_papersModel call_for_papers) {

		this.type = type;
		this.privacy = privacy;
		this.end_time = end_time;
		this.timezone = timezone;
		this._version = version;
		this.id = id;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.topic = topic;
		this.state = state;
		this.description = description;
		this.name = name;
		this.start_time = start_time;
		this.location_name = location_name;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.background_image = background_image;
		this.logo = logo;
		this._call_for_papers = call_for_papers;

	}

}