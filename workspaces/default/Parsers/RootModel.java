import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String type;
	public VersionModel _version;
	public String logo;
	public String email;
	public String code_of_conduct;
	public String background_image;
	public String description;
	public String schedule_published_on;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String state;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String name;
	public String end_time;
	public CreatorModel _creator;
	public String organizer_name;
	public String organizer_description;
	public String privacy;
	public String topic;

	public RootModel(String location_name, String type, VersionModel version, String logo, String email, String code_of_conduct, String background_image, String description, String schedule_published_on, int id, Call_for_papersModel call_for_papers, String start_time, String state, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String timezone, String name, String end_time, CreatorModel creator, String organizer_name, String organizer_description, String privacy, String topic) {

		this.location_name = location_name;
		this.type = type;
		this._version = version;
		this.logo = logo;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.state = state;
		this._copyright = copyright;
		this.social_links = social_links;
		this.timezone = timezone;
		this.name = name;
		this.end_time = end_time;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.topic = topic;

	}

}