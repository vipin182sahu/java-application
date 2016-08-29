import java.util.ArrayList;

class RootModel {

	public String description;
	public CreatorModel _creator;
	public String location_name;
	public String logo;
	public String timezone;
	public String email;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String name;
	public String type;
	public String state;
	public CopyrightModel _copyright;
	public String background_image;
	public int id;
	public String end_time;
	public String organizer_description;
	public String code_of_conduct;
	public String start_time;
	public String topic;
	public String schedule_published_on;

	public RootModel(String description, CreatorModel creator, String location_name, String logo, String timezone, String email, VersionModel version, ArrayList<Social_linksModel> social_links, String organizer_name, Call_for_papersModel call_for_papers, String privacy, String name, String type, String state, CopyrightModel copyright, String background_image, int id, String end_time, String organizer_description, String code_of_conduct, String start_time, String topic, String schedule_published_on) {

		this.description = description;
		this._creator = creator;
		this.location_name = location_name;
		this.logo = logo;
		this.timezone = timezone;
		this.email = email;
		this._version = version;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.name = name;
		this.type = type;
		this.state = state;
		this._copyright = copyright;
		this.background_image = background_image;
		this.id = id;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;

	}

}