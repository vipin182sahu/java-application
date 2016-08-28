import java.util.ArrayList;

class RootModel {

	public String name;
	public int id;
	public String email;
	public String type;
	public String start_time;
	public String topic;
	public String end_time;
	public String schedule_published_on;
	public String timezone;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String organizer_description;
	public String description;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String privacy;
	public String location_name;
	public String code_of_conduct;
	public String background_image;
	public VersionModel _version;
	public String state;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String name, int id, String email, String type, String start_time, String topic, String end_time, String schedule_published_on, String timezone, CreatorModel creator, Call_for_papersModel call_for_papers, String logo, String organizer_description, String description, CopyrightModel copyright, String organizer_name, String privacy, String location_name, String code_of_conduct, String background_image, VersionModel version, String state, ArrayList<Social_linksModel> social_links) {

		this.name = name;
		this.id = id;
		this.email = email;
		this.type = type;
		this.start_time = start_time;
		this.topic = topic;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.description = description;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this._version = version;
		this.state = state;
		this.social_links = social_links;

	}

}