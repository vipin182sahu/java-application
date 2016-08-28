import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String type;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String description;
	public String start_time;
	public String state;
	public String email;
	public String end_time;
	public String privacy;
	public String location_name;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String organizer_description;
	public CreatorModel _creator;
	public String logo;
	public VersionModel _version;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String name;
	public String schedule_published_on;

	public RootModel(String organizer_name, String type, int id, Call_for_papersModel call_for_papers, String background_image, String description, String start_time, String state, String email, String end_time, String privacy, String location_name, CopyrightModel copyright, String code_of_conduct, String organizer_description, CreatorModel creator, String logo, VersionModel version, String topic, ArrayList<Social_linksModel> social_links, String timezone, String name, String schedule_published_on) {

		this.organizer_name = organizer_name;
		this.type = type;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.description = description;
		this.start_time = start_time;
		this.state = state;
		this.email = email;
		this.end_time = end_time;
		this.privacy = privacy;
		this.location_name = location_name;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.logo = logo;
		this._version = version;
		this.topic = topic;
		this.social_links = social_links;
		this.timezone = timezone;
		this.name = name;
		this.schedule_published_on = schedule_published_on;

	}

}