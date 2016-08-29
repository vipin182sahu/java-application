import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String name;
	public VersionModel _version;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public CreatorModel _creator;
	public String organizer_name;
	public String code_of_conduct;
	public String email;
	public String timezone;
	public String description;
	public String type;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String logo;
	public String state;
	public String background_image;
	public String location_name;
	public CopyrightModel _copyright;
	public String privacy;
	public String end_time;

	public RootModel(String schedule_published_on, String name, VersionModel version, String start_time, ArrayList<Social_linksModel> social_links, String organizer_description, CreatorModel creator, String organizer_name, String code_of_conduct, String email, String timezone, String description, String type, int id, Call_for_papersModel call_for_papers, String topic, String logo, String state, String background_image, String location_name, CopyrightModel copyright, String privacy, String end_time) {

		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this._version = version;
		this.start_time = start_time;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.timezone = timezone;
		this.description = description;
		this.type = type;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.logo = logo;
		this.state = state;
		this.background_image = background_image;
		this.location_name = location_name;
		this._copyright = copyright;
		this.privacy = privacy;
		this.end_time = end_time;

	}

}