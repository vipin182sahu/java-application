import java.util.ArrayList;

class RootModel {

	public String state;
	public String organizer_name;
	public String name;
	public String end_time;
	public String start_time;
	public String logo;
	public CreatorModel _creator;
	public String type;
	public String organizer_description;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String topic;
	public CopyrightModel _copyright;
	public String background_image;
	public String description;
	public int id;
	public String schedule_published_on;
	public String timezone;
	public String location_name;
	public VersionModel _version;

	public RootModel(String state, String organizer_name, String name, String end_time, String start_time, String logo, CreatorModel creator, String type, String organizer_description, String email, ArrayList<Social_linksModel> social_links, String code_of_conduct, Call_for_papersModel call_for_papers, String privacy, String topic, CopyrightModel copyright, String background_image, String description, int id, String schedule_published_on, String timezone, String location_name, VersionModel version) {

		this.state = state;
		this.organizer_name = organizer_name;
		this.name = name;
		this.end_time = end_time;
		this.start_time = start_time;
		this.logo = logo;
		this._creator = creator;
		this.type = type;
		this.organizer_description = organizer_description;
		this.email = email;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.topic = topic;
		this._copyright = copyright;
		this.background_image = background_image;
		this.description = description;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.location_name = location_name;
		this._version = version;

	}

}