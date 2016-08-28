import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String logo;
	public String end_time;
	public String code_of_conduct;
	public String background_image;
	public String description;
	public String timezone;
	public String organizer_name;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String topic;
	public String organizer_description;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String email;
	public int id;
	public String privacy;
	public String schedule_published_on;
	public String type;
	public CopyrightModel _copyright;
	public String name;

	public RootModel(VersionModel version, String logo, String end_time, String code_of_conduct, String background_image, String description, String timezone, String organizer_name, String location_name, Call_for_papersModel call_for_papers, CreatorModel creator, String topic, String organizer_description, String state, ArrayList<Social_linksModel> social_links, String start_time, String email, int id, String privacy, String schedule_published_on, String type, CopyrightModel copyright, String name) {

		this._version = version;
		this.logo = logo;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.description = description;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.state = state;
		this.social_links = social_links;
		this.start_time = start_time;
		this.email = email;
		this.id = id;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this._copyright = copyright;
		this.name = name;

	}

}