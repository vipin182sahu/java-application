import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String schedule_published_on;
	public String type;
	public String location_name;
	public int id;
	public String background_image;
	public String email;
	public String start_time;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String name;
	public String organizer_name;
	public String logo;
	public String code_of_conduct;
	public String timezone;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public CopyrightModel _copyright;
	public String topic;
	public String description;
	public String end_time;

	public RootModel(String organizer_description, String schedule_published_on, String type, String location_name, int id, String background_image, String email, String start_time, String state, Call_for_papersModel call_for_papers, VersionModel version, String name, String organizer_name, String logo, String code_of_conduct, String timezone, CreatorModel creator, ArrayList<Social_linksModel> social_links, String privacy, CopyrightModel copyright, String topic, String description, String end_time) {

		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.location_name = location_name;
		this.id = id;
		this.background_image = background_image;
		this.email = email;
		this.start_time = start_time;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.name = name;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this._creator = creator;
		this.social_links = social_links;
		this.privacy = privacy;
		this._copyright = copyright;
		this.topic = topic;
		this.description = description;
		this.end_time = end_time;

	}

}