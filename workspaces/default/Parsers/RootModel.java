import java.util.ArrayList;

class RootModel {

	public int id;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String timezone;
	public String logo;
	public String location_name;
	public String topic;
	public CreatorModel _creator;
	public String organizer_description;
	public String privacy;
	public String organizer_name;
	public String description;
	public String type;
	public String schedule_published_on;
	public String background_image;
	public String state;
	public String email;
	public String name;
	public String end_time;
	public VersionModel _version;

	public RootModel(int id, String start_time, Call_for_papersModel call_for_papers, String code_of_conduct, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String timezone, String logo, String location_name, String topic, CreatorModel creator, String organizer_description, String privacy, String organizer_name, String description, String type, String schedule_published_on, String background_image, String state, String email, String name, String end_time, VersionModel version) {

		this.id = id;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this._copyright = copyright;
		this.timezone = timezone;
		this.logo = logo;
		this.location_name = location_name;
		this.topic = topic;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.description = description;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.state = state;
		this.email = email;
		this.name = name;
		this.end_time = end_time;
		this._version = version;

	}

}