import java.util.ArrayList;

class RootModel {

	public int id;
	public String description;
	public String name;
	public String background_image;
	public String schedule_published_on;
	public String type;
	public String state;
	public String privacy;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String organizer_description;
	public String email;
	public String logo;
	public String location_name;
	public CreatorModel _creator;
	public String start_time;
	public String topic;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String timezone;
	public VersionModel _version;

	public RootModel(int id, String description, String name, String background_image, String schedule_published_on, String type, String state, String privacy, String organizer_name, ArrayList<Social_linksModel> social_links, String code_of_conduct, String organizer_description, String email, String logo, String location_name, CreatorModel creator, String start_time, String topic, CopyrightModel copyright, Call_for_papersModel call_for_papers, String end_time, String timezone, VersionModel version) {

		this.id = id;
		this.description = description;
		this.name = name;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.state = state;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.email = email;
		this.logo = logo;
		this.location_name = location_name;
		this._creator = creator;
		this.start_time = start_time;
		this.topic = topic;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.timezone = timezone;
		this._version = version;

	}

}