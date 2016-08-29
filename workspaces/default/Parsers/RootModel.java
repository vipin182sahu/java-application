import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String type;
	public String name;
	public String organizer_description;
	public String end_time;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String description;
	public String background_image;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public int id;
	public String timezone;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String state;
	public String location_name;
	public String privacy;
	public String organizer_name;
	public String topic;

	public RootModel(ArrayList<Social_linksModel> social_links, String logo, String type, String name, String organizer_description, String end_time, String email, Call_for_papersModel call_for_papers, String start_time, String description, String background_image, CopyrightModel copyright, VersionModel version, int id, String timezone, String code_of_conduct, CreatorModel creator, String schedule_published_on, String state, String location_name, String privacy, String organizer_name, String topic) {

		this.social_links = social_links;
		this.logo = logo;
		this.type = type;
		this.name = name;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.description = description;
		this.background_image = background_image;
		this._copyright = copyright;
		this._version = version;
		this.id = id;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.location_name = location_name;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.topic = topic;

	}

}