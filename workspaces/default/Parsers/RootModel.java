import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String start_time;
	public String background_image;
	public int id;
	public String schedule_published_on;
	public String email;
	public String privacy;
	public String location_name;
	public CreatorModel _creator;
	public String timezone;
	public String state;
	public String end_time;
	public String description;
	public String topic;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String name;
	public String code_of_conduct;
	public VersionModel _version;

	public RootModel(String organizer_description, String start_time, String background_image, int id, String schedule_published_on, String email, String privacy, String location_name, CreatorModel creator, String timezone, String state, String end_time, String description, String topic, String logo, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String type, String organizer_name, CopyrightModel copyright, String name, String code_of_conduct, VersionModel version) {

		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.background_image = background_image;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.privacy = privacy;
		this.location_name = location_name;
		this._creator = creator;
		this.timezone = timezone;
		this.state = state;
		this.end_time = end_time;
		this.description = description;
		this.topic = topic;
		this.logo = logo;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this._version = version;

	}

}