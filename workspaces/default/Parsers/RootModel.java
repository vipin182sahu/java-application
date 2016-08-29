import java.util.ArrayList;

class RootModel {

	public String end_time;
	public int id;
	public String state;
	public String timezone;
	public String organizer_name;
	public String start_time;
	public String topic;
	public String organizer_description;
	public VersionModel _version;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String name;
	public String type;
	public String email;
	public String description;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String location_name;
	public String privacy;
	public String background_image;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String end_time, int id, String state, String timezone, String organizer_name, String start_time, String topic, String organizer_description, VersionModel version, String code_of_conduct, CopyrightModel copyright, String name, String type, String email, String description, String schedule_published_on, Call_for_papersModel call_for_papers, String logo, String location_name, String privacy, String background_image, CreatorModel creator, ArrayList<Social_linksModel> social_links) {

		this.end_time = end_time;
		this.id = id;
		this.state = state;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.name = name;
		this.type = type;
		this.email = email;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.location_name = location_name;
		this.privacy = privacy;
		this.background_image = background_image;
		this._creator = creator;
		this.social_links = social_links;

	}

}