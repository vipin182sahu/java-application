import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public VersionModel _version;
	public String privacy;
	public String organizer_description;
	public String end_time;
	public String background_image;
	public int id;
	public String type;
	public String state;
	public String organizer_name;
	public String logo;
	public String name;
	public String description;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String topic;

	public RootModel(String start_time, String timezone, ArrayList<Social_linksModel> social_links, String email, Call_for_papersModel call_for_papers, String location_name, CopyrightModel copyright, String schedule_published_on, VersionModel version, String privacy, String organizer_description, String end_time, String background_image, int id, String type, String state, String organizer_name, String logo, String name, String description, String code_of_conduct, CreatorModel creator, String topic) {

		this.start_time = start_time;
		this.timezone = timezone;
		this.social_links = social_links;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.background_image = background_image;
		this.id = id;
		this.type = type;
		this.state = state;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.name = name;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.topic = topic;

	}

}