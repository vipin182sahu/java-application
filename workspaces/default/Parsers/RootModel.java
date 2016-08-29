import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public int id;
	public String description;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String logo;
	public CopyrightModel _copyright;
	public String email;
	public String location_name;
	public String type;
	public CreatorModel _creator;
	public String name;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String end_time;
	public String topic;
	public String background_image;
	public String timezone;
	public String organizer_description;
	public String state;
	public String start_time;

	public RootModel(VersionModel version, int id, String description, String code_of_conduct, Call_for_papersModel call_for_papers, String privacy, String logo, CopyrightModel copyright, String email, String location_name, String type, CreatorModel creator, String name, String organizer_name, ArrayList<Social_linksModel> social_links, String schedule_published_on, String end_time, String topic, String background_image, String timezone, String organizer_description, String state, String start_time) {

		this._version = version;
		this.id = id;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.logo = logo;
		this._copyright = copyright;
		this.email = email;
		this.location_name = location_name;
		this.type = type;
		this._creator = creator;
		this.name = name;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.topic = topic;
		this.background_image = background_image;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.state = state;
		this.start_time = start_time;

	}

}