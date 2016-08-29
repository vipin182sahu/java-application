import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String logo;
	public String end_time;
	public String timezone;
	public String location_name;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String topic;
	public String background_image;
	public String start_time;
	public String type;
	public String organizer_name;
	public String privacy;
	public String name;
	public int id;
	public VersionModel _version;
	public String schedule_published_on;
	public String description;
	public String organizer_description;
	public String email;

	public RootModel(CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String code_of_conduct, String logo, String end_time, String timezone, String location_name, String state, Call_for_papersModel call_for_papers, CreatorModel creator, String topic, String background_image, String start_time, String type, String organizer_name, String privacy, String name, int id, VersionModel version, String schedule_published_on, String description, String organizer_description, String email) {

		this._copyright = copyright;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.end_time = end_time;
		this.timezone = timezone;
		this.location_name = location_name;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.topic = topic;
		this.background_image = background_image;
		this.start_time = start_time;
		this.type = type;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.name = name;
		this.id = id;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.organizer_description = organizer_description;
		this.email = email;

	}

}