import java.util.ArrayList;

class RootModel {

	public String name;
	public String timezone;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String privacy;
	public String description;
	public String background_image;
	public String location_name;
	public String code_of_conduct;
	public String start_time;
	public String schedule_published_on;
	public String email;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String topic;
	public String state;
	public VersionModel _version;
	public CreatorModel _creator;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String type;

	public RootModel(String name, String timezone, String end_time, ArrayList<Social_linksModel> social_links, String logo, String privacy, String description, String background_image, String location_name, String code_of_conduct, String start_time, String schedule_published_on, String email, CopyrightModel copyright, String organizer_name, String topic, String state, VersionModel version, CreatorModel creator, String organizer_description, Call_for_papersModel call_for_papers, int id, String type) {

		this.name = name;
		this.timezone = timezone;
		this.end_time = end_time;
		this.social_links = social_links;
		this.logo = logo;
		this.privacy = privacy;
		this.description = description;
		this.background_image = background_image;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.state = state;
		this._version = version;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.type = type;

	}

}