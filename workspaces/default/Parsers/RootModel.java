import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String timezone;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public CreatorModel _creator;
	public String name;
	public int id;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String code_of_conduct;
	public String logo;
	public String background_image;
	public String description;
	public String email;
	public String start_time;
	public String organizer_description;
	public String state;
	public VersionModel _version;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String topic;

	public RootModel(String end_time, String timezone, String schedule_published_on, ArrayList<Social_linksModel> social_links, String privacy, CreatorModel creator, String name, int id, CopyrightModel copyright, String organizer_name, String code_of_conduct, String logo, String background_image, String description, String email, String start_time, String organizer_description, String state, VersionModel version, String location_name, Call_for_papersModel call_for_papers, String type, String topic) {

		this.end_time = end_time;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.privacy = privacy;
		this._creator = creator;
		this.name = name;
		this.id = id;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.background_image = background_image;
		this.description = description;
		this.email = email;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.state = state;
		this._version = version;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.topic = topic;

	}

}