import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String description;
	public String code_of_conduct;
	public String logo;
	public String privacy;
	public String schedule_published_on;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String type;
	public String end_time;
	public String name;
	public String organizer_description;
	public String start_time;
	public String topic;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String organizer_name;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String timezone;
	public String email;

	public RootModel(VersionModel version, String description, String code_of_conduct, String logo, String privacy, String schedule_published_on, CreatorModel creator, CopyrightModel copyright, String type, String end_time, String name, String organizer_description, String start_time, String topic, String state, Call_for_papersModel call_for_papers, String background_image, String organizer_name, int id, ArrayList<Social_linksModel> social_links, String location_name, String timezone, String email) {

		this._version = version;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this._copyright = copyright;
		this.type = type;
		this.end_time = end_time;
		this.name = name;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.topic = topic;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.id = id;
		this.social_links = social_links;
		this.location_name = location_name;
		this.timezone = timezone;
		this.email = email;

	}

}