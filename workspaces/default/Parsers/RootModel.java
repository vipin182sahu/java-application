import java.util.ArrayList;

class RootModel {

	public int id;
	public String topic;
	public String code_of_conduct;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String start_time;
	public String description;
	public String email;
	public String timezone;
	public String logo;
	public String organizer_description;
	public String state;
	public CopyrightModel _copyright;
	public String type;
	public CreatorModel _creator;
	public String name;
	public String location_name;
	public String organizer_name;
	public String end_time;

	public RootModel(int id, String topic, String code_of_conduct, String schedule_published_on, ArrayList<Social_linksModel> social_links, String background_image, VersionModel version, Call_for_papersModel call_for_papers, String privacy, String start_time, String description, String email, String timezone, String logo, String organizer_description, String state, CopyrightModel copyright, String type, CreatorModel creator, String name, String location_name, String organizer_name, String end_time) {

		this.id = id;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.background_image = background_image;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.start_time = start_time;
		this.description = description;
		this.email = email;
		this.timezone = timezone;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.state = state;
		this._copyright = copyright;
		this.type = type;
		this._creator = creator;
		this.name = name;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.end_time = end_time;

	}

}