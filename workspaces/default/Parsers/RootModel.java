import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String description;
	public String start_time;
	public String topic;
	public String timezone;
	public CreatorModel _creator;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String organizer_description;
	public String state;
	public String privacy;
	public String background_image;
	public String end_time;
	public String type;
	public String code_of_conduct;
	public String logo;

	public RootModel(String organizer_name, String description, String start_time, String topic, String timezone, CreatorModel creator, VersionModel version, CopyrightModel copyright, String schedule_published_on, String name, ArrayList<Social_linksModel> social_links, String location_name, int id, Call_for_papersModel call_for_papers, String email, String organizer_description, String state, String privacy, String background_image, String end_time, String type, String code_of_conduct, String logo) {

		this.organizer_name = organizer_name;
		this.description = description;
		this.start_time = start_time;
		this.topic = topic;
		this.timezone = timezone;
		this._creator = creator;
		this._version = version;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.social_links = social_links;
		this.location_name = location_name;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.organizer_description = organizer_description;
		this.state = state;
		this.privacy = privacy;
		this.background_image = background_image;
		this.end_time = end_time;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;

	}

}