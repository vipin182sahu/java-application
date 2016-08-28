import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String topic;
	public VersionModel _version;
	public String background_image;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String type;
	public String logo;
	public String email;
	public int id;
	public String timezone;
	public String end_time;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String description;
	public String code_of_conduct;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String organizer_description;

	public RootModel(String location_name, String privacy, ArrayList<Social_linksModel> social_links, String state, String topic, VersionModel version, String background_image, String start_time, Call_for_papersModel call_for_papers, String name, String type, String logo, String email, int id, String timezone, String end_time, String organizer_name, CopyrightModel copyright, String description, String code_of_conduct, String schedule_published_on, CreatorModel creator, String organizer_description) {

		this.location_name = location_name;
		this.privacy = privacy;
		this.social_links = social_links;
		this.state = state;
		this.topic = topic;
		this._version = version;
		this.background_image = background_image;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.type = type;
		this.logo = logo;
		this.email = email;
		this.id = id;
		this.timezone = timezone;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.organizer_description = organizer_description;

	}

}