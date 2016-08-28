import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String privacy;
	public int id;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String type;
	public String logo;
	public String end_time;
	public String email;
	public String organizer_description;
	public String location_name;
	public String start_time;
	public String description;
	public String schedule_published_on;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String code_of_conduct;
	public VersionModel _version;
	public String organizer_name;
	public String background_image;
	public String topic;

	public RootModel(CopyrightModel copyright, String privacy, int id, String state, Call_for_papersModel call_for_papers, CreatorModel creator, String type, String logo, String end_time, String email, String organizer_description, String location_name, String start_time, String description, String schedule_published_on, String timezone, ArrayList<Social_linksModel> social_links, String name, String code_of_conduct, VersionModel version, String organizer_name, String background_image, String topic) {

		this._copyright = copyright;
		this.privacy = privacy;
		this.id = id;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.type = type;
		this.logo = logo;
		this.end_time = end_time;
		this.email = email;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.start_time = start_time;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.social_links = social_links;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.topic = topic;

	}

}