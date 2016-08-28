import java.util.ArrayList;

class RootModel {

	public String description;
	public String type;
	public String code_of_conduct;
	public String location_name;
	public String privacy;
	public CopyrightModel _copyright;
	public String logo;
	public String schedule_published_on;
	public String organizer_name;
	public String timezone;
	public String topic;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String background_image;
	public String name;
	public String end_time;
	public String state;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public VersionModel _version;
	public CreatorModel _creator;

	public RootModel(String description, String type, String code_of_conduct, String location_name, String privacy, CopyrightModel copyright, String logo, String schedule_published_on, String organizer_name, String timezone, String topic, String start_time, ArrayList<Social_linksModel> social_links, String organizer_description, String background_image, String name, String end_time, String state, String email, Call_for_papersModel call_for_papers, int id, VersionModel version, CreatorModel creator) {

		this.description = description;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.privacy = privacy;
		this._copyright = copyright;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.topic = topic;
		this.start_time = start_time;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.name = name;
		this.end_time = end_time;
		this.state = state;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this._version = version;
		this._creator = creator;

	}

}