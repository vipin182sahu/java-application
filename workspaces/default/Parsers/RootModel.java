import java.util.ArrayList;

class RootModel {

	public String type;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String background_image;
	public String timezone;
	public String end_time;
	public String location_name;
	public int id;
	public String email;
	public String topic;
	public String code_of_conduct;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String start_time;
	public String logo;
	public String organizer_description;
	public String organizer_name;
	public VersionModel _version;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String state;
	public String privacy;

	public RootModel(String type, Call_for_papersModel call_for_papers, String name, String background_image, String timezone, String end_time, String location_name, int id, String email, String topic, String code_of_conduct, String schedule_published_on, CreatorModel creator, String start_time, String logo, String organizer_description, String organizer_name, VersionModel version, String description, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String state, String privacy) {

		this.type = type;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.background_image = background_image;
		this.timezone = timezone;
		this.end_time = end_time;
		this.location_name = location_name;
		this.id = id;
		this.email = email;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.start_time = start_time;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this._version = version;
		this.description = description;
		this.social_links = social_links;
		this._copyright = copyright;
		this.state = state;
		this.privacy = privacy;

	}

}