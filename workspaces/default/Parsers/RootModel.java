import java.util.ArrayList;

class RootModel {

	public String email;
	public String state;
	public String logo;
	public String location_name;
	public String background_image;
	public String privacy;
	public String end_time;
	public int id;
	public String timezone;
	public String organizer_name;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String topic;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public CreatorModel _creator;
	public String organizer_description;
	public String type;
	public String code_of_conduct;
	public String start_time;

	public RootModel(String email, String state, String logo, String location_name, String background_image, String privacy, String end_time, int id, String timezone, String organizer_name, CopyrightModel copyright, VersionModel version, String topic, String schedule_published_on, Call_for_papersModel call_for_papers, String description, ArrayList<Social_linksModel> social_links, String name, CreatorModel creator, String organizer_description, String type, String code_of_conduct, String start_time) {

		this.email = email;
		this.state = state;
		this.logo = logo;
		this.location_name = location_name;
		this.background_image = background_image;
		this.privacy = privacy;
		this.end_time = end_time;
		this.id = id;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this._version = version;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this.social_links = social_links;
		this.name = name;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;

	}

}