import java.util.ArrayList;

class RootModel {

	public String name;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String privacy;
	public String email;
	public String description;
	public CreatorModel _creator;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public int id;
	public String organizer_description;
	public String type;
	public String topic;
	public String location_name;
	public String organizer_name;
	public String background_image;
	public VersionModel _version;
	public String timezone;
	public String logo;
	public String end_time;

	public RootModel(String name, String start_time, Call_for_papersModel call_for_papers, String state, ArrayList<Social_linksModel> social_links, String schedule_published_on, String privacy, String email, String description, CreatorModel creator, String code_of_conduct, CopyrightModel copyright, int id, String organizer_description, String type, String topic, String location_name, String organizer_name, String background_image, VersionModel version, String timezone, String logo, String end_time) {

		this.name = name;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.email = email;
		this.description = description;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.id = id;
		this.organizer_description = organizer_description;
		this.type = type;
		this.topic = topic;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this._version = version;
		this.timezone = timezone;
		this.logo = logo;
		this.end_time = end_time;

	}

}