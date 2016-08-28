import java.util.ArrayList;

class RootModel {

	public String email;
	public VersionModel _version;
	public String privacy;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String topic;
	public String type;
	public String description;
	public String end_time;
	public String name;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String organizer_description;
	public String location_name;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String timezone;
	public int id;
	public String organizer_name;
	public String start_time;
	public String logo;

	public RootModel(String email, VersionModel version, String privacy, CopyrightModel copyright, String code_of_conduct, String topic, String type, String description, String end_time, String name, String schedule_published_on, ArrayList<Social_linksModel> social_links, String state, String organizer_description, String location_name, CreatorModel creator, Call_for_papersModel call_for_papers, String background_image, String timezone, int id, String organizer_name, String start_time, String logo) {

		this.email = email;
		this._version = version;
		this.privacy = privacy;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.type = type;
		this.description = description;
		this.end_time = end_time;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.state = state;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.timezone = timezone;
		this.id = id;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.logo = logo;

	}

}