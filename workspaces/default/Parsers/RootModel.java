import java.util.ArrayList;

class RootModel {

	public String email;
	public int id;
	public String logo;
	public String timezone;
	public String name;
	public CreatorModel _creator;
	public String topic;
	public String location_name;
	public String description;
	public String code_of_conduct;
	public String organizer_name;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String background_image;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String type;
	public String organizer_description;
	public String state;
	public String schedule_published_on;

	public RootModel(String email, int id, String logo, String timezone, String name, CreatorModel creator, String topic, String location_name, String description, String code_of_conduct, String organizer_name, String privacy, Call_for_papersModel call_for_papers, String start_time, String background_image, String end_time, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, VersionModel version, String type, String organizer_description, String state, String schedule_published_on) {

		this.email = email;
		this.id = id;
		this.logo = logo;
		this.timezone = timezone;
		this.name = name;
		this._creator = creator;
		this.topic = topic;
		this.location_name = location_name;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.background_image = background_image;
		this.end_time = end_time;
		this.social_links = social_links;
		this._copyright = copyright;
		this._version = version;
		this.type = type;
		this.organizer_description = organizer_description;
		this.state = state;
		this.schedule_published_on = schedule_published_on;

	}

}