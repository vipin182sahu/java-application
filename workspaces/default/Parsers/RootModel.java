import java.util.ArrayList;

class RootModel {

	public String email;
	public String background_image;
	public String schedule_published_on;
	public String organizer_name;
	public String state;
	public String name;
	public CreatorModel _creator;
	public String code_of_conduct;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String location_name;
	public String type;
	public String topic;
	public int id;
	public CopyrightModel _copyright;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String end_time;
	public String start_time;
	public String logo;
	public String privacy;

	public RootModel(String email, String background_image, String schedule_published_on, String organizer_name, String state, String name, CreatorModel creator, String code_of_conduct, String timezone, ArrayList<Social_linksModel> social_links, VersionModel version, String location_name, String type, String topic, int id, CopyrightModel copyright, String description, Call_for_papersModel call_for_papers, String organizer_description, String end_time, String start_time, String logo, String privacy) {

		this.email = email;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.state = state;
		this.name = name;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.social_links = social_links;
		this._version = version;
		this.location_name = location_name;
		this.type = type;
		this.topic = topic;
		this.id = id;
		this._copyright = copyright;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.start_time = start_time;
		this.logo = logo;
		this.privacy = privacy;

	}

}