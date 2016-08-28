import java.util.ArrayList;

class RootModel {

	public String description;
	public String email;
	public String organizer_name;
	public String privacy;
	public String end_time;
	public String timezone;
	public CopyrightModel _copyright;
	public String organizer_description;
	public VersionModel _version;
	public CreatorModel _creator;
	public String location_name;
	public String start_time;
	public String topic;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String background_image;
	public String state;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public int id;
	public String logo;

	public RootModel(String description, String email, String organizer_name, String privacy, String end_time, String timezone, CopyrightModel copyright, String organizer_description, VersionModel version, CreatorModel creator, String location_name, String start_time, String topic, String schedule_published_on, ArrayList<Social_linksModel> social_links, String type, String background_image, String state, String code_of_conduct, Call_for_papersModel call_for_papers, String name, int id, String logo) {

		this.description = description;
		this.email = email;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.end_time = end_time;
		this.timezone = timezone;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this._version = version;
		this._creator = creator;
		this.location_name = location_name;
		this.start_time = start_time;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.type = type;
		this.background_image = background_image;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.id = id;
		this.logo = logo;

	}

}