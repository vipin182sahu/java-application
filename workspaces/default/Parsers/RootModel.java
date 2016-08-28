import java.util.ArrayList;

class RootModel {

	public String logo;
	public String description;
	public String location_name;
	public String organizer_description;
	public String topic;
	public String state;
	public VersionModel _version;
	public String timezone;
	public String email;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String start_time;
	public String privacy;
	public String name;
	public int id;
	public String end_time;
	public CreatorModel _creator;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String schedule_published_on;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String logo, String description, String location_name, String organizer_description, String topic, String state, VersionModel version, String timezone, String email, String organizer_name, CopyrightModel copyright, String start_time, String privacy, String name, int id, String end_time, CreatorModel creator, String background_image, ArrayList<Social_linksModel> social_links, String type, String schedule_published_on, String code_of_conduct, Call_for_papersModel call_for_papers) {

		this.logo = logo;
		this.description = description;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.state = state;
		this._version = version;
		this.timezone = timezone;
		this.email = email;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.start_time = start_time;
		this.privacy = privacy;
		this.name = name;
		this.id = id;
		this.end_time = end_time;
		this._creator = creator;
		this.background_image = background_image;
		this.social_links = social_links;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;

	}

}