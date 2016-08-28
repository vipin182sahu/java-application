import java.util.ArrayList;

class RootModel {

	public String topic;
	public String logo;
	public String code_of_conduct;
	public String location_name;
	public VersionModel _version;
	public String start_time;
	public String end_time;
	public String timezone;
	public String name;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String state;
	public int id;
	public String privacy;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String type;
	public String schedule_published_on;
	public String description;
	public String background_image;
	public String email;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String topic, String logo, String code_of_conduct, String location_name, VersionModel version, String start_time, String end_time, String timezone, String name, CreatorModel creator, CopyrightModel copyright, String state, int id, String privacy, String organizer_name, Call_for_papersModel call_for_papers, String organizer_description, String type, String schedule_published_on, String description, String background_image, String email, ArrayList<Social_linksModel> social_links) {

		this.topic = topic;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this._version = version;
		this.start_time = start_time;
		this.end_time = end_time;
		this.timezone = timezone;
		this.name = name;
		this._creator = creator;
		this._copyright = copyright;
		this.state = state;
		this.id = id;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.background_image = background_image;
		this.email = email;
		this.social_links = social_links;

	}

}