import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String code_of_conduct;
	public String logo;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String privacy;
	public String timezone;
	public String background_image;
	public String description;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String end_time;
	public String start_time;
	public CreatorModel _creator;
	public String organizer_description;
	public int id;
	public VersionModel _version;
	public String location_name;
	public String type;
	public String email;
	public String topic;

	public RootModel(String organizer_name, String code_of_conduct, String logo, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String schedule_published_on, String privacy, String timezone, String background_image, String description, String state, Call_for_papersModel call_for_papers, String name, String end_time, String start_time, CreatorModel creator, String organizer_description, int id, VersionModel version, String location_name, String type, String email, String topic) {

		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this._copyright = copyright;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.timezone = timezone;
		this.background_image = background_image;
		this.description = description;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.end_time = end_time;
		this.start_time = start_time;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.id = id;
		this._version = version;
		this.location_name = location_name;
		this.type = type;
		this.email = email;
		this.topic = topic;

	}

}