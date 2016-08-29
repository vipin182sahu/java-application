import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String state;
	public String start_time;
	public int id;
	public String end_time;
	public CopyrightModel _copyright;
	public String type;
	public String background_image;
	public String organizer_description;
	public CreatorModel _creator;
	public String organizer_name;
	public String privacy;
	public String description;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String email;
	public VersionModel _version;
	public String topic;
	public String logo;

	public RootModel(String schedule_published_on, String state, String start_time, int id, String end_time, CopyrightModel copyright, String type, String background_image, String organizer_description, CreatorModel creator, String organizer_name, String privacy, String description, String name, ArrayList<Social_linksModel> social_links, String timezone, String location_name, Call_for_papersModel call_for_papers, String code_of_conduct, String email, VersionModel version, String topic, String logo) {

		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.start_time = start_time;
		this.id = id;
		this.end_time = end_time;
		this._copyright = copyright;
		this.type = type;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.description = description;
		this.name = name;
		this.social_links = social_links;
		this.timezone = timezone;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this._version = version;
		this.topic = topic;
		this.logo = logo;

	}

}