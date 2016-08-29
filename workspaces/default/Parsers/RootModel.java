import java.util.ArrayList;

class RootModel {

	public int id;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String end_time;
	public VersionModel _version;
	public String email;
	public String code_of_conduct;
	public String location_name;
	public String name;
	public String privacy;
	public String organizer_name;
	public String organizer_description;
	public CreatorModel _creator;
	public String logo;
	public String description;
	public String type;
	public String start_time;
	public String timezone;
	public String state;
	public Call_for_papersModel _call_for_papers;

	public RootModel(int id, String background_image, ArrayList<Social_linksModel> social_links, String topic, String schedule_published_on, CopyrightModel copyright, String end_time, VersionModel version, String email, String code_of_conduct, String location_name, String name, String privacy, String organizer_name, String organizer_description, CreatorModel creator, String logo, String description, String type, String start_time, String timezone, String state, Call_for_papersModel call_for_papers) {

		this.id = id;
		this.background_image = background_image;
		this.social_links = social_links;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.end_time = end_time;
		this._version = version;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.name = name;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.logo = logo;
		this.description = description;
		this.type = type;
		this.start_time = start_time;
		this.timezone = timezone;
		this.state = state;
		this._call_for_papers = call_for_papers;

	}

}