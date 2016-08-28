import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String location_name;
	public String organizer_name;
	public String topic;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String timezone;
	public String start_time;
	public String description;
	public String name;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String end_time;
	public String email;
	public CopyrightModel _copyright;
	public String logo;
	public String state;
	public String privacy;
	public String type;

	public RootModel(VersionModel version, String code_of_conduct, Call_for_papersModel call_for_papers, String organizer_description, String location_name, String organizer_name, String topic, int id, ArrayList<Social_linksModel> social_links, String background_image, String timezone, String start_time, String description, String name, CreatorModel creator, String schedule_published_on, String end_time, String email, CopyrightModel copyright, String logo, String state, String privacy, String type) {

		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.id = id;
		this.social_links = social_links;
		this.background_image = background_image;
		this.timezone = timezone;
		this.start_time = start_time;
		this.description = description;
		this.name = name;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.email = email;
		this._copyright = copyright;
		this.logo = logo;
		this.state = state;
		this.privacy = privacy;
		this.type = type;

	}

}