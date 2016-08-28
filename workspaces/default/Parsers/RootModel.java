import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String type;
	public String code_of_conduct;
	public String logo;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String email;
	public String timezone;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public CreatorModel _creator;
	public VersionModel _version;
	public int id;
	public String end_time;
	public String background_image;
	public String schedule_published_on;
	public String location_name;
	public String description;
	public String privacy;
	public CopyrightModel _copyright;
	public String topic;

	public RootModel(String organizer_name, String type, String code_of_conduct, String logo, String state, Call_for_papersModel call_for_papers, String start_time, String email, String timezone, String organizer_description, ArrayList<Social_linksModel> social_links, String name, CreatorModel creator, VersionModel version, int id, String end_time, String background_image, String schedule_published_on, String location_name, String description, String privacy, CopyrightModel copyright, String topic) {

		this.organizer_name = organizer_name;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.email = email;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.name = name;
		this._creator = creator;
		this._version = version;
		this.id = id;
		this.end_time = end_time;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.description = description;
		this.privacy = privacy;
		this._copyright = copyright;
		this.topic = topic;

	}

}