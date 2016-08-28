import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public int id;
	public String code_of_conduct;
	public String organizer_name;
	public String state;
	public String description;
	public CreatorModel _creator;
	public String name;
	public String email;
	public String end_time;
	public String location_name;
	public String topic;
	public String organizer_description;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String privacy;
	public String timezone;
	public String type;
	public String logo;
	public VersionModel _version;

	public RootModel(String schedule_published_on, int id, String code_of_conduct, String organizer_name, String state, String description, CreatorModel creator, String name, String email, String end_time, String location_name, String topic, String organizer_description, String background_image, ArrayList<Social_linksModel> social_links, String start_time, Call_for_papersModel call_for_papers, CopyrightModel copyright, String privacy, String timezone, String type, String logo, VersionModel version) {

		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.state = state;
		this.description = description;
		this._creator = creator;
		this.name = name;
		this.email = email;
		this.end_time = end_time;
		this.location_name = location_name;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.social_links = social_links;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.privacy = privacy;
		this.timezone = timezone;
		this.type = type;
		this.logo = logo;
		this._version = version;

	}

}