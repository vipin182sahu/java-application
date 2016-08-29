import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String organizer_name;
	public String schedule_published_on;
	public VersionModel _version;
	public String state;
	public String name;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String logo;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String type;
	public String timezone;
	public String description;
	public CopyrightModel _copyright;
	public String privacy;
	public int id;
	public String start_time;
	public String topic;
	public String organizer_description;
	public CreatorModel _creator;

	public RootModel(String end_time, String organizer_name, String schedule_published_on, VersionModel version, String state, String name, String code_of_conduct, ArrayList<Social_linksModel> social_links, String background_image, String logo, String location_name, Call_for_papersModel call_for_papers, String email, String type, String timezone, String description, CopyrightModel copyright, String privacy, int id, String start_time, String topic, String organizer_description, CreatorModel creator) {

		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.state = state;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.background_image = background_image;
		this.logo = logo;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.type = type;
		this.timezone = timezone;
		this.description = description;
		this._copyright = copyright;
		this.privacy = privacy;
		this.id = id;
		this.start_time = start_time;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this._creator = creator;

	}

}