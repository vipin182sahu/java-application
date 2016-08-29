import java.util.ArrayList;

class RootModel {

	public String type;
	public String description;
	public String end_time;
	public String organizer_description;
	public String code_of_conduct;
	public String timezone;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String name;
	public VersionModel _version;
	public String start_time;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String schedule_published_on;
	public String email;
	public String topic;
	public String privacy;
	public String logo;
	public String state;
	public String background_image;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String type, String description, String end_time, String organizer_description, String code_of_conduct, String timezone, CopyrightModel copyright, CreatorModel creator, String name, VersionModel version, String start_time, int id, ArrayList<Social_linksModel> social_links, String location_name, String schedule_published_on, String email, String topic, String privacy, String logo, String state, String background_image, String organizer_name, Call_for_papersModel call_for_papers) {

		this.type = type;
		this.description = description;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this._copyright = copyright;
		this._creator = creator;
		this.name = name;
		this._version = version;
		this.start_time = start_time;
		this.id = id;
		this.social_links = social_links;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.topic = topic;
		this.privacy = privacy;
		this.logo = logo;
		this.state = state;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;

	}

}