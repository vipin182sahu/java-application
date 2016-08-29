import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String schedule_published_on;
	public String state;
	public String logo;
	public String organizer_description;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String code_of_conduct;
	public String organizer_name;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String privacy;
	public String start_time;
	public String name;
	public String timezone;
	public String topic;
	public String location_name;
	public String email;
	public String end_time;
	public String description;

	public RootModel(String background_image, String schedule_published_on, String state, String logo, String organizer_description, int id, ArrayList<Social_linksModel> social_links, CreatorModel creator, Call_for_papersModel call_for_papers, String type, String code_of_conduct, String organizer_name, CopyrightModel copyright, VersionModel version, String privacy, String start_time, String name, String timezone, String topic, String location_name, String email, String end_time, String description) {

		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.id = id;
		this.social_links = social_links;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this._version = version;
		this.privacy = privacy;
		this.start_time = start_time;
		this.name = name;
		this.timezone = timezone;
		this.topic = topic;
		this.location_name = location_name;
		this.email = email;
		this.end_time = end_time;
		this.description = description;

	}

}