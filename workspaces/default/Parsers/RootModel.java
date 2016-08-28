import java.util.ArrayList;

class RootModel {

	public String description;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String code_of_conduct;
	public String state;
	public String timezone;
	public String end_time;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String email;
	public int id;
	public String location_name;
	public String logo;
	public String background_image;
	public String organizer_description;
	public String start_time;
	public CreatorModel _creator;
	public String topic;
	public VersionModel _version;

	public RootModel(String description, String type, Call_for_papersModel call_for_papers, String organizer_name, String code_of_conduct, String state, String timezone, String end_time, CopyrightModel copyright, String schedule_published_on, String privacy, ArrayList<Social_linksModel> social_links, String name, String email, int id, String location_name, String logo, String background_image, String organizer_description, String start_time, CreatorModel creator, String topic, VersionModel version) {

		this.description = description;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.timezone = timezone;
		this.end_time = end_time;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.social_links = social_links;
		this.name = name;
		this.email = email;
		this.id = id;
		this.location_name = location_name;
		this.logo = logo;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this._creator = creator;
		this.topic = topic;
		this._version = version;

	}

}