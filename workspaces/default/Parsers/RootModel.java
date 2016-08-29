import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String privacy;
	public int id;
	public String organizer_description;
	public String description;
	public String logo;
	public String schedule_published_on;
	public String code_of_conduct;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String email;
	public String timezone;
	public String organizer_name;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String start_time;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String name;
	public String type;
	public String state;

	public RootModel(String end_time, String privacy, int id, String organizer_description, String description, String logo, String schedule_published_on, String code_of_conduct, String topic, ArrayList<Social_linksModel> social_links, String background_image, String email, String timezone, String organizer_name, String location_name, Call_for_papersModel call_for_papers, VersionModel version, String start_time, CopyrightModel copyright, CreatorModel creator, String name, String type, String state) {

		this.end_time = end_time;
		this.privacy = privacy;
		this.id = id;
		this.organizer_description = organizer_description;
		this.description = description;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.social_links = social_links;
		this.background_image = background_image;
		this.email = email;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.start_time = start_time;
		this._copyright = copyright;
		this._creator = creator;
		this.name = name;
		this.type = type;
		this.state = state;

	}

}