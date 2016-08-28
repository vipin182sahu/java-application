import java.util.ArrayList;

class RootModel {

	public String email;
	public String name;
	public VersionModel _version;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String organizer_name;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String background_image;
	public String end_time;
	public String privacy;
	public String timezone;
	public String type;
	public CreatorModel _creator;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String logo;
	public String start_time;
	public String location_name;
	public String code_of_conduct;
	public String organizer_description;

	public RootModel(String email, String name, VersionModel version, String description, ArrayList<Social_linksModel> social_links, int id, String organizer_name, String topic, Call_for_papersModel call_for_papers, String state, String background_image, String end_time, String privacy, String timezone, String type, CreatorModel creator, String schedule_published_on, CopyrightModel copyright, String logo, String start_time, String location_name, String code_of_conduct, String organizer_description) {

		this.email = email;
		this.name = name;
		this._version = version;
		this.description = description;
		this.social_links = social_links;
		this.id = id;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.background_image = background_image;
		this.end_time = end_time;
		this.privacy = privacy;
		this.timezone = timezone;
		this.type = type;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.logo = logo;
		this.start_time = start_time;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;

	}

}