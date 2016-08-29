import java.util.ArrayList;

class RootModel {

	public String background_image;
	public int id;
	public String description;
	public String end_time;
	public String start_time;
	public CreatorModel _creator;
	public VersionModel _version;
	public String code_of_conduct;
	public String email;
	public String organizer_name;
	public String organizer_description;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String type;
	public String logo;
	public String privacy;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String topic;

	public RootModel(String background_image, int id, String description, String end_time, String start_time, CreatorModel creator, VersionModel version, String code_of_conduct, String email, String organizer_name, String organizer_description, String name, Call_for_papersModel call_for_papers, String state, CopyrightModel copyright, String schedule_published_on, String type, String logo, String privacy, String location_name, ArrayList<Social_linksModel> social_links, String timezone, String topic) {

		this.background_image = background_image;
		this.id = id;
		this.description = description;
		this.end_time = end_time;
		this.start_time = start_time;
		this._creator = creator;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.logo = logo;
		this.privacy = privacy;
		this.location_name = location_name;
		this.social_links = social_links;
		this.timezone = timezone;
		this.topic = topic;

	}

}