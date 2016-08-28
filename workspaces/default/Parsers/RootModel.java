import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String type;
	public String description;
	public String timezone;
	public VersionModel _version;
	public String end_time;
	public String state;
	public String organizer_name;
	public String code_of_conduct;
	public String name;
	public CopyrightModel _copyright;
	public String background_image;
	public String location_name;
	public String email;
	public String privacy;
	public int id;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String start_time;
	public String logo;
	public String organizer_description;

	public RootModel(ArrayList<Social_linksModel> social_links, CreatorModel creator, String type, String description, String timezone, VersionModel version, String end_time, String state, String organizer_name, String code_of_conduct, String name, CopyrightModel copyright, String background_image, String location_name, String email, String privacy, int id, String schedule_published_on, Call_for_papersModel call_for_papers, String topic, String start_time, String logo, String organizer_description) {

		this.social_links = social_links;
		this._creator = creator;
		this.type = type;
		this.description = description;
		this.timezone = timezone;
		this._version = version;
		this.end_time = end_time;
		this.state = state;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this._copyright = copyright;
		this.background_image = background_image;
		this.location_name = location_name;
		this.email = email;
		this.privacy = privacy;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.start_time = start_time;
		this.logo = logo;
		this.organizer_description = organizer_description;

	}

}