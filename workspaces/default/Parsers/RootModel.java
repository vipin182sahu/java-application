import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String background_image;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String state;
	public String start_time;
	public VersionModel _version;
	public String privacy;
	public String end_time;
	public String location_name;
	public String timezone;
	public String description;
	public String schedule_published_on;
	public String code_of_conduct;
	public String organizer_description;
	public int id;
	public String logo;
	public String topic;
	public String type;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String organizer_name, String background_image, String name, Call_for_papersModel call_for_papers, String email, String state, String start_time, VersionModel version, String privacy, String end_time, String location_name, String timezone, String description, String schedule_published_on, String code_of_conduct, String organizer_description, int id, String logo, String topic, String type, CopyrightModel copyright, CreatorModel creator, ArrayList<Social_linksModel> social_links) {

		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.state = state;
		this.start_time = start_time;
		this._version = version;
		this.privacy = privacy;
		this.end_time = end_time;
		this.location_name = location_name;
		this.timezone = timezone;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.id = id;
		this.logo = logo;
		this.topic = topic;
		this.type = type;
		this._copyright = copyright;
		this._creator = creator;
		this.social_links = social_links;

	}

}