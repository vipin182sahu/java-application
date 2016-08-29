import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String name;
	public String schedule_published_on;
	public String state;
	public String organizer_description;
	public String description;
	public String topic;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String logo;
	public int id;
	public String background_image;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String type;
	public String code_of_conduct;
	public String privacy;
	public String organizer_name;
	public String timezone;
	public String start_time;
	public VersionModel _version;

	public RootModel(String end_time, String name, String schedule_published_on, String state, String organizer_description, String description, String topic, String email, Call_for_papersModel call_for_papers, CopyrightModel copyright, String logo, int id, String background_image, String location_name, ArrayList<Social_linksModel> social_links, CreatorModel creator, String type, String code_of_conduct, String privacy, String organizer_name, String timezone, String start_time, VersionModel version) {

		this.end_time = end_time;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.organizer_description = organizer_description;
		this.description = description;
		this.topic = topic;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.logo = logo;
		this.id = id;
		this.background_image = background_image;
		this.location_name = location_name;
		this.social_links = social_links;
		this._creator = creator;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.start_time = start_time;
		this._version = version;

	}

}