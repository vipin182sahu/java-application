import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String location_name;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String schedule_published_on;
	public String code_of_conduct;
	public String name;
	public String email;
	public String type;
	public int id;
	public String logo;
	public String organizer_description;
	public String description;
	public CopyrightModel _copyright;
	public String state;
	public String privacy;
	public String topic;
	public String end_time;
	public String background_image;
	public String organizer_name;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String timezone, String location_name, String start_time, ArrayList<Social_linksModel> social_links, VersionModel version, String schedule_published_on, String code_of_conduct, String name, String email, String type, int id, String logo, String organizer_description, String description, CopyrightModel copyright, String state, String privacy, String topic, String end_time, String background_image, String organizer_name, CreatorModel creator, Call_for_papersModel call_for_papers) {

		this.timezone = timezone;
		this.location_name = location_name;
		this.start_time = start_time;
		this.social_links = social_links;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.email = email;
		this.type = type;
		this.id = id;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.description = description;
		this._copyright = copyright;
		this.state = state;
		this.privacy = privacy;
		this.topic = topic;
		this.end_time = end_time;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this._call_for_papers = call_for_papers;

	}

}