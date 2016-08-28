import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String description;
	public String state;
	public String location_name;
	public int id;
	public String email;
	public String organizer_description;
	public String privacy;
	public String logo;
	public String name;
	public CreatorModel _creator;
	public String code_of_conduct;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public VersionModel _version;
	public String end_time;
	public String background_image;
	public CopyrightModel _copyright;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String topic;

	public RootModel(String timezone, String description, String state, String location_name, int id, String email, String organizer_description, String privacy, String logo, String name, CreatorModel creator, String code_of_conduct, String organizer_name, ArrayList<Social_linksModel> social_links, String schedule_published_on, VersionModel version, String end_time, String background_image, CopyrightModel copyright, String start_time, Call_for_papersModel call_for_papers, String type, String topic) {

		this.timezone = timezone;
		this.description = description;
		this.state = state;
		this.location_name = location_name;
		this.id = id;
		this.email = email;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.logo = logo;
		this.name = name;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.end_time = end_time;
		this.background_image = background_image;
		this._copyright = copyright;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.topic = topic;

	}

}