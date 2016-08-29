import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String background_image;
	public VersionModel _version;
	public String topic;
	public String email;
	public String end_time;
	public String code_of_conduct;
	public String name;
	public CreatorModel _creator;
	public String description;
	public String organizer_description;
	public String schedule_published_on;
	public String location_name;
	public String timezone;
	public String organizer_name;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String type;
	public String logo;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public int id;

	public RootModel(CopyrightModel copyright, String background_image, VersionModel version, String topic, String email, String end_time, String code_of_conduct, String name, CreatorModel creator, String description, String organizer_description, String schedule_published_on, String location_name, String timezone, String organizer_name, String start_time, Call_for_papersModel call_for_papers, String privacy, String type, String logo, String state, ArrayList<Social_linksModel> social_links, int id) {

		this._copyright = copyright;
		this.background_image = background_image;
		this._version = version;
		this.topic = topic;
		this.email = email;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this._creator = creator;
		this.description = description;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.type = type;
		this.logo = logo;
		this.state = state;
		this.social_links = social_links;
		this.id = id;

	}

}