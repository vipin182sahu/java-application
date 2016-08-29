import java.util.ArrayList;

class RootModel {

	public int id;
	public String background_image;
	public VersionModel _version;
	public String start_time;
	public String email;
	public String logo;
	public CreatorModel _creator;
	public String state;
	public String privacy;
	public String type;
	public String organizer_description;
	public String code_of_conduct;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String end_time;
	public String description;
	public String name;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String topic;
	public String organizer_name;

	public RootModel(int id, String background_image, VersionModel version, String start_time, String email, String logo, CreatorModel creator, String state, String privacy, String type, String organizer_description, String code_of_conduct, String timezone, Call_for_papersModel call_for_papers, CopyrightModel copyright, String end_time, String description, String name, String schedule_published_on, ArrayList<Social_linksModel> social_links, String location_name, String topic, String organizer_name) {

		this.id = id;
		this.background_image = background_image;
		this._version = version;
		this.start_time = start_time;
		this.email = email;
		this.logo = logo;
		this._creator = creator;
		this.state = state;
		this.privacy = privacy;
		this.type = type;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.end_time = end_time;
		this.description = description;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.location_name = location_name;
		this.topic = topic;
		this.organizer_name = organizer_name;

	}

}