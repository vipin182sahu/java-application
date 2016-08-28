import java.util.ArrayList;

class RootModel {

	public String email;
	public String organizer_description;
	public VersionModel _version;
	public String name;
	public String type;
	public String end_time;
	public String schedule_published_on;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String timezone;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String state;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String location_name;
	public String topic;
	public int id;
	public String background_image;
	public String start_time;
	public String description;

	public RootModel(String email, String organizer_description, VersionModel version, String name, String type, String end_time, String schedule_published_on, CreatorModel creator, CopyrightModel copyright, String timezone, String organizer_name, ArrayList<Social_linksModel> social_links, String code_of_conduct, String state, String privacy, Call_for_papersModel call_for_papers, String logo, String location_name, String topic, int id, String background_image, String start_time, String description) {

		this.email = email;
		this.organizer_description = organizer_description;
		this._version = version;
		this.name = name;
		this.type = type;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this._copyright = copyright;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.location_name = location_name;
		this.topic = topic;
		this.id = id;
		this.background_image = background_image;
		this.start_time = start_time;
		this.description = description;

	}

}