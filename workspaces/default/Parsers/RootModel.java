import java.util.ArrayList;

class RootModel {

	public String background_image;
	public CopyrightModel _copyright;
	public String name;
	public String end_time;
	public String state;
	public String organizer_name;
	public String code_of_conduct;
	public String type;
	public String privacy;
	public String organizer_description;
	public String timezone;
	public String topic;
	public String start_time;
	public VersionModel _version;
	public String location_name;
	public CreatorModel _creator;
	public String email;
	public String logo;
	public int id;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;

	public RootModel(String background_image, CopyrightModel copyright, String name, String end_time, String state, String organizer_name, String code_of_conduct, String type, String privacy, String organizer_description, String timezone, String topic, String start_time, VersionModel version, String location_name, CreatorModel creator, String email, String logo, int id, String description, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String schedule_published_on) {

		this.background_image = background_image;
		this._copyright = copyright;
		this.name = name;
		this.end_time = end_time;
		this.state = state;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.topic = topic;
		this.start_time = start_time;
		this._version = version;
		this.location_name = location_name;
		this._creator = creator;
		this.email = email;
		this.logo = logo;
		this.id = id;
		this.description = description;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;

	}

}