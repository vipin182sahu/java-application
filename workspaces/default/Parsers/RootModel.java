import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String description;
	public String privacy;
	public String background_image;
	public VersionModel _version;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String logo;
	public String schedule_published_on;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String name;
	public String timezone;
	public String organizer_description;
	public String end_time;
	public String type;
	public String email;
	public String state;
	public String topic;

	public RootModel(CopyrightModel copyright, String code_of_conduct, CreatorModel creator, String description, String privacy, String background_image, VersionModel version, int id, ArrayList<Social_linksModel> social_links, String location_name, String logo, String schedule_published_on, String start_time, Call_for_papersModel call_for_papers, String organizer_name, String name, String timezone, String organizer_description, String end_time, String type, String email, String state, String topic) {

		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.description = description;
		this.privacy = privacy;
		this.background_image = background_image;
		this._version = version;
		this.id = id;
		this.social_links = social_links;
		this.location_name = location_name;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.name = name;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.type = type;
		this.email = email;
		this.state = state;
		this.topic = topic;

	}

}