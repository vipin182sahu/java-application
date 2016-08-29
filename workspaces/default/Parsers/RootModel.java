import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String timezone;
	public CreatorModel _creator;
	public String logo;
	public String organizer_name;
	public String name;
	public String privacy;
	public int id;
	public String end_time;
	public String start_time;
	public String topic;
	public CopyrightModel _copyright;
	public String location_name;
	public String schedule_published_on;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String description;
	public String type;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public VersionModel _version;

	public RootModel(String code_of_conduct, String timezone, CreatorModel creator, String logo, String organizer_name, String name, String privacy, int id, String end_time, String start_time, String topic, CopyrightModel copyright, String location_name, String schedule_published_on, String background_image, Call_for_papersModel call_for_papers, String organizer_description, String description, String type, String email, ArrayList<Social_linksModel> social_links, String state, VersionModel version) {

		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this._creator = creator;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this.name = name;
		this.privacy = privacy;
		this.id = id;
		this.end_time = end_time;
		this.start_time = start_time;
		this.topic = topic;
		this._copyright = copyright;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.description = description;
		this.type = type;
		this.email = email;
		this.social_links = social_links;
		this.state = state;
		this._version = version;

	}

}