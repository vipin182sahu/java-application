import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String start_time;
	public String type;
	public String logo;
	public VersionModel _version;
	public String description;
	public String email;
	public String state;
	public String background_image;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String location_name;
	public String organizer_name;
	public String timezone;
	public String privacy;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String end_time;
	public String topic;
	public String schedule_published_on;

	public RootModel(String organizer_description, ArrayList<Social_linksModel> social_links, int id, String start_time, String type, String logo, VersionModel version, String description, String email, String state, String background_image, CreatorModel creator, Call_for_papersModel call_for_papers, String name, String location_name, String organizer_name, String timezone, String privacy, String code_of_conduct, CopyrightModel copyright, String end_time, String topic, String schedule_published_on) {

		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.id = id;
		this.start_time = start_time;
		this.type = type;
		this.logo = logo;
		this._version = version;
		this.description = description;
		this.email = email;
		this.state = state;
		this.background_image = background_image;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.end_time = end_time;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;

	}

}