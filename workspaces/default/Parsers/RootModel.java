import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String code_of_conduct;
	public int id;
	public String end_time;
	public String timezone;
	public String privacy;
	public String location_name;
	public String topic;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String logo;
	public VersionModel _version;
	public String state;
	public String organizer_name;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public CreatorModel _creator;
	public String organizer_description;
	public String name;
	public String background_image;
	public String schedule_published_on;

	public RootModel(CopyrightModel copyright, String code_of_conduct, int id, String end_time, String timezone, String privacy, String location_name, String topic, String email, ArrayList<Social_linksModel> social_links, String start_time, String logo, VersionModel version, String state, String organizer_name, String type, Call_for_papersModel call_for_papers, String description, CreatorModel creator, String organizer_description, String name, String background_image, String schedule_published_on) {

		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.end_time = end_time;
		this.timezone = timezone;
		this.privacy = privacy;
		this.location_name = location_name;
		this.topic = topic;
		this.email = email;
		this.social_links = social_links;
		this.start_time = start_time;
		this.logo = logo;
		this._version = version;
		this.state = state;
		this.organizer_name = organizer_name;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.name = name;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;

	}

}