import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String location_name;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String state;
	public VersionModel _version;
	public String description;
	public String schedule_published_on;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String organizer_description;
	public String privacy;
	public String start_time;
	public String email;
	public String name;
	public String background_image;
	public int id;
	public String timezone;
	public String logo;

	public RootModel(String organizer_name, String location_name, String code_of_conduct, CreatorModel creator, String topic, Call_for_papersModel call_for_papers, CopyrightModel copyright, String state, VersionModel version, String description, String schedule_published_on, String type, ArrayList<Social_linksModel> social_links, String end_time, String organizer_description, String privacy, String start_time, String email, String name, String background_image, int id, String timezone, String logo) {

		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.state = state;
		this._version = version;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.social_links = social_links;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.start_time = start_time;
		this.email = email;
		this.name = name;
		this.background_image = background_image;
		this.id = id;
		this.timezone = timezone;
		this.logo = logo;

	}

}