import java.util.ArrayList;

class RootModel {

	public String name;
	public String location_name;
	public String type;
	public CreatorModel _creator;
	public String code_of_conduct;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String end_time;
	public String start_time;
	public String description;
	public String organizer_name;
	public String background_image;
	public CopyrightModel _copyright;
	public String privacy;
	public String state;
	public String schedule_published_on;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String logo;
	public String organizer_description;
	public String topic;

	public RootModel(String name, String location_name, String type, CreatorModel creator, String code_of_conduct, String email, ArrayList<Social_linksModel> social_links, VersionModel version, String end_time, String start_time, String description, String organizer_name, String background_image, CopyrightModel copyright, String privacy, String state, String schedule_published_on, int id, Call_for_papersModel call_for_papers, String timezone, String logo, String organizer_description, String topic) {

		this.name = name;
		this.location_name = location_name;
		this.type = type;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.social_links = social_links;
		this._version = version;
		this.end_time = end_time;
		this.start_time = start_time;
		this.description = description;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this._copyright = copyright;
		this.privacy = privacy;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.topic = topic;

	}

}