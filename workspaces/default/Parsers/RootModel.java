import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String schedule_published_on;
	public int id;
	public String background_image;
	public String location_name;
	public String privacy;
	public String type;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String organizer_description;
	public String timezone;
	public String email;
	public String topic;
	public String name;
	public String organizer_name;
	public String state;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String start_time;

	public RootModel(String code_of_conduct, String end_time, Call_for_papersModel call_for_papers, String logo, String schedule_published_on, int id, String background_image, String location_name, String privacy, String type, String description, ArrayList<Social_linksModel> social_links, CreatorModel creator, String organizer_description, String timezone, String email, String topic, String name, String organizer_name, String state, VersionModel version, CopyrightModel copyright, String start_time) {

		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.background_image = background_image;
		this.location_name = location_name;
		this.privacy = privacy;
		this.type = type;
		this.description = description;
		this.social_links = social_links;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.email = email;
		this.topic = topic;
		this.name = name;
		this.organizer_name = organizer_name;
		this.state = state;
		this._version = version;
		this._copyright = copyright;
		this.start_time = start_time;

	}

}