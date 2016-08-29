import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String email;
	public String topic;
	public String organizer_description;
	public String schedule_published_on;
	public String logo;
	public String timezone;
	public String end_time;
	public String background_image;
	public String description;
	public String state;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String start_time;
	public VersionModel _version;
	public String location_name;
	public String organizer_name;
	public String privacy;
	public CreatorModel _creator;
	public String name;

	public RootModel(CopyrightModel copyright, String code_of_conduct, String email, String topic, String organizer_description, String schedule_published_on, String logo, String timezone, String end_time, String background_image, String description, String state, String type, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, int id, String start_time, VersionModel version, String location_name, String organizer_name, String privacy, CreatorModel creator, String name) {

		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.timezone = timezone;
		this.end_time = end_time;
		this.background_image = background_image;
		this.description = description;
		this.state = state;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.id = id;
		this.start_time = start_time;
		this._version = version;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this._creator = creator;
		this.name = name;

	}

}