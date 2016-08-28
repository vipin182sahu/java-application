import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String description;
	public CopyrightModel _copyright;
	public String start_time;
	public String email;
	public CreatorModel _creator;
	public String privacy;
	public String organizer_description;
	public String state;
	public String timezone;
	public String background_image;
	public String logo;
	public String end_time;
	public int id;
	public String name;
	public String code_of_conduct;
	public String organizer_name;
	public String schedule_published_on;
	public VersionModel _version;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String topic;

	public RootModel(String location_name, String description, CopyrightModel copyright, String start_time, String email, CreatorModel creator, String privacy, String organizer_description, String state, String timezone, String background_image, String logo, String end_time, int id, String name, String code_of_conduct, String organizer_name, String schedule_published_on, VersionModel version, String type, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String topic) {

		this.location_name = location_name;
		this.description = description;
		this._copyright = copyright;
		this.start_time = start_time;
		this.email = email;
		this._creator = creator;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.state = state;
		this.timezone = timezone;
		this.background_image = background_image;
		this.logo = logo;
		this.end_time = end_time;
		this.id = id;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.topic = topic;

	}

}