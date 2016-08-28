import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String type;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public CreatorModel _creator;
	public String topic;
	public int id;
	public String logo;
	public String description;
	public String organizer_description;
	public String background_image;
	public String name;
	public CopyrightModel _copyright;
	public String timezone;
	public String email;
	public String privacy;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String state;
	public String location_name;
	public VersionModel _version;

	public RootModel(String code_of_conduct, String type, String schedule_published_on, Call_for_papersModel call_for_papers, String end_time, CreatorModel creator, String topic, int id, String logo, String description, String organizer_description, String background_image, String name, CopyrightModel copyright, String timezone, String email, String privacy, String organizer_name, ArrayList<Social_linksModel> social_links, String start_time, String state, String location_name, VersionModel version) {

		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this._creator = creator;
		this.topic = topic;
		this.id = id;
		this.logo = logo;
		this.description = description;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.name = name;
		this._copyright = copyright;
		this.timezone = timezone;
		this.email = email;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.start_time = start_time;
		this.state = state;
		this.location_name = location_name;
		this._version = version;

	}

}