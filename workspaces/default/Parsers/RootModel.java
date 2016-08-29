import java.util.ArrayList;

class RootModel {

	public String background_image;
	public VersionModel _version;
	public String privacy;
	public String type;
	public String code_of_conduct;
	public String schedule_published_on;
	public String state;
	public String location_name;
	public String organizer_name;
	public String email;
	public String organizer_description;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public CreatorModel _creator;
	public String name;
	public CopyrightModel _copyright;
	public String description;
	public String timezone;
	public String start_time;
	public String topic;

	public RootModel(String background_image, VersionModel version, String privacy, String type, String code_of_conduct, String schedule_published_on, String state, String location_name, String organizer_name, String email, String organizer_description, String logo, ArrayList<Social_linksModel> social_links, int id, Call_for_papersModel call_for_papers, String end_time, CreatorModel creator, String name, CopyrightModel copyright, String description, String timezone, String start_time, String topic) {

		this.background_image = background_image;
		this._version = version;
		this.privacy = privacy;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.email = email;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this.social_links = social_links;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this._creator = creator;
		this.name = name;
		this._copyright = copyright;
		this.description = description;
		this.timezone = timezone;
		this.start_time = start_time;
		this.topic = topic;

	}

}