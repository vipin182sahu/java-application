import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String email;
	public String organizer_description;
	public String type;
	public String topic;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public int id;
	public String background_image;
	public String logo;
	public String timezone;
	public String schedule_published_on;
	public String name;
	public String end_time;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String location_name;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String state;
	public VersionModel _version;

	public RootModel(String privacy, String email, String organizer_description, String type, String topic, CreatorModel creator, CopyrightModel copyright, int id, String background_image, String logo, String timezone, String schedule_published_on, String name, String end_time, String description, Call_for_papersModel call_for_papers, String start_time, String location_name, String organizer_name, ArrayList<Social_linksModel> social_links, String code_of_conduct, String state, VersionModel version) {

		this.privacy = privacy;
		this.email = email;
		this.organizer_description = organizer_description;
		this.type = type;
		this.topic = topic;
		this._creator = creator;
		this._copyright = copyright;
		this.id = id;
		this.background_image = background_image;
		this.logo = logo;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.end_time = end_time;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this._version = version;

	}

}