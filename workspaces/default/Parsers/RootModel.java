import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String timezone;
	public String organizer_description;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String start_time;
	public String code_of_conduct;
	public String state;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String logo;
	public String end_time;
	public String schedule_published_on;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String description;
	public String topic;
	public int id;
	public String email;
	public String name;
	public VersionModel _version;

	public RootModel(String organizer_name, String timezone, String organizer_description, CreatorModel creator, CopyrightModel copyright, String start_time, String code_of_conduct, String state, String type, Call_for_papersModel call_for_papers, String background_image, String logo, String end_time, String schedule_published_on, String location_name, ArrayList<Social_linksModel> social_links, String privacy, String description, String topic, int id, String email, String name, VersionModel version) {

		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this._copyright = copyright;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.logo = logo;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.social_links = social_links;
		this.privacy = privacy;
		this.description = description;
		this.topic = topic;
		this.id = id;
		this.email = email;
		this.name = name;
		this._version = version;

	}

}