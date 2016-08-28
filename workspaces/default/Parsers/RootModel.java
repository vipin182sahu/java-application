import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String email;
	public String end_time;
	public CreatorModel _creator;
	public String name;
	public String type;
	public VersionModel _version;
	public String background_image;
	public String privacy;
	public String location_name;
	public String description;
	public String state;
	public String schedule_published_on;
	public String organizer_name;
	public String organizer_description;
	public String code_of_conduct;
	public String start_time;
	public String logo;
	public CopyrightModel _copyright;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String topic;

	public RootModel(String timezone, String email, String end_time, CreatorModel creator, String name, String type, VersionModel version, String background_image, String privacy, String location_name, String description, String state, String schedule_published_on, String organizer_name, String organizer_description, String code_of_conduct, String start_time, String logo, CopyrightModel copyright, int id, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String topic) {

		this.timezone = timezone;
		this.email = email;
		this.end_time = end_time;
		this._creator = creator;
		this.name = name;
		this.type = type;
		this._version = version;
		this.background_image = background_image;
		this.privacy = privacy;
		this.location_name = location_name;
		this.description = description;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.logo = logo;
		this._copyright = copyright;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.topic = topic;

	}

}