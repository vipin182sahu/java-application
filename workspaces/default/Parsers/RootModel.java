import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String end_time;
	public String name;
	public CreatorModel _creator;
	public String location_name;
	public int id;
	public VersionModel _version;
	public String state;
	public String logo;
	public String topic;
	public String timezone;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String email;
	public String description;
	public String start_time;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String background_image;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String organizer_name, String end_time, String name, CreatorModel creator, String location_name, int id, VersionModel version, String state, String logo, String topic, String timezone, String schedule_published_on, CopyrightModel copyright, String organizer_description, String email, String description, String start_time, String code_of_conduct, Call_for_papersModel call_for_papers, String type, String background_image, String privacy, ArrayList<Social_linksModel> social_links) {

		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.name = name;
		this._creator = creator;
		this.location_name = location_name;
		this.id = id;
		this._version = version;
		this.state = state;
		this.logo = logo;
		this.topic = topic;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.email = email;
		this.description = description;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.background_image = background_image;
		this.privacy = privacy;
		this.social_links = social_links;

	}

}