import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String schedule_published_on;
	public String timezone;
	public String location_name;
	public String type;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String state;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String description;
	public String logo;
	public String code_of_conduct;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String organizer_name;
	public int id;
	public String organizer_description;
	public String topic;
	public VersionModel _version;
	public String start_time;

	public RootModel(String privacy, String schedule_published_on, String timezone, String location_name, String type, String name, Call_for_papersModel call_for_papers, String end_time, String state, CreatorModel creator, CopyrightModel copyright, String description, String logo, String code_of_conduct, String background_image, ArrayList<Social_linksModel> social_links, String email, String organizer_name, int id, String organizer_description, String topic, VersionModel version, String start_time) {

		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.location_name = location_name;
		this.type = type;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.state = state;
		this._creator = creator;
		this._copyright = copyright;
		this.description = description;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.social_links = social_links;
		this.email = email;
		this.organizer_name = organizer_name;
		this.id = id;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this._version = version;
		this.start_time = start_time;

	}

}