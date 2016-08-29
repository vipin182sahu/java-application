import java.util.ArrayList;

class RootModel {

	public String type;
	public String name;
	public String code_of_conduct;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String state;
	public String location_name;
	public String start_time;
	public String topic;
	public String description;
	public String email;
	public int id;
	public String organizer_description;
	public String timezone;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String organizer_name;
	public String logo;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public CreatorModel _creator;

	public RootModel(String type, String name, String code_of_conduct, String privacy, Call_for_papersModel call_for_papers, String background_image, String state, String location_name, String start_time, String topic, String description, String email, int id, String organizer_description, String timezone, CopyrightModel copyright, VersionModel version, String organizer_name, String logo, String schedule_published_on, ArrayList<Social_linksModel> social_links, String end_time, CreatorModel creator) {

		this.type = type;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.state = state;
		this.location_name = location_name;
		this.start_time = start_time;
		this.topic = topic;
		this.description = description;
		this.email = email;
		this.id = id;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this._copyright = copyright;
		this._version = version;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.end_time = end_time;
		this._creator = creator;

	}

}