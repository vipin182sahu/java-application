import java.util.ArrayList;

class RootModel {

	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public int id;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String organizer_description;
	public CreatorModel _creator;
	public String topic;
	public String organizer_name;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String timezone;
	public String location_name;
	public String schedule_published_on;
	public VersionModel _version;
	public String start_time;
	public String state;
	public String name;
	public String background_image;
	public String end_time;
	public String type;

	public RootModel(String logo, Call_for_papersModel call_for_papers, String email, int id, CopyrightModel copyright, String code_of_conduct, String organizer_description, CreatorModel creator, String topic, String organizer_name, String privacy, ArrayList<Social_linksModel> social_links, String description, String timezone, String location_name, String schedule_published_on, VersionModel version, String start_time, String state, String name, String background_image, String end_time, String type) {

		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.id = id;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.social_links = social_links;
		this.description = description;
		this.timezone = timezone;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.start_time = start_time;
		this.state = state;
		this.name = name;
		this.background_image = background_image;
		this.end_time = end_time;
		this.type = type;

	}

}