import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String privacy;
	public String timezone;
	public String schedule_published_on;
	public String email;
	public CopyrightModel _copyright;
	public String description;
	public CreatorModel _creator;
	public String end_time;
	public String state;
	public String organizer_name;
	public String logo;
	public int id;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String type;
	public String code_of_conduct;
	public String topic;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String start_time;

	public RootModel(String organizer_description, String privacy, String timezone, String schedule_published_on, String email, CopyrightModel copyright, String description, CreatorModel creator, String end_time, String state, String organizer_name, String logo, int id, String name, ArrayList<Social_linksModel> social_links, VersionModel version, String type, String code_of_conduct, String topic, String location_name, Call_for_papersModel call_for_papers, String background_image, String start_time) {

		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this._copyright = copyright;
		this.description = description;
		this._creator = creator;
		this.end_time = end_time;
		this.state = state;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.id = id;
		this.name = name;
		this.social_links = social_links;
		this._version = version;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.start_time = start_time;

	}

}