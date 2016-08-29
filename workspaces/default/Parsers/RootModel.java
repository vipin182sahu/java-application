import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String location_name;
	public String name;
	public VersionModel _version;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String topic;
	public String code_of_conduct;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String end_time;
	public String description;
	public String privacy;
	public String schedule_published_on;
	public String timezone;
	public String organizer_description;
	public String organizer_name;
	public String state;
	public CreatorModel _creator;
	public String start_time;
	public int id;

	public RootModel(CopyrightModel copyright, String location_name, String name, VersionModel version, String logo, ArrayList<Social_linksModel> social_links, String email, String topic, String code_of_conduct, String background_image, Call_for_papersModel call_for_papers, String type, String end_time, String description, String privacy, String schedule_published_on, String timezone, String organizer_description, String organizer_name, String state, CreatorModel creator, String start_time, int id) {

		this._copyright = copyright;
		this.location_name = location_name;
		this.name = name;
		this._version = version;
		this.logo = logo;
		this.social_links = social_links;
		this.email = email;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.end_time = end_time;
		this.description = description;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.state = state;
		this._creator = creator;
		this.start_time = start_time;
		this.id = id;

	}

}