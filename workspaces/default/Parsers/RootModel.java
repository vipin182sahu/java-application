import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public CopyrightModel _copyright;
	public String privacy;
	public String background_image;
	public String description;
	public String topic;
	public String start_time;
	public String name;
	public String logo;
	public CreatorModel _creator;
	public String location_name;
	public String timezone;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String email;
	public int id;
	public String state;
	public String code_of_conduct;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String organizer_name;

	public RootModel(VersionModel version, CopyrightModel copyright, String privacy, String background_image, String description, String topic, String start_time, String name, String logo, CreatorModel creator, String location_name, String timezone, String end_time, ArrayList<Social_linksModel> social_links, String schedule_published_on, String email, int id, String state, String code_of_conduct, String organizer_description, Call_for_papersModel call_for_papers, String type, String organizer_name) {

		this._version = version;
		this._copyright = copyright;
		this.privacy = privacy;
		this.background_image = background_image;
		this.description = description;
		this.topic = topic;
		this.start_time = start_time;
		this.name = name;
		this.logo = logo;
		this._creator = creator;
		this.location_name = location_name;
		this.timezone = timezone;
		this.end_time = end_time;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.id = id;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.organizer_name = organizer_name;

	}

}