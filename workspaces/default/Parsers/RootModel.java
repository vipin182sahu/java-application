import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String topic;
	public VersionModel _version;
	public String code_of_conduct;
	public String privacy;
	public String state;
	public String start_time;
	public String name;
	public String description;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String location_name;
	public String organizer_description;
	public String end_time;
	public String email;
	public String background_image;
	public String schedule_published_on;
	public int id;
	public String type;
	public String logo;

	public RootModel(CopyrightModel copyright, Call_for_papersModel call_for_papers, CreatorModel creator, String topic, VersionModel version, String code_of_conduct, String privacy, String state, String start_time, String name, String description, String timezone, ArrayList<Social_linksModel> social_links, String organizer_name, String location_name, String organizer_description, String end_time, String email, String background_image, String schedule_published_on, int id, String type, String logo) {

		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.topic = topic;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.state = state;
		this.start_time = start_time;
		this.name = name;
		this.description = description;
		this.timezone = timezone;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.email = email;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.type = type;
		this.logo = logo;

	}

}