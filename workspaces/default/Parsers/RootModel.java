import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String location_name;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public VersionModel _version;
	public String topic;
	public int id;
	public String name;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String start_time;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String privacy;
	public String background_image;
	public String logo;
	public String organizer_description;
	public String type;
	public String timezone;
	public String code_of_conduct;
	public String state;

	public RootModel(String end_time, String location_name, String description, Call_for_papersModel call_for_papers, String email, VersionModel version, String topic, int id, String name, String schedule_published_on, ArrayList<Social_linksModel> social_links, String organizer_name, String start_time, CopyrightModel copyright, CreatorModel creator, String privacy, String background_image, String logo, String organizer_description, String type, String timezone, String code_of_conduct, String state) {

		this.end_time = end_time;
		this.location_name = location_name;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this._version = version;
		this.topic = topic;
		this.id = id;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this._copyright = copyright;
		this._creator = creator;
		this.privacy = privacy;
		this.background_image = background_image;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.type = type;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.state = state;

	}

}