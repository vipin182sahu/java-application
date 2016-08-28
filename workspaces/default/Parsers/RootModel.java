import java.util.ArrayList;

class RootModel {

	public String email;
	public String background_image;
	public int id;
	public String state;
	public String start_time;
	public VersionModel _version;
	public String name;
	public String organizer_name;
	public String privacy;
	public String timezone;
	public String end_time;
	public String description;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String location_name;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String type;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String logo;

	public RootModel(String email, String background_image, int id, String state, String start_time, VersionModel version, String name, String organizer_name, String privacy, String timezone, String end_time, String description, String topic, ArrayList<Social_linksModel> social_links, String code_of_conduct, String location_name, CopyrightModel copyright, String schedule_published_on, CreatorModel creator, String type, String organizer_description, Call_for_papersModel call_for_papers, String logo) {

		this.email = email;
		this.background_image = background_image;
		this.id = id;
		this.state = state;
		this.start_time = start_time;
		this._version = version;
		this.name = name;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.timezone = timezone;
		this.end_time = end_time;
		this.description = description;
		this.topic = topic;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.type = type;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.logo = logo;

	}

}