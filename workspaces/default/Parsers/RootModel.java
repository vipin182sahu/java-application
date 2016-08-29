import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String description;
	public String code_of_conduct;
	public String organizer_description;
	public String start_time;
	public String email;
	public String name;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public int id;
	public String organizer_name;
	public String type;
	public String background_image;
	public String timezone;
	public String location_name;
	public String schedule_published_on;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String state;
	public String end_time;
	public String logo;

	public RootModel(String privacy, String description, String code_of_conduct, String organizer_description, String start_time, String email, String name, VersionModel version, CopyrightModel copyright, int id, String organizer_name, String type, String background_image, String timezone, String location_name, String schedule_published_on, String topic, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, CreatorModel creator, String state, String end_time, String logo) {

		this.privacy = privacy;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.email = email;
		this.name = name;
		this._version = version;
		this._copyright = copyright;
		this.id = id;
		this.organizer_name = organizer_name;
		this.type = type;
		this.background_image = background_image;
		this.timezone = timezone;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.state = state;
		this.end_time = end_time;
		this.logo = logo;

	}

}