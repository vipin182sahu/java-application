import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String end_time;
	public String organizer_description;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String start_time;
	public String logo;
	public String email;
	public int id;
	public String description;
	public String timezone;
	public VersionModel _version;
	public String state;
	public String background_image;
	public CreatorModel _creator;
	public String code_of_conduct;
	public String organizer_name;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String privacy;

	public RootModel(String location_name, String end_time, String organizer_description, CopyrightModel copyright, String schedule_published_on, String name, ArrayList<Social_linksModel> social_links, String topic, String start_time, String logo, String email, int id, String description, String timezone, VersionModel version, String state, String background_image, CreatorModel creator, String code_of_conduct, String organizer_name, String type, Call_for_papersModel call_for_papers, String privacy) {

		this.location_name = location_name;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.social_links = social_links;
		this.topic = topic;
		this.start_time = start_time;
		this.logo = logo;
		this.email = email;
		this.id = id;
		this.description = description;
		this.timezone = timezone;
		this._version = version;
		this.state = state;
		this.background_image = background_image;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;

	}

}