import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String description;
	public String email;
	public String state;
	public String organizer_name;
	public String timezone;
	public String organizer_description;
	public int id;
	public CreatorModel _creator;
	public String end_time;
	public String name;
	public String type;
	public String topic;
	public String start_time;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String background_image;
	public String code_of_conduct;
	public String schedule_published_on;
	public String location_name;

	public RootModel(VersionModel version, String description, String email, String state, String organizer_name, String timezone, String organizer_description, int id, CreatorModel creator, String end_time, String name, String type, String topic, String start_time, String logo, ArrayList<Social_linksModel> social_links, String privacy, Call_for_papersModel call_for_papers, CopyrightModel copyright, String background_image, String code_of_conduct, String schedule_published_on, String location_name) {

		this._version = version;
		this.description = description;
		this.email = email;
		this.state = state;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.id = id;
		this._creator = creator;
		this.end_time = end_time;
		this.name = name;
		this.type = type;
		this.topic = topic;
		this.start_time = start_time;
		this.logo = logo;
		this.social_links = social_links;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;

	}

}