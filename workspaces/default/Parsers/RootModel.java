import java.util.ArrayList;

class RootModel {

	public String description;
	public String name;
	public String code_of_conduct;
	public String email;
	public CreatorModel _creator;
	public String location_name;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String organizer_name;
	public String state;
	public String topic;
	public String schedule_published_on;
	public String logo;
	public String start_time;
	public String timezone;
	public String organizer_description;
	public String privacy;
	public CopyrightModel _copyright;
	public String end_time;

	public RootModel(String description, String name, String code_of_conduct, String email, CreatorModel creator, String location_name, String type, Call_for_papersModel call_for_papers, String background_image, int id, ArrayList<Social_linksModel> social_links, VersionModel version, String organizer_name, String state, String topic, String schedule_published_on, String logo, String start_time, String timezone, String organizer_description, String privacy, CopyrightModel copyright, String end_time) {

		this.description = description;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this._creator = creator;
		this.location_name = location_name;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.id = id;
		this.social_links = social_links;
		this._version = version;
		this.organizer_name = organizer_name;
		this.state = state;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.start_time = start_time;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this._copyright = copyright;
		this.end_time = end_time;

	}

}