import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String location_name;
	public String description;
	public String start_time;
	public String schedule_published_on;
	public String email;
	public String organizer_name;
	public CreatorModel _creator;
	public String code_of_conduct;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public VersionModel _version;
	public String type;
	public String end_time;
	public int id;
	public String name;
	public String state;
	public String timezone;
	public CopyrightModel _copyright;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String topic;

	public RootModel(String privacy, String location_name, String description, String start_time, String schedule_published_on, String email, String organizer_name, CreatorModel creator, String code_of_conduct, String organizer_description, Call_for_papersModel call_for_papers, String background_image, VersionModel version, String type, String end_time, int id, String name, String state, String timezone, CopyrightModel copyright, String logo, ArrayList<Social_linksModel> social_links, String topic) {

		this.privacy = privacy;
		this.location_name = location_name;
		this.description = description;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this._version = version;
		this.type = type;
		this.end_time = end_time;
		this.id = id;
		this.name = name;
		this.state = state;
		this.timezone = timezone;
		this._copyright = copyright;
		this.logo = logo;
		this.social_links = social_links;
		this.topic = topic;

	}

}