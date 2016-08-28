import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String code_of_conduct;
	public String type;
	public String background_image;
	public String email;
	public String end_time;
	public int id;
	public CopyrightModel _copyright;
	public String logo;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String start_time;
	public VersionModel _version;
	public String timezone;
	public String schedule_published_on;
	public String topic;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String location_name;
	public CreatorModel _creator;
	public String description;

	public RootModel(String organizer_description, String code_of_conduct, String type, String background_image, String email, String end_time, int id, CopyrightModel copyright, String logo, String organizer_name, Call_for_papersModel call_for_papers, String state, String start_time, VersionModel version, String timezone, String schedule_published_on, String topic, String name, ArrayList<Social_linksModel> social_links, String privacy, String location_name, CreatorModel creator, String description) {

		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.background_image = background_image;
		this.email = email;
		this.end_time = end_time;
		this.id = id;
		this._copyright = copyright;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.start_time = start_time;
		this._version = version;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.name = name;
		this.social_links = social_links;
		this.privacy = privacy;
		this.location_name = location_name;
		this._creator = creator;
		this.description = description;

	}

}