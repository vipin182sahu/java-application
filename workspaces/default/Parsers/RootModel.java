import java.util.ArrayList;

class RootModel {

	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String email;
	public String code_of_conduct;
	public String organizer_name;
	public String background_image;
	public String privacy;
	public int id;
	public String start_time;
	public String topic;
	public String description;
	public String location_name;
	public String organizer_description;
	public String state;
	public String timezone;
	public String type;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public String logo;
	public CreatorModel _creator;

	public RootModel(String end_time, ArrayList<Social_linksModel> social_links, VersionModel version, CopyrightModel copyright, String email, String code_of_conduct, String organizer_name, String background_image, String privacy, int id, String start_time, String topic, String description, String location_name, String organizer_description, String state, String timezone, String type, String name, Call_for_papersModel call_for_papers, String schedule_published_on, String logo, CreatorModel creator) {

		this.end_time = end_time;
		this.social_links = social_links;
		this._version = version;
		this._copyright = copyright;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.privacy = privacy;
		this.id = id;
		this.start_time = start_time;
		this.topic = topic;
		this.description = description;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.state = state;
		this.timezone = timezone;
		this.type = type;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this._creator = creator;

	}

}