import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public VersionModel _version;
	public String organizer_description;
	public String end_time;
	public String privacy;
	public String name;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String state;
	public String email;
	public String description;
	public CreatorModel _creator;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String location_name;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String start_time;
	public String timezone;
	public String background_image;
	public String topic;

	public RootModel(String organizer_name, VersionModel version, String organizer_description, String end_time, String privacy, String name, String logo, Call_for_papersModel call_for_papers, String type, String state, String email, String description, CreatorModel creator, int id, ArrayList<Social_linksModel> social_links, String code_of_conduct, String location_name, CopyrightModel copyright, String schedule_published_on, String start_time, String timezone, String background_image, String topic) {

		this.organizer_name = organizer_name;
		this._version = version;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.privacy = privacy;
		this.name = name;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.state = state;
		this.email = email;
		this.description = description;
		this._creator = creator;
		this.id = id;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.timezone = timezone;
		this.background_image = background_image;
		this.topic = topic;

	}

}