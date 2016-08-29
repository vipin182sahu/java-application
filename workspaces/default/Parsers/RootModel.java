import java.util.ArrayList;

class RootModel {

	public int id;
	public String name;
	public String logo;
	public String start_time;
	public String background_image;
	public String end_time;
	public String type;
	public String location_name;
	public String organizer_name;
	public VersionModel _version;
	public String organizer_description;
	public String state;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String timezone;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String topic;

	public RootModel(int id, String name, String logo, String start_time, String background_image, String end_time, String type, String location_name, String organizer_name, VersionModel version, String organizer_description, String state, CopyrightModel copyright, CreatorModel creator, String schedule_published_on, String privacy, ArrayList<Social_linksModel> social_links, String email, String timezone, String description, Call_for_papersModel call_for_papers, String code_of_conduct, String topic) {

		this.id = id;
		this.name = name;
		this.logo = logo;
		this.start_time = start_time;
		this.background_image = background_image;
		this.end_time = end_time;
		this.type = type;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this._version = version;
		this.organizer_description = organizer_description;
		this.state = state;
		this._copyright = copyright;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.social_links = social_links;
		this.email = email;
		this.timezone = timezone;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;

	}

}