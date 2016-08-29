import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String name;
	public String organizer_description;
	public int id;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String location_name;
	public CopyrightModel _copyright;
	public String email;
	public String start_time;
	public String background_image;
	public String end_time;
	public String topic;
	public String description;
	public String code_of_conduct;
	public String privacy;
	public CreatorModel _creator;
	public String state;
	public String logo;
	public String organizer_name;
	public String schedule_published_on;

	public RootModel(VersionModel version, String name, String organizer_description, int id, String type, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String timezone, String location_name, CopyrightModel copyright, String email, String start_time, String background_image, String end_time, String topic, String description, String code_of_conduct, String privacy, CreatorModel creator, String state, String logo, String organizer_name, String schedule_published_on) {

		this._version = version;
		this.name = name;
		this.organizer_description = organizer_description;
		this.id = id;
		this.type = type;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.location_name = location_name;
		this._copyright = copyright;
		this.email = email;
		this.start_time = start_time;
		this.background_image = background_image;
		this.end_time = end_time;
		this.topic = topic;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this._creator = creator;
		this.state = state;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;

	}

}