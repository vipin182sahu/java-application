import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String background_image;
	public int id;
	public CopyrightModel _copyright;
	public String timezone;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String start_time;
	public String organizer_description;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public String location_name;
	public String name;
	public String end_time;
	public String organizer_name;
	public String type;
	public String logo;
	public String description;
	public String topic;

	public RootModel(String privacy, String code_of_conduct, CreatorModel creator, String background_image, int id, CopyrightModel copyright, String timezone, VersionModel version, ArrayList<Social_linksModel> social_links, String state, String start_time, String organizer_description, String email, Call_for_papersModel call_for_papers, String schedule_published_on, String location_name, String name, String end_time, String organizer_name, String type, String logo, String description, String topic) {

		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.background_image = background_image;
		this.id = id;
		this._copyright = copyright;
		this.timezone = timezone;
		this._version = version;
		this.social_links = social_links;
		this.state = state;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.name = name;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.type = type;
		this.logo = logo;
		this.description = description;
		this.topic = topic;

	}

}