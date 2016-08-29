import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String type;
	public VersionModel _version;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public CopyrightModel _copyright;
	public String logo;
	public CreatorModel _creator;
	public String organizer_description;
	public String start_time;
	public String code_of_conduct;
	public String organizer_name;
	public String background_image;
	public String location_name;
	public String email;
	public String topic;
	public String schedule_published_on;
	public String state;
	public String privacy;
	public int id;
	public String description;
	public String end_time;

	public RootModel(ArrayList<Social_linksModel> social_links, String type, VersionModel version, String timezone, Call_for_papersModel call_for_papers, String name, CopyrightModel copyright, String logo, CreatorModel creator, String organizer_description, String start_time, String code_of_conduct, String organizer_name, String background_image, String location_name, String email, String topic, String schedule_published_on, String state, String privacy, int id, String description, String end_time) {

		this.social_links = social_links;
		this.type = type;
		this._version = version;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this._copyright = copyright;
		this.logo = logo;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.location_name = location_name;
		this.email = email;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.privacy = privacy;
		this.id = id;
		this.description = description;
		this.end_time = end_time;

	}

}