import java.util.ArrayList;

class RootModel {

	public int id;
	public String schedule_published_on;
	public String description;
	public String start_time;
	public String logo;
	public String organizer_name;
	public String type;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String privacy;
	public String background_image;
	public String topic;
	public String email;
	public String state;
	public String timezone;
	public String name;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String location_name;
	public Call_for_papersModel _call_for_papers;

	public RootModel(int id, String schedule_published_on, String description, String start_time, String logo, String organizer_name, String type, CopyrightModel copyright, String organizer_description, String privacy, String background_image, String topic, String email, String state, String timezone, String name, String code_of_conduct, CreatorModel creator, String end_time, ArrayList<Social_linksModel> social_links, VersionModel version, String location_name, Call_for_papersModel call_for_papers) {

		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.start_time = start_time;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this.type = type;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.background_image = background_image;
		this.topic = topic;
		this.email = email;
		this.state = state;
		this.timezone = timezone;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.end_time = end_time;
		this.social_links = social_links;
		this._version = version;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;

	}

}