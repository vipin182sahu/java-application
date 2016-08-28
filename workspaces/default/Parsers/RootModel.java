import java.util.ArrayList;

class RootModel {

	public String state;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String organizer_name;
	public String timezone;
	public String end_time;
	public String logo;
	public String description;
	public String code_of_conduct;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public int id;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String type;
	public String privacy;
	public String location_name;
	public String topic;
	public String start_time;
	public String organizer_description;
	public VersionModel _version;

	public RootModel(String state, CreatorModel creator, ArrayList<Social_linksModel> social_links, String email, String organizer_name, String timezone, String end_time, String logo, String description, String code_of_conduct, String schedule_published_on, CopyrightModel copyright, int id, String name, Call_for_papersModel call_for_papers, String background_image, String type, String privacy, String location_name, String topic, String start_time, String organizer_description, VersionModel version) {

		this.state = state;
		this._creator = creator;
		this.social_links = social_links;
		this.email = email;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.end_time = end_time;
		this.logo = logo;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.id = id;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.type = type;
		this.privacy = privacy;
		this.location_name = location_name;
		this.topic = topic;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this._version = version;

	}

}