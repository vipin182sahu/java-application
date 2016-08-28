import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String logo;
	public String timezone;
	public String topic;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String type;
	public String start_time;
	public int id;
	public String code_of_conduct;
	public VersionModel _version;
	public String email;
	public String end_time;
	public CreatorModel _creator;
	public String description;
	public String state;
	public String location_name;
	public String organizer_name;
	public String name;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;

	public RootModel(String background_image, String logo, String timezone, String topic, String schedule_published_on, CopyrightModel copyright, String type, String start_time, int id, String code_of_conduct, VersionModel version, String email, String end_time, CreatorModel creator, String description, String state, String location_name, String organizer_name, String name, String privacy, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String organizer_description) {

		this.background_image = background_image;
		this.logo = logo;
		this.timezone = timezone;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.type = type;
		this.start_time = start_time;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.email = email;
		this.end_time = end_time;
		this._creator = creator;
		this.description = description;
		this.state = state;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.name = name;
		this.privacy = privacy;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;

	}

}