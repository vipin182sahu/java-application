import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String state;
	public int id;
	public String schedule_published_on;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String logo;
	public String email;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String description;
	public CreatorModel _creator;
	public String name;
	public String organizer_name;
	public String code_of_conduct;
	public String end_time;
	public String start_time;
	public String privacy;
	public String background_image;
	public String location_name;
	public VersionModel _version;

	public RootModel(String timezone, String state, int id, String schedule_published_on, String type, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String topic, String logo, String email, CopyrightModel copyright, String organizer_description, String description, CreatorModel creator, String name, String organizer_name, String code_of_conduct, String end_time, String start_time, String privacy, String background_image, String location_name, VersionModel version) {

		this.timezone = timezone;
		this.state = state;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.logo = logo;
		this.email = email;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.description = description;
		this._creator = creator;
		this.name = name;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.start_time = start_time;
		this.privacy = privacy;
		this.background_image = background_image;
		this.location_name = location_name;
		this._version = version;

	}

}