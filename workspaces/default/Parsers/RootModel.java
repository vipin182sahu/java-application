import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String organizer_description;
	public String code_of_conduct;
	public String privacy;
	public String end_time;
	public String organizer_name;
	public String start_time;
	public String logo;
	public VersionModel _version;
	public String background_image;
	public String state;
	public String description;
	public String timezone;
	public String topic;
	public int id;
	public CopyrightModel _copyright;
	public String type;
	public CreatorModel _creator;
	public String email;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String schedule_published_on, String name, Call_for_papersModel call_for_papers, String location_name, String organizer_description, String code_of_conduct, String privacy, String end_time, String organizer_name, String start_time, String logo, VersionModel version, String background_image, String state, String description, String timezone, String topic, int id, CopyrightModel copyright, String type, CreatorModel creator, String email, ArrayList<Social_linksModel> social_links) {

		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.logo = logo;
		this._version = version;
		this.background_image = background_image;
		this.state = state;
		this.description = description;
		this.timezone = timezone;
		this.topic = topic;
		this.id = id;
		this._copyright = copyright;
		this.type = type;
		this._creator = creator;
		this.email = email;
		this.social_links = social_links;

	}

}