import java.util.ArrayList;

class RootModel {

	public String state;
	public String timezone;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String privacy;
	public String end_time;
	public String start_time;
	public String description;
	public String logo;
	public String organizer_name;
	public String name;
	public String topic;
	public VersionModel _version;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String type;
	public String background_image;
	public String email;
	public int id;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;

	public RootModel(String state, String timezone, CopyrightModel copyright, String code_of_conduct, String privacy, String end_time, String start_time, String description, String logo, String organizer_name, String name, String topic, VersionModel version, CreatorModel creator, String schedule_published_on, String type, String background_image, String email, int id, String location_name, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String organizer_description) {

		this.state = state;
		this.timezone = timezone;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.end_time = end_time;
		this.start_time = start_time;
		this.description = description;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this.name = name;
		this.topic = topic;
		this._version = version;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.background_image = background_image;
		this.email = email;
		this.id = id;
		this.location_name = location_name;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;

	}

}