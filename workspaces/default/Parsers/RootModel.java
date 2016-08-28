import java.util.ArrayList;

class RootModel {

	public String state;
	public String email;
	public String topic;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String location_name;
	public String timezone;
	public String description;
	public String end_time;
	public String privacy;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String organizer_description;
	public VersionModel _version;
	public String start_time;
	public String code_of_conduct;
	public String background_image;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String logo;
	public String type;

	public RootModel(String state, String email, String topic, String organizer_name, Call_for_papersModel call_for_papers, String name, String location_name, String timezone, String description, String end_time, String privacy, String schedule_published_on, CopyrightModel copyright, String organizer_description, VersionModel version, String start_time, String code_of_conduct, String background_image, CreatorModel creator, ArrayList<Social_linksModel> social_links, int id, String logo, String type) {

		this.state = state;
		this.email = email;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.location_name = location_name;
		this.timezone = timezone;
		this.description = description;
		this.end_time = end_time;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this._version = version;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this._creator = creator;
		this.social_links = social_links;
		this.id = id;
		this.logo = logo;
		this.type = type;

	}

}