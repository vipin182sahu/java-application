import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String location_name;
	public String description;
	public CreatorModel _creator;
	public String state;
	public String end_time;
	public String email;
	public String organizer_name;
	public String timezone;
	public String name;
	public String code_of_conduct;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String topic;
	public String organizer_description;
	public String start_time;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String logo;
	public String type;

	public RootModel(String background_image, String location_name, String description, CreatorModel creator, String state, String end_time, String email, String organizer_name, String timezone, String name, String code_of_conduct, int id, Call_for_papersModel call_for_papers, String schedule_published_on, CopyrightModel copyright, String topic, String organizer_description, String start_time, VersionModel version, ArrayList<Social_linksModel> social_links, String privacy, String logo, String type) {

		this.background_image = background_image;
		this.location_name = location_name;
		this.description = description;
		this._creator = creator;
		this.state = state;
		this.end_time = end_time;
		this.email = email;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this._version = version;
		this.social_links = social_links;
		this.privacy = privacy;
		this.logo = logo;
		this.type = type;

	}

}