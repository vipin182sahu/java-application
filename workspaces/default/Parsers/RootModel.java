import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String timezone;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String background_image;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String name;
	public String start_time;
	public String description;
	public String state;
	public int id;
	public VersionModel _version;
	public String schedule_published_on;
	public String topic;
	public String organizer_name;
	public String email;
	public String location_name;
	public String organizer_description;

	public RootModel(String end_time, String code_of_conduct, Call_for_papersModel call_for_papers, String type, String timezone, CopyrightModel copyright, CreatorModel creator, String background_image, String privacy, ArrayList<Social_linksModel> social_links, String logo, String name, String start_time, String description, String state, int id, VersionModel version, String schedule_published_on, String topic, String organizer_name, String email, String location_name, String organizer_description) {

		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.timezone = timezone;
		this._copyright = copyright;
		this._creator = creator;
		this.background_image = background_image;
		this.privacy = privacy;
		this.social_links = social_links;
		this.logo = logo;
		this.name = name;
		this.start_time = start_time;
		this.description = description;
		this.state = state;
		this.id = id;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.email = email;
		this.location_name = location_name;
		this.organizer_description = organizer_description;

	}

}