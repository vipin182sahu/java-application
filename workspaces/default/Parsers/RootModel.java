import java.util.ArrayList;

class RootModel {

	public int id;
	public String topic;
	public String organizer_description;
	public String type;
	public String timezone;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String logo;
	public CreatorModel _creator;
	public VersionModel _version;
	public String end_time;
	public String name;
	public String organizer_name;
	public String background_image;
	public String privacy;
	public String email;
	public String start_time;
	public String description;

	public RootModel(int id, String topic, String organizer_description, String type, String timezone, String code_of_conduct, CopyrightModel copyright, Call_for_papersModel call_for_papers, String location_name, String state, ArrayList<Social_linksModel> social_links, String schedule_published_on, String logo, CreatorModel creator, VersionModel version, String end_time, String name, String organizer_name, String background_image, String privacy, String email, String start_time, String description) {

		this.id = id;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.type = type;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.state = state;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this._creator = creator;
		this._version = version;
		this.end_time = end_time;
		this.name = name;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.privacy = privacy;
		this.email = email;
		this.start_time = start_time;
		this.description = description;

	}

}