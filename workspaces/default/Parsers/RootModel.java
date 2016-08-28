import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String schedule_published_on;
	public String location_name;
	public String end_time;
	public String state;
	public String logo;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String code_of_conduct;
	public String organizer_name;
	public String name;
	public int id;
	public String email;
	public String description;
	public String background_image;
	public String timezone;
	public String topic;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;

	public RootModel(String start_time, String schedule_published_on, String location_name, String end_time, String state, String logo, VersionModel version, ArrayList<Social_linksModel> social_links, String privacy, String code_of_conduct, String organizer_name, String name, int id, String email, String description, String background_image, String timezone, String topic, CopyrightModel copyright, CreatorModel creator, String type, Call_for_papersModel call_for_papers, String organizer_description) {

		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.end_time = end_time;
		this.state = state;
		this.logo = logo;
		this._version = version;
		this.social_links = social_links;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.name = name;
		this.id = id;
		this.email = email;
		this.description = description;
		this.background_image = background_image;
		this.timezone = timezone;
		this.topic = topic;
		this._copyright = copyright;
		this._creator = creator;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;

	}

}