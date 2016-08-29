import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String privacy;
	public int id;
	public CreatorModel _creator;
	public String location_name;
	public String organizer_name;
	public String topic;
	public String end_time;
	public String name;
	public String schedule_published_on;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String email;
	public String start_time;
	public String code_of_conduct;
	public VersionModel _version;
	public String logo;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String state;
	public String type;

	public RootModel(String organizer_description, String privacy, int id, CreatorModel creator, String location_name, String organizer_name, String topic, String end_time, String name, String schedule_published_on, String description, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String email, String start_time, String code_of_conduct, VersionModel version, String logo, String background_image, Call_for_papersModel call_for_papers, String timezone, String state, String type) {

		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.id = id;
		this._creator = creator;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.end_time = end_time;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.social_links = social_links;
		this._copyright = copyright;
		this.email = email;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.logo = logo;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.state = state;
		this.type = type;

	}

}