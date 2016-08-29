import java.util.ArrayList;

class RootModel {

	public String privacy;
	public CopyrightModel _copyright;
	public String background_image;
	public String schedule_published_on;
	public String name;
	public String location_name;
	public VersionModel _version;
	public String description;
	public String type;
	public String logo;
	public String timezone;
	public int id;
	public CreatorModel _creator;
	public String state;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String organizer_description;
	public String code_of_conduct;
	public String start_time;
	public String email;
	public String topic;

	public RootModel(String privacy, CopyrightModel copyright, String background_image, String schedule_published_on, String name, String location_name, VersionModel version, String description, String type, String logo, String timezone, int id, CreatorModel creator, String state, String organizer_name, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String end_time, String organizer_description, String code_of_conduct, String start_time, String email, String topic) {

		this.privacy = privacy;
		this._copyright = copyright;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.location_name = location_name;
		this._version = version;
		this.description = description;
		this.type = type;
		this.logo = logo;
		this.timezone = timezone;
		this.id = id;
		this._creator = creator;
		this.state = state;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.email = email;
		this.topic = topic;

	}

}