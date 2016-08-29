import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String privacy;
	public String background_image;
	public String end_time;
	public String organizer_name;
	public String topic;
	public String schedule_published_on;
	public String logo;
	public String code_of_conduct;
	public String name;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String timezone;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public int id;
	public String start_time;
	public String description;
	public String type;
	public String organizer_description;

	public RootModel(String location_name, String privacy, String background_image, String end_time, String organizer_name, String topic, String schedule_published_on, String logo, String code_of_conduct, String name, VersionModel version, CopyrightModel copyright, CreatorModel creator, String timezone, String state, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String email, int id, String start_time, String description, String type, String organizer_description) {

		this.location_name = location_name;
		this.privacy = privacy;
		this.background_image = background_image;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this._version = version;
		this._copyright = copyright;
		this._creator = creator;
		this.timezone = timezone;
		this.state = state;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.id = id;
		this.start_time = start_time;
		this.description = description;
		this.type = type;
		this.organizer_description = organizer_description;

	}

}