import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String type;
	public String topic;
	public String background_image;
	public VersionModel _version;
	public String code_of_conduct;
	public String name;
	public CopyrightModel _copyright;
	public String timezone;
	public String schedule_published_on;
	public int id;
	public String location_name;
	public String start_time;
	public String state;
	public String organizer_name;
	public String privacy;
	public String email;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String end_time;

	public RootModel(String organizer_description, String type, String topic, String background_image, VersionModel version, String code_of_conduct, String name, CopyrightModel copyright, String timezone, String schedule_published_on, int id, String location_name, String start_time, String state, String organizer_name, String privacy, String email, String logo, ArrayList<Social_linksModel> social_links, CreatorModel creator, String description, Call_for_papersModel call_for_papers, String end_time) {

		this.organizer_description = organizer_description;
		this.type = type;
		this.topic = topic;
		this.background_image = background_image;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this._copyright = copyright;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.location_name = location_name;
		this.start_time = start_time;
		this.state = state;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.email = email;
		this.logo = logo;
		this.social_links = social_links;
		this._creator = creator;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;

	}

}