import java.util.ArrayList;

class RootModel {

	public String name;
	public String location_name;
	public String code_of_conduct;
	public String description;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String state;
	public String timezone;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public int id;
	public String logo;
	public String schedule_published_on;
	public String start_time;
	public String organizer_name;
	public String background_image;
	public String privacy;
	public String end_time;
	public String email;
	public String type;
	public String topic;

	public RootModel(String name, String location_name, String code_of_conduct, String description, CreatorModel creator, ArrayList<Social_linksModel> social_links, String organizer_description, String state, String timezone, VersionModel version, Call_for_papersModel call_for_papers, CopyrightModel copyright, int id, String logo, String schedule_published_on, String start_time, String organizer_name, String background_image, String privacy, String end_time, String email, String type, String topic) {

		this.name = name;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this._creator = creator;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.state = state;
		this.timezone = timezone;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.id = id;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.privacy = privacy;
		this.end_time = end_time;
		this.email = email;
		this.type = type;
		this.topic = topic;

	}

}