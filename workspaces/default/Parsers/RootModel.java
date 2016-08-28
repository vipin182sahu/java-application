import java.util.ArrayList;

class RootModel {

	public String state;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public String background_image;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String start_time;
	public String description;
	public String timezone;
	public VersionModel _version;
	public String type;
	public String logo;
	public int id;
	public String end_time;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String topic;
	public String email;
	public String organizer_name;
	public String code_of_conduct;
	public String privacy;

	public RootModel(String state, Call_for_papersModel call_for_papers, String schedule_published_on, String background_image, CreatorModel creator, CopyrightModel copyright, String organizer_description, String start_time, String description, String timezone, VersionModel version, String type, String logo, int id, String end_time, String location_name, ArrayList<Social_linksModel> social_links, String name, String topic, String email, String organizer_name, String code_of_conduct, String privacy) {

		this.state = state;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this._creator = creator;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.description = description;
		this.timezone = timezone;
		this._version = version;
		this.type = type;
		this.logo = logo;
		this.id = id;
		this.end_time = end_time;
		this.location_name = location_name;
		this.social_links = social_links;
		this.name = name;
		this.topic = topic;
		this.email = email;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;

	}

}