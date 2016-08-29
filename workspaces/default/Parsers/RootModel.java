import java.util.ArrayList;

class RootModel {

	public String description;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String organizer_name;
	public String background_image;
	public String email;
	public String privacy;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String start_time;
	public String topic;
	public String location_name;
	public int id;
	public VersionModel _version;
	public String state;
	public String code_of_conduct;
	public String name;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String timezone;
	public String type;
	public String schedule_published_on;

	public RootModel(String description, Call_for_papersModel call_for_papers, String logo, String organizer_name, String background_image, String email, String privacy, CopyrightModel copyright, String organizer_description, String start_time, String topic, String location_name, int id, VersionModel version, String state, String code_of_conduct, String name, CreatorModel creator, ArrayList<Social_linksModel> social_links, String end_time, String timezone, String type, String schedule_published_on) {

		this.description = description;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.email = email;
		this.privacy = privacy;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.topic = topic;
		this.location_name = location_name;
		this.id = id;
		this._version = version;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this._creator = creator;
		this.social_links = social_links;
		this.end_time = end_time;
		this.timezone = timezone;
		this.type = type;
		this.schedule_published_on = schedule_published_on;

	}

}