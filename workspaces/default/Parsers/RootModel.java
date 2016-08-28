import java.util.ArrayList;

class RootModel {

	public String name;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String topic;
	public String schedule_published_on;
	public String organizer_name;
	public String background_image;
	public CopyrightModel _copyright;
	public String privacy;
	public String timezone;
	public String location_name;
	public VersionModel _version;
	public String logo;
	public String email;
	public CreatorModel _creator;
	public int id;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String organizer_description;
	public String end_time;
	public String description;

	public RootModel(String name, String type, Call_for_papersModel call_for_papers, String start_time, String topic, String schedule_published_on, String organizer_name, String background_image, CopyrightModel copyright, String privacy, String timezone, String location_name, VersionModel version, String logo, String email, CreatorModel creator, int id, String state, ArrayList<Social_linksModel> social_links, String code_of_conduct, String organizer_description, String end_time, String description) {

		this.name = name;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this._copyright = copyright;
		this.privacy = privacy;
		this.timezone = timezone;
		this.location_name = location_name;
		this._version = version;
		this.logo = logo;
		this.email = email;
		this._creator = creator;
		this.id = id;
		this.state = state;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.description = description;

	}

}