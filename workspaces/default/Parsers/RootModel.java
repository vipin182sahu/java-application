import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String organizer_description;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String location_name;
	public String start_time;
	public String type;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String description;
	public String logo;
	public String state;
	public String topic;
	public int id;
	public String schedule_published_on;
	public String name;
	public CreatorModel _creator;
	public String email;
	public VersionModel _version;

	public RootModel(String timezone, String end_time, ArrayList<Social_linksModel> social_links, String background_image, String organizer_description, String privacy, Call_for_papersModel call_for_papers, String code_of_conduct, String location_name, String start_time, String type, String organizer_name, CopyrightModel copyright, String description, String logo, String state, String topic, int id, String schedule_published_on, String name, CreatorModel creator, String email, VersionModel version) {

		this.timezone = timezone;
		this.end_time = end_time;
		this.social_links = social_links;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.start_time = start_time;
		this.type = type;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.description = description;
		this.logo = logo;
		this.state = state;
		this.topic = topic;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this._creator = creator;
		this.email = email;
		this._version = version;

	}

}