import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String location_name;
	public String name;
	public String privacy;
	public String state;
	public CopyrightModel _copyright;
	public String topic;
	public String email;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public int id;
	public String background_image;
	public String type;
	public String organizer_description;
	public String timezone;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String description;
	public String organizer_name;
	public String logo;

	public RootModel(String schedule_published_on, String location_name, String name, String privacy, String state, CopyrightModel copyright, String topic, String email, String start_time, Call_for_papersModel call_for_papers, String end_time, ArrayList<Social_linksModel> social_links, VersionModel version, int id, String background_image, String type, String organizer_description, String timezone, String code_of_conduct, CreatorModel creator, String description, String organizer_name, String logo) {

		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.name = name;
		this.privacy = privacy;
		this.state = state;
		this._copyright = copyright;
		this.topic = topic;
		this.email = email;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.social_links = social_links;
		this._version = version;
		this.id = id;
		this.background_image = background_image;
		this.type = type;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.description = description;
		this.organizer_name = organizer_name;
		this.logo = logo;

	}

}