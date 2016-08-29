import java.util.ArrayList;

class RootModel {

	public String email;
	public String description;
	public VersionModel _version;
	public String organizer_description;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String logo;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String name;
	public String topic;
	public String code_of_conduct;
	public String timezone;
	public String privacy;
	public String location_name;
	public String background_image;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String start_time;
	public CreatorModel _creator;
	public String end_time;

	public RootModel(String email, String description, VersionModel version, String organizer_description, CopyrightModel copyright, String organizer_name, String logo, String schedule_published_on, ArrayList<Social_linksModel> social_links, int id, String name, String topic, String code_of_conduct, String timezone, String privacy, String location_name, String background_image, String type, Call_for_papersModel call_for_papers, String state, String start_time, CreatorModel creator, String end_time) {

		this.email = email;
		this.description = description;
		this._version = version;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.id = id;
		this.name = name;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.privacy = privacy;
		this.location_name = location_name;
		this.background_image = background_image;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.start_time = start_time;
		this._creator = creator;
		this.end_time = end_time;

	}

}