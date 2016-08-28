import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String code_of_conduct;
	public String end_time;
	public String timezone;
	public String state;
	public String background_image;
	public String organizer_description;
	public CreatorModel _creator;
	public VersionModel _version;
	public String type;
	public String topic;
	public String email;
	public String description;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String schedule_published_on;
	public String logo;
	public String start_time;
	public String name;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String privacy, String location_name, Call_for_papersModel call_for_papers, int id, String code_of_conduct, String end_time, String timezone, String state, String background_image, String organizer_description, CreatorModel creator, VersionModel version, String type, String topic, String email, String description, CopyrightModel copyright, String organizer_name, String schedule_published_on, String logo, String start_time, String name, ArrayList<Social_linksModel> social_links) {

		this.privacy = privacy;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.timezone = timezone;
		this.state = state;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this._version = version;
		this.type = type;
		this.topic = topic;
		this.email = email;
		this.description = description;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.start_time = start_time;
		this.name = name;
		this.social_links = social_links;

	}

}