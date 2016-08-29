import java.util.ArrayList;

class RootModel {

	public String privacy;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String timezone;
	public String start_time;
	public int id;
	public String end_time;
	public String location_name;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public String topic;
	public VersionModel _version;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String name;
	public String organizer_name;
	public CreatorModel _creator;
	public String code_of_conduct;
	public String organizer_description;
	public String email;
	public String logo;

	public RootModel(String privacy, CopyrightModel copyright, String schedule_published_on, String timezone, String start_time, int id, String end_time, String location_name, String type, Call_for_papersModel call_for_papers, String description, String topic, VersionModel version, String background_image, ArrayList<Social_linksModel> social_links, String state, String name, String organizer_name, CreatorModel creator, String code_of_conduct, String organizer_description, String email, String logo) {

		this.privacy = privacy;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.start_time = start_time;
		this.id = id;
		this.end_time = end_time;
		this.location_name = location_name;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this.topic = topic;
		this._version = version;
		this.background_image = background_image;
		this.social_links = social_links;
		this.state = state;
		this.name = name;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.email = email;
		this.logo = logo;

	}

}