import java.util.ArrayList;

class RootModel {

	public String location_name;
	public int id;
	public String organizer_description;
	public String schedule_published_on;
	public String email;
	public String start_time;
	public String state;
	public String end_time;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String description;
	public String logo;
	public String timezone;
	public CreatorModel _creator;
	public String name;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String type;
	public VersionModel _version;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String topic;

	public RootModel(String location_name, int id, String organizer_description, String schedule_published_on, String email, String start_time, String state, String end_time, String code_of_conduct, Call_for_papersModel call_for_papers, String privacy, String description, String logo, String timezone, CreatorModel creator, String name, String organizer_name, CopyrightModel copyright, String type, VersionModel version, String background_image, ArrayList<Social_linksModel> social_links, String topic) {

		this.location_name = location_name;
		this.id = id;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.start_time = start_time;
		this.state = state;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.description = description;
		this.logo = logo;
		this.timezone = timezone;
		this._creator = creator;
		this.name = name;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.type = type;
		this._version = version;
		this.background_image = background_image;
		this.social_links = social_links;
		this.topic = topic;

	}

}