import java.util.ArrayList;

class RootModel {

	public String state;
	public String code_of_conduct;
	public String schedule_published_on;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String organizer_name;
	public String start_time;
	public int id;
	public String timezone;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public VersionModel _version;
	public String description;
	public String privacy;
	public String logo;
	public String type;
	public String location_name;
	public String background_image;
	public String email;
	public String end_time;
	public String organizer_description;

	public RootModel(String state, String code_of_conduct, String schedule_published_on, String topic, Call_for_papersModel call_for_papers, String name, String organizer_name, String start_time, int id, String timezone, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, CreatorModel creator, VersionModel version, String description, String privacy, String logo, String type, String location_name, String background_image, String email, String end_time, String organizer_description) {

		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.id = id;
		this.timezone = timezone;
		this._copyright = copyright;
		this.social_links = social_links;
		this._creator = creator;
		this._version = version;
		this.description = description;
		this.privacy = privacy;
		this.logo = logo;
		this.type = type;
		this.location_name = location_name;
		this.background_image = background_image;
		this.email = email;
		this.end_time = end_time;
		this.organizer_description = organizer_description;

	}

}