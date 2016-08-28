import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String description;
	public String organizer_name;
	public String code_of_conduct;
	public String logo;
	public int id;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String location_name;
	public String type;
	public String organizer_description;
	public String end_time;
	public String email;
	public String timezone;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String state;
	public String topic;
	public String start_time;

	public RootModel(String schedule_published_on, String description, String organizer_name, String code_of_conduct, String logo, int id, String background_image, ArrayList<Social_linksModel> social_links, CreatorModel creator, String location_name, String type, String organizer_description, String end_time, String email, String timezone, String name, Call_for_papersModel call_for_papers, String privacy, CopyrightModel copyright, VersionModel version, String state, String topic, String start_time) {

		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.id = id;
		this.background_image = background_image;
		this.social_links = social_links;
		this._creator = creator;
		this.location_name = location_name;
		this.type = type;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.email = email;
		this.timezone = timezone;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this._copyright = copyright;
		this._version = version;
		this.state = state;
		this.topic = topic;
		this.start_time = start_time;

	}

}