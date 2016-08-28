import java.util.ArrayList;

class RootModel {

	public String background_image;
	public CopyrightModel _copyright;
	public String timezone;
	public String privacy;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public CreatorModel _creator;
	public String state;
	public String code_of_conduct;
	public String description;
	public String topic;
	public VersionModel _version;
	public String email;
	public String start_time;
	public String type;
	public String logo;
	public String location_name;
	public String schedule_published_on;
	public String end_time;

	public RootModel(String background_image, CopyrightModel copyright, String timezone, String privacy, int id, Call_for_papersModel call_for_papers, String organizer_description, String organizer_name, ArrayList<Social_linksModel> social_links, String name, CreatorModel creator, String state, String code_of_conduct, String description, String topic, VersionModel version, String email, String start_time, String type, String logo, String location_name, String schedule_published_on, String end_time) {

		this.background_image = background_image;
		this._copyright = copyright;
		this.timezone = timezone;
		this.privacy = privacy;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.name = name;
		this._creator = creator;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.topic = topic;
		this._version = version;
		this.email = email;
		this.start_time = start_time;
		this.type = type;
		this.logo = logo;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;

	}

}