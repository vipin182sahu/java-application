import java.util.ArrayList;

class RootModel {

	public String logo;
	public String organizer_description;
	public String topic;
	public String start_time;
	public String code_of_conduct;
	public String organizer_name;
	public VersionModel _version;
	public CreatorModel _creator;
	public String privacy;
	public CopyrightModel _copyright;
	public String timezone;
	public String type;
	public String state;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String schedule_published_on;
	public String location_name;
	public String background_image;
	public String description;
	public String end_time;
	public String email;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String logo, String organizer_description, String topic, String start_time, String code_of_conduct, String organizer_name, VersionModel version, CreatorModel creator, String privacy, CopyrightModel copyright, String timezone, String type, String state, int id, ArrayList<Social_linksModel> social_links, String name, String schedule_published_on, String location_name, String background_image, String description, String end_time, String email, Call_for_papersModel call_for_papers) {

		this.logo = logo;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this._version = version;
		this._creator = creator;
		this.privacy = privacy;
		this._copyright = copyright;
		this.timezone = timezone;
		this.type = type;
		this.state = state;
		this.id = id;
		this.social_links = social_links;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.background_image = background_image;
		this.description = description;
		this.end_time = end_time;
		this.email = email;
		this._call_for_papers = call_for_papers;

	}

}