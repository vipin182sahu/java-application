import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String organizer_name;
	public String topic;
	public CopyrightModel _copyright;
	public String timezone;
	public String description;
	public String privacy;
	public String type;
	public String end_time;
	public String schedule_published_on;
	public String organizer_description;
	public String start_time;
	public String logo;
	public String state;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String email;
	public int id;
	public String name;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String location_name;

	public RootModel(VersionModel version, String organizer_name, String topic, CopyrightModel copyright, String timezone, String description, String privacy, String type, String end_time, String schedule_published_on, String organizer_description, String start_time, String logo, String state, CreatorModel creator, ArrayList<Social_linksModel> social_links, String background_image, String email, int id, String name, String code_of_conduct, Call_for_papersModel call_for_papers, String location_name) {

		this._version = version;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this._copyright = copyright;
		this.timezone = timezone;
		this.description = description;
		this.privacy = privacy;
		this.type = type;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.logo = logo;
		this.state = state;
		this._creator = creator;
		this.social_links = social_links;
		this.background_image = background_image;
		this.email = email;
		this.id = id;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;

	}

}