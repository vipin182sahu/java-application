import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String topic;
	public String privacy;
	public int id;
	public String organizer_description;
	public String logo;
	public CopyrightModel _copyright;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String name;
	public String schedule_published_on;
	public String organizer_name;
	public String location_name;
	public String code_of_conduct;
	public VersionModel _version;
	public String timezone;
	public String email;
	public String start_time;
	public CreatorModel _creator;
	public String type;
	public String description;

	public RootModel(ArrayList<Social_linksModel> social_links, String end_time, String topic, String privacy, int id, String organizer_description, String logo, CopyrightModel copyright, String state, Call_for_papersModel call_for_papers, String background_image, String name, String schedule_published_on, String organizer_name, String location_name, String code_of_conduct, VersionModel version, String timezone, String email, String start_time, CreatorModel creator, String type, String description) {

		this.social_links = social_links;
		this.end_time = end_time;
		this.topic = topic;
		this.privacy = privacy;
		this.id = id;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this._copyright = copyright;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.timezone = timezone;
		this.email = email;
		this.start_time = start_time;
		this._creator = creator;
		this.type = type;
		this.description = description;

	}

}