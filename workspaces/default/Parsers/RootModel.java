import java.util.ArrayList;

class RootModel {

	public String description;
	public VersionModel _version;
	public String location_name;
	public CopyrightModel _copyright;
	public String background_image;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public CreatorModel _creator;
	public String start_time;
	public String organizer_name;
	public String state;
	public String schedule_published_on;
	public String privacy;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String end_time;
	public String code_of_conduct;
	public String email;
	public String organizer_description;
	public String name;
	public String topic;

	public RootModel(String description, VersionModel version, String location_name, CopyrightModel copyright, String background_image, String logo, Call_for_papersModel call_for_papers, String timezone, CreatorModel creator, String start_time, String organizer_name, String state, String schedule_published_on, String privacy, int id, ArrayList<Social_linksModel> social_links, String type, String end_time, String code_of_conduct, String email, String organizer_description, String name, String topic) {

		this.description = description;
		this._version = version;
		this.location_name = location_name;
		this._copyright = copyright;
		this.background_image = background_image;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this._creator = creator;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.id = id;
		this.social_links = social_links;
		this.type = type;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.organizer_description = organizer_description;
		this.name = name;
		this.topic = topic;

	}

}