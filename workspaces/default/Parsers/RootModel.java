import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String organizer_description;
	public String privacy;
	public CopyrightModel _copyright;
	public String state;
	public String type;
	public String background_image;
	public String end_time;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String start_time;
	public String timezone;
	public String name;
	public CreatorModel _creator;
	public int id;
	public String topic;
	public String location_name;
	public String logo;
	public String organizer_name;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String description;

	public RootModel(VersionModel version, String organizer_description, String privacy, CopyrightModel copyright, String state, String type, String background_image, String end_time, String email, ArrayList<Social_linksModel> social_links, String schedule_published_on, String start_time, String timezone, String name, CreatorModel creator, int id, String topic, String location_name, String logo, String organizer_name, String code_of_conduct, Call_for_papersModel call_for_papers, String description) {

		this._version = version;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this._copyright = copyright;
		this.state = state;
		this.type = type;
		this.background_image = background_image;
		this.end_time = end_time;
		this.email = email;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.timezone = timezone;
		this.name = name;
		this._creator = creator;
		this.id = id;
		this.topic = topic;
		this.location_name = location_name;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.description = description;

	}

}