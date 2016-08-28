import java.util.ArrayList;

class RootModel {

	public String privacy;
	public CopyrightModel _copyright;
	public String end_time;
	public String logo;
	public String timezone;
	public String description;
	public String state;
	public VersionModel _version;
	public String email;
	public String organizer_name;
	public String location_name;
	public String type;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String background_image;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public int id;
	public String name;
	public String start_time;
	public String topic;

	public RootModel(String privacy, CopyrightModel copyright, String end_time, String logo, String timezone, String description, String state, VersionModel version, String email, String organizer_name, String location_name, String type, CreatorModel creator, Call_for_papersModel call_for_papers, String organizer_description, String background_image, String code_of_conduct, ArrayList<Social_linksModel> social_links, String schedule_published_on, int id, String name, String start_time, String topic) {

		this.privacy = privacy;
		this._copyright = copyright;
		this.end_time = end_time;
		this.logo = logo;
		this.timezone = timezone;
		this.description = description;
		this.state = state;
		this._version = version;
		this.email = email;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.type = type;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.name = name;
		this.start_time = start_time;
		this.topic = topic;

	}

}