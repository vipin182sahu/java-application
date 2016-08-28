import java.util.ArrayList;

class RootModel {

	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String state;
	public String email;
	public CreatorModel _creator;
	public VersionModel _version;
	public String timezone;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String name;
	public String description;
	public String topic;
	public String type;
	public String code_of_conduct;
	public String organizer_description;
	public String background_image;
	public String location_name;
	public String start_time;
	public String schedule_published_on;
	public String end_time;
	public String organizer_name;

	public RootModel(int id, ArrayList<Social_linksModel> social_links, String privacy, String state, String email, CreatorModel creator, VersionModel version, String timezone, CopyrightModel copyright, Call_for_papersModel call_for_papers, String logo, String name, String description, String topic, String type, String code_of_conduct, String organizer_description, String background_image, String location_name, String start_time, String schedule_published_on, String end_time, String organizer_name) {

		this.id = id;
		this.social_links = social_links;
		this.privacy = privacy;
		this.state = state;
		this.email = email;
		this._creator = creator;
		this._version = version;
		this.timezone = timezone;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.name = name;
		this.description = description;
		this.topic = topic;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.location_name = location_name;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.organizer_name = organizer_name;

	}

}