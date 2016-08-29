import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String timezone;
	public String code_of_conduct;
	public String privacy;
	public CreatorModel _creator;
	public String background_image;
	public String schedule_published_on;
	public String end_time;
	public String description;
	public String organizer_name;
	public String location_name;
	public String topic;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public VersionModel _version;
	public int id;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String state;
	public String logo;
	public String email;

	public RootModel(CopyrightModel copyright, String timezone, String code_of_conduct, String privacy, CreatorModel creator, String background_image, String schedule_published_on, String end_time, String description, String organizer_name, String location_name, String topic, String name, Call_for_papersModel call_for_papers, String organizer_description, VersionModel version, int id, String type, ArrayList<Social_linksModel> social_links, String start_time, String state, String logo, String email) {

		this._copyright = copyright;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this._creator = creator;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.description = description;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.topic = topic;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this._version = version;
		this.id = id;
		this.type = type;
		this.social_links = social_links;
		this.start_time = start_time;
		this.state = state;
		this.logo = logo;
		this.email = email;

	}

}